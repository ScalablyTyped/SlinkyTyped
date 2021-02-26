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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling "noteTag.toJSON()". */
@js.native
trait NoteTagData extends StObject {
  
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
  implicit class NoteTagDataMutableBuilder[Self <: NoteTagData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setStatus(
      value: NoteTagStatus | Unknown_ | Normal | Completed | Disabled | OutlookTask | TaskNotSyncedYet | TaskRemoved
    ): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setType(
      value: NoteTagType | Unknown_ | ToDo | Important | Question | Contact | Address | PhoneNumber | Website | Idea | Critical | ToDoPriority1 | ToDoPriority2
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
