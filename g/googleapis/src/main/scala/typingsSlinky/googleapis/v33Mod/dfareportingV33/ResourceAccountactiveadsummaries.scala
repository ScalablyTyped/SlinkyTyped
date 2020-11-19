package typingsSlinky.googleapis.v33Mod.dfareportingV33

import typingsSlinky.gaxios.commonMod.GaxiosPromise
import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.BodyResponseCallback
import typingsSlinky.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v3.3", "dfareporting_v3_3.Resource$Accountactiveadsummaries")
@js.native
class ResourceAccountactiveadsummaries protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * dfareporting.accountActiveAdSummaries.get
    * @desc Gets the account's active ad summary by account ID.
    * @alias dfareporting.accountActiveAdSummaries.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string} params.summaryAccountId Account ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaAccountActiveAdSummary] = js.native
  def get(callback: BodyResponseCallback[SchemaAccountActiveAdSummary]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAccountActiveAdSummary] = js.native
  def get(params: ParamsResourceAccountactiveadsummariesGet): GaxiosPromise[SchemaAccountActiveAdSummary] = js.native
  def get(
    params: ParamsResourceAccountactiveadsummariesGet,
    callback: BodyResponseCallback[SchemaAccountActiveAdSummary]
  ): Unit = js.native
  def get(
    params: ParamsResourceAccountactiveadsummariesGet,
    options: BodyResponseCallback[SchemaAccountActiveAdSummary],
    callback: BodyResponseCallback[SchemaAccountActiveAdSummary]
  ): Unit = js.native
  def get(params: ParamsResourceAccountactiveadsummariesGet, options: MethodOptions): GaxiosPromise[SchemaAccountActiveAdSummary] = js.native
  def get(
    params: ParamsResourceAccountactiveadsummariesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccountActiveAdSummary]
  ): Unit = js.native
}
