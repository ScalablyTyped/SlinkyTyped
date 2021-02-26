package typingsSlinky.googleapis.booksV1Mod.booksV1

import typingsSlinky.gaxios.commonMod.GaxiosPromise
import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.BodyResponseCallback
import typingsSlinky.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/books/v1", "books_v1.Resource$Personalizedstream")
@js.native
class ResourcePersonalizedstream protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * books.personalizedstream.get
    * @desc Returns a stream of personalized book clusters
    * @alias books.personalizedstream.get
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.locale ISO-639-1 language and ISO-3166-1 country code. Ex: 'en_US'. Used for generating recommendations.
    * @param {string=} params.maxAllowedMaturityRating The maximum allowed maturity rating of returned recommendations. Books with a higher maturity rating are filtered out.
    * @param {string=} params.source String to identify the originator of this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaDiscoveryclusters] = js.native
  def get(callback: BodyResponseCallback[SchemaDiscoveryclusters]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDiscoveryclusters] = js.native
  def get(params: ParamsResourcePersonalizedstreamGet): GaxiosPromise[SchemaDiscoveryclusters] = js.native
  def get(
    params: ParamsResourcePersonalizedstreamGet,
    callback: BodyResponseCallback[SchemaDiscoveryclusters]
  ): Unit = js.native
  def get(
    params: ParamsResourcePersonalizedstreamGet,
    options: BodyResponseCallback[SchemaDiscoveryclusters],
    callback: BodyResponseCallback[SchemaDiscoveryclusters]
  ): Unit = js.native
  def get(params: ParamsResourcePersonalizedstreamGet, options: MethodOptions): GaxiosPromise[SchemaDiscoveryclusters] = js.native
  def get(
    params: ParamsResourcePersonalizedstreamGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDiscoveryclusters]
  ): Unit = js.native
}
