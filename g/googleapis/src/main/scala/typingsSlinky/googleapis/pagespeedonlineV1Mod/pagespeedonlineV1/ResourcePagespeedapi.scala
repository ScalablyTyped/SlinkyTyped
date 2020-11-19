package typingsSlinky.googleapis.pagespeedonlineV1Mod.pagespeedonlineV1

import typingsSlinky.gaxios.commonMod.GaxiosPromise
import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.BodyResponseCallback
import typingsSlinky.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/pagespeedonline/v1", "pagespeedonline_v1.Resource$Pagespeedapi")
@js.native
class ResourcePagespeedapi protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * pagespeedonline.pagespeedapi.runpagespeed
    * @desc Runs PageSpeed analysis on the page at the specified URL, and
    * returns a PageSpeed score, a list of suggestions to make that page
    * faster, and other information.
    * @alias pagespeedonline.pagespeedapi.runpagespeed
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.filter_third_party_resources Indicates if third party resources should be filtered out before PageSpeed analysis.
    * @param {string=} params.locale The locale used to localize formatted results
    * @param {string=} params.rule A PageSpeed rule to run; if none are given, all rules are run
    * @param {boolean=} params.screenshot Indicates if binary data containing a screenshot should be included
    * @param {string=} params.strategy The analysis strategy to use
    * @param {string} params.url The URL to fetch and analyze
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def runpagespeed(): GaxiosPromise[SchemaResult] = js.native
  def runpagespeed(callback: BodyResponseCallback[SchemaResult]): Unit = js.native
  def runpagespeed(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaResult] = js.native
  def runpagespeed(params: ParamsResourcePagespeedapiRunpagespeed): GaxiosPromise[SchemaResult] = js.native
  def runpagespeed(params: ParamsResourcePagespeedapiRunpagespeed, callback: BodyResponseCallback[SchemaResult]): Unit = js.native
  def runpagespeed(
    params: ParamsResourcePagespeedapiRunpagespeed,
    options: BodyResponseCallback[SchemaResult],
    callback: BodyResponseCallback[SchemaResult]
  ): Unit = js.native
  def runpagespeed(params: ParamsResourcePagespeedapiRunpagespeed, options: MethodOptions): GaxiosPromise[SchemaResult] = js.native
  def runpagespeed(
    params: ParamsResourcePagespeedapiRunpagespeed,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaResult]
  ): Unit = js.native
}
