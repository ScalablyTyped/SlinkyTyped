package typingsSlinky.maximMazurokGapiClientGames.gapi.client.games

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientGames.anon.ClientRevision
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RevisionsResource extends js.Object {
  
  /** Checks whether the games client is out of date. */
  def check(): Request[RevisionCheckResponse] = js.native
  def check(request: ClientRevision): Request[RevisionCheckResponse] = js.native
}
