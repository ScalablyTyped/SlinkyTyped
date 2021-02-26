package typingsSlinky.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LanguageTag extends StObject {
  
  var value: js.UndefOr[String] = js.native
}
object LanguageTag {
  
  @scala.inline
  def apply(): LanguageTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LanguageTag]
  }
  
  @scala.inline
  implicit class LanguageTagMutableBuilder[Self <: LanguageTag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
