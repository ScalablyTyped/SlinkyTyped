package typingsSlinky.gapiClientTagmanager.gapi.client.tagmanager

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientTagmanager.AnonAlt
import typingsSlinky.gapiClientTagmanager.AnonFields
import typingsSlinky.gapiClientTagmanager.AnonFingerprint
import typingsSlinky.gapiClientTagmanager.AnonKey
import typingsSlinky.gapiClientTagmanager.AnonPageToken
import typingsSlinky.gapiClientTagmanager.AnonPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FoldersResource extends js.Object {
  /** Creates a GTM Folder. */
  def create(request: AnonAlt): Request_[Folder] = js.native
  /** Deletes a GTM Folder. */
  def delete(request: AnonFields): Request_[Unit] = js.native
  /** List all entities in a GTM Folder. */
  def entities(request: AnonPageToken): Request_[FolderEntities] = js.native
  /** Gets a GTM Folder. */
  def get(request: AnonFields): Request_[Folder] = js.native
  /** Lists all GTM Folders of a Container. */
  def list(request: AnonKey): Request_[ListFoldersResponse] = js.native
  /** Moves entities to a GTM Folder. */
  def move_entities_to_folder(request: AnonPrettyPrint): Request_[Unit] = js.native
  /** Reverts changes to a GTM Folder in a GTM Workspace. */
  def revert(request: AnonFingerprint): Request_[RevertFolderResponse] = js.native
  /** Updates a GTM Folder. */
  def update(request: AnonFingerprint): Request_[Folder] = js.native
}

object FoldersResource {
  @scala.inline
  def apply(
    create: AnonAlt => Request_[Folder],
    delete: AnonFields => Request_[Unit],
    entities: AnonPageToken => Request_[FolderEntities],
    get: AnonFields => Request_[Folder],
    list: AnonKey => Request_[ListFoldersResponse],
    move_entities_to_folder: AnonPrettyPrint => Request_[Unit],
    revert: AnonFingerprint => Request_[RevertFolderResponse],
    update: AnonFingerprint => Request_[Folder]
  ): FoldersResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), entities = js.Any.fromFunction1(entities), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), move_entities_to_folder = js.Any.fromFunction1(move_entities_to_folder), revert = js.Any.fromFunction1(revert), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[FoldersResource]
  }
  @scala.inline
  implicit class FoldersResourceOps[Self <: FoldersResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: AnonAlt => Request_[Folder]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonFields => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEntities(value: AnonPageToken => Request_[FolderEntities]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entities")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonFields => Request_[Folder]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonKey => Request_[ListFoldersResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMove_entities_to_folder(value: AnonPrettyPrint => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("move_entities_to_folder")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRevert(value: AnonFingerprint => Request_[RevertFolderResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonFingerprint => Request_[Folder]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

