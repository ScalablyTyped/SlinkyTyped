package typingsSlinky.googleapis.buildSrcApisSafebrowsingV4Mod.safebrowsing_v4

import typingsSlinky.gaxios.buildSrcCommonMod.GaxiosPromise
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/safebrowsing/v4", "safebrowsing_v4.Resource$Threatmatches")
@js.native
class Resource$Threatmatches protected () extends js.Object {
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
  def find(): GaxiosPromise[Schema$FindThreatMatchesResponse] = js.native
  def find(callback: BodyResponseCallback[Schema$FindThreatMatchesResponse]): Unit = js.native
  def find(params: ParamsDollarResourceDollarThreatmatchesDollarFind): GaxiosPromise[Schema$FindThreatMatchesResponse] = js.native
  def find(
    params: ParamsDollarResourceDollarThreatmatchesDollarFind,
    callback: BodyResponseCallback[Schema$FindThreatMatchesResponse]
  ): Unit = js.native
  def find(
    params: ParamsDollarResourceDollarThreatmatchesDollarFind,
    options: BodyResponseCallback[Schema$FindThreatMatchesResponse],
    callback: BodyResponseCallback[Schema$FindThreatMatchesResponse]
  ): Unit = js.native
  def find(params: ParamsDollarResourceDollarThreatmatchesDollarFind, options: MethodOptions): GaxiosPromise[Schema$FindThreatMatchesResponse] = js.native
  def find(
    params: ParamsDollarResourceDollarThreatmatchesDollarFind,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$FindThreatMatchesResponse]
  ): Unit = js.native
}

