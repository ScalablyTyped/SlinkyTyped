package typingsSlinky.googleapis.surveysV2Mod.surveysV2

import typingsSlinky.gaxios.commonMod.GaxiosPromise
import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.BodyResponseCallback
import typingsSlinky.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/surveys/v2", "surveys_v2.Resource$Results")
@js.native
class ResourceResults protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * surveys.results.get
    * @desc Retrieves any survey results that have been produced so far.
    * Results are formatted as an Excel file. You must add "?alt=media" to the
    * URL as an argument to get results.
    * @alias surveys.results.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.surveyUrlId External URL ID for the survey.
    * @param {().ResultsGetRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaSurveyResults] = js.native
  def get(callback: BodyResponseCallback[SchemaSurveyResults]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSurveyResults] = js.native
  def get(params: ParamsResourceResultsGet): GaxiosPromise[SchemaSurveyResults] = js.native
  def get(params: ParamsResourceResultsGet, callback: BodyResponseCallback[SchemaSurveyResults]): Unit = js.native
  def get(
    params: ParamsResourceResultsGet,
    options: BodyResponseCallback[SchemaSurveyResults],
    callback: BodyResponseCallback[SchemaSurveyResults]
  ): Unit = js.native
  def get(params: ParamsResourceResultsGet, options: MethodOptions): GaxiosPromise[SchemaSurveyResults] = js.native
  def get(
    params: ParamsResourceResultsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSurveyResults]
  ): Unit = js.native
}
