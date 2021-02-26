package typingsSlinky.googleapis.v31Mod.dfareportingV31

import typingsSlinky.gaxios.commonMod.GaxiosPromise
import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.BodyResponseCallback
import typingsSlinky.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v3.1", "dfareporting_v3_1.Resource$Connectiontypes")
@js.native
class ResourceConnectiontypes protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * dfareporting.connectionTypes.get
    * @desc Gets one connection type by ID.
    * @alias dfareporting.connectionTypes.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Connection type ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaConnectionType] = js.native
  def get(callback: BodyResponseCallback[SchemaConnectionType]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaConnectionType] = js.native
  def get(params: ParamsResourceConnectiontypesGet): GaxiosPromise[SchemaConnectionType] = js.native
  def get(params: ParamsResourceConnectiontypesGet, callback: BodyResponseCallback[SchemaConnectionType]): Unit = js.native
  def get(
    params: ParamsResourceConnectiontypesGet,
    options: BodyResponseCallback[SchemaConnectionType],
    callback: BodyResponseCallback[SchemaConnectionType]
  ): Unit = js.native
  def get(params: ParamsResourceConnectiontypesGet, options: MethodOptions): GaxiosPromise[SchemaConnectionType] = js.native
  def get(
    params: ParamsResourceConnectiontypesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaConnectionType]
  ): Unit = js.native
  
  /**
    * dfareporting.connectionTypes.list
    * @desc Retrieves a list of connection types.
    * @alias dfareporting.connectionTypes.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaConnectionTypesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaConnectionTypesListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaConnectionTypesListResponse] = js.native
  def list(params: ParamsResourceConnectiontypesList): GaxiosPromise[SchemaConnectionTypesListResponse] = js.native
  def list(
    params: ParamsResourceConnectiontypesList,
    callback: BodyResponseCallback[SchemaConnectionTypesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceConnectiontypesList,
    options: BodyResponseCallback[SchemaConnectionTypesListResponse],
    callback: BodyResponseCallback[SchemaConnectionTypesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceConnectiontypesList, options: MethodOptions): GaxiosPromise[SchemaConnectionTypesListResponse] = js.native
  def list(
    params: ParamsResourceConnectiontypesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaConnectionTypesListResponse]
  ): Unit = js.native
}
