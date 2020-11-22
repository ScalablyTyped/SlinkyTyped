package typingsSlinky.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientCloudsearch.anon.PageToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourcesResource extends js.Object {
  
  /**
    * Returns list of sources that user can use for Search and Suggest APIs. **Note:** This API requires a standard end user account to execute. A service account can't perform Query API
    * requests directly; to use a service account to perform queries, set up [G Suite domain-wide delegation of
    * authority](https://developers.google.com/cloud-search/docs/guides/delegation/).
    */
  def list(): Request[ListQuerySourcesResponse] = js.native
  def list(request: PageToken): Request[ListQuerySourcesResponse] = js.native
}
