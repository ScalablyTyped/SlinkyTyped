package typingsSlinky.googleapis.v31Mod.dfareportingV31

import typingsSlinky.gaxios.commonMod.GaxiosPromise
import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.BodyResponseCallback
import typingsSlinky.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v3.1", "dfareporting_v3_1.Resource$Regions")
@js.native
class ResourceRegions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * dfareporting.regions.list
    * @desc Retrieves a list of regions.
    * @alias dfareporting.regions.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaRegionsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaRegionsListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaRegionsListResponse] = js.native
  def list(params: ParamsResourceRegionsList): GaxiosPromise[SchemaRegionsListResponse] = js.native
  def list(params: ParamsResourceRegionsList, callback: BodyResponseCallback[SchemaRegionsListResponse]): Unit = js.native
  def list(
    params: ParamsResourceRegionsList,
    options: BodyResponseCallback[SchemaRegionsListResponse],
    callback: BodyResponseCallback[SchemaRegionsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceRegionsList, options: MethodOptions): GaxiosPromise[SchemaRegionsListResponse] = js.native
  def list(
    params: ParamsResourceRegionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRegionsListResponse]
  ): Unit = js.native
}
