package typingsSlinky.googleapis.v14Mod.adexchangebuyerV14

import typingsSlinky.gaxios.commonMod.GaxiosPromise
import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.BodyResponseCallback
import typingsSlinky.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/adexchangebuyer/v1.4", "adexchangebuyer_v1_4.Resource$Performancereport")
@js.native
class ResourcePerformancereport protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * adexchangebuyer.performanceReport.list
    * @desc Retrieves the authenticated user's list of performance metrics.
    * @alias adexchangebuyer.performanceReport.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The account id to get the reports.
    * @param {string} params.endDateTime The end time of the report in ISO 8601 timestamp format using UTC.
    * @param {integer=} params.maxResults Maximum number of entries returned on one result page. If not set, the default is 100. Optional.
    * @param {string=} params.pageToken A continuation token, used to page through performance reports. To retrieve the next page, set this parameter to the value of "nextPageToken" from the previous response. Optional.
    * @param {string} params.startDateTime The start time of the report in ISO 8601 timestamp format using UTC.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaPerformanceReportList] = js.native
  def list(callback: BodyResponseCallback[SchemaPerformanceReportList]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPerformanceReportList] = js.native
  def list(params: ParamsResourcePerformancereportList): GaxiosPromise[SchemaPerformanceReportList] = js.native
  def list(
    params: ParamsResourcePerformancereportList,
    callback: BodyResponseCallback[SchemaPerformanceReportList]
  ): Unit = js.native
  def list(
    params: ParamsResourcePerformancereportList,
    options: BodyResponseCallback[SchemaPerformanceReportList],
    callback: BodyResponseCallback[SchemaPerformanceReportList]
  ): Unit = js.native
  def list(params: ParamsResourcePerformancereportList, options: MethodOptions): GaxiosPromise[SchemaPerformanceReportList] = js.native
  def list(
    params: ParamsResourcePerformancereportList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPerformanceReportList]
  ): Unit = js.native
}
