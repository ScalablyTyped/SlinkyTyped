package typingsSlinky.googleapis.v31Mod.dfareportingV31

import typingsSlinky.gaxios.commonMod.GaxiosPromise
import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.BodyResponseCallback
import typingsSlinky.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v3.1", "dfareporting_v3_1.Resource$Browsers")
@js.native
class ResourceBrowsers protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * dfareporting.browsers.list
    * @desc Retrieves a list of browsers.
    * @alias dfareporting.browsers.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaBrowsersListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaBrowsersListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaBrowsersListResponse] = js.native
  def list(params: ParamsResourceBrowsersList): GaxiosPromise[SchemaBrowsersListResponse] = js.native
  def list(params: ParamsResourceBrowsersList, callback: BodyResponseCallback[SchemaBrowsersListResponse]): Unit = js.native
  def list(
    params: ParamsResourceBrowsersList,
    options: BodyResponseCallback[SchemaBrowsersListResponse],
    callback: BodyResponseCallback[SchemaBrowsersListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceBrowsersList, options: MethodOptions): GaxiosPromise[SchemaBrowsersListResponse] = js.native
  def list(
    params: ParamsResourceBrowsersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBrowsersListResponse]
  ): Unit = js.native
}
