package typingsSlinky.msRestAzure.mod

import typingsSlinky.msRest.mod.ServiceClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AzureServiceClientOptions extends ServiceClientOptions {
  
  /**
    * @property {string} [acceptLanguage] - Gets or sets the preferred language for the response. 
    * Default value is: 'en-US'.
    */
  var acceptLanguage: js.UndefOr[String] = js.native
  
  /**
    * @property {boolean} [generateClientRequestId] - When set to true a unique x-ms-client-request-id value 
    * is generated and included in each request. Default is true.
    */
  var generateClientRequestId: js.UndefOr[Boolean] = js.native
  
  /**
    * @property {number} [longRunningOperationRetryTimeout] - The retry timeout in seconds for 
    * Long Running Operations. Default value is 30 seconds.
    */
  var longRunningOperationRetryTimeout: js.UndefOr[Double] = js.native
  
  /**
    * @property {number} [rpRegistrationRetryTimeout] - Gets or sets the retry timeout in seconds for 
    * AutomaticRPRegistration. Default value is 30 seconds.
    */
  var rpRegistrationRetryTimeout: js.UndefOr[Double] = js.native
}
object AzureServiceClientOptions {
  
  @scala.inline
  def apply(): AzureServiceClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AzureServiceClientOptions]
  }
  
  @scala.inline
  implicit class AzureServiceClientOptionsMutableBuilder[Self <: AzureServiceClientOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptLanguage(value: String): Self = StObject.set(x, "acceptLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptLanguageUndefined: Self = StObject.set(x, "acceptLanguage", js.undefined)
    
    @scala.inline
    def setGenerateClientRequestId(value: Boolean): Self = StObject.set(x, "generateClientRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerateClientRequestIdUndefined: Self = StObject.set(x, "generateClientRequestId", js.undefined)
    
    @scala.inline
    def setLongRunningOperationRetryTimeout(value: Double): Self = StObject.set(x, "longRunningOperationRetryTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongRunningOperationRetryTimeoutUndefined: Self = StObject.set(x, "longRunningOperationRetryTimeout", js.undefined)
    
    @scala.inline
    def setRpRegistrationRetryTimeout(value: Double): Self = StObject.set(x, "rpRegistrationRetryTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRpRegistrationRetryTimeoutUndefined: Self = StObject.set(x, "rpRegistrationRetryTimeout", js.undefined)
  }
}
