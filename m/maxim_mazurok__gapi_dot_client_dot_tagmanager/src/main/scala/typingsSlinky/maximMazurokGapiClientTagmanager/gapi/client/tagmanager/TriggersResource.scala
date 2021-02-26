package typingsSlinky.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientTagmanager.anon.Alt
import typingsSlinky.maximMazurokGapiClientTagmanager.anon.Callback
import typingsSlinky.maximMazurokGapiClientTagmanager.anon.CallbackFields
import typingsSlinky.maximMazurokGapiClientTagmanager.anon.Fields
import typingsSlinky.maximMazurokGapiClientTagmanager.anon.FieldsFingerprint
import typingsSlinky.maximMazurokGapiClientTagmanager.anon.Oauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TriggersResource extends StObject {
  
  def create(request: Alt, body: Trigger): Request[Trigger] = js.native
  /** Creates a GTM Trigger. */
  def create(request: CallbackFields): Request[Trigger] = js.native
  
  /** Deletes a GTM Trigger. */
  def delete(): Request[Unit] = js.native
  def delete(request: Callback): Request[Unit] = js.native
  
  /** Gets a GTM Trigger. */
  def get(): Request[Trigger] = js.native
  def get(request: Callback): Request[Trigger] = js.native
  
  /** Lists all GTM Triggers of a Container. */
  def list(): Request[ListTriggersResponse] = js.native
  def list(request: Fields): Request[ListTriggersResponse] = js.native
  
  /** Reverts changes to a GTM Trigger in a GTM Workspace. */
  def revert(): Request[RevertTriggerResponse] = js.native
  def revert(request: Oauthtoken): Request[RevertTriggerResponse] = js.native
  
  /** Updates a GTM Trigger. */
  def update(request: FieldsFingerprint): Request[Trigger] = js.native
  def update(request: Oauthtoken, body: Trigger): Request[Trigger] = js.native
}
