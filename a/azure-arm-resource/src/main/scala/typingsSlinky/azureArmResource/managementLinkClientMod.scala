package typingsSlinky.azureArmResource

import typingsSlinky.azureArmResource.linkOperationsMod.Operations
import typingsSlinky.azureArmResource.linkOperationsMod.ResourceLinks
import typingsSlinky.msRest.mod.ServiceClientCredentials
import typingsSlinky.msRestAzure.mod.AzureServiceClient
import typingsSlinky.msRestAzure.mod.AzureServiceClientOptions
import typingsSlinky.msRestAzure.mod.CloudErrorParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object managementLinkClientMod {
  
  @JSImport("azure-arm-resource/lib/link/managementLinkClient", JSImport.Default)
  @js.native
  class default protected () extends ManagementLinkClient {
    /**
      * Initializes a new instance of the ManagementLinkClient class.
      * @constructor
      *
      * @class
      * @param {credentials} credentials - Credentials needed for the client to connect to Azure.
      *
      * @param {string} subscriptionId - The ID of the target subscription.
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
      * @param {string} [options.acceptLanguage] - The preferred language for the response.
      *
      * @param {number} [options.longRunningOperationRetryTimeout] - The retry timeout in seconds for Long Running Operations. Default value is 30.
      *
      * @param {boolean} [options.generateClientRequestId] - Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
      *
      */
    def this(credentials: ServiceClientCredentials, subscriptionId: String) = this()
    def this(credentials: ServiceClientCredentials, subscriptionId: String, baseUri: String) = this()
    def this(
      credentials: ServiceClientCredentials,
      subscriptionId: String,
      baseUri: js.UndefOr[scala.Nothing],
      options: AzureServiceClientOptions
    ) = this()
    def this(
      credentials: ServiceClientCredentials,
      subscriptionId: String,
      baseUri: String,
      options: AzureServiceClientOptions
    ) = this()
  }
  
  @JSImport("azure-arm-resource/lib/link/managementLinkClient", "ManagementLinkClient")
  @js.native
  class ManagementLinkClient protected () extends AzureServiceClient {
    /**
      * Initializes a new instance of the ManagementLinkClient class.
      * @constructor
      *
      * @class
      * @param {credentials} credentials - Credentials needed for the client to connect to Azure.
      *
      * @param {string} subscriptionId - The ID of the target subscription.
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
      * @param {string} [options.acceptLanguage] - The preferred language for the response.
      *
      * @param {number} [options.longRunningOperationRetryTimeout] - The retry timeout in seconds for Long Running Operations. Default value is 30.
      *
      * @param {boolean} [options.generateClientRequestId] - Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
      *
      */
    def this(credentials: ServiceClientCredentials, subscriptionId: String) = this()
    def this(credentials: ServiceClientCredentials, subscriptionId: String, baseUri: String) = this()
    def this(
      credentials: ServiceClientCredentials,
      subscriptionId: String,
      baseUri: js.UndefOr[scala.Nothing],
      options: AzureServiceClientOptions
    ) = this()
    def this(
      credentials: ServiceClientCredentials,
      subscriptionId: String,
      baseUri: String,
      options: AzureServiceClientOptions
    ) = this()
    
    var acceptLanguage: String = js.native
    
    var apiVersion: String = js.native
    
    var credentials: ServiceClientCredentials = js.native
    
    var generateClientRequestId: Boolean = js.native
    
    var longRunningOperationRetryTimeout: Double = js.native
    
    // Operation groups
    var operations: Operations = js.native
    
    var resourceLinks: ResourceLinks = js.native
    
    var subscriptionId: String = js.native
  }
  
  object ManagementLinkModels {
    
    @JSImport("azure-arm-resource/lib/link/managementLinkClient", "ManagementLinkModels.BaseResource")
    @js.native
    class BaseResource ()
      extends typingsSlinky.azureArmResource.linkModelsMod.BaseResource
    
    @JSImport("azure-arm-resource/lib/link/managementLinkClient", "ManagementLinkModels.CloudError")
    @js.native
    class CloudError protected ()
      extends typingsSlinky.azureArmResource.linkModelsMod.CloudError {
      def this(parameters: CloudErrorParameters) = this()
    }
  }
}
