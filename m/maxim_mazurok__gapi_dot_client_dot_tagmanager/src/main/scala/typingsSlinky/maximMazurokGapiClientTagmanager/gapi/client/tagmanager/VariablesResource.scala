package typingsSlinky.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientTagmanager.anon.Alt
import typingsSlinky.maximMazurokGapiClientTagmanager.anon.Callback
import typingsSlinky.maximMazurokGapiClientTagmanager.anon.Fields
import typingsSlinky.maximMazurokGapiClientTagmanager.anon.FieldsKey
import typingsSlinky.maximMazurokGapiClientTagmanager.anon.FingerprintKey
import typingsSlinky.maximMazurokGapiClientTagmanager.anon.Oauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VariablesResource extends StObject {
  
  def create(request: Alt, body: Variable): Request[Variable] = js.native
  /** Creates a GTM Variable. */
  def create(request: FieldsKey): Request[Variable] = js.native
  
  /** Deletes a GTM Variable. */
  def delete(): Request[Unit] = js.native
  def delete(request: Callback): Request[Unit] = js.native
  
  /** Gets a GTM Variable. */
  def get(): Request[Variable] = js.native
  def get(request: Callback): Request[Variable] = js.native
  
  /** Lists all GTM Variables of a Container. */
  def list(): Request[ListVariablesResponse] = js.native
  def list(request: Fields): Request[ListVariablesResponse] = js.native
  
  /** Reverts changes to a GTM Variable in a GTM Workspace. */
  def revert(): Request[RevertVariableResponse] = js.native
  def revert(request: Oauthtoken): Request[RevertVariableResponse] = js.native
  
  /** Updates a GTM Variable. */
  def update(request: FingerprintKey): Request[Variable] = js.native
  def update(request: Oauthtoken, body: Variable): Request[Variable] = js.native
}
