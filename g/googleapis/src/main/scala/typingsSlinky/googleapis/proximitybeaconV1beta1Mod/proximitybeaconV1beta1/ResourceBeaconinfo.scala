package typingsSlinky.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1

import typingsSlinky.gaxios.commonMod.GaxiosPromise
import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.BodyResponseCallback
import typingsSlinky.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/proximitybeacon/v1beta1", "proximitybeacon_v1beta1.Resource$Beaconinfo")
@js.native
class ResourceBeaconinfo protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * proximitybeacon.beaconinfo.getforobserved
    * @desc Given one or more beacon observations, returns any beacon
    * information and attachments accessible to your application. Authorize by
    * using the [API
    * key](https://developers.google.com/beacons/proximity/get-started#request_a_browser_api_key)
    * for the application.
    * @alias proximitybeacon.beaconinfo.getforobserved
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().GetInfoForObservedBeaconsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getforobserved(): GaxiosPromise[SchemaGetInfoForObservedBeaconsResponse] = js.native
  def getforobserved(callback: BodyResponseCallback[SchemaGetInfoForObservedBeaconsResponse]): Unit = js.native
  def getforobserved(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGetInfoForObservedBeaconsResponse] = js.native
  def getforobserved(params: ParamsResourceBeaconinfoGetforobserved): GaxiosPromise[SchemaGetInfoForObservedBeaconsResponse] = js.native
  def getforobserved(
    params: ParamsResourceBeaconinfoGetforobserved,
    callback: BodyResponseCallback[SchemaGetInfoForObservedBeaconsResponse]
  ): Unit = js.native
  def getforobserved(
    params: ParamsResourceBeaconinfoGetforobserved,
    options: BodyResponseCallback[SchemaGetInfoForObservedBeaconsResponse],
    callback: BodyResponseCallback[SchemaGetInfoForObservedBeaconsResponse]
  ): Unit = js.native
  def getforobserved(params: ParamsResourceBeaconinfoGetforobserved, options: MethodOptions): GaxiosPromise[SchemaGetInfoForObservedBeaconsResponse] = js.native
  def getforobserved(
    params: ParamsResourceBeaconinfoGetforobserved,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGetInfoForObservedBeaconsResponse]
  ): Unit = js.native
}
