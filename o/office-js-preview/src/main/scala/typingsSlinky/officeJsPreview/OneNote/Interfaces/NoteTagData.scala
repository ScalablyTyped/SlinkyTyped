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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setStatus(
      value: NoteTagStatus | Unknown_ | Normal | Completed | Disabled | OutlookTask | TaskNotSyncedYet | TaskRemoved
    ): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setType(
      value: NoteTagType | Unknown_ | ToDo | Important | Question | Contact | Address | PhoneNumber | Website | Idea | Critical | ToDoPriority1 | ToDoPriority2
    ): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
