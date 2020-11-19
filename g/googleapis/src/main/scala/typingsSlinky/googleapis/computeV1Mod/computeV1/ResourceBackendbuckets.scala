package typingsSlinky.googleapis.computeV1Mod.computeV1

import typingsSlinky.gaxios.commonMod.GaxiosPromise
import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.BodyResponseCallback
import typingsSlinky.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/compute/v1", "compute_v1.Resource$Backendbuckets")
@js.native
class ResourceBackendbuckets protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  /**
    * compute.backendBuckets.addSignedUrlKey
    * @desc Adds a key for validating requests with signed URLs for this
    * backend bucket.
    * @alias compute.backendBuckets.addSignedUrlKey
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.backendBucket Name of the BackendBucket resource to which the Signed URL Key should be added. The name should conform to RFC1035.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().SignedUrlKey} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def addSignedUrlKey(): GaxiosPromise[SchemaOperation] = js.native
  def addSignedUrlKey(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def addSignedUrlKey(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def addSignedUrlKey(params: ParamsResourceBackendbucketsAddsignedurlkey): GaxiosPromise[SchemaOperation] = js.native
  def addSignedUrlKey(
    params: ParamsResourceBackendbucketsAddsignedurlkey,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def addSignedUrlKey(
    params: ParamsResourceBackendbucketsAddsignedurlkey,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def addSignedUrlKey(params: ParamsResourceBackendbucketsAddsignedurlkey, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def addSignedUrlKey(
    params: ParamsResourceBackendbucketsAddsignedurlkey,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  /**
    * compute.backendBuckets.delete
    * @desc Deletes the specified BackendBucket resource.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Compute Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/compute
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var compute = google.compute('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID for this request.
    *     project: 'my-project',  // TODO: Update placeholder value.
    *
    *     // Name of the BackendBucket resource to delete.
    *     backendBucket: 'my-backend-bucket',  // TODO: Update placeholder
    * value.
    *
    *     auth: authClient,
    *   };
    *
    *   compute.backendBuckets.delete(request, function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias compute.backendBuckets.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.backendBucket Name of the BackendBucket resource to delete.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceBackendbucketsDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceBackendbucketsDelete, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(
    params: ParamsResourceBackendbucketsDelete,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceBackendbucketsDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceBackendbucketsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.backendBuckets.deleteSignedUrlKey
    * @desc Deletes a key for validating requests with signed URLs for this
    * backend bucket.
    * @alias compute.backendBuckets.deleteSignedUrlKey
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.backendBucket Name of the BackendBucket resource to which the Signed URL Key should be added. The name should conform to RFC1035.
    * @param {string} params.keyName The name of the Signed URL Key to delete.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def deleteSignedUrlKey(): GaxiosPromise[SchemaOperation] = js.native
  def deleteSignedUrlKey(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def deleteSignedUrlKey(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def deleteSignedUrlKey(params: ParamsResourceBackendbucketsDeletesignedurlkey): GaxiosPromise[SchemaOperation] = js.native
  def deleteSignedUrlKey(
    params: ParamsResourceBackendbucketsDeletesignedurlkey,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def deleteSignedUrlKey(
    params: ParamsResourceBackendbucketsDeletesignedurlkey,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def deleteSignedUrlKey(params: ParamsResourceBackendbucketsDeletesignedurlkey, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def deleteSignedUrlKey(
    params: ParamsResourceBackendbucketsDeletesignedurlkey,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.backendBuckets.get
    * @desc Returns the specified BackendBucket resource. Gets a list of
    * available backend buckets by making a list() request.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Compute Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/compute
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var compute = google.compute('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID for this request.
    *     project: 'my-project',  // TODO: Update placeholder value.
    *
    *     // Name of the BackendBucket resource to return.
    *     backendBucket: 'my-backend-bucket',  // TODO: Update placeholder
    * value.
    *
    *     auth: authClient,
    *   };
    *
    *   compute.backendBuckets.get(request, function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias compute.backendBuckets.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.backendBucket Name of the BackendBucket resource to return.
    * @param {string} params.project Project ID for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaBackendBucket] = js.native
  def get(callback: BodyResponseCallback[SchemaBackendBucket]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaBackendBucket] = js.native
  def get(params: ParamsResourceBackendbucketsGet): GaxiosPromise[SchemaBackendBucket] = js.native
  def get(params: ParamsResourceBackendbucketsGet, callback: BodyResponseCallback[SchemaBackendBucket]): Unit = js.native
  def get(
    params: ParamsResourceBackendbucketsGet,
    options: BodyResponseCallback[SchemaBackendBucket],
    callback: BodyResponseCallback[SchemaBackendBucket]
  ): Unit = js.native
  def get(params: ParamsResourceBackendbucketsGet, options: MethodOptions): GaxiosPromise[SchemaBackendBucket] = js.native
  def get(
    params: ParamsResourceBackendbucketsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBackendBucket]
  ): Unit = js.native
  
  /**
    * compute.backendBuckets.insert
    * @desc Creates a BackendBucket resource in the specified project using the
    * data included in the request.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Compute Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/compute
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var compute = google.compute('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID for this request.
    *     project: 'my-project',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   compute.backendBuckets.insert(request, function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias compute.backendBuckets.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().BackendBucket} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaOperation] = js.native
  def insert(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceBackendbucketsInsert): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceBackendbucketsInsert, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(
    params: ParamsResourceBackendbucketsInsert,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def insert(params: ParamsResourceBackendbucketsInsert, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(
    params: ParamsResourceBackendbucketsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.backendBuckets.list
    * @desc Retrieves the list of BackendBucket resources available to the
    * specified project.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Compute Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/compute
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var compute = google.compute('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID for this request.
    *     project: 'my-project',  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   var handlePage = function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     var itemsPage = response['items'];
    *     if (!itemsPage) {
    *       return;
    *     }
    *     for (var i = 0; i < itemsPage.length; i++) {
    *       // TODO: Change code below to process each resource in `itemsPage`:
    *       console.log(JSON.stringify(itemsPage[i], null, 2));
    *     }
    *
    *     if (response.nextPageToken) {
    *       request.pageToken = response.nextPageToken;
    *       compute.backendBuckets.list(request, handlePage);
    *     }
    *   };
    *
    *   compute.backendBuckets.list(request, handlePage);
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias compute.backendBuckets.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter A filter expression that filters resources listed in the response. The expression must specify the field name, a comparison operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The comparison operator must be either =, !=, >, or <.  For example, if you are filtering Compute Engine instances, you can exclude instances named example-instance by specifying name != example-instance.  You can also filter nested fields. For example, you could specify scheduling.automaticRestart = false to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels.  To filter on multiple expressions, provide each separate expression within parentheses. For example, (scheduling.automaticRestart = true) (cpuPlatform = "Intel Skylake"). By default, each expression is an AND expression. However, you can include AND and OR expressions explicitly. For example, (cpuPlatform = "Intel Skylake") OR (cpuPlatform = "Intel Broadwell") AND (scheduling.automaticRestart = true).
    * @param {integer=} params.maxResults The maximum number of results per page that should be returned. If the number of available results is larger than maxResults, Compute Engine returns a nextPageToken that can be used to get the next page of results in subsequent list requests. Acceptable values are 0 to 500, inclusive. (Default: 500)
    * @param {string=} params.orderBy Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name.  You can also sort results in descending order based on the creation timestamp using orderBy="creationTimestamp desc". This sorts results based on the creationTimestamp field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first.  Currently, only sorting by name or creationTimestamp desc is supported.
    * @param {string=} params.pageToken Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list request to get the next page of results.
    * @param {string} params.project Project ID for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaBackendBucketList] = js.native
  def list(callback: BodyResponseCallback[SchemaBackendBucketList]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaBackendBucketList] = js.native
  def list(params: ParamsResourceBackendbucketsList): GaxiosPromise[SchemaBackendBucketList] = js.native
  def list(params: ParamsResourceBackendbucketsList, callback: BodyResponseCallback[SchemaBackendBucketList]): Unit = js.native
  def list(
    params: ParamsResourceBackendbucketsList,
    options: BodyResponseCallback[SchemaBackendBucketList],
    callback: BodyResponseCallback[SchemaBackendBucketList]
  ): Unit = js.native
  def list(params: ParamsResourceBackendbucketsList, options: MethodOptions): GaxiosPromise[SchemaBackendBucketList] = js.native
  def list(
    params: ParamsResourceBackendbucketsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBackendBucketList]
  ): Unit = js.native
  
  /**
    * compute.backendBuckets.patch
    * @desc Updates the specified BackendBucket resource with the data included
    * in the request. This method supports PATCH semantics and uses the JSON
    * merge patch format and processing rules.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Compute Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/compute
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var compute = google.compute('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID for this request.
    *     project: 'my-project',  // TODO: Update placeholder value.
    *
    *     // Name of the BackendBucket resource to patch.
    *     backendBucket: 'my-backend-bucket',  // TODO: Update placeholder
    * value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body. Only these
    * properties
    *       // will be changed.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   compute.backendBuckets.patch(request, function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias compute.backendBuckets.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.backendBucket Name of the BackendBucket resource to patch.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().BackendBucket} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceBackendbucketsPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceBackendbucketsPatch, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(
    params: ParamsResourceBackendbucketsPatch,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceBackendbucketsPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceBackendbucketsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.backendBuckets.update
    * @desc Updates the specified BackendBucket resource with the data included
    * in the request.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Compute Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/compute
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var compute = google.compute('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID for this request.
    *     project: 'my-project',  // TODO: Update placeholder value.
    *
    *     // Name of the BackendBucket resource to update.
    *     backendBucket: 'my-backend-bucket',  // TODO: Update placeholder
    * value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body. All existing
    * properties
    *       // will be replaced.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   compute.backendBuckets.update(request, function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias compute.backendBuckets.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.backendBucket Name of the BackendBucket resource to update.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().BackendBucket} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaOperation] = js.native
  def update(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def update(params: ParamsResourceBackendbucketsUpdate): GaxiosPromise[SchemaOperation] = js.native
  def update(params: ParamsResourceBackendbucketsUpdate, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def update(
    params: ParamsResourceBackendbucketsUpdate,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def update(params: ParamsResourceBackendbucketsUpdate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def update(
    params: ParamsResourceBackendbucketsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
}
