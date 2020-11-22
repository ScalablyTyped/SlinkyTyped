package typingsSlinky.maximMazurokGapiClientGames.gapi.client.games

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientGames.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientGames.anon.Language
import typingsSlinky.maximMazurokGapiClientGames.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventsResource extends js.Object {
  
  /** Returns a list showing the current progress on events in this application for the currently authenticated user. */
  def listByPlayer(): Request[PlayerEventListResponse] = js.native
  def listByPlayer(request: Accesstoken): Request[PlayerEventListResponse] = js.native
  
  /** Returns a list of the event definitions in this application. */
  def listDefinitions(): Request[EventDefinitionListResponse] = js.native
  def listDefinitions(request: Accesstoken): Request[EventDefinitionListResponse] = js.native
  
  /** Records a batch of changes to the number of times events have occurred for the currently authenticated user of this application. */
  def record(request: Language): Request[EventUpdateResponse] = js.native
  def record(request: QuotaUser, body: EventRecordRequest): Request[EventUpdateResponse] = js.native
}
