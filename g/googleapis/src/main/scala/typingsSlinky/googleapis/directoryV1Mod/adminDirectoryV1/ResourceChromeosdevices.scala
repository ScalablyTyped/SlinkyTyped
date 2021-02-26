package typingsSlinky.googleapis.directoryV1Mod.adminDirectoryV1

import typingsSlinky.gaxios.commonMod.GaxiosPromise
import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.BodyResponseCallback
import typingsSlinky.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Chromeosdevices")
@js.native
class ResourceChromeosdevices protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  /**
    * directory.chromeosdevices.action
    * @desc Take action on Chrome OS Device
    * @alias directory.chromeosdevices.action
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId Immutable ID of the G Suite account
    * @param {string} params.resourceId Immutable ID of Chrome OS Device
    * @param {().ChromeOsDeviceAction} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def action(): GaxiosPromise[Unit] = js.native
  def action(callback: BodyResponseCallback[Unit]): Unit = js.native
  def action(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def action(params: ParamsResourceChromeosdevicesAction): GaxiosPromise[Unit] = js.native
  def action(params: ParamsResourceChromeosdevicesAction, callback: BodyResponseCallback[Unit]): Unit = js.native
  def action(
    params: ParamsResourceChromeosdevicesAction,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def action(params: ParamsResourceChromeosdevicesAction, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def action(
    params: ParamsResourceChromeosdevicesAction,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  /**
    * directory.chromeosdevices.get
    * @desc Retrieve Chrome OS Device
    * @alias directory.chromeosdevices.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId Immutable ID of the G Suite account
    * @param {string} params.deviceId Immutable ID of Chrome OS Device
    * @param {string=} params.projection Restrict information returned to a set of selected fields.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaChromeOsDevice] = js.native
  def get(callback: BodyResponseCallback[SchemaChromeOsDevice]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaChromeOsDevice] = js.native
  def get(params: ParamsResourceChromeosdevicesGet): GaxiosPromise[SchemaChromeOsDevice] = js.native
  def get(params: ParamsResourceChromeosdevicesGet, callback: BodyResponseCallback[SchemaChromeOsDevice]): Unit = js.native
  def get(
    params: ParamsResourceChromeosdevicesGet,
    options: BodyResponseCallback[SchemaChromeOsDevice],
    callback: BodyResponseCallback[SchemaChromeOsDevice]
  ): Unit = js.native
  def get(params: ParamsResourceChromeosdevicesGet, options: MethodOptions): GaxiosPromise[SchemaChromeOsDevice] = js.native
  def get(
    params: ParamsResourceChromeosdevicesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaChromeOsDevice]
  ): Unit = js.native
  
  /**
    * directory.chromeosdevices.list
    * @desc Retrieve all Chrome OS Devices of a customer (paginated)
    * @alias directory.chromeosdevices.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId Immutable ID of the G Suite account
    * @param {integer=} params.maxResults Maximum number of results to return. Default is 100
    * @param {string=} params.orderBy Column to use for sorting results
    * @param {string=} params.orgUnitPath Full path of the organizational unit or its ID
    * @param {string=} params.pageToken Token to specify next page in the list
    * @param {string=} params.projection Restrict information returned to a set of selected fields.
    * @param {string=} params.query Search string in the format given at http://support.google.com/chromeos/a/bin/answer.py?answer=1698333
    * @param {string=} params.sortOrder Whether to return results in ascending or descending order. Only of use when orderBy is also used
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaChromeOsDevices] = js.native
  def list(callback: BodyResponseCallback[SchemaChromeOsDevices]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaChromeOsDevices] = js.native
  def list(params: ParamsResourceChromeosdevicesList): GaxiosPromise[SchemaChromeOsDevices] = js.native
  def list(params: ParamsResourceChromeosdevicesList, callback: BodyResponseCallback[SchemaChromeOsDevices]): Unit = js.native
  def list(
    params: ParamsResourceChromeosdevicesList,
    options: BodyResponseCallback[SchemaChromeOsDevices],
    callback: BodyResponseCallback[SchemaChromeOsDevices]
  ): Unit = js.native
  def list(params: ParamsResourceChromeosdevicesList, options: MethodOptions): GaxiosPromise[SchemaChromeOsDevices] = js.native
  def list(
    params: ParamsResourceChromeosdevicesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaChromeOsDevices]
  ): Unit = js.native
  
  /**
    * directory.chromeosdevices.moveDevicesToOu
    * @desc Move or insert multiple Chrome OS Devices to organizational unit
    * @alias directory.chromeosdevices.moveDevicesToOu
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId Immutable ID of the G Suite account
    * @param {string} params.orgUnitPath Full path of the target organizational unit or its ID
    * @param {().ChromeOsMoveDevicesToOu} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def moveDevicesToOu(): GaxiosPromise[Unit] = js.native
  def moveDevicesToOu(callback: BodyResponseCallback[Unit]): Unit = js.native
  def moveDevicesToOu(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def moveDevicesToOu(params: ParamsResourceChromeosdevicesMovedevicestoou): GaxiosPromise[Unit] = js.native
  def moveDevicesToOu(params: ParamsResourceChromeosdevicesMovedevicestoou, callback: BodyResponseCallback[Unit]): Unit = js.native
  def moveDevicesToOu(
    params: ParamsResourceChromeosdevicesMovedevicestoou,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def moveDevicesToOu(params: ParamsResourceChromeosdevicesMovedevicestoou, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def moveDevicesToOu(
    params: ParamsResourceChromeosdevicesMovedevicestoou,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * directory.chromeosdevices.patch
    * @desc Update Chrome OS Device. This method supports patch semantics.
    * @alias directory.chromeosdevices.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId Immutable ID of the G Suite account
    * @param {string} params.deviceId Immutable ID of Chrome OS Device
    * @param {string=} params.projection Restrict information returned to a set of selected fields.
    * @param {().ChromeOsDevice} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaChromeOsDevice] = js.native
  def patch(callback: BodyResponseCallback[SchemaChromeOsDevice]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaChromeOsDevice] = js.native
  def patch(params: ParamsResourceChromeosdevicesPatch): GaxiosPromise[SchemaChromeOsDevice] = js.native
  def patch(params: ParamsResourceChromeosdevicesPatch, callback: BodyResponseCallback[SchemaChromeOsDevice]): Unit = js.native
  def patch(
    params: ParamsResourceChromeosdevicesPatch,
    options: BodyResponseCallback[SchemaChromeOsDevice],
    callback: BodyResponseCallback[SchemaChromeOsDevice]
  ): Unit = js.native
  def patch(params: ParamsResourceChromeosdevicesPatch, options: MethodOptions): GaxiosPromise[SchemaChromeOsDevice] = js.native
  def patch(
    params: ParamsResourceChromeosdevicesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaChromeOsDevice]
  ): Unit = js.native
  
  /**
    * directory.chromeosdevices.update
    * @desc Update Chrome OS Device
    * @alias directory.chromeosdevices.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId Immutable ID of the G Suite account
    * @param {string} params.deviceId Immutable ID of Chrome OS Device
    * @param {string=} params.projection Restrict information returned to a set of selected fields.
    * @param {().ChromeOsDevice} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaChromeOsDevice] = js.native
  def update(callback: BodyResponseCallback[SchemaChromeOsDevice]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaChromeOsDevice] = js.native
  def update(params: ParamsResourceChromeosdevicesUpdate): GaxiosPromise[SchemaChromeOsDevice] = js.native
  def update(params: ParamsResourceChromeosdevicesUpdate, callback: BodyResponseCallback[SchemaChromeOsDevice]): Unit = js.native
  def update(
    params: ParamsResourceChromeosdevicesUpdate,
    options: BodyResponseCallback[SchemaChromeOsDevice],
    callback: BodyResponseCallback[SchemaChromeOsDevice]
  ): Unit = js.native
  def update(params: ParamsResourceChromeosdevicesUpdate, options: MethodOptions): GaxiosPromise[SchemaChromeOsDevice] = js.native
  def update(
    params: ParamsResourceChromeosdevicesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaChromeOsDevice]
  ): Unit = js.native
}
