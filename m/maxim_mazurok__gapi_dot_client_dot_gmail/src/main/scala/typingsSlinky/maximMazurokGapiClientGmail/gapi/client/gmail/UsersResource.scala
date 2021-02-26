package typingsSlinky.maximMazurokGapiClientGmail.gapi.client.gmail

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientGmail.anon.Alt
import typingsSlinky.maximMazurokGapiClientGmail.anon.UserIdXgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsersResource extends StObject {
  
  var drafts: DraftsResource = js.native
  
  /** Gets the current user's Gmail profile. */
  def getProfile(): Request[Profile] = js.native
  def getProfile(request: Alt): Request[Profile] = js.native
  
  var history: HistoryResource = js.native
  
  var labels: LabelsResource = js.native
  
  var messages: MessagesResource = js.native
  
  var settings: SettingsResource = js.native
  
  /** Stop receiving push notifications for the given user mailbox. */
  def stop(): Request[Unit] = js.native
  def stop(request: Alt): Request[Unit] = js.native
  
  var threads: ThreadsResource = js.native
  
  def watch(request: Alt, body: WatchRequest): Request[WatchResponse] = js.native
  /** Set up or update a push notification watch on the given user mailbox. */
  def watch(request: UserIdXgafv): Request[WatchResponse] = js.native
}
