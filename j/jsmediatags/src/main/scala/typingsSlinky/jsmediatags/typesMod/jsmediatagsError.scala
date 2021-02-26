package typingsSlinky.jsmediatags.typesMod

import org.scalajs.dom.raw.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait jsmediatagsError extends StObject {
  
  var info: String = js.native
  
  var `type`: String = js.native
  
  var xhr: js.UndefOr[XMLHttpRequest] = js.native
}
object jsmediatagsError {
  
  @scala.inline
  def apply(info: String, `type`: String): jsmediatagsError = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[jsmediatagsError]
  }
  
  @scala.inline
  implicit class jsmediatagsErrorMutableBuilder[Self <: jsmediatagsError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXhr(value: XMLHttpRequest): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXhrUndefined: Self = StObject.set(x, "xhr", js.undefined)
  }
}
