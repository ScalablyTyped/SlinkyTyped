package typingsSlinky.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha

import typingsSlinky.gaxios.commonMod.GaxiosPromise
import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.BodyResponseCallback
import typingsSlinky.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/remotebuildexecution/v1alpha", "remotebuildexecution_v1alpha.Resource$Projects$Operations")
@js.native
class ResourceProjectsOperations protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * remotebuildexecution.projects.operations.get
    * @desc Gets the latest state of a long-running operation.  Clients can use
    * this method to poll the operation result at intervals as recommended by
    * the API service.
    * @alias remotebuildexecution.projects.operations.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the operation resource.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def get(params: ParamsResourceProjectsOperationsGet): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def get(
    params: ParamsResourceProjectsOperationsGet,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsOperationsGet,
    options: BodyResponseCallback[SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsOperationsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def get(
    params: ParamsResourceProjectsOperationsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
}
