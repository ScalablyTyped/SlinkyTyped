package typingsSlinky.googleapis.v33Mod.dfareportingV33

import typingsSlinky.gaxios.commonMod.GaxiosPromise
import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.BodyResponseCallback
import typingsSlinky.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v3.3", "dfareporting_v3_3.Resource$Metros")
@js.native
class ResourceMetros protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * dfareporting.metros.list
    * @desc Retrieves a list of metros.
    * @alias dfareporting.metros.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaMetrosListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaMetrosListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaMetrosListResponse] = js.native
  def list(params: ParamsResourceMetrosList): GaxiosPromise[SchemaMetrosListResponse] = js.native
  def list(params: ParamsResourceMetrosList, callback: BodyResponseCallback[SchemaMetrosListResponse]): Unit = js.native
  def list(
    params: ParamsResourceMetrosList,
    options: BodyResponseCallback[SchemaMetrosListResponse],
    callback: BodyResponseCallback[SchemaMetrosListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceMetrosList, options: MethodOptions): GaxiosPromise[SchemaMetrosListResponse] = js.native
  def list(
    params: ParamsResourceMetrosList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMetrosListResponse]
  ): Unit = js.native
}
