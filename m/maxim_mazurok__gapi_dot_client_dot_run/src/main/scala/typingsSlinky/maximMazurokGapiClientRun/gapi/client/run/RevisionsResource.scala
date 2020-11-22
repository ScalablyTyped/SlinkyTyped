package typingsSlinky.maximMazurokGapiClientRun.gapi.client.run

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientRun.anon.Alt
import typingsSlinky.maximMazurokGapiClientRun.anon.ApiVersion
import typingsSlinky.maximMazurokGapiClientRun.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RevisionsResource extends js.Object {
  
  /** Delete a revision. */
  def delete(): Request[Status] = js.native
  def delete(request: ApiVersion): Request[Status] = js.native
  
  /** Get information about a revision. */
  def get(): Request[Revision] = js.native
  def get(request: Alt): Request[Revision] = js.native
  
  /** List revisions. */
  def list(): Request[ListRevisionsResponse] = js.native
  def list(request: Callback): Request[ListRevisionsResponse] = js.native
}
