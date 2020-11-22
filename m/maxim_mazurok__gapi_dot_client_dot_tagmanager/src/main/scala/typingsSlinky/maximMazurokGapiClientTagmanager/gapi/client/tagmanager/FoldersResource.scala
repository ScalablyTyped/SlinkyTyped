package typingsSlinky.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientTagmanager.anon.Alt
import typingsSlinky.maximMazurokGapiClientTagmanager.anon.Callback
import typingsSlinky.maximMazurokGapiClientTagmanager.anon.Fields
import typingsSlinky.maximMazurokGapiClientTagmanager.anon.Oauthtoken
import typingsSlinky.maximMazurokGapiClientTagmanager.anon.PageToken
import typingsSlinky.maximMazurokGapiClientTagmanager.anon.Resource
import typingsSlinky.maximMazurokGapiClientTagmanager.anon.TagId
import typingsSlinky.maximMazurokGapiClientTagmanager.anon.TriggerId
import typingsSlinky.maximMazurokGapiClientTagmanager.anon.UploadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FoldersResource extends js.Object {
  
  def create(request: Alt, body: Folder): Request[Folder] = js.native
  /** Creates a GTM Folder. */
  def create(request: Resource): Request[Folder] = js.native
  
  /** Deletes a GTM Folder. */
  def delete(): Request[Unit] = js.native
  def delete(request: Callback): Request[Unit] = js.native
  
  /** List all entities in a GTM Folder. */
  def entities(): Request[FolderEntities] = js.native
  def entities(request: PageToken): Request[FolderEntities] = js.native
  
  /** Gets a GTM Folder. */
  def get(): Request[Folder] = js.native
  def get(request: Callback): Request[Folder] = js.native
  
  /** Lists all GTM Folders of a Container. */
  def list(): Request[ListFoldersResponse] = js.native
  def list(request: Fields): Request[ListFoldersResponse] = js.native
  
  /** Moves entities to a GTM Folder. */
  def move_entities_to_folder(request: TagId): Request[Unit] = js.native
  def move_entities_to_folder(request: TriggerId, body: Folder): Request[Unit] = js.native
  
  /** Reverts changes to a GTM Folder in a GTM Workspace. */
  def revert(): Request[RevertFolderResponse] = js.native
  def revert(request: Oauthtoken): Request[RevertFolderResponse] = js.native
  
  def update(request: Oauthtoken, body: Folder): Request[Folder] = js.native
  /** Updates a GTM Folder. */
  def update(request: UploadType): Request[Folder] = js.native
}
