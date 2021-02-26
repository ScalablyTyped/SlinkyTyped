package typingsSlinky.googleapis.alphaMod.computeAlpha

import typingsSlinky.gaxios.commonMod.GaxiosPromise
import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.BodyResponseCallback
import typingsSlinky.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/compute/alpha", "compute_alpha.Resource$Regionhealthchecks")
@js.native
class ResourceRegionhealthchecks protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * compute.regionHealthChecks.delete
    * @desc Deletes the specified HealthCheck resource.
    * @alias compute.regionHealthChecks.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.healthCheck Name of the HealthCheck resource to delete.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceRegionhealthchecksDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceRegionhealthchecksDelete, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(
    params: ParamsResourceRegionhealthchecksDelete,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceRegionhealthchecksDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceRegionhealthchecksDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.regionHealthChecks.get
    * @desc Returns the specified HealthCheck resource. Gets a list of
    * available health checks by making a list() request.
    * @alias compute.regionHealthChecks.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.healthCheck Name of the HealthCheck resource to return.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaHealthCheck] = js.native
  def get(callback: BodyResponseCallback[SchemaHealthCheck]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaHealthCheck] = js.native
  def get(params: ParamsResourceRegionhealthchecksGet): GaxiosPromise[SchemaHealthCheck] = js.native
  def get(params: ParamsResourceRegionhealthchecksGet, callback: BodyResponseCallback[SchemaHealthCheck]): Unit = js.native
  def get(
    params: ParamsResourceRegionhealthchecksGet,
    options: BodyResponseCallback[SchemaHealthCheck],
    callback: BodyResponseCallback[SchemaHealthCheck]
  ): Unit = js.native
  def get(params: ParamsResourceRegionhealthchecksGet, options: MethodOptions): GaxiosPromise[SchemaHealthCheck] = js.native
  def get(
    params: ParamsResourceRegionhealthchecksGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHealthCheck]
  ): Unit = js.native
  
  /**
    * compute.regionHealthChecks.insert
    * @desc Creates a HealthCheck resource in the specified project using the
    * data included in the request.
    * @alias compute.regionHealthChecks.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().HealthCheck} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaOperation] = js.native
  def insert(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceRegionhealthchecksInsert): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceRegionhealthchecksInsert, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(
    params: ParamsResourceRegionhealthchecksInsert,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def insert(params: ParamsResourceRegionhealthchecksInsert, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(
    params: ParamsResourceRegionhealthchecksInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.regionHealthChecks.list
    * @desc Retrieves the list of HealthCheck resources available to the
    * specified project.
    * @alias compute.regionHealthChecks.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter A filter expression that filters resources listed in the response. The expression must specify the field name, a comparison operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The comparison operator must be either =, !=, >, or <.  For example, if you are filtering Compute Engine instances, you can exclude instances named example-instance by specifying name != example-instance.  You can also filter nested fields. For example, you could specify scheduling.automaticRestart = false to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels.  To filter on multiple expressions, provide each separate expression within parentheses. For example, (scheduling.automaticRestart = true) (cpuPlatform = "Intel Skylake"). By default, each expression is an AND expression. However, you can include AND and OR expressions explicitly. For example, (cpuPlatform = "Intel Skylake") OR (cpuPlatform = "Intel Broadwell") AND (scheduling.automaticRestart = true).
    * @param {integer=} params.maxResults The maximum number of results per page that should be returned. If the number of available results is larger than maxResults, Compute Engine returns a nextPageToken that can be used to get the next page of results in subsequent list requests. Acceptable values are 0 to 500, inclusive. (Default: 500)
    * @param {string=} params.orderBy Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name.  You can also sort results in descending order based on the creation timestamp using orderBy="creationTimestamp desc". This sorts results based on the creationTimestamp field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first.  Currently, only sorting by name or creationTimestamp desc is supported.
    * @param {string=} params.pageToken Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list request to get the next page of results.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaHealthCheckList] = js.native
  def list(callback: BodyResponseCallback[SchemaHealthCheckList]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaHealthCheckList] = js.native
  def list(params: ParamsResourceRegionhealthchecksList): GaxiosPromise[SchemaHealthCheckList] = js.native
  def list(
    params: ParamsResourceRegionhealthchecksList,
    callback: BodyResponseCallback[SchemaHealthCheckList]
  ): Unit = js.native
  def list(
    params: ParamsResourceRegionhealthchecksList,
    options: BodyResponseCallback[SchemaHealthCheckList],
    callback: BodyResponseCallback[SchemaHealthCheckList]
  ): Unit = js.native
  def list(params: ParamsResourceRegionhealthchecksList, options: MethodOptions): GaxiosPromise[SchemaHealthCheckList] = js.native
  def list(
    params: ParamsResourceRegionhealthchecksList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHealthCheckList]
  ): Unit = js.native
  
  /**
    * compute.regionHealthChecks.patch
    * @desc Updates a HealthCheck resource in the specified project using the
    * data included in the request. This method supports PATCH semantics and
    * uses the JSON merge patch format and processing rules.
    * @alias compute.regionHealthChecks.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.healthCheck Name of the HealthCheck resource to patch.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().HealthCheck} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceRegionhealthchecksPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceRegionhealthchecksPatch, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(
    params: ParamsResourceRegionhealthchecksPatch,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceRegionhealthchecksPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceRegionhealthchecksPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.regionHealthChecks.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource.
    * @alias compute.regionHealthChecks.testIamPermissions
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region The name of the region for this request.
    * @param {string} params.resource_ Name or id of the resource for this request.
    * @param {().TestPermissionsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def testIamPermissions(): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaTestPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceRegionhealthchecksTestiampermissions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceRegionhealthchecksTestiampermissions,
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceRegionhealthchecksTestiampermissions,
    options: BodyResponseCallback[SchemaTestPermissionsResponse],
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceRegionhealthchecksTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceRegionhealthchecksTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  
  /**
    * compute.regionHealthChecks.update
    * @desc Updates a HealthCheck resource in the specified project using the
    * data included in the request.
    * @alias compute.regionHealthChecks.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.healthCheck Name of the HealthCheck resource to update.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().HealthCheck} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaOperation] = js.native
  def update(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def update(params: ParamsResourceRegionhealthchecksUpdate): GaxiosPromise[SchemaOperation] = js.native
  def update(params: ParamsResourceRegionhealthchecksUpdate, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def update(
    params: ParamsResourceRegionhealthchecksUpdate,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def update(params: ParamsResourceRegionhealthchecksUpdate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def update(
    params: ParamsResourceRegionhealthchecksUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
}
