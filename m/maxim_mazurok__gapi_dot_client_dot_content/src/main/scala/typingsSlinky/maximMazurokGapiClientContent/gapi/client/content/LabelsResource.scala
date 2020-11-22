package typingsSlinky.maximMazurokGapiClientContent.gapi.client.content

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientContent.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientContent.anon.AccountId
import typingsSlinky.maximMazurokGapiClientContent.anon.Alt
import typingsSlinky.maximMazurokGapiClientContent.anon.Callback
import typingsSlinky.maximMazurokGapiClientContent.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelsResource extends js.Object {
  
  /** Creates a new label, not assigned to any account. */
  def create(request: Accesstoken): Request[AccountLabel] = js.native
  def create(request: AccountId, body: AccountLabel): Request[AccountLabel] = js.native
  
  /** Deletes a label and removes it from all accounts to which it was assigned. */
  def delete(): Request[Unit] = js.native
  def delete(request: Alt): Request[Unit] = js.native
  
  /** Lists the labels assigned to an account. */
  def list(): Request[ListAccountLabelsResponse] = js.native
  def list(request: Callback): Request[ListAccountLabelsResponse] = js.native
  
  def patch(request: Alt, body: AccountLabel): Request[AccountLabel] = js.native
  /** Updates a label. */
  def patch(request: Fields): Request[AccountLabel] = js.native
}
