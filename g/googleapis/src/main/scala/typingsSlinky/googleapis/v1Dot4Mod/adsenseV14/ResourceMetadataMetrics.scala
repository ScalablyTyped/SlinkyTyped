package typingsSlinky.googleapis.v1Dot4Mod.adsenseV14

import typingsSlinky.gaxios.commonMod.GaxiosPromise
import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.BodyResponseCallback
import typingsSlinky.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/adsense/v1.4", "adsense_v1_4.Resource$Metadata$Metrics")
@js.native
class ResourceMetadataMetrics protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * adsense.metadata.metrics.list
    * @desc List the metadata for the metrics available to this AdSense
    * account.
    * @alias adsense.metadata.metrics.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaMetadata] = js.native
  def list(callback: BodyResponseCallback[SchemaMetadata]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaMetadata] = js.native
  def list(params: ParamsResourceMetadataMetricsList): GaxiosPromise[SchemaMetadata] = js.native
  def list(params: ParamsResourceMetadataMetricsList, callback: BodyResponseCallback[SchemaMetadata]): Unit = js.native
  def list(
    params: ParamsResourceMetadataMetricsList,
    options: BodyResponseCallback[SchemaMetadata],
    callback: BodyResponseCallback[SchemaMetadata]
  ): Unit = js.native
  def list(params: ParamsResourceMetadataMetricsList, options: MethodOptions): GaxiosPromise[SchemaMetadata] = js.native
  def list(
    params: ParamsResourceMetadataMetricsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMetadata]
  ): Unit = js.native
}
