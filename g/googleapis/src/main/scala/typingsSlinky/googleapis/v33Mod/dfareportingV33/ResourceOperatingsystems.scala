package typingsSlinky.googleapis.v33Mod.dfareportingV33

import typingsSlinky.gaxios.commonMod.GaxiosPromise
import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.BodyResponseCallback
import typingsSlinky.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v3.3", "dfareporting_v3_3.Resource$Operatingsystems")
@js.native
class ResourceOperatingsystems protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * dfareporting.operatingSystems.get
    * @desc Gets one operating system by DART ID.
    * @alias dfareporting.operatingSystems.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.dartId Operating system DART ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaOperatingSystem] = js.native
  def get(callback: BodyResponseCallback[SchemaOperatingSystem]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperatingSystem] = js.native
  def get(params: ParamsResourceOperatingsystemsGet): GaxiosPromise[SchemaOperatingSystem] = js.native
  def get(params: ParamsResourceOperatingsystemsGet, callback: BodyResponseCallback[SchemaOperatingSystem]): Unit = js.native
  def get(
    params: ParamsResourceOperatingsystemsGet,
    options: BodyResponseCallback[SchemaOperatingSystem],
    callback: BodyResponseCallback[SchemaOperatingSystem]
  ): Unit = js.native
  def get(params: ParamsResourceOperatingsystemsGet, options: MethodOptions): GaxiosPromise[SchemaOperatingSystem] = js.native
  def get(
    params: ParamsResourceOperatingsystemsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperatingSystem]
  ): Unit = js.native
  
  /**
    * dfareporting.operatingSystems.list
    * @desc Retrieves a list of operating systems.
    * @alias dfareporting.operatingSystems.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaOperatingSystemsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaOperatingSystemsListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperatingSystemsListResponse] = js.native
  def list(params: ParamsResourceOperatingsystemsList): GaxiosPromise[SchemaOperatingSystemsListResponse] = js.native
  def list(
    params: ParamsResourceOperatingsystemsList,
    callback: BodyResponseCallback[SchemaOperatingSystemsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceOperatingsystemsList,
    options: BodyResponseCallback[SchemaOperatingSystemsListResponse],
    callback: BodyResponseCallback[SchemaOperatingSystemsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceOperatingsystemsList, options: MethodOptions): GaxiosPromise[SchemaOperatingSystemsListResponse] = js.native
  def list(
    params: ParamsResourceOperatingsystemsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperatingSystemsListResponse]
  ): Unit = js.native
}
