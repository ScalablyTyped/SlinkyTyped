package typingsSlinky.googleapis.cloudassetV1Mod.cloudassetV1

import typingsSlinky.gaxios.commonMod.GaxiosPromise
import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.BodyResponseCallback
import typingsSlinky.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudasset/v1", "cloudasset_v1.Resource$V1")
@js.native
class ResourceV1 protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  /**
    * cloudasset.batchGetAssetsHistory
    * @desc Batch gets the update history of assets that overlap a time window.
    * For RESOURCE content, this API outputs history with asset in both
    * non-delete or deleted status. For IAM_POLICY content, this API outputs
    * history when the asset and its attached IAM POLICY both exist. This can
    * create gaps in the output history. If a specified asset does not exist,
    * this API returns an INVALID_ARGUMENT error.
    * @alias cloudasset.batchGetAssetsHistory
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.assetNames A list of the full names of the assets. For example: `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1`. See [Resource Names](https://cloud.google.com/apis/design/resource_names#full_resource_name) and [Resource Name Format](https://cloud.google.com/resource-manager/docs/cloud-asset-inventory/resource-name-format) for more info.  The request becomes a no-op if the asset name list is empty, and the max size of the asset name list is 100 in one request.
    * @param {string=} params.contentType Required. The content type.
    * @param {string} params.parent Required. The relative name of the root asset. It can only be an organization number (such as "organizations/123"), a project ID (such as "projects/my-project-id")", or a project number (such as "projects/12345").
    * @param {string=} params.readTimeWindow.endTime End time of the time window (inclusive). Current timestamp if not specified.
    * @param {string=} params.readTimeWindow.startTime Start time of the time window (exclusive).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def batchGetAssetsHistory(): GaxiosPromise[SchemaBatchGetAssetsHistoryResponse] = js.native
  def batchGetAssetsHistory(callback: BodyResponseCallback[SchemaBatchGetAssetsHistoryResponse]): Unit = js.native
  def batchGetAssetsHistory(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaBatchGetAssetsHistoryResponse] = js.native
  def batchGetAssetsHistory(params: ParamsResourceV1Batchgetassetshistory): GaxiosPromise[SchemaBatchGetAssetsHistoryResponse] = js.native
  def batchGetAssetsHistory(
    params: ParamsResourceV1Batchgetassetshistory,
    callback: BodyResponseCallback[SchemaBatchGetAssetsHistoryResponse]
  ): Unit = js.native
  def batchGetAssetsHistory(
    params: ParamsResourceV1Batchgetassetshistory,
    options: BodyResponseCallback[SchemaBatchGetAssetsHistoryResponse],
    callback: BodyResponseCallback[SchemaBatchGetAssetsHistoryResponse]
  ): Unit = js.native
  def batchGetAssetsHistory(params: ParamsResourceV1Batchgetassetshistory, options: MethodOptions): GaxiosPromise[SchemaBatchGetAssetsHistoryResponse] = js.native
  def batchGetAssetsHistory(
    params: ParamsResourceV1Batchgetassetshistory,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBatchGetAssetsHistoryResponse]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  /**
    * cloudasset.exportAssets
    * @desc Exports assets with time and resource types to a given Cloud
    * Storage location. The output format is newline-delimited JSON. This API
    * implements the google.longrunning.Operation API allowing you to keep
    * track of the export.
    * @alias cloudasset.exportAssets
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The relative name of the root asset. This can only be an organization number (such as "organizations/123"), a project ID (such as "projects/my-project-id"), or a project number (such as "projects/12345"), or a folder number (such as "folders/123").
    * @param {().ExportAssetsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def exportAssets(): GaxiosPromise[SchemaOperation] = js.native
  def exportAssets(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def exportAssets(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def exportAssets(params: ParamsResourceV1Exportassets): GaxiosPromise[SchemaOperation] = js.native
  def exportAssets(params: ParamsResourceV1Exportassets, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def exportAssets(
    params: ParamsResourceV1Exportassets,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def exportAssets(params: ParamsResourceV1Exportassets, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def exportAssets(
    params: ParamsResourceV1Exportassets,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
}
