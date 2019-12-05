package typingsSlinky.officeDashJsDashPreview.OneNote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NoteTagType extends js.Object

/**
  * [Api set: OneNoteApi 1.1]
  */
@JSGlobal("OneNote.NoteTagType")
@js.native
object NoteTagType extends js.Object {
  @js.native
  sealed trait address extends NoteTagType
  
  @js.native
  sealed trait contact extends NoteTagType
  
  @js.native
  sealed trait critical extends NoteTagType
  
  @js.native
  sealed trait idea extends NoteTagType
  
  @js.native
  sealed trait important extends NoteTagType
  
  @js.native
  sealed trait phoneNumber extends NoteTagType
  
  @js.native
  sealed trait question extends NoteTagType
  
  @js.native
  sealed trait toDo extends NoteTagType
  
  @js.native
  sealed trait toDoPriority1 extends NoteTagType
  
  @js.native
  sealed trait toDoPriority2 extends NoteTagType
  
  @js.native
  sealed trait unknown extends NoteTagType
  
  @js.native
  sealed trait website extends NoteTagType
  
  /* "Address" */ val address: typingsSlinky.officeDashJsDashPreview.OneNote.NoteTagType.address with String = js.native
  /* "Contact" */ val contact: typingsSlinky.officeDashJsDashPreview.OneNote.NoteTagType.contact with String = js.native
  /* "Critical" */ val critical: typingsSlinky.officeDashJsDashPreview.OneNote.NoteTagType.critical with String = js.native
  /* "Idea" */ val idea: typingsSlinky.officeDashJsDashPreview.OneNote.NoteTagType.idea with String = js.native
  /* "Important" */ val important: typingsSlinky.officeDashJsDashPreview.OneNote.NoteTagType.important with String = js.native
  /* "PhoneNumber" */ val phoneNumber: typingsSlinky.officeDashJsDashPreview.OneNote.NoteTagType.phoneNumber with String = js.native
  /* "Question" */ val question: typingsSlinky.officeDashJsDashPreview.OneNote.NoteTagType.question with String = js.native
  /* "ToDo" */ val toDo: typingsSlinky.officeDashJsDashPreview.OneNote.NoteTagType.toDo with String = js.native
  /* "ToDoPriority1" */ val toDoPriority1: typingsSlinky.officeDashJsDashPreview.OneNote.NoteTagType.toDoPriority1 with String = js.native
  /* "ToDoPriority2" */ val toDoPriority2: typingsSlinky.officeDashJsDashPreview.OneNote.NoteTagType.toDoPriority2 with String = js.native
  /* "Unknown" */ val unknown: typingsSlinky.officeDashJsDashPreview.OneNote.NoteTagType.unknown with String = js.native
  /* "Website" */ val website: typingsSlinky.officeDashJsDashPreview.OneNote.NoteTagType.website with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[NoteTagType with String] = js.native
}

