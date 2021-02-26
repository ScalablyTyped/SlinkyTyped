package typingsSlinky.googleapis.alphaMod.computeAlpha

import typingsSlinky.gaxios.commonMod.GaxiosPromise
import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.BodyResponseCallback
import typingsSlinky.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/compute/alpha", "compute_alpha.Resource$Routers")
@js.native
class ResourceRouters protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  /**
    * compute.routers.aggregatedList
    * @desc Retrieves an aggregated list of routers.
    * @alias compute.routers.aggregatedList
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
  def aggregatedList(): GaxiosPromise[SchemaRouterAggregatedList] = js.native
  def aggregatedList(callback: BodyResponseCallback[SchemaRouterAggregatedList]): Unit = js.native
  def aggregatedList(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaRouterAggregatedList] = js.native
  def aggregatedList(params: ParamsResourceRoutersAggregatedlist): GaxiosPromise[SchemaRouterAggregatedList] = js.native
  def aggregatedList(
    params: ParamsResourceRoutersAggregatedlist,
    callback: BodyResponseCallback[SchemaRouterAggregatedList]
  ): Unit = js.native
  def aggregatedList(
    params: ParamsResourceRoutersAggregatedlist,
    options: BodyResponseCallback[SchemaRouterAggregatedList],
    callback: BodyResponseCallback[SchemaRouterAggregatedList]
  ): Unit = js.native
  def aggregatedList(params: ParamsResourceRoutersAggregatedlist, options: MethodOptions): GaxiosPromise[SchemaRouterAggregatedList] = js.native
  def aggregatedList(
    params: ParamsResourceRoutersAggregatedlist,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRouterAggregatedList]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  /**
    * compute.routers.delete
    * @desc Deletes the specified Router resource.
    * @alias compute.routers.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.router Name of the Router resource to delete.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceRoutersDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceRoutersDelete, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(
    params: ParamsResourceRoutersDelete,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceRoutersDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceRoutersDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.routers.get
    * @desc Returns the specified Router resource. Gets a list of available
    * routers by making a list() request.
    * @alias compute.routers.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region for this request.
    * @param {string} params.router Name of the Router resource to return.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaRouter] = js.native
  def get(callback: BodyResponseCallback[SchemaRouter]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaRouter] = js.native
  def get(params: ParamsResourceRoutersGet): GaxiosPromise[SchemaRouter] = js.native
  def get(params: ParamsResourceRoutersGet, callback: BodyResponseCallback[SchemaRouter]): Unit = js.native
  def get(
    params: ParamsResourceRoutersGet,
    options: BodyResponseCallback[SchemaRouter],
    callback: BodyResponseCallback[SchemaRouter]
  ): Unit = js.native
  def get(params: ParamsResourceRoutersGet, options: MethodOptions): GaxiosPromise[SchemaRouter] = js.native
  def get(
    params: ParamsResourceRoutersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRouter]
  ): Unit = js.native
  
  /**
    * compute.routers.getNatMappingInfo
    * @desc Retrieves runtime Nat mapping information of VM endpoints.
    * @alias compute.routers.getNatMappingInfo
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter A filter expression that filters resources listed in the response. The expression must specify the field name, a comparison operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The comparison operator must be either =, !=, >, or <.  For example, if you are filtering Compute Engine instances, you can exclude instances named example-instance by specifying name != example-instance.  You can also filter nested fields. For example, you could specify scheduling.automaticRestart = false to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels.  To filter on multiple expressions, provide each separate expression within parentheses. For example, (scheduling.automaticRestart = true) (cpuPlatform = "Intel Skylake"). By default, each expression is an AND expression. However, you can include AND and OR expressions explicitly. For example, (cpuPlatform = "Intel Skylake") OR (cpuPlatform = "Intel Broadwell") AND (scheduling.automaticRestart = true).
    * @param {integer=} params.maxResults The maximum number of results per page that should be returned. If the number of available results is larger than maxResults, Compute Engine returns a nextPageToken that can be used to get the next page of results in subsequent list requests. Acceptable values are 0 to 500, inclusive. (Default: 500)
    * @param {string=} params.natName Name of the nat service to filter the Nat Mapping information. If it is omitted, all nats for this router will be returned. Name should conform to RFC1035.
    * @param {string=} params.orderBy Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name.  You can also sort results in descending order based on the creation timestamp using orderBy="creationTimestamp desc". This sorts results based on the creationTimestamp field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first.  Currently, only sorting by name or creationTimestamp desc is supported.
    * @param {string=} params.pageToken Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list request to get the next page of results.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region for this request.
    * @param {string} params.router Name of the Router resource to query for Nat Mapping information of VM endpoints.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getNatMappingInfo(): GaxiosPromise[SchemaVmEndpointNatMappingsList] = js.native
  def getNatMappingInfo(callback: BodyResponseCallback[SchemaVmEndpointNatMappingsList]): Unit = js.native
  def getNatMappingInfo(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaVmEndpointNatMappingsList] = js.native
  def getNatMappingInfo(params: ParamsResourceRoutersGetnatmappinginfo): GaxiosPromise[SchemaVmEndpointNatMappingsList] = js.native
  def getNatMappingInfo(
    params: ParamsResourceRoutersGetnatmappinginfo,
    callback: BodyResponseCallback[SchemaVmEndpointNatMappingsList]
  ): Unit = js.native
  def getNatMappingInfo(
    params: ParamsResourceRoutersGetnatmappinginfo,
    options: BodyResponseCallback[SchemaVmEndpointNatMappingsList],
    callback: BodyResponseCallback[SchemaVmEndpointNatMappingsList]
  ): Unit = js.native
  def getNatMappingInfo(params: ParamsResourceRoutersGetnatmappinginfo, options: MethodOptions): GaxiosPromise[SchemaVmEndpointNatMappingsList] = js.native
  def getNatMappingInfo(
    params: ParamsResourceRoutersGetnatmappinginfo,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVmEndpointNatMappingsList]
  ): Unit = js.native
  
  /**
    * compute.routers.getRouterStatus
    * @desc Retrieves runtime information of the specified router.
    * @alias compute.routers.getRouterStatus
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region for this request.
    * @param {string} params.router Name of the Router resource to query.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getRouterStatus(): GaxiosPromise[SchemaRouterStatusResponse] = js.native
  def getRouterStatus(callback: BodyResponseCallback[SchemaRouterStatusResponse]): Unit = js.native
  def getRouterStatus(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaRouterStatusResponse] = js.native
  def getRouterStatus(params: ParamsResourceRoutersGetrouterstatus): GaxiosPromise[SchemaRouterStatusResponse] = js.native
  def getRouterStatus(
    params: ParamsResourceRoutersGetrouterstatus,
    callback: BodyResponseCallback[SchemaRouterStatusResponse]
  ): Unit = js.native
  def getRouterStatus(
    params: ParamsResourceRoutersGetrouterstatus,
    options: BodyResponseCallback[SchemaRouterStatusResponse],
    callback: BodyResponseCallback[SchemaRouterStatusResponse]
  ): Unit = js.native
  def getRouterStatus(params: ParamsResourceRoutersGetrouterstatus, options: MethodOptions): GaxiosPromise[SchemaRouterStatusResponse] = js.native
  def getRouterStatus(
    params: ParamsResourceRoutersGetrouterstatus,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRouterStatusResponse]
  ): Unit = js.native
  
  /**
    * compute.routers.insert
    * @desc Creates a Router resource in the specified project and region using
    * the data included in the request.
    * @alias compute.routers.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().Router} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaOperation] = js.native
  def insert(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceRoutersInsert): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceRoutersInsert, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(
    params: ParamsResourceRoutersInsert,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def insert(params: ParamsResourceRoutersInsert, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(
    params: ParamsResourceRoutersInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.routers.list
    * @desc Retrieves a list of Router resources available to the specified
    * project.
    * @alias compute.routers.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter A filter expression that filters resources listed in the response. The expression must specify the field name, a comparison operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The comparison operator must be either =, !=, >, or <.  For example, if you are filtering Compute Engine instances, you can exclude instances named example-instance by specifying name != example-instance.  You can also filter nested fields. For example, you could specify scheduling.automaticRestart = false to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels.  To filter on multiple expressions, provide each separate expression within parentheses. For example, (scheduling.automaticRestart = true) (cpuPlatform = "Intel Skylake"). By default, each expression is an AND expression. However, you can include AND and OR expressions explicitly. For example, (cpuPlatform = "Intel Skylake") OR (cpuPlatform = "Intel Broadwell") AND (scheduling.automaticRestart = true).
    * @param {integer=} params.maxResults The maximum number of results per page that should be returned. If the number of available results is larger than maxResults, Compute Engine returns a nextPageToken that can be used to get the next page of results in subsequent list requests. Acceptable values are 0 to 500, inclusive. (Default: 500)
    * @param {string=} params.orderBy Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name.  You can also sort results in descending order based on the creation timestamp using orderBy="creationTimestamp desc". This sorts results based on the creationTimestamp field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first.  Currently, only sorting by name or creationTimestamp desc is supported.
    * @param {string=} params.pageToken Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list request to get the next page of results.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaRouterList] = js.native
  def list(callback: BodyResponseCallback[SchemaRouterList]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaRouterList] = js.native
  def list(params: ParamsResourceRoutersList): GaxiosPromise[SchemaRouterList] = js.native
  def list(params: ParamsResourceRoutersList, callback: BodyResponseCallback[SchemaRouterList]): Unit = js.native
  def list(
    params: ParamsResourceRoutersList,
    options: BodyResponseCallback[SchemaRouterList],
    callback: BodyResponseCallback[SchemaRouterList]
  ): Unit = js.native
  def list(params: ParamsResourceRoutersList, options: MethodOptions): GaxiosPromise[SchemaRouterList] = js.native
  def list(
    params: ParamsResourceRoutersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRouterList]
  ): Unit = js.native
  
  /**
    * compute.routers.patch
    * @desc Patches the specified Router resource with the data included in the
    * request. This method supports PATCH semantics and uses JSON merge patch
    * format and processing rules.
    * @alias compute.routers.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.router Name of the Router resource to patch.
    * @param {().Router} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceRoutersPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceRoutersPatch, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(
    params: ParamsResourceRoutersPatch,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceRoutersPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceRoutersPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.routers.preview
    * @desc Preview fields auto-generated during router create and update
    * operations. Calling this method does NOT create or update the router.
    * @alias compute.routers.preview
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region for this request.
    * @param {string} params.router Name of the Router resource to query.
    * @param {().Router} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def preview(): GaxiosPromise[SchemaRoutersPreviewResponse] = js.native
  def preview(callback: BodyResponseCallback[SchemaRoutersPreviewResponse]): Unit = js.native
  def preview(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaRoutersPreviewResponse] = js.native
  def preview(params: ParamsResourceRoutersPreview): GaxiosPromise[SchemaRoutersPreviewResponse] = js.native
  def preview(params: ParamsResourceRoutersPreview, callback: BodyResponseCallback[SchemaRoutersPreviewResponse]): Unit = js.native
  def preview(
    params: ParamsResourceRoutersPreview,
    options: BodyResponseCallback[SchemaRoutersPreviewResponse],
    callback: BodyResponseCallback[SchemaRoutersPreviewResponse]
  ): Unit = js.native
  def preview(params: ParamsResourceRoutersPreview, options: MethodOptions): GaxiosPromise[SchemaRoutersPreviewResponse] = js.native
  def preview(
    params: ParamsResourceRoutersPreview,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRoutersPreviewResponse]
  ): Unit = js.native
  
  /**
    * compute.routers.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource.
    * @alias compute.routers.testIamPermissions
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
  def testIamPermissions(params: ParamsResourceRoutersTestiampermissions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceRoutersTestiampermissions,
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceRoutersTestiampermissions,
    options: BodyResponseCallback[SchemaTestPermissionsResponse],
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceRoutersTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceRoutersTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  
  /**
    * compute.routers.update
    * @desc Updates the specified Router resource with the data included in the
    * request.
    * @alias compute.routers.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.router Name of the Router resource to update.
    * @param {().Router} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaOperation] = js.native
  def update(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def update(params: ParamsResourceRoutersUpdate): GaxiosPromise[SchemaOperation] = js.native
  def update(params: ParamsResourceRoutersUpdate, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def update(
    params: ParamsResourceRoutersUpdate,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def update(params: ParamsResourceRoutersUpdate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def update(
    params: ParamsResourceRoutersUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
}
