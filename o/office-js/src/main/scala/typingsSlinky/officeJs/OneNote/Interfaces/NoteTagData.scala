package typingsSlinky.officeJs.OneNote.Interfaces

import typingsSlinky.officeJs.OneNote.NoteTagStatus
import typingsSlinky.officeJs.OneNote.NoteTagType
import typingsSlinky.officeJs.officeJsStrings.Address
import typingsSlinky.officeJs.officeJsStrings.Completed
import typingsSlinky.officeJs.officeJsStrings.Contact
import typingsSlinky.officeJs.officeJsStrings.Critical
import typingsSlinky.officeJs.officeJsStrings.Disabled
import typingsSlinky.officeJs.officeJsStrings.Idea
import typingsSlinky.officeJs.officeJsStrings.Important
import typingsSlinky.officeJs.officeJsStrings.Normal
import typingsSlinky.officeJs.officeJsStrings.OutlookTask
import typingsSlinky.officeJs.officeJsStrings.PhoneNumber
import typingsSlinky.officeJs.officeJsStrings.Question
import typingsSlinky.officeJs.officeJsStrings.TaskNotSyncedYet
import typingsSlinky.officeJs.officeJsStrings.TaskRemoved
import typingsSlinky.officeJs.officeJsStrings.ToDo
import typingsSlinky.officeJs.officeJsStrings.ToDoPriority1
import typingsSlinky.officeJs.officeJsStrings.ToDoPriority2
import typingsSlinky.officeJs.officeJsStrings.Unknown_
import typingsSlinky.officeJs.officeJsStrings.Website
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

