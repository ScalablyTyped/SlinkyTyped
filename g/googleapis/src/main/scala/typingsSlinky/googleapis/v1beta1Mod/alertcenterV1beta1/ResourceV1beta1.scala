package typingsSlinky.googleapis.v1beta1Mod.alertcenterV1beta1

import typingsSlinky.gaxios.commonMod.GaxiosPromise
import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.BodyResponseCallback
import typingsSlinky.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/alertcenter/v1beta1", "alertcenter_v1beta1.Resource$V1beta1")
@js.native
class ResourceV1beta1 protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * alertcenter.getSettings
    * @desc Returns customer-level settings.
    * @alias alertcenter.getSettings
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.customerId Optional. The unique identifier of the G Suite organization account of the customer the alert settings are associated with. Inferred from the caller identity if not provided.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getSettings(): GaxiosPromise[SchemaSettings] = js.native
  def getSettings(callback: BodyResponseCallback[SchemaSettings]): Unit = js.native
  def getSettings(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSettings] = js.native
  def getSettings(params: ParamsResourceV1beta1Getsettings): GaxiosPromise[SchemaSettings] = js.native
  def getSettings(params: ParamsResourceV1beta1Getsettings, callback: BodyResponseCallback[SchemaSettings]): Unit = js.native
  def getSettings(
    params: ParamsResourceV1beta1Getsettings,
    options: BodyResponseCallback[SchemaSettings],
    callback: BodyResponseCallback[SchemaSettings]
  ): Unit = js.native
  def getSettings(params: ParamsResourceV1beta1Getsettings, options: MethodOptions): GaxiosPromise[SchemaSettings] = js.native
  def getSettings(
    params: ParamsResourceV1beta1Getsettings,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSettings]
  ): Unit = js.native
  
  /**
    * alertcenter.updateSettings
    * @desc Updates the customer-level settings.
    * @alias alertcenter.updateSettings
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.customerId Optional. The unique identifier of the G Suite organization account of the customer the alert settings are associated with. Inferred from the caller identity if not provided.
    * @param {().Settings} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def updateSettings(): GaxiosPromise[SchemaSettings] = js.native
  def updateSettings(callback: BodyResponseCallback[SchemaSettings]): Unit = js.native
  def updateSettings(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSettings] = js.native
  def updateSettings(params: ParamsResourceV1beta1Updatesettings): GaxiosPromise[SchemaSettings] = js.native
  def updateSettings(params: ParamsResourceV1beta1Updatesettings, callback: BodyResponseCallback[SchemaSettings]): Unit = js.native
  def updateSettings(
    params: ParamsResourceV1beta1Updatesettings,
    options: BodyResponseCallback[SchemaSettings],
    callback: BodyResponseCallback[SchemaSettings]
  ): Unit = js.native
  def updateSettings(params: ParamsResourceV1beta1Updatesettings, options: MethodOptions): GaxiosPromise[SchemaSettings] = js.native
  def updateSettings(
    params: ParamsResourceV1beta1Updatesettings,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSettings]
  ): Unit = js.native
}
