package typingsSlinky.gapiClientDrive.gapi.client.drive

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientDrive.anon.AcknowledgeAbuse
import typingsSlinky.gapiClientDrive.anon.AddParents
import typingsSlinky.gapiClientDrive.anon.Alt
import typingsSlinky.gapiClientDrive.anon.Corpora
import typingsSlinky.gapiClientDrive.anon.Count
import typingsSlinky.gapiClientDrive.anon.IgnoreDefaultVisibility
import typingsSlinky.gapiClientDrive.anon.KeepRevisionForever
import typingsSlinky.gapiClientDrive.anon.Oauthtoken
import typingsSlinky.gapiClientDrive.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilesResource extends js.Object {
  /** Creates a copy of a file and applies any requested updates with patch semantics. */
  def copy(request: IgnoreDefaultVisibility): Request[File] = js.native
  /** Creates a new file. */
  def create(request: KeepRevisionForever): Request[File] = js.native
  /**
    * Permanently deletes a file owned by the user without moving it to the trash. If the file belongs to a Team Drive the user must be an organizer on the
    * parent. If the target is a folder, all descendants owned by the user are also deleted.
    */
  def delete(request: Oauthtoken): Request[Unit] = js.native
  /** Permanently deletes all of the user's trashed files. */
  def emptyTrash(request: Alt): Request[Unit] = js.native
  /** Exports a Google Doc to the requested MIME type and returns the exported content. Please note that the exported content is limited to 10MB. */
  def export(request: PrettyPrint): Request[Unit] = js.native
  /** Generates a set of file IDs which can be provided in create requests. */
  def generateIds(request: Count): Request[GeneratedIds] = js.native
  /** Gets a file's metadata or content by ID. */
  def get(request: AcknowledgeAbuse): Request[File] = js.native
  /** Lists or searches files. */
  def list(request: Corpora): Request[FileList] = js.native
  /** Updates a file's metadata and/or content with patch semantics. */
  def update(request: AddParents): Request[File] = js.native
  /** Subscribes to changes to a file */
  def watch(request: AcknowledgeAbuse): Request[Channel] = js.native
}

object FilesResource {
  @scala.inline
  def apply(
    copy: IgnoreDefaultVisibility => Request[File],
    create: KeepRevisionForever => Request[File],
    delete: Oauthtoken => Request[Unit],
    emptyTrash: Alt => Request[Unit],
    export: PrettyPrint => Request[Unit],
    generateIds: Count => Request[GeneratedIds],
    get: AcknowledgeAbuse => Request[File],
    list: Corpora => Request[FileList],
    update: AddParents => Request[File],
    watch: AcknowledgeAbuse => Request[Channel]
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
    def withCopy(value: IgnoreDefaultVisibility => Request[File]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreate(value: KeepRevisionForever => Request[File]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: Oauthtoken => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEmptyTrash(value: Alt => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyTrash")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExport(value: PrettyPrint => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("export")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGenerateIds(value: Count => Request[GeneratedIds]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateIds")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AcknowledgeAbuse => Request[File]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Corpora => Request[FileList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AddParents => Request[File]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWatch(value: AcknowledgeAbuse => Request[Channel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

