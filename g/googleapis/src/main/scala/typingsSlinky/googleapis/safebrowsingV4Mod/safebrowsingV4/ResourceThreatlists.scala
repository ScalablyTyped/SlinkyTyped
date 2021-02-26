package typingsSlinky.googleapis.safebrowsingV4Mod.safebrowsingV4

import typingsSlinky.gaxios.commonMod.GaxiosPromise
import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.BodyResponseCallback
import typingsSlinky.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/safebrowsing/v4", "safebrowsing_v4.Resource$Threatlists")
@js.native
class ResourceThreatlists protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * safebrowsing.threatLists.list
    * @desc Lists the Safe Browsing threat lists available for download.
    * @alias safebrowsing.threatLists.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListThreatListsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListThreatListsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListThreatListsResponse] = js.native
  def list(params: ParamsResourceThreatlistsList): GaxiosPromise[SchemaListThreatListsResponse] = js.native
  def list(
    params: ParamsResourceThreatlistsList,
    callback: BodyResponseCallback[SchemaListThreatListsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceThreatlistsList,
    options: BodyResponseCallback[SchemaListThreatListsResponse],
    callback: BodyResponseCallback[SchemaListThreatListsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceThreatlistsList, options: MethodOptions): GaxiosPromise[SchemaListThreatListsResponse] = js.native
  def list(
    params: ParamsResourceThreatlistsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListThreatListsResponse]
  ): Unit = js.native
}
