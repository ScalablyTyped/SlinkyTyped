package typingsSlinky.msRestAzure.mod

import typingsSlinky.msRest.mod.ServiceClientOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class AzureServiceClientOptionsOps[Self <: AzureServiceClientOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceptLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceptLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptLanguage")(js.undefined)
        ret
    }
    @scala.inline
    def withGenerateClientRequestId(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateClientRequestId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGenerateClientRequestId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateClientRequestId")(js.undefined)
        ret
    }
    @scala.inline
    def withLongRunningOperationRetryTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longRunningOperationRetryTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLongRunningOperationRetryTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longRunningOperationRetryTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withRpRegistrationRetryTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rpRegistrationRetryTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRpRegistrationRetryTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rpRegistrationRetryTimeout")(js.undefined)
        ret
    }
  }
  
}

