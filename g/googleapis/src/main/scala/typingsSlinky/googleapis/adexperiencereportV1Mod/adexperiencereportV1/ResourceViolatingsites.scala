package typingsSlinky.googleapis.adexperiencereportV1Mod.adexperiencereportV1

import typingsSlinky.gaxios.commonMod.GaxiosPromise
import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.BodyResponseCallback
import typingsSlinky.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/adexperiencereport/v1", "adexperiencereport_v1.Resource$Violatingsites")
@js.native
class ResourceViolatingsites protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * adexperiencereport.violatingSites.list
    * @desc Lists sites with Ad Experience Report statuses of "Failing" or
    * "Warning".
    * @alias adexperiencereport.violatingSites.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaViolatingSitesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaViolatingSitesResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaViolatingSitesResponse] = js.native
  def list(params: ParamsResourceViolatingsitesList): GaxiosPromise[SchemaViolatingSitesResponse] = js.native
  def list(
    params: ParamsResourceViolatingsitesList,
    callback: BodyResponseCallback[SchemaViolatingSitesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceViolatingsitesList,
    options: BodyResponseCallback[SchemaViolatingSitesResponse],
    callback: BodyResponseCallback[SchemaViolatingSitesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceViolatingsitesList, options: MethodOptions): GaxiosPromise[SchemaViolatingSitesResponse] = js.native
  def list(
    params: ParamsResourceViolatingsitesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaViolatingSitesResponse]
  ): Unit = js.native
}
