package typingsSlinky.msRestAzure

import typingsSlinky.msRest.mod.ServiceClientCredentials
import typingsSlinky.msRest.mod.ServiceClientOptions
import typingsSlinky.msRestAzure.operationsMod.Subscriptions
import typingsSlinky.msRestAzure.operationsMod.Tenants
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subscriptionClientMod {
  
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
  
  @js.native
  trait SubscriptionClient extends StObject {
    
    var acceptLanguage: String = js.native
    
    var apiVersion: String = js.native
    
    var credentials: ServiceClientCredentials = js.native
    
    var generateClientRequestId: Boolean = js.native
    
    var longRunningOperationRetryTimeout: Double = js.native
    
    // Operation groups
    var subscriptions: Subscriptions = js.native
    
    var tenants: Tenants = js.native
  }
  object SubscriptionClient {
    
    @scala.inline
    def apply(
      acceptLanguage: String,
      apiVersion: String,
      credentials: ServiceClientCredentials,
      generateClientRequestId: Boolean,
      longRunningOperationRetryTimeout: Double,
      subscriptions: Subscriptions,
      tenants: Tenants
    ): SubscriptionClient = {
      val __obj = js.Dynamic.literal(acceptLanguage = acceptLanguage.asInstanceOf[js.Any], apiVersion = apiVersion.asInstanceOf[js.Any], credentials = credentials.asInstanceOf[js.Any], generateClientRequestId = generateClientRequestId.asInstanceOf[js.Any], longRunningOperationRetryTimeout = longRunningOperationRetryTimeout.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any], tenants = tenants.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubscriptionClient]
    }
    
    @scala.inline
    implicit class SubscriptionClientMutableBuilder[Self <: SubscriptionClient] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAcceptLanguage(value: String): Self = StObject.set(x, "acceptLanguage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCredentials(value: ServiceClientCredentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGenerateClientRequestId(value: Boolean): Self = StObject.set(x, "generateClientRequestId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLongRunningOperationRetryTimeout(value: Double): Self = StObject.set(x, "longRunningOperationRetryTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscriptions(value: Subscriptions): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTenants(value: Tenants): Self = StObject.set(x, "tenants", value.asInstanceOf[js.Any])
    }
  }
}
