package typingsSlinky.azureArmResource

import typingsSlinky.azureArmResource.anon.CustomHeaders
import typingsSlinky.azureArmResource.modelsMod.OperationListResult
import typingsSlinky.azureArmResource.operationsMod.Features
import typingsSlinky.msRest.mod.HttpOperationResponse
import typingsSlinky.msRest.mod.ServiceCallback
import typingsSlinky.msRest.mod.ServiceClientCredentials
import typingsSlinky.msRestAzure.mod.AzureServiceClient
import typingsSlinky.msRestAzure.mod.AzureServiceClientOptions
import typingsSlinky.msRestAzure.mod.CloudErrorParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object featureClientMod {
  
  @JSImport("azure-arm-resource/lib/feature/featureClient", JSImport.Default)
  @js.native
  class default protected () extends FeatureClient {
    /**
      * Initializes a new instance of the FeatureClient class.
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
  
  @JSImport("azure-arm-resource/lib/feature/featureClient", "FeatureClient")
  @js.native
  class FeatureClient protected () extends AzureServiceClient {
    /**
      * Initializes a new instance of the FeatureClient class.
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
    
    // Operation groups
    var features: Features = js.native
    
    var generateClientRequestId: Boolean = js.native
    
    /**
      * Lists all of the available Microsoft.Features REST API operations.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {OperationListResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {OperationListResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link OperationListResult} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def listOperations(): js.Promise[OperationListResult] = js.native
    def listOperations(callback: ServiceCallback[OperationListResult]): Unit = js.native
    def listOperations(options: CustomHeaders): js.Promise[OperationListResult] = js.native
    def listOperations(options: CustomHeaders, callback: ServiceCallback[OperationListResult]): Unit = js.native
    
    /**
      * Lists all of the available Microsoft.Features REST API operations.
      *
      * @param {string} nextPageLink The NextLink from the previous successful call
      * to List operation.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {OperationListResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {OperationListResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link OperationListResult} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def listOperationsNext(nextPageLink: String): js.Promise[OperationListResult] = js.native
    def listOperationsNext(nextPageLink: String, callback: ServiceCallback[OperationListResult]): Unit = js.native
    def listOperationsNext(nextPageLink: String, options: CustomHeaders): js.Promise[OperationListResult] = js.native
    def listOperationsNext(nextPageLink: String, options: CustomHeaders, callback: ServiceCallback[OperationListResult]): Unit = js.native
    
    /**
      * Lists all of the available Microsoft.Features REST API operations.
      *
      * @param {string} nextPageLink The NextLink from the previous successful call
      * to List operation.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<OperationListResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def listOperationsNextWithHttpOperationResponse(nextPageLink: String): js.Promise[HttpOperationResponse[OperationListResult]] = js.native
    def listOperationsNextWithHttpOperationResponse(nextPageLink: String, options: CustomHeaders): js.Promise[HttpOperationResponse[OperationListResult]] = js.native
    
    /**
      * Lists all of the available Microsoft.Features REST API operations.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<OperationListResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def listOperationsWithHttpOperationResponse(): js.Promise[HttpOperationResponse[OperationListResult]] = js.native
    def listOperationsWithHttpOperationResponse(options: CustomHeaders): js.Promise[HttpOperationResponse[OperationListResult]] = js.native
    
    var longRunningOperationRetryTimeout: Double = js.native
    
    var subscriptionId: String = js.native
  }
  
  object FeatureModels {
    
    @JSImport("azure-arm-resource/lib/feature/featureClient", "FeatureModels.BaseResource")
    @js.native
    class BaseResource ()
      extends typingsSlinky.azureArmResource.modelsMod.BaseResource
    
    @JSImport("azure-arm-resource/lib/feature/featureClient", "FeatureModels.CloudError")
    @js.native
    class CloudError protected ()
      extends typingsSlinky.azureArmResource.modelsMod.CloudError {
      def this(parameters: CloudErrorParameters) = this()
    }
  }
}
