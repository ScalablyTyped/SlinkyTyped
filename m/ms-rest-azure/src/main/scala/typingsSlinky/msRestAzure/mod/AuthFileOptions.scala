package typingsSlinky.msRestAzure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthFileOptions extends StObject {
  
  /**
    * @prop {string} [filePath] Absolute file path to the auth file. If not provided 
    * then please set the environment variable 'AZURE_AUTH_LOCATION'.
    */
  var filePath: js.UndefOr[String] = js.native
  
  /**
    * @prop {string} [subscriptionEnvVariableName] The subscriptionId environment variable 
    * name. Default is 'AZURE_SUBSCRIPTION_ID'.
    */
  var subscriptionEnvVariableName: js.UndefOr[String] = js.native
}
object AuthFileOptions {
  
  @scala.inline
  def apply(): AuthFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthFileOptions]
  }
  
  @scala.inline
  implicit class AuthFileOptionsMutableBuilder[Self <: AuthFileOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
    
    @scala.inline
    def setSubscriptionEnvVariableName(value: String): Self = StObject.set(x, "subscriptionEnvVariableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionEnvVariableNameUndefined: Self = StObject.set(x, "subscriptionEnvVariableName", js.undefined)
  }
}
