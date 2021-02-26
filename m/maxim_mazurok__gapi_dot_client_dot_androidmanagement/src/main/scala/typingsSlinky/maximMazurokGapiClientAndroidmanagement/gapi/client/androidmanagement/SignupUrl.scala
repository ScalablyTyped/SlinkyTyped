package typingsSlinky.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignupUrl extends StObject {
  
  /** The name of the resource. Use this value in the signupUrl field when calling enterprises.create to complete the enterprise signup flow. */
  var name: js.UndefOr[String] = js.native
  
  /** A URL where an enterprise admin can register their enterprise. The page can't be rendered in an iframe. */
  var url: js.UndefOr[String] = js.native
}
object SignupUrl {
  
  @scala.inline
  def apply(): SignupUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignupUrl]
  }
  
  @scala.inline
  implicit class SignupUrlMutableBuilder[Self <: SignupUrl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
