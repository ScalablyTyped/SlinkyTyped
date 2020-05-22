package typingsSlinky.officeJsPreview.OneNote.Interfaces

import typingsSlinky.officeJsPreview.OneNote.NoteTagStatus
import typingsSlinky.officeJsPreview.OneNote.NoteTagType
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Address
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Completed
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Contact
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Critical
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Disabled
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Idea
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Important
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Normal
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.OutlookTask
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.PhoneNumber
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Question
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.TaskNotSyncedYet
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.TaskRemoved
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ToDo
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ToDoPriority1
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.ToDoPriority2
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Unknown_
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Website
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "noteTag.toJSON()". */
trait NoteTagData extends js.Object {
  /**
    *
    * Gets the Id of the NoteTag object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    *
    * Gets the status of the NoteTag object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var status: js.UndefOr[
    NoteTagStatus | Unknown_ | Normal | Completed | Disabled | OutlookTask | TaskNotSyncedYet | TaskRemoved
  ] = js.undefined
  /**
    *
    * Gets the type of the NoteTag object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var `type`: js.UndefOr[
    NoteTagType | Unknown_ | ToDo | Important | Question | Contact | Address | PhoneNumber | Website | Idea | Critical | ToDoPriority1 | ToDoPriority2
  ] = js.undefined
}

object NoteTagData {
  @scala.inline
  def apply(
    id: String = null,
    status: NoteTagStatus | Unknown_ | Normal | Completed | Disabled | OutlookTask | TaskNotSyncedYet | TaskRemoved = null,
    `type`: NoteTagType | Unknown_ | ToDo | Important | Question | Contact | Address | PhoneNumber | Website | Idea | Critical | ToDoPriority1 | ToDoPriority2 = null
  ): NoteTagData = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoteTagData]
  }
}

