package typingsSlinky.googleapis.alphaMod.computeAlpha

import typingsSlinky.gaxios.commonMod.GaxiosPromise
import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.BodyResponseCallback
import typingsSlinky.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/compute/alpha", "compute_alpha.Resource$Httpshealthchecks")
@js.native
class ResourceHttpshealthchecks protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * compute.httpsHealthChecks.delete
    * @desc Deletes the specified HttpsHealthCheck resource.
    * @alias compute.httpsHealthChecks.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.httpsHealthCheck Name of the HttpsHealthCheck resource to delete.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceHttpshealthchecksDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceHttpshealthchecksDelete, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(
    params: ParamsResourceHttpshealthchecksDelete,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceHttpshealthchecksDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceHttpshealthchecksDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.httpsHealthChecks.get
    * @desc Returns the specified HttpsHealthCheck resource. Gets a list of
    * available HTTPS health checks by making a list() request.
    * @alias compute.httpsHealthChecks.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.httpsHealthCheck Name of the HttpsHealthCheck resource to return.
    * @param {string} params.project Project ID for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaHttpsHealthCheck] = js.native
  def get(callback: BodyResponseCallback[SchemaHttpsHealthCheck]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaHttpsHealthCheck] = js.native
  def get(params: ParamsResourceHttpshealthchecksGet): GaxiosPromise[SchemaHttpsHealthCheck] = js.native
  def get(params: ParamsResourceHttpshealthchecksGet, callback: BodyResponseCallback[SchemaHttpsHealthCheck]): Unit = js.native
  def get(
    params: ParamsResourceHttpshealthchecksGet,
    options: BodyResponseCallback[SchemaHttpsHealthCheck],
    callback: BodyResponseCallback[SchemaHttpsHealthCheck]
  ): Unit = js.native
  def get(params: ParamsResourceHttpshealthchecksGet, options: MethodOptions): GaxiosPromise[SchemaHttpsHealthCheck] = js.native
  def get(
    params: ParamsResourceHttpshealthchecksGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHttpsHealthCheck]
  ): Unit = js.native
  
  /**
    * compute.httpsHealthChecks.insert
    * @desc Creates a HttpsHealthCheck resource in the specified project using
    * the data included in the request.
    * @alias compute.httpsHealthChecks.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().HttpsHealthCheck} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaOperation] = js.native
  def insert(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceHttpshealthchecksInsert): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceHttpshealthchecksInsert, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(
    params: ParamsResourceHttpshealthchecksInsert,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def insert(params: ParamsResourceHttpshealthchecksInsert, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(
    params: ParamsResourceHttpshealthchecksInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.httpsHealthChecks.list
    * @desc Retrieves the list of HttpsHealthCheck resources available to the
    * specified project.
    * @alias compute.httpsHealthChecks.list
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
  def list(): GaxiosPromise[SchemaHttpsHealthCheckList] = js.native
  def list(callback: BodyResponseCallback[SchemaHttpsHealthCheckList]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaHttpsHealthCheckList] = js.native
  def list(params: ParamsResourceHttpshealthchecksList): GaxiosPromise[SchemaHttpsHealthCheckList] = js.native
  def list(
    params: ParamsResourceHttpshealthchecksList,
    callback: BodyResponseCallback[SchemaHttpsHealthCheckList]
  ): Unit = js.native
  def list(
    params: ParamsResourceHttpshealthchecksList,
    options: BodyResponseCallback[SchemaHttpsHealthCheckList],
    callback: BodyResponseCallback[SchemaHttpsHealthCheckList]
  ): Unit = js.native
  def list(params: ParamsResourceHttpshealthchecksList, options: MethodOptions): GaxiosPromise[SchemaHttpsHealthCheckList] = js.native
  def list(
    params: ParamsResourceHttpshealthchecksList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHttpsHealthCheckList]
  ): Unit = js.native
  
  /**
    * compute.httpsHealthChecks.patch
    * @desc Updates a HttpsHealthCheck resource in the specified project using
    * the data included in the request. This method supports PATCH semantics
    * and uses the JSON merge patch format and processing rules.
    * @alias compute.httpsHealthChecks.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.httpsHealthCheck Name of the HttpsHealthCheck resource to patch.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().HttpsHealthCheck} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceHttpshealthchecksPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceHttpshealthchecksPatch, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(
    params: ParamsResourceHttpshealthchecksPatch,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceHttpshealthchecksPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceHttpshealthchecksPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.httpsHealthChecks.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource.
    * @alias compute.httpsHealthChecks.testIamPermissions
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.resource_ Name or id of the resource for this request.
    * @param {().TestPermissionsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def testIamPermissions(): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaTestPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceHttpshealthchecksTestiampermissions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceHttpshealthchecksTestiampermissions,
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceHttpshealthchecksTestiampermissions,
    options: BodyResponseCallback[SchemaTestPermissionsResponse],
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceHttpshealthchecksTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceHttpshealthchecksTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  
  /**
    * compute.httpsHealthChecks.update
    * @desc Updates a HttpsHealthCheck resource in the specified project using
    * the data included in the request.
    * @alias compute.httpsHealthChecks.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.httpsHealthCheck Name of the HttpsHealthCheck resource to update.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().HttpsHealthCheck} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaOperation] = js.native
  def update(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def update(params: ParamsResourceHttpshealthchecksUpdate): GaxiosPromise[SchemaOperation] = js.native
  def update(params: ParamsResourceHttpshealthchecksUpdate, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def update(
    params: ParamsResourceHttpshealthchecksUpdate,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def update(params: ParamsResourceHttpshealthchecksUpdate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def update(
    params: ParamsResourceHttpshealthchecksUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
}
