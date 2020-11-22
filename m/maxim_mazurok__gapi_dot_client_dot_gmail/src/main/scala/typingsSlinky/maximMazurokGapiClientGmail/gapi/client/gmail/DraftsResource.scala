package typingsSlinky.maximMazurokGapiClientGmail.gapi.client.gmail

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientGmail.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientGmail.anon.Alt
import typingsSlinky.maximMazurokGapiClientGmail.anon.Callback
import typingsSlinky.maximMazurokGapiClientGmail.anon.Fields
import typingsSlinky.maximMazurokGapiClientGmail.anon.Id
import typingsSlinky.maximMazurokGapiClientGmail.anon.IncludeSpamTrash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DraftsResource extends js.Object {
  
  /** Creates a new draft with the `DRAFT` label. */
  def create(request: Accesstoken): Request[Draft] = js.native
  def create(request: Alt, body: Draft): Request[Draft] = js.native
  
  /** Immediately and permanently deletes the specified draft. Does not simply trash it. */
  def delete(): Request[Unit] = js.native
  def delete(request: Callback): Request[Unit] = js.native
  
  /** Gets the specified draft. */
  def get(): Request[Draft] = js.native
  def get(request: Fields): Request[Draft] = js.native
  
  /** Lists the drafts in the user's mailbox. */
  def list(): Request[ListDraftsResponse] = js.native
  def list(request: IncludeSpamTrash): Request[ListDraftsResponse] = js.native
  
  /** Sends the specified, existing draft to the recipients in the `To`, `Cc`, and `Bcc` headers. */
  def send(request: Accesstoken): Request[Message] = js.native
  def send(request: Alt, body: Draft): Request[Message] = js.native
  
  def update(request: Callback, body: Draft): Request[Draft] = js.native
  /** Replaces a draft's content. */
  def update(request: Id): Request[Draft] = js.native
}
