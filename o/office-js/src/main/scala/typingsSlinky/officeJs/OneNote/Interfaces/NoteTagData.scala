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
@js.native
trait NoteTagData extends js.Object {
  /**
    *
    * Gets the Id of the NoteTag object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[String] = js.native
  /**
    *
    * Gets the status of the NoteTag object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var status: js.UndefOr[
    NoteTagStatus | Unknown_ | Normal | Completed | Disabled | OutlookTask | TaskNotSyncedYet | TaskRemoved
  ] = js.native
  /**
    *
    * Gets the type of the NoteTag object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var `type`: js.UndefOr[
    NoteTagType | Unknown_ | ToDo | Important | Question | Contact | Address | PhoneNumber | Website | Idea | Critical | ToDoPriority1 | ToDoPriority2
  ] = js.native
}

object NoteTagData {
  @scala.inline
  def apply(): NoteTagData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoteTagData]
  }
  @scala.inline
  implicit class NoteTagDataOps[Self <: NoteTagData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(
      value: NoteTagStatus | Unknown_ | Normal | Completed | Disabled | OutlookTask | TaskNotSyncedYet | TaskRemoved
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withType(
      value: NoteTagType | Unknown_ | ToDo | Important | Question | Contact | Address | PhoneNumber | Website | Idea | Critical | ToDoPriority1 | ToDoPriority2
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

