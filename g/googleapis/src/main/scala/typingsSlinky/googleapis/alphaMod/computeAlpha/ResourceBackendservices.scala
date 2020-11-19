package typingsSlinky.googleapis.alphaMod.computeAlpha

import typingsSlinky.gaxios.commonMod.GaxiosPromise
import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.BodyResponseCallback
import typingsSlinky.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/compute/alpha", "compute_alpha.Resource$Backendservices")
@js.native
class ResourceBackendservices protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  /**
    * compute.backendServices.addSignedUrlKey
    * @desc Adds a key for validating requests with signed URLs for this
    * backend service.
    * @alias compute.backendServices.addSignedUrlKey
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.backendService Name of the BackendService resource to which the Signed URL Key should be added. The name should conform to RFC1035.
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
  def addSignedUrlKey(params: ParamsResourceBackendservicesAddsignedurlkey): GaxiosPromise[SchemaOperation] = js.native
  def addSignedUrlKey(
    params: ParamsResourceBackendservicesAddsignedurlkey,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def addSignedUrlKey(
    params: ParamsResourceBackendservicesAddsignedurlkey,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def addSignedUrlKey(params: ParamsResourceBackendservicesAddsignedurlkey, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def addSignedUrlKey(
    params: ParamsResourceBackendservicesAddsignedurlkey,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.backendServices.aggregatedList
    * @desc Retrieves the list of all BackendService resources, regional and
    * global, available to the specified project.
    * @alias compute.backendServices.aggregatedList
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter A filter expression that filters resources listed in the response. The expression must specify the field name, a comparison operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The comparison operator must be either =, !=, >, or <.  For example, if you are filtering Compute Engine instances, you can exclude instances named example-instance by specifying name != example-instance.  You can also filter nested fields. For example, you could specify scheduling.automaticRestart = false to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels.  To filter on multiple expressions, provide each separate expression within parentheses. For example, (scheduling.automaticRestart = true) (cpuPlatform = "Intel Skylake"). By default, each expression is an AND expression. However, you can include AND and OR expressions explicitly. For example, (cpuPlatform = "Intel Skylake") OR (cpuPlatform = "Intel Broadwell") AND (scheduling.automaticRestart = true).
    * @param {integer=} params.maxResults The maximum number of results per page that should be returned. If the number of available results is larger than maxResults, Compute Engine returns a nextPageToken that can be used to get the next page of results in subsequent list requests. Acceptable values are 0 to 500, inclusive. (Default: 500)
    * @param {string=} params.orderBy Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name.  You can also sort results in descending order based on the creation timestamp using orderBy="creationTimestamp desc". This sorts results based on the creationTimestamp field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first.  Currently, only sorting by name or creationTimestamp desc is supported.
    * @param {string=} params.pageToken Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list request to get the next page of results.
    * @param {string} params.project Name of the project scoping this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def aggregatedList(): GaxiosPromise[SchemaBackendServiceAggregatedList] = js.native
  def aggregatedList(callback: BodyResponseCallback[SchemaBackendServiceAggregatedList]): Unit = js.native
  def aggregatedList(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaBackendServiceAggregatedList] = js.native
  def aggregatedList(params: ParamsResourceBackendservicesAggregatedlist): GaxiosPromise[SchemaBackendServiceAggregatedList] = js.native
  def aggregatedList(
    params: ParamsResourceBackendservicesAggregatedlist,
    callback: BodyResponseCallback[SchemaBackendServiceAggregatedList]
  ): Unit = js.native
  def aggregatedList(
    params: ParamsResourceBackendservicesAggregatedlist,
    options: BodyResponseCallback[SchemaBackendServiceAggregatedList],
    callback: BodyResponseCallback[SchemaBackendServiceAggregatedList]
  ): Unit = js.native
  def aggregatedList(params: ParamsResourceBackendservicesAggregatedlist, options: MethodOptions): GaxiosPromise[SchemaBackendServiceAggregatedList] = js.native
  def aggregatedList(
    params: ParamsResourceBackendservicesAggregatedlist,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBackendServiceAggregatedList]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  /**
    * compute.backendServices.delete
    * @desc Deletes the specified BackendService resource.
    * @alias compute.backendServices.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.backendService Name of the BackendService resource to delete.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceBackendservicesDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceBackendservicesDelete, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(
    params: ParamsResourceBackendservicesDelete,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceBackendservicesDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceBackendservicesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.backendServices.deleteSignedUrlKey
    * @desc Deletes a key for validating requests with signed URLs for this
    * backend service.
    * @alias compute.backendServices.deleteSignedUrlKey
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.backendService Name of the BackendService resource to which the Signed URL Key should be added. The name should conform to RFC1035.
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
  def deleteSignedUrlKey(params: ParamsResourceBackendservicesDeletesignedurlkey): GaxiosPromise[SchemaOperation] = js.native
  def deleteSignedUrlKey(
    params: ParamsResourceBackendservicesDeletesignedurlkey,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def deleteSignedUrlKey(
    params: ParamsResourceBackendservicesDeletesignedurlkey,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def deleteSignedUrlKey(params: ParamsResourceBackendservicesDeletesignedurlkey, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def deleteSignedUrlKey(
    params: ParamsResourceBackendservicesDeletesignedurlkey,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.backendServices.get
    * @desc Returns the specified BackendService resource. Gets a list of
    * available backend services.
    * @alias compute.backendServices.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.backendService Name of the BackendService resource to return.
    * @param {string} params.project Project ID for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaBackendService] = js.native
  def get(callback: BodyResponseCallback[SchemaBackendService]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaBackendService] = js.native
  def get(params: ParamsResourceBackendservicesGet): GaxiosPromise[SchemaBackendService] = js.native
  def get(params: ParamsResourceBackendservicesGet, callback: BodyResponseCallback[SchemaBackendService]): Unit = js.native
  def get(
    params: ParamsResourceBackendservicesGet,
    options: BodyResponseCallback[SchemaBackendService],
    callback: BodyResponseCallback[SchemaBackendService]
  ): Unit = js.native
  def get(params: ParamsResourceBackendservicesGet, options: MethodOptions): GaxiosPromise[SchemaBackendService] = js.native
  def get(
    params: ParamsResourceBackendservicesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBackendService]
  ): Unit = js.native
  
  /**
    * compute.backendServices.getHealth
    * @desc Gets the most recent health check results for this BackendService.
    * @alias compute.backendServices.getHealth
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.backendService Name of the BackendService resource to which the queried instance belongs.
    * @param {string} params.project
    * @param {().ResourceGroupReference} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getHealth(): GaxiosPromise[SchemaBackendServiceGroupHealth] = js.native
  def getHealth(callback: BodyResponseCallback[SchemaBackendServiceGroupHealth]): Unit = js.native
  def getHealth(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaBackendServiceGroupHealth] = js.native
  def getHealth(params: ParamsResourceBackendservicesGethealth): GaxiosPromise[SchemaBackendServiceGroupHealth] = js.native
  def getHealth(
    params: ParamsResourceBackendservicesGethealth,
    callback: BodyResponseCallback[SchemaBackendServiceGroupHealth]
  ): Unit = js.native
  def getHealth(
    params: ParamsResourceBackendservicesGethealth,
    options: BodyResponseCallback[SchemaBackendServiceGroupHealth],
    callback: BodyResponseCallback[SchemaBackendServiceGroupHealth]
  ): Unit = js.native
  def getHealth(params: ParamsResourceBackendservicesGethealth, options: MethodOptions): GaxiosPromise[SchemaBackendServiceGroupHealth] = js.native
  def getHealth(
    params: ParamsResourceBackendservicesGethealth,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBackendServiceGroupHealth]
  ): Unit = js.native
  
  /**
    * compute.backendServices.insert
    * @desc Creates a BackendService resource in the specified project using
    * the data included in the request. There are several restrictions and
    * guidelines to keep in mind when creating a backend service. Read
    * Restrictions and Guidelines for more information.
    * @alias compute.backendServices.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().BackendService} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaOperation] = js.native
  def insert(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceBackendservicesInsert): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceBackendservicesInsert, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(
    params: ParamsResourceBackendservicesInsert,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def insert(params: ParamsResourceBackendservicesInsert, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(
    params: ParamsResourceBackendservicesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.backendServices.list
    * @desc Retrieves the list of BackendService resources available to the
    * specified project.
    * @alias compute.backendServices.list
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
  def list(): GaxiosPromise[SchemaBackendServiceList] = js.native
  def list(callback: BodyResponseCallback[SchemaBackendServiceList]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaBackendServiceList] = js.native
  def list(params: ParamsResourceBackendservicesList): GaxiosPromise[SchemaBackendServiceList] = js.native
  def list(
    params: ParamsResourceBackendservicesList,
    callback: BodyResponseCallback[SchemaBackendServiceList]
  ): Unit = js.native
  def list(
    params: ParamsResourceBackendservicesList,
    options: BodyResponseCallback[SchemaBackendServiceList],
    callback: BodyResponseCallback[SchemaBackendServiceList]
  ): Unit = js.native
  def list(params: ParamsResourceBackendservicesList, options: MethodOptions): GaxiosPromise[SchemaBackendServiceList] = js.native
  def list(
    params: ParamsResourceBackendservicesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBackendServiceList]
  ): Unit = js.native
  
  /**
    * compute.backendServices.patch
    * @desc Patches the specified BackendService resource with the data
    * included in the request. There are several restrictions and guidelines to
    * keep in mind when updating a backend service. Read  Restrictions and
    * Guidelines for more information. This method supports PATCH semantics and
    * uses the JSON merge patch format and processing rules.
    * @alias compute.backendServices.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.backendService Name of the BackendService resource to patch.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().BackendService} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceBackendservicesPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceBackendservicesPatch, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(
    params: ParamsResourceBackendservicesPatch,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceBackendservicesPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceBackendservicesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.backendServices.setSecurityPolicy
    * @desc Sets the security policy for the specified backend service.
    * @alias compute.backendServices.setSecurityPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.backendService Name of the BackendService resource to which the security policy should be set. The name should conform to RFC1035.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().SecurityPolicyReference} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setSecurityPolicy(): GaxiosPromise[SchemaOperation] = js.native
  def setSecurityPolicy(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setSecurityPolicy(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setSecurityPolicy(params: ParamsResourceBackendservicesSetsecuritypolicy): GaxiosPromise[SchemaOperation] = js.native
  def setSecurityPolicy(
    params: ParamsResourceBackendservicesSetsecuritypolicy,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setSecurityPolicy(
    params: ParamsResourceBackendservicesSetsecuritypolicy,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setSecurityPolicy(params: ParamsResourceBackendservicesSetsecuritypolicy, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setSecurityPolicy(
    params: ParamsResourceBackendservicesSetsecuritypolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.backendServices.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource.
    * @alias compute.backendServices.testIamPermissions
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
  def testIamPermissions(params: ParamsResourceBackendservicesTestiampermissions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceBackendservicesTestiampermissions,
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceBackendservicesTestiampermissions,
    options: BodyResponseCallback[SchemaTestPermissionsResponse],
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceBackendservicesTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceBackendservicesTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  
  /**
    * compute.backendServices.update
    * @desc Updates the specified BackendService resource with the data
    * included in the request. There are several restrictions and guidelines to
    * keep in mind when updating a backend service. Read  Restrictions and
    * Guidelines for more information.
    * @alias compute.backendServices.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.backendService Name of the BackendService resource to update.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().BackendService} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaOperation] = js.native
  def update(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def update(params: ParamsResourceBackendservicesUpdate): GaxiosPromise[SchemaOperation] = js.native
  def update(params: ParamsResourceBackendservicesUpdate, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def update(
    params: ParamsResourceBackendservicesUpdate,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def update(params: ParamsResourceBackendservicesUpdate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def update(
    params: ParamsResourceBackendservicesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
}
