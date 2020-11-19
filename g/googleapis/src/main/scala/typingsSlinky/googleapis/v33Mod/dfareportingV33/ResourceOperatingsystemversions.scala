package typingsSlinky.googleapis.v33Mod.dfareportingV33

import typingsSlinky.gaxios.commonMod.GaxiosPromise
import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.BodyResponseCallback
import typingsSlinky.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v3.3", "dfareporting_v3_3.Resource$Operatingsystemversions")
@js.native
class ResourceOperatingsystemversions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * dfareporting.operatingSystemVersions.get
    * @desc Gets one operating system version by ID.
    * @alias dfareporting.operatingSystemVersions.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Operating system version ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaOperatingSystemVersion] = js.native
  def get(callback: BodyResponseCallback[SchemaOperatingSystemVersion]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperatingSystemVersion] = js.native
  def get(params: ParamsResourceOperatingsystemversionsGet): GaxiosPromise[SchemaOperatingSystemVersion] = js.native
  def get(
    params: ParamsResourceOperatingsystemversionsGet,
    callback: BodyResponseCallback[SchemaOperatingSystemVersion]
  ): Unit = js.native
  def get(
    params: ParamsResourceOperatingsystemversionsGet,
    options: BodyResponseCallback[SchemaOperatingSystemVersion],
    callback: BodyResponseCallback[SchemaOperatingSystemVersion]
  ): Unit = js.native
  def get(params: ParamsResourceOperatingsystemversionsGet, options: MethodOptions): GaxiosPromise[SchemaOperatingSystemVersion] = js.native
  def get(
    params: ParamsResourceOperatingsystemversionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperatingSystemVersion]
  ): Unit = js.native
  
  /**
    * dfareporting.operatingSystemVersions.list
    * @desc Retrieves a list of operating system versions.
    * @alias dfareporting.operatingSystemVersions.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaOperatingSystemVersionsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaOperatingSystemVersionsListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperatingSystemVersionsListResponse] = js.native
  def list(params: ParamsResourceOperatingsystemversionsList): GaxiosPromise[SchemaOperatingSystemVersionsListResponse] = js.native
  def list(
    params: ParamsResourceOperatingsystemversionsList,
    callback: BodyResponseCallback[SchemaOperatingSystemVersionsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceOperatingsystemversionsList,
    options: BodyResponseCallback[SchemaOperatingSystemVersionsListResponse],
    callback: BodyResponseCallback[SchemaOperatingSystemVersionsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceOperatingsystemversionsList, options: MethodOptions): GaxiosPromise[SchemaOperatingSystemVersionsListResponse] = js.native
  def list(
    params: ParamsResourceOperatingsystemversionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperatingSystemVersionsListResponse]
  ): Unit = js.native
}
