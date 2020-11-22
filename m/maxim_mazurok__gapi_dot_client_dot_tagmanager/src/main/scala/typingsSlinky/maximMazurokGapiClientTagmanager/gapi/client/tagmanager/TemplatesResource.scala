package typingsSlinky.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientTagmanager.anon.AccesstokenAlt
import typingsSlinky.maximMazurokGapiClientTagmanager.anon.Alt
import typingsSlinky.maximMazurokGapiClientTagmanager.anon.AltCallback
import typingsSlinky.maximMazurokGapiClientTagmanager.anon.Callback
import typingsSlinky.maximMazurokGapiClientTagmanager.anon.Fields
import typingsSlinky.maximMazurokGapiClientTagmanager.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplatesResource extends js.Object {
  
  /** Creates a GTM Custom Template. */
  def create(request: AccesstokenAlt): Request[CustomTemplate] = js.native
  def create(request: Alt, body: CustomTemplate): Request[CustomTemplate] = js.native
  
  /** Deletes a GTM Template. */
  def delete(): Request[Unit] = js.native
  def delete(request: Callback): Request[Unit] = js.native
  
  /** Gets a GTM Template. */
  def get(): Request[CustomTemplate] = js.native
  def get(request: Callback): Request[CustomTemplate] = js.native
  
  /** Lists all GTM Templates of a GTM container workspace. */
  def list(): Request[ListTemplatesResponse] = js.native
  def list(request: Fields): Request[ListTemplatesResponse] = js.native
  
  /** Reverts changes to a GTM Template in a GTM Workspace. */
  def revert(): Request[RevertTemplateResponse] = js.native
  def revert(request: Oauthtoken): Request[RevertTemplateResponse] = js.native
  
  /** Updates a GTM Template. */
  def update(request: AltCallback): Request[CustomTemplate] = js.native
  def update(request: Oauthtoken, body: CustomTemplate): Request[CustomTemplate] = js.native
}
