package typingsSlinky.gapiClientDrive.gapi.client.drive

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientDrive.AnonAcknowledgeAbuse
import typingsSlinky.gapiClientDrive.AnonAddParents
import typingsSlinky.gapiClientDrive.AnonAlt
import typingsSlinky.gapiClientDrive.AnonCorpora
import typingsSlinky.gapiClientDrive.AnonCount
import typingsSlinky.gapiClientDrive.AnonIgnoreDefaultVisibility
import typingsSlinky.gapiClientDrive.AnonKeepRevisionForever
import typingsSlinky.gapiClientDrive.AnonOauthtoken
import typingsSlinky.gapiClientDrive.AnonPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilesResource extends js.Object {
  /** Creates a copy of a file and applies any requested updates with patch semantics. */
  def copy(request: AnonIgnoreDefaultVisibility): Request_[File] = js.native
  /** Creates a new file. */
  def create(request: AnonKeepRevisionForever): Request_[File] = js.native
  /**
    * Permanently deletes a file owned by the user without moving it to the trash. If the file belongs to a Team Drive the user must be an organizer on the
    * parent. If the target is a folder, all descendants owned by the user are also deleted.
    */
  def delete(request: AnonOauthtoken): Request_[Unit] = js.native
  /** Permanently deletes all of the user's trashed files. */
  def emptyTrash(request: AnonAlt): Request_[Unit] = js.native
  /** Exports a Google Doc to the requested MIME type and returns the exported content. Please note that the exported content is limited to 10MB. */
  def export(request: AnonPrettyPrint): Request_[Unit] = js.native
  /** Generates a set of file IDs which can be provided in create requests. */
  def generateIds(request: AnonCount): Request_[GeneratedIds] = js.native
  /** Gets a file's metadata or content by ID. */
  def get(request: AnonAcknowledgeAbuse): Request_[File] = js.native
  /** Lists or searches files. */
  def list(request: AnonCorpora): Request_[FileList] = js.native
  /** Updates a file's metadata and/or content with patch semantics. */
  def update(request: AnonAddParents): Request_[File] = js.native
  /** Subscribes to changes to a file */
  def watch(request: AnonAcknowledgeAbuse): Request_[Channel] = js.native
}

object FilesResource {
  @scala.inline
  def apply(
    copy: AnonIgnoreDefaultVisibility => Request_[File],
    create: AnonKeepRevisionForever => Request_[File],
    delete: AnonOauthtoken => Request_[Unit],
    emptyTrash: AnonAlt => Request_[Unit],
    export: AnonPrettyPrint => Request_[Unit],
    generateIds: AnonCount => Request_[GeneratedIds],
    get: AnonAcknowledgeAbuse => Request_[File],
    list: AnonCorpora => Request_[FileList],
    update: AnonAddParents => Request_[File],
    watch: AnonAcknowledgeAbuse => Request_[Channel]
  ): FilesResource = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction1(copy), create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), emptyTrash = js.Any.fromFunction1(emptyTrash), export = js.Any.fromFunction1(export), generateIds = js.Any.fromFunction1(generateIds), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update), watch = js.Any.fromFunction1(watch))
    __obj.asInstanceOf[FilesResource]
  }
  @scala.inline
  implicit class FilesResourceOps[Self <: FilesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCopy(value: AnonIgnoreDefaultVisibility => Request_[File]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreate(value: AnonKeepRevisionForever => Request_[File]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonOauthtoken => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEmptyTrash(value: AnonAlt => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyTrash")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExport(value: AnonPrettyPrint => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("export")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGenerateIds(value: AnonCount => Request_[GeneratedIds]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateIds")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonAcknowledgeAbuse => Request_[File]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonCorpora => Request_[FileList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonAddParents => Request_[File]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWatch(value: AnonAcknowledgeAbuse => Request_[Channel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

