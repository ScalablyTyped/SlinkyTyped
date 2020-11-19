package typingsSlinky.azureArmResource

import typingsSlinky.azureArmResource.anon.CustomHeaders
import typingsSlinky.azureArmResource.anon.Expand
import typingsSlinky.azureArmResource.anon.Skiptoken
import typingsSlinky.azureArmResource.managementModelsMod.ManagementGroupListResult
import typingsSlinky.azureArmResource.managementModelsMod.ManagementGroupWithHierarchy
import typingsSlinky.azureArmResource.managementModelsMod.OperationListResult
import typingsSlinky.msRest.mod.HttpOperationResponse
import typingsSlinky.msRest.mod.ServiceCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("azure-arm-resource/lib/management/operations", JSImport.Namespace)
@js.native
object managementOperationsMod extends js.Object {
  
  @js.native
  trait ManagementGroups extends js.Object {
    
    /**
      * Get the details of the management group.
      *
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {string} [options.expand] The $expand=children query string parameter
      * allows clients to request inclusion of children in the response payload.
      * Possible values include: 'children'
      *
      * @param {boolean} [options.recurse] The $recurse=true query string parameter
      * allows clients to request inclusion of entire hierarchy in the response
      * payload.
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
      *                      @resolve {ManagementGroupWithHierarchy} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {ManagementGroupWithHierarchy} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link ManagementGroupWithHierarchy} for more
      *                      information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def get(): js.Promise[ManagementGroupWithHierarchy] = js.native
    def get(callback: ServiceCallback[ManagementGroupWithHierarchy]): Unit = js.native
    def get(options: Expand): js.Promise[ManagementGroupWithHierarchy] = js.native
    def get(options: Expand, callback: ServiceCallback[ManagementGroupWithHierarchy]): Unit = js.native
    
    /**
      * Get the details of the management group.
      *
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {string} [options.expand] The $expand=children query string parameter
      * allows clients to request inclusion of children in the response payload.
      * Possible values include: 'children'
      *
      * @param {boolean} [options.recurse] The $recurse=true query string parameter
      * allows clients to request inclusion of entire hierarchy in the response
      * payload.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<ManagementGroupWithHierarchy>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def getWithHttpOperationResponse(): js.Promise[HttpOperationResponse[ManagementGroupWithHierarchy]] = js.native
    def getWithHttpOperationResponse(options: Expand): js.Promise[HttpOperationResponse[ManagementGroupWithHierarchy]] = js.native
    
    /**
      * List management groups for the authenticated user.
      *
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {string} [options.skiptoken] Page continuation token is only used if
      * a previous operation returned a partial result.
      * If a previous response contains a nextLink element, the value of the
      * nextLink element will include a token parameter that specifies a starting
      * point to use for subsequent calls.
      *
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
      *                      @resolve {ManagementGroupListResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {ManagementGroupListResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link ManagementGroupListResult} for more
      *                      information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def list(): js.Promise[ManagementGroupListResult] = js.native
    def list(callback: ServiceCallback[ManagementGroupListResult]): Unit = js.native
    def list(options: Skiptoken): js.Promise[ManagementGroupListResult] = js.native
    def list(options: Skiptoken, callback: ServiceCallback[ManagementGroupListResult]): Unit = js.native
    
    /**
      * List management groups for the authenticated user.
      *
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
      *                      @resolve {ManagementGroupListResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {ManagementGroupListResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link ManagementGroupListResult} for more
      *                      information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def listNext(nextPageLink: String): js.Promise[ManagementGroupListResult] = js.native
    def listNext(nextPageLink: String, callback: ServiceCallback[ManagementGroupListResult]): Unit = js.native
    def listNext(nextPageLink: String, options: CustomHeaders): js.Promise[ManagementGroupListResult] = js.native
    def listNext(nextPageLink: String, options: CustomHeaders, callback: ServiceCallback[ManagementGroupListResult]): Unit = js.native
    
    /**
      * List management groups for the authenticated user.
      *
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
      * @resolve {HttpOperationResponse<ManagementGroupListResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def listNextWithHttpOperationResponse(nextPageLink: String): js.Promise[HttpOperationResponse[ManagementGroupListResult]] = js.native
    def listNextWithHttpOperationResponse(nextPageLink: String, options: CustomHeaders): js.Promise[HttpOperationResponse[ManagementGroupListResult]] = js.native
    
    /**
      * List management groups for the authenticated user.
      *
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {string} [options.skiptoken] Page continuation token is only used if
      * a previous operation returned a partial result.
      * If a previous response contains a nextLink element, the value of the
      * nextLink element will include a token parameter that specifies a starting
      * point to use for subsequent calls.
      *
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<ManagementGroupListResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def listWithHttpOperationResponse(): js.Promise[HttpOperationResponse[ManagementGroupListResult]] = js.native
    def listWithHttpOperationResponse(options: Skiptoken): js.Promise[HttpOperationResponse[ManagementGroupListResult]] = js.native
  }
  
  @js.native
  trait Operations extends js.Object {
    
    /**
      * Lists all of the available management REST API operations.
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
    def list(): js.Promise[OperationListResult] = js.native
    def list(callback: ServiceCallback[OperationListResult]): Unit = js.native
    def list(options: CustomHeaders): js.Promise[OperationListResult] = js.native
    def list(options: CustomHeaders, callback: ServiceCallback[OperationListResult]): Unit = js.native
    
    /**
      * Lists all of the available management REST API operations.
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
    def listNext(nextPageLink: String): js.Promise[OperationListResult] = js.native
    def listNext(nextPageLink: String, callback: ServiceCallback[OperationListResult]): Unit = js.native
    def listNext(nextPageLink: String, options: CustomHeaders): js.Promise[OperationListResult] = js.native
    def listNext(nextPageLink: String, options: CustomHeaders, callback: ServiceCallback[OperationListResult]): Unit = js.native
    
    /**
      * Lists all of the available management REST API operations.
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
    def listNextWithHttpOperationResponse(nextPageLink: String): js.Promise[HttpOperationResponse[OperationListResult]] = js.native
    def listNextWithHttpOperationResponse(nextPageLink: String, options: CustomHeaders): js.Promise[HttpOperationResponse[OperationListResult]] = js.native
    
    /**
      * Lists all of the available management REST API operations.
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
    def listWithHttpOperationResponse(): js.Promise[HttpOperationResponse[OperationListResult]] = js.native
    def listWithHttpOperationResponse(options: CustomHeaders): js.Promise[HttpOperationResponse[OperationListResult]] = js.native
  }
}
