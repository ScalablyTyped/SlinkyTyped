package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import typingsSlinky.gaxios.commonMod.GaxiosPromise
import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.BodyResponseCallback
import typingsSlinky.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudsearch/v1", "cloudsearch_v1.Resource$Query$Sources")
@js.native
class ResourceQuerySources protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * cloudsearch.query.sources.list
    * @desc Returns list of sources that user can use for Search and Suggest
    * APIs.
    * @alias cloudsearch.query.sources.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.pageToken Number of sources to return in the response.
    * @param {boolean=} params.requestOptions.debugOptions.enableDebugging If set, the request will enable debugging features of Cloud Search. Only turn on this field, if asked by Google to help with debugging.
    * @param {string=} params.requestOptions.languageCode The BCP-47 language code, such as "en-US" or "sr-Latn". For more information, see http://www.unicode.org/reports/tr35/#Unicode_locale_identifier. For translations.
    * @param {string=} params.requestOptions.searchApplicationId Id of the application created using SearchApplicationsService.
    * @param {string=} params.requestOptions.timeZone Current user's time zone id, such as "America/Los_Angeles" or "Australia/Sydney". These IDs are defined by [Unicode Common Locale Data Repository (CLDR)](http://cldr.unicode.org/) project, and currently available in the file [timezone.xml](http://unicode.org/repos/cldr/trunk/common/bcp47/timezone.xml)
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListQuerySourcesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListQuerySourcesResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListQuerySourcesResponse] = js.native
  def list(params: ParamsResourceQuerySourcesList): GaxiosPromise[SchemaListQuerySourcesResponse] = js.native
  def list(
    params: ParamsResourceQuerySourcesList,
    callback: BodyResponseCallback[SchemaListQuerySourcesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceQuerySourcesList,
    options: BodyResponseCallback[SchemaListQuerySourcesResponse],
    callback: BodyResponseCallback[SchemaListQuerySourcesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceQuerySourcesList, options: MethodOptions): GaxiosPromise[SchemaListQuerySourcesResponse] = js.native
  def list(
    params: ParamsResourceQuerySourcesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListQuerySourcesResponse]
  ): Unit = js.native
}
