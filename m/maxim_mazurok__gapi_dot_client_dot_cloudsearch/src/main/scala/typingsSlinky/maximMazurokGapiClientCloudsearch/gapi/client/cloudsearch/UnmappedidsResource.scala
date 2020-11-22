package typingsSlinky.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientCloudsearch.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientCloudsearch.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmappedidsResource extends js.Object {
  
  /** List all unmapped identities for a specific item. **Note:** This API requires an admin account to execute. */
  def list(): Request[ListUnmappedIdentitiesResponse] = js.native
  def list(request: Accesstoken): Request[ListUnmappedIdentitiesResponse] = js.native
  def list(request: Alt): Request[ListUnmappedIdentitiesResponse] = js.native
}
