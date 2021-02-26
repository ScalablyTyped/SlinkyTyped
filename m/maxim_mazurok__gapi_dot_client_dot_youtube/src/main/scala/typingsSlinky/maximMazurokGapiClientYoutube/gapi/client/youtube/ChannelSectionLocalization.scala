package typingsSlinky.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelSectionLocalization extends StObject {
  
  /** The localized strings for channel section's title. */
  var title: js.UndefOr[String] = js.native
}
object ChannelSectionLocalization {
  
  @scala.inline
  def apply(): ChannelSectionLocalization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelSectionLocalization]
  }
  
  @scala.inline
  implicit class ChannelSectionLocalizationMutableBuilder[Self <: ChannelSectionLocalization] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
