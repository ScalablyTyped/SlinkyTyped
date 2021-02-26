package typingsSlinky.googleapis.safebrowsingV4Mod.safebrowsingV4

import typingsSlinky.gaxios.commonMod.GaxiosPromise
import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.BodyResponseCallback
import typingsSlinky.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/safebrowsing/v4", "safebrowsing_v4.Resource$Threatmatches")
@js.native
class ResourceThreatmatches protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * safebrowsing.threatMatches.find
    * @desc Finds the threat entries that match the Safe Browsing lists.
    * @alias safebrowsing.threatMatches.find
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().FindThreatMatchesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def find(): GaxiosPromise[SchemaFindThreatMatchesResponse] = js.native
  def find(callback: BodyResponseCallback[SchemaFindThreatMatchesResponse]): Unit = js.native
  def find(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaFindThreatMatchesResponse] = js.native
  def find(params: ParamsResourceThreatmatchesFind): GaxiosPromise[SchemaFindThreatMatchesResponse] = js.native
  def find(
    params: ParamsResourceThreatmatchesFind,
    callback: BodyResponseCallback[SchemaFindThreatMatchesResponse]
  ): Unit = js.native
  def find(
    params: ParamsResourceThreatmatchesFind,
    options: BodyResponseCallback[SchemaFindThreatMatchesResponse],
    callback: BodyResponseCallback[SchemaFindThreatMatchesResponse]
  ): Unit = js.native
  def find(params: ParamsResourceThreatmatchesFind, options: MethodOptions): GaxiosPromise[SchemaFindThreatMatchesResponse] = js.native
  def find(
    params: ParamsResourceThreatmatchesFind,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFindThreatMatchesResponse]
  ): Unit = js.native
}
