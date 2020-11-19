package typingsSlinky.msRestAzure.subscriptionClientMod

import typingsSlinky.msRest.mod.ServiceClientCredentials
import typingsSlinky.msRest.mod.ServiceClientOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ms-rest-azure/lib/subscriptionManagement/subscriptionClient", JSImport.Namespace)
@js.native
class ^ protected () extends SubscriptionClient {
  /**
    * Initializes a new instance of the SubscriptionClient class.
    * @constructor
    *
    * @class
    * @param {credentials} credentials - Credentials needed for the client to connect to Azure.
    *
    * @param {string} [baseUri] - The base URI of the service.
    *
    * @param {object} [options] - The parameter options
    *
    * @param {Array} [options.filters] - Filters to be added to the request pipeline
    *
    * @param {object} [options.requestOptions] - Options for the underlying request object
    * {@link https://github.com/request/request#requestoptions-callback Options doc}
    *
    * @param {boolean} [options.noRetryPolicy] - If set to true, turn off default retry policy
    *
    * @param {string} [options.apiVersion] - The API version to use for the operation.
    *
    * @param {string} [options.acceptLanguage] - Gets or sets the preferred language for the response.
    *
    * @param {number} [options.longRunningOperationRetryTimeout] - Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
    *
    * @param {boolean} [options.generateClientRequestId] - When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
    *
    */
  def this(credentials: ServiceClientCredentials) = this()
  def this(credentials: ServiceClientCredentials, baseUri: String) = this()
  def this(
    credentials: ServiceClientCredentials,
    baseUri: js.UndefOr[scala.Nothing],
    options: ServiceClientOptions
  ) = this()
  def this(credentials: ServiceClientCredentials, baseUri: String, options: ServiceClientOptions) = this()
}
