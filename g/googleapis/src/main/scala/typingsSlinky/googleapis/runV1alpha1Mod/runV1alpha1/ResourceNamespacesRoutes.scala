package typingsSlinky.googleapis.runV1alpha1Mod.runV1alpha1

import typingsSlinky.gaxios.commonMod.GaxiosPromise
import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.BodyResponseCallback
import typingsSlinky.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/run/v1alpha1", "run_v1alpha1.Resource$Namespaces$Routes")
@js.native
class ResourceNamespacesRoutes protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * run.namespaces.routes.get
    * @desc Rpc to get information about a route.
    * @alias run.namespaces.routes.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the route being retrieved. If needed, replace {namespace_id} with the project ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaRoute] = js.native
  def get(callback: BodyResponseCallback[SchemaRoute]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaRoute] = js.native
  def get(params: ParamsResourceNamespacesRoutesGet): GaxiosPromise[SchemaRoute] = js.native
  def get(params: ParamsResourceNamespacesRoutesGet, callback: BodyResponseCallback[SchemaRoute]): Unit = js.native
  def get(
    params: ParamsResourceNamespacesRoutesGet,
    options: BodyResponseCallback[SchemaRoute],
    callback: BodyResponseCallback[SchemaRoute]
  ): Unit = js.native
  def get(params: ParamsResourceNamespacesRoutesGet, options: MethodOptions): GaxiosPromise[SchemaRoute] = js.native
  def get(
    params: ParamsResourceNamespacesRoutesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRoute]
  ): Unit = js.native
  
  /**
    * run.namespaces.routes.list
    * @desc Rpc to list routes.
    * @alias run.namespaces.routes.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.continue Optional encoded string to continue paging.
    * @param {string=} params.fieldSelector Allows to filter resources based on a specific value for a field name. Send this in a query string format. i.e. 'metadata.name%3Dlorem'. Not currently used by Cloud Run.
    * @param {boolean=} params.includeUninitialized Not currently used by Cloud Run.
    * @param {string=} params.labelSelector Allows to filter resources based on a label. Supported operations are =, !=, exists, in, and notIn.
    * @param {integer=} params.limit The maximum number of records that should be returned.
    * @param {string} params.parent The project ID or project number from which the routes should be listed.
    * @param {string=} params.resourceVersion The baseline resource version from which the list or watch operation should start. Not currently used by Cloud Run.
    * @param {boolean=} params.watch Flag that indicates that the client expects to watch this resource as well. Not currently used by Cloud Run.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListRoutesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListRoutesResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListRoutesResponse] = js.native
  def list(params: ParamsResourceNamespacesRoutesList): GaxiosPromise[SchemaListRoutesResponse] = js.native
  def list(
    params: ParamsResourceNamespacesRoutesList,
    callback: BodyResponseCallback[SchemaListRoutesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceNamespacesRoutesList,
    options: BodyResponseCallback[SchemaListRoutesResponse],
    callback: BodyResponseCallback[SchemaListRoutesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceNamespacesRoutesList, options: MethodOptions): GaxiosPromise[SchemaListRoutesResponse] = js.native
  def list(
    params: ParamsResourceNamespacesRoutesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListRoutesResponse]
  ): Unit = js.native
}
