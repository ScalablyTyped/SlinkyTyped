package typingsSlinky.chrome.chrome.contentSettings

import typingsSlinky.chrome.chromeStrings.allow
import typingsSlinky.chrome.chromeStrings.ask
import typingsSlinky.chrome.chromeStrings.block
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultipleAutomaticDownloadsSetDetails extends SetDetails {
  
  @JSName("setting")
  var setting_MultipleAutomaticDownloadsSetDetails: allow | block | ask = js.native
}
object MultipleAutomaticDownloadsSetDetails {
  
  @scala.inline
  def apply(primaryPattern: String, setting: allow | block | ask): MultipleAutomaticDownloadsSetDetails = {
    val __obj = js.Dynamic.literal(primaryPattern = primaryPattern.asInstanceOf[js.Any], setting = setting.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipleAutomaticDownloadsSetDetails]
  }
  
  @scala.inline
  implicit class MultipleAutomaticDownloadsSetDetailsMutableBuilder[Self <: MultipleAutomaticDownloadsSetDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetting(value: allow | block | ask): Self = StObject.set(x, "setting", value.asInstanceOf[js.Any])
  }
}
