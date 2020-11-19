package typingsSlinky.googleapis.acceleratedmobilepageurlV1Mod.acceleratedmobilepageurlV1

import typingsSlinky.gaxios.commonMod.GaxiosPromise
import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.BodyResponseCallback
import typingsSlinky.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/acceleratedmobilepageurl/v1", "acceleratedmobilepageurl_v1.Resource$Ampurls")
@js.native
class ResourceAmpurls protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  /**
    * acceleratedmobilepageurl.ampUrls.batchGet
    * @desc Returns AMP URL(s) and equivalent [AMP Cache
    * URL(s)](/amp/cache/overview#amp-cache-url-format).
    * @alias acceleratedmobilepageurl.ampUrls.batchGet
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().BatchGetAmpUrlsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def batchGet(): GaxiosPromise[SchemaBatchGetAmpUrlsResponse] = js.native
  def batchGet(callback: BodyResponseCallback[SchemaBatchGetAmpUrlsResponse]): Unit = js.native
  def batchGet(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaBatchGetAmpUrlsResponse] = js.native
  def batchGet(params: ParamsResourceAmpurlsBatchget): GaxiosPromise[SchemaBatchGetAmpUrlsResponse] = js.native
  def batchGet(
    params: ParamsResourceAmpurlsBatchget,
    callback: BodyResponseCallback[SchemaBatchGetAmpUrlsResponse]
  ): Unit = js.native
  def batchGet(
    params: ParamsResourceAmpurlsBatchget,
    options: BodyResponseCallback[SchemaBatchGetAmpUrlsResponse],
    callback: BodyResponseCallback[SchemaBatchGetAmpUrlsResponse]
  ): Unit = js.native
  def batchGet(params: ParamsResourceAmpurlsBatchget, options: MethodOptions): GaxiosPromise[SchemaBatchGetAmpUrlsResponse] = js.native
  def batchGet(
    params: ParamsResourceAmpurlsBatchget,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBatchGetAmpUrlsResponse]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
}
