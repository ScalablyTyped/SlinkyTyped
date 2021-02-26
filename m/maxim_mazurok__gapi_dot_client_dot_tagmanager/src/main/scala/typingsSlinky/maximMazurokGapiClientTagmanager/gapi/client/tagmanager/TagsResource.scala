package typingsSlinky.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientTagmanager.anon.Alt
import typingsSlinky.maximMazurokGapiClientTagmanager.anon.Callback
import typingsSlinky.maximMazurokGapiClientTagmanager.anon.Fields
import typingsSlinky.maximMazurokGapiClientTagmanager.anon.Oauthtoken
import typingsSlinky.maximMazurokGapiClientTagmanager.anon.Uploadprotocol
import typingsSlinky.maximMazurokGapiClientTagmanager.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagsResource extends StObject {
  
  def create(request: Alt, body: Tag): Request[Tag] = js.native
  /** Creates a GTM Tag. */
  def create(request: Uploadprotocol): Request[Tag] = js.native
  
  /** Deletes a GTM Tag. */
  def delete(): Request[Unit] = js.native
  def delete(request: Callback): Request[Unit] = js.native
  
  /** Gets a GTM Tag. */
  def get(): Request[Tag] = js.native
  def get(request: Callback): Request[Tag] = js.native
  
  /** Lists all GTM Tags of a Container. */
  def list(): Request[ListTagsResponse] = js.native
  def list(request: Fields): Request[ListTagsResponse] = js.native
  
  /** Reverts changes to a GTM Tag in a GTM Workspace. */
  def revert(): Request[RevertTagResponse] = js.native
  def revert(request: Oauthtoken): Request[RevertTagResponse] = js.native
  
  def update(request: Oauthtoken, body: Tag): Request[Tag] = js.native
  /** Updates a GTM Tag. */
  def update(request: Xgafv): Request[Tag] = js.native
}
