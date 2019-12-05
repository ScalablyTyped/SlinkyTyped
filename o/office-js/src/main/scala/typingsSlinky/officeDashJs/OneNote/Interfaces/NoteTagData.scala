package typingsSlinky.officeDashJs.OneNote.Interfaces

import typingsSlinky.officeDashJs.OneNote.NoteTagStatus
import typingsSlinky.officeDashJs.OneNote.NoteTagType
import typingsSlinky.officeDashJs.officeDashJsStrings.Address
import typingsSlinky.officeDashJs.officeDashJsStrings.Completed
import typingsSlinky.officeDashJs.officeDashJsStrings.Contact
import typingsSlinky.officeDashJs.officeDashJsStrings.Critical
import typingsSlinky.officeDashJs.officeDashJsStrings.Disabled
import typingsSlinky.officeDashJs.officeDashJsStrings.Idea
import typingsSlinky.officeDashJs.officeDashJsStrings.Important
import typingsSlinky.officeDashJs.officeDashJsStrings.Normal
import typingsSlinky.officeDashJs.officeDashJsStrings.OutlookTask
import typingsSlinky.officeDashJs.officeDashJsStrings.PhoneNumber
import typingsSlinky.officeDashJs.officeDashJsStrings.Question
import typingsSlinky.officeDashJs.officeDashJsStrings.TaskNotSyncedYet
import typingsSlinky.officeDashJs.officeDashJsStrings.TaskRemoved
import typingsSlinky.officeDashJs.officeDashJsStrings.ToDo
import typingsSlinky.officeDashJs.officeDashJsStrings.ToDoPriority1
import typingsSlinky.officeDashJs.officeDashJsStrings.ToDoPriority2
import typingsSlinky.officeDashJs.officeDashJsStrings.Unknown_
import typingsSlinky.officeDashJs.officeDashJsStrings.Website
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

