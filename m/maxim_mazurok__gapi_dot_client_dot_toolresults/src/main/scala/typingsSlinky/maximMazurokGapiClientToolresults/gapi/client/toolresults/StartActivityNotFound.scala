package typingsSlinky.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartActivityNotFound extends StObject {
  
  var action: js.UndefOr[String] = js.native
  
  var uri: js.UndefOr[String] = js.native
}
object StartActivityNotFound {
  
  @scala.inline
  def apply(): StartActivityNotFound = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartActivityNotFound]
  }
  
  @scala.inline
  implicit class StartActivityNotFoundMutableBuilder[Self <: StartActivityNotFound] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
