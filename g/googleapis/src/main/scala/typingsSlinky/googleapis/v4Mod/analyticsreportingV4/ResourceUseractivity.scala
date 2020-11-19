package typingsSlinky.googleapis.v4Mod.analyticsreportingV4

import typingsSlinky.gaxios.commonMod.GaxiosPromise
import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.BodyResponseCallback
import typingsSlinky.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/analyticsreporting/v4", "analyticsreporting_v4.Resource$Useractivity")
@js.native
class ResourceUseractivity protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * analyticsreporting.userActivity.search
    * @desc Returns User Activity data.
    * @alias analyticsreporting.userActivity.search
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().SearchUserActivityRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def search(): GaxiosPromise[SchemaSearchUserActivityResponse] = js.native
  def search(callback: BodyResponseCallback[SchemaSearchUserActivityResponse]): Unit = js.native
  def search(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSearchUserActivityResponse] = js.native
  def search(params: ParamsResourceUseractivitySearch): GaxiosPromise[SchemaSearchUserActivityResponse] = js.native
  def search(
    params: ParamsResourceUseractivitySearch,
    callback: BodyResponseCallback[SchemaSearchUserActivityResponse]
  ): Unit = js.native
  def search(
    params: ParamsResourceUseractivitySearch,
    options: BodyResponseCallback[SchemaSearchUserActivityResponse],
    callback: BodyResponseCallback[SchemaSearchUserActivityResponse]
  ): Unit = js.native
  def search(params: ParamsResourceUseractivitySearch, options: MethodOptions): GaxiosPromise[SchemaSearchUserActivityResponse] = js.native
  def search(
    params: ParamsResourceUseractivitySearch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSearchUserActivityResponse]
  ): Unit = js.native
}
