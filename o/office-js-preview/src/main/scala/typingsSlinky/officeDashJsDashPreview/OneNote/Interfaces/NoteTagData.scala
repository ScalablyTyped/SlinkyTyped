package typingsSlinky.officeDashJsDashPreview.OneNote.Interfaces

import typingsSlinky.officeDashJsDashPreview.OneNote.NoteTagStatus
import typingsSlinky.officeDashJsDashPreview.OneNote.NoteTagType
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Address
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Completed
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Contact
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Critical
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Disabled
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Idea
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Important
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Normal
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.OutlookTask
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.PhoneNumber
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Question
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.TaskNotSyncedYet
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.TaskRemoved
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ToDo
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ToDoPriority1
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ToDoPriority2
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Unknown_
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Website
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

