package typingsSlinky.googleapis.cloudiotV1Mod.cloudiotV1

import typingsSlinky.gaxios.commonMod.GaxiosPromise
import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.BodyResponseCallback
import typingsSlinky.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudiot/v1", "cloudiot_v1.Resource$Projects$Locations$Registries$Devices$States")
@js.native
class ResourceProjectsLocationsRegistriesDevicesStates protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * cloudiot.projects.locations.registries.devices.states.list
    * @desc Lists the last few versions of the device state in descending order
    * (i.e.: newest first).
    * @alias cloudiot.projects.locations.registries.devices.states.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the device. For example, `projects/p0/locations/us-central1/registries/registry0/devices/device0` or `projects/p0/locations/us-central1/registries/registry0/devices/{num_id}`.
    * @param {integer=} params.numStates The number of states to list. States are listed in descending order of update time. The maximum number of states retained is 10. If this value is zero, it will return all the states available.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListDeviceStatesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListDeviceStatesResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListDeviceStatesResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsRegistriesDevicesStatesList): GaxiosPromise[SchemaListDeviceStatesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsRegistriesDevicesStatesList,
    callback: BodyResponseCallback[SchemaListDeviceStatesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsRegistriesDevicesStatesList,
    options: BodyResponseCallback[SchemaListDeviceStatesResponse],
    callback: BodyResponseCallback[SchemaListDeviceStatesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsRegistriesDevicesStatesList, options: MethodOptions): GaxiosPromise[SchemaListDeviceStatesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsRegistriesDevicesStatesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListDeviceStatesResponse]
  ): Unit = js.native
}
