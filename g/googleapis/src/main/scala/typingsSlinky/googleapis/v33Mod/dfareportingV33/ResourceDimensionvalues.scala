package typingsSlinky.googleapis.v33Mod.dfareportingV33

import typingsSlinky.gaxios.commonMod.GaxiosPromise
import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.BodyResponseCallback
import typingsSlinky.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v3.3", "dfareporting_v3_3.Resource$Dimensionvalues")
@js.native
class ResourceDimensionvalues protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * dfareporting.dimensionValues.query
    * @desc Retrieves list of report dimension values for a list of filters.
    * @alias dfareporting.dimensionValues.query
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.pageToken The value of the nextToken from the previous result page.
    * @param {string} params.profileId The DFA user profile ID.
    * @param {().DimensionValueRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def query(): GaxiosPromise[SchemaDimensionValueList] = js.native
  def query(callback: BodyResponseCallback[SchemaDimensionValueList]): Unit = js.native
  def query(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDimensionValueList] = js.native
  def query(params: ParamsResourceDimensionvaluesQuery): GaxiosPromise[SchemaDimensionValueList] = js.native
  def query(
    params: ParamsResourceDimensionvaluesQuery,
    callback: BodyResponseCallback[SchemaDimensionValueList]
  ): Unit = js.native
  def query(
    params: ParamsResourceDimensionvaluesQuery,
    options: BodyResponseCallback[SchemaDimensionValueList],
    callback: BodyResponseCallback[SchemaDimensionValueList]
  ): Unit = js.native
  def query(params: ParamsResourceDimensionvaluesQuery, options: MethodOptions): GaxiosPromise[SchemaDimensionValueList] = js.native
  def query(
    params: ParamsResourceDimensionvaluesQuery,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDimensionValueList]
  ): Unit = js.native
}
