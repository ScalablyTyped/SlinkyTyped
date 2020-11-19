package typingsSlinky.googleapis.reportsV1Mod.adminReportsV1

import typingsSlinky.gaxios.commonMod.GaxiosPromise
import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.BodyResponseCallback
import typingsSlinky.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/admin/reports_v1", "admin_reports_v1.Resource$Customerusagereports")
@js.native
class ResourceCustomerusagereports protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * reports.customerUsageReports.get
    * @desc Retrieves a report which is a collection of properties / statistics
    * for a specific customer.
    * @alias reports.customerUsageReports.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.customerId Represents the customer for which the data is to be fetched.
    * @param {string} params.date Represents the date in yyyy-mm-dd format for which the data is to be fetched.
    * @param {string=} params.pageToken Token to specify next page.
    * @param {string=} params.parameters Represents the application name, parameter name pairs to fetch in csv as app_name1:param_name1, app_name2:param_name2.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaUsageReports] = js.native
  def get(callback: BodyResponseCallback[SchemaUsageReports]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaUsageReports] = js.native
  def get(params: ParamsResourceCustomerusagereportsGet): GaxiosPromise[SchemaUsageReports] = js.native
  def get(params: ParamsResourceCustomerusagereportsGet, callback: BodyResponseCallback[SchemaUsageReports]): Unit = js.native
  def get(
    params: ParamsResourceCustomerusagereportsGet,
    options: BodyResponseCallback[SchemaUsageReports],
    callback: BodyResponseCallback[SchemaUsageReports]
  ): Unit = js.native
  def get(params: ParamsResourceCustomerusagereportsGet, options: MethodOptions): GaxiosPromise[SchemaUsageReports] = js.native
  def get(
    params: ParamsResourceCustomerusagereportsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUsageReports]
  ): Unit = js.native
}
