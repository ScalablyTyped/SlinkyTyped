package typingsSlinky.googleapis.v32Mod.dfareportingV32

import typingsSlinky.gaxios.commonMod.GaxiosPromise
import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.BodyResponseCallback
import typingsSlinky.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v3.2", "dfareporting_v3_2.Resource$Mobilecarriers")
@js.native
class ResourceMobilecarriers protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * dfareporting.mobileCarriers.get
    * @desc Gets one mobile carrier by ID.
    * @alias dfareporting.mobileCarriers.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Mobile carrier ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaMobileCarrier] = js.native
  def get(callback: BodyResponseCallback[SchemaMobileCarrier]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaMobileCarrier] = js.native
  def get(params: ParamsResourceMobilecarriersGet): GaxiosPromise[SchemaMobileCarrier] = js.native
  def get(params: ParamsResourceMobilecarriersGet, callback: BodyResponseCallback[SchemaMobileCarrier]): Unit = js.native
  def get(
    params: ParamsResourceMobilecarriersGet,
    options: BodyResponseCallback[SchemaMobileCarrier],
    callback: BodyResponseCallback[SchemaMobileCarrier]
  ): Unit = js.native
  def get(params: ParamsResourceMobilecarriersGet, options: MethodOptions): GaxiosPromise[SchemaMobileCarrier] = js.native
  def get(
    params: ParamsResourceMobilecarriersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMobileCarrier]
  ): Unit = js.native
  
  /**
    * dfareporting.mobileCarriers.list
    * @desc Retrieves a list of mobile carriers.
    * @alias dfareporting.mobileCarriers.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaMobileCarriersListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaMobileCarriersListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaMobileCarriersListResponse] = js.native
  def list(params: ParamsResourceMobilecarriersList): GaxiosPromise[SchemaMobileCarriersListResponse] = js.native
  def list(
    params: ParamsResourceMobilecarriersList,
    callback: BodyResponseCallback[SchemaMobileCarriersListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceMobilecarriersList,
    options: BodyResponseCallback[SchemaMobileCarriersListResponse],
    callback: BodyResponseCallback[SchemaMobileCarriersListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceMobilecarriersList, options: MethodOptions): GaxiosPromise[SchemaMobileCarriersListResponse] = js.native
  def list(
    params: ParamsResourceMobilecarriersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMobileCarriersListResponse]
  ): Unit = js.native
}
