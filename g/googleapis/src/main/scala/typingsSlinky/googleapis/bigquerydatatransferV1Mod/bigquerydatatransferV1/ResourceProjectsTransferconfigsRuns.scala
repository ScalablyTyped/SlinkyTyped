package typingsSlinky.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1

import typingsSlinky.gaxios.commonMod.GaxiosPromise
import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.BodyResponseCallback
import typingsSlinky.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/bigquerydatatransfer/v1", "bigquerydatatransfer_v1.Resource$Projects$Transferconfigs$Runs")
@js.native
class ResourceProjectsTransferconfigsRuns protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * bigquerydatatransfer.projects.transferConfigs.runs.delete
    * @desc Deletes the specified transfer run.
    * @alias bigquerydatatransfer.projects.transferConfigs.runs.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The field will contain name of the resource requested, for example: `projects/{project_id}/transferConfigs/{config_id}/runs/{run_id}`
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsTransferconfigsRunsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsTransferconfigsRunsDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsTransferconfigsRunsDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsTransferconfigsRunsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsTransferconfigsRunsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  
  /**
    * bigquerydatatransfer.projects.transferConfigs.runs.get
    * @desc Returns information about the particular transfer run.
    * @alias bigquerydatatransfer.projects.transferConfigs.runs.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The field will contain name of the resource requested, for example: `projects/{project_id}/transferConfigs/{config_id}/runs/{run_id}`
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaTransferRun] = js.native
  def get(callback: BodyResponseCallback[SchemaTransferRun]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTransferRun] = js.native
  def get(params: ParamsResourceProjectsTransferconfigsRunsGet): GaxiosPromise[SchemaTransferRun] = js.native
  def get(
    params: ParamsResourceProjectsTransferconfigsRunsGet,
    callback: BodyResponseCallback[SchemaTransferRun]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsTransferconfigsRunsGet,
    options: BodyResponseCallback[SchemaTransferRun],
    callback: BodyResponseCallback[SchemaTransferRun]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsTransferconfigsRunsGet, options: MethodOptions): GaxiosPromise[SchemaTransferRun] = js.native
  def get(
    params: ParamsResourceProjectsTransferconfigsRunsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTransferRun]
  ): Unit = js.native
  
  /**
    * bigquerydatatransfer.projects.transferConfigs.runs.list
    * @desc Returns information about running and completed jobs.
    * @alias bigquerydatatransfer.projects.transferConfigs.runs.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Page size. The default page size is the maximum value of 1000 results.
    * @param {string=} params.pageToken Pagination token, which can be used to request a specific page of `ListTransferRunsRequest` list results. For multiple-page results, `ListTransferRunsResponse` outputs a `next_page` token, which can be used as the `page_token` value to request the next page of list results.
    * @param {string} params.parent Name of transfer configuration for which transfer runs should be retrieved. Format of transfer configuration resource name is: `projects/{project_id}/transferConfigs/{config_id}`.
    * @param {string=} params.runAttempt Indicates how run attempts are to be pulled.
    * @param {string=} params.states When specified, only transfer runs with requested states are returned.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListTransferRunsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListTransferRunsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListTransferRunsResponse] = js.native
  def list(params: ParamsResourceProjectsTransferconfigsRunsList): GaxiosPromise[SchemaListTransferRunsResponse] = js.native
  def list(
    params: ParamsResourceProjectsTransferconfigsRunsList,
    callback: BodyResponseCallback[SchemaListTransferRunsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsTransferconfigsRunsList,
    options: BodyResponseCallback[SchemaListTransferRunsResponse],
    callback: BodyResponseCallback[SchemaListTransferRunsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsTransferconfigsRunsList, options: MethodOptions): GaxiosPromise[SchemaListTransferRunsResponse] = js.native
  def list(
    params: ParamsResourceProjectsTransferconfigsRunsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListTransferRunsResponse]
  ): Unit = js.native
  
  var transferLogs: ResourceProjectsTransferconfigsRunsTransferlogs = js.native
}
