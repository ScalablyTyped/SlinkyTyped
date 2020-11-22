package typingsSlinky.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientCloudsearch.anon.AltCallback
import typingsSlinky.maximMazurokGapiClientCloudsearch.anon.KeyOauthtoken
import typingsSlinky.maximMazurokGapiClientCloudsearch.anon.OauthtokenPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryResource extends js.Object {
  
  def search(request: AltCallback, body: SearchRequest): Request[SearchResponse] = js.native
  /**
    * The Cloud Search Query API provides the search method, which returns the most relevant results from a user query. The results can come from G Suite Apps, such as Gmail or Google
    * Drive, or they can come from data that you have indexed from a third party. **Note:** This API requires a standard end user account to execute. A service account can't perform Query
    * API requests directly; to use a service account to perform queries, set up [G Suite domain-wide delegation of
    * authority](https://developers.google.com/cloud-search/docs/guides/delegation/).
    */
  def search(request: KeyOauthtoken): Request[SearchResponse] = js.native
  
  var searchapplications: SearchapplicationsResource = js.native
  
  var sources: SourcesResource = js.native
  
  def suggest(request: AltCallback, body: SuggestRequest): Request[SuggestResponse] = js.native
  /**
    * Provides suggestions for autocompleting the query. **Note:** This API requires a standard end user account to execute. A service account can't perform Query API requests directly;
    * to use a service account to perform queries, set up [G Suite domain-wide delegation of authority](https://developers.google.com/cloud-search/docs/guides/delegation/).
    */
  def suggest(request: OauthtokenPrettyPrint): Request[SuggestResponse] = js.native
}
