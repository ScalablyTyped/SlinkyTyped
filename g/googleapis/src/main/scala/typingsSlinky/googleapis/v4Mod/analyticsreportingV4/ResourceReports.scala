package typingsSlinky.googleapis.v4Mod.analyticsreportingV4

import typingsSlinky.gaxios.commonMod.GaxiosPromise
import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.BodyResponseCallback
import typingsSlinky.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/analyticsreporting/v4", "analyticsreporting_v4.Resource$Reports")
@js.native
class ResourceReports protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  /**
    * analyticsreporting.reports.batchGet
    * @desc Returns the Analytics data.
    * @alias analyticsreporting.reports.batchGet
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().GetReportsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def batchGet(): GaxiosPromise[SchemaGetReportsResponse] = js.native
  def batchGet(callback: BodyResponseCallback[SchemaGetReportsResponse]): Unit = js.native
  def batchGet(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGetReportsResponse] = js.native
  def batchGet(params: ParamsResourceReportsBatchget): GaxiosPromise[SchemaGetReportsResponse] = js.native
  def batchGet(params: ParamsResourceReportsBatchget, callback: BodyResponseCallback[SchemaGetReportsResponse]): Unit = js.native
  def batchGet(
    params: ParamsResourceReportsBatchget,
    options: BodyResponseCallback[SchemaGetReportsResponse],
    callback: BodyResponseCallback[SchemaGetReportsResponse]
  ): Unit = js.native
  def batchGet(params: ParamsResourceReportsBatchget, options: MethodOptions): GaxiosPromise[SchemaGetReportsResponse] = js.native
  def batchGet(
    params: ParamsResourceReportsBatchget,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGetReportsResponse]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
}
