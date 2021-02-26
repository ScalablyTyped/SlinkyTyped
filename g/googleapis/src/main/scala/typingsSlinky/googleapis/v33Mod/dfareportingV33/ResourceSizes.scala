package typingsSlinky.googleapis.v33Mod.dfareportingV33

import typingsSlinky.gaxios.commonMod.GaxiosPromise
import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.BodyResponseCallback
import typingsSlinky.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v3.3", "dfareporting_v3_3.Resource$Sizes")
@js.native
class ResourceSizes protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * dfareporting.sizes.get
    * @desc Gets one size by ID.
    * @alias dfareporting.sizes.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Size ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaSize] = js.native
  def get(callback: BodyResponseCallback[SchemaSize]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSize] = js.native
  def get(params: ParamsResourceSizesGet): GaxiosPromise[SchemaSize] = js.native
  def get(params: ParamsResourceSizesGet, callback: BodyResponseCallback[SchemaSize]): Unit = js.native
  def get(
    params: ParamsResourceSizesGet,
    options: BodyResponseCallback[SchemaSize],
    callback: BodyResponseCallback[SchemaSize]
  ): Unit = js.native
  def get(params: ParamsResourceSizesGet, options: MethodOptions): GaxiosPromise[SchemaSize] = js.native
  def get(params: ParamsResourceSizesGet, options: MethodOptions, callback: BodyResponseCallback[SchemaSize]): Unit = js.native
  
  /**
    * dfareporting.sizes.insert
    * @desc Inserts a new size.
    * @alias dfareporting.sizes.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().Size} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaSize] = js.native
  def insert(callback: BodyResponseCallback[SchemaSize]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSize] = js.native
  def insert(params: ParamsResourceSizesInsert): GaxiosPromise[SchemaSize] = js.native
  def insert(params: ParamsResourceSizesInsert, callback: BodyResponseCallback[SchemaSize]): Unit = js.native
  def insert(
    params: ParamsResourceSizesInsert,
    options: BodyResponseCallback[SchemaSize],
    callback: BodyResponseCallback[SchemaSize]
  ): Unit = js.native
  def insert(params: ParamsResourceSizesInsert, options: MethodOptions): GaxiosPromise[SchemaSize] = js.native
  def insert(
    params: ParamsResourceSizesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSize]
  ): Unit = js.native
  
  /**
    * dfareporting.sizes.list
    * @desc Retrieves a list of sizes, possibly filtered. Retrieved sizes are
    * globally unique and may include values not currently in use by your
    * account. Due to this, the list of sizes returned by this method may
    * differ from the list seen in the Trafficking UI.
    * @alias dfareporting.sizes.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.height Select only sizes with this height.
    * @param {boolean=} params.iabStandard Select only IAB standard sizes.
    * @param {string=} params.ids Select only sizes with these IDs.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {integer=} params.width Select only sizes with this width.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaSizesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaSizesListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSizesListResponse] = js.native
  def list(params: ParamsResourceSizesList): GaxiosPromise[SchemaSizesListResponse] = js.native
  def list(params: ParamsResourceSizesList, callback: BodyResponseCallback[SchemaSizesListResponse]): Unit = js.native
  def list(
    params: ParamsResourceSizesList,
    options: BodyResponseCallback[SchemaSizesListResponse],
    callback: BodyResponseCallback[SchemaSizesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceSizesList, options: MethodOptions): GaxiosPromise[SchemaSizesListResponse] = js.native
  def list(
    params: ParamsResourceSizesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSizesListResponse]
  ): Unit = js.native
}
