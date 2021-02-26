package typingsSlinky.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputSource extends StObject {
  
  /**
    * The key used to extract the password from EC2 Parameter store.
    */
  var PasswordParam: js.UndefOr[string] = js.native
  
  /**
    * This represents the customer's source URL where stream is
  pulled from.
    */
  var Url: js.UndefOr[string] = js.native
  
  /**
    * The username for the input source.
    */
  var Username: js.UndefOr[string] = js.native
}
object InputSource {
  
  @scala.inline
  def apply(): InputSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputSource]
  }
  
  @scala.inline
  implicit class InputSourceMutableBuilder[Self <: InputSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPasswordParam(value: string): Self = StObject.set(x, "PasswordParam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordParamUndefined: Self = StObject.set(x, "PasswordParam", js.undefined)
    
    @scala.inline
    def setUrl(value: string): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
    
    @scala.inline
    def setUsername(value: string): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "Username", js.undefined)
  }
}
