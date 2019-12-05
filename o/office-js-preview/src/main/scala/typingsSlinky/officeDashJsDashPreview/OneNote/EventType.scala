package typingsSlinky.officeDashJsDashPreview.OneNote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EventType extends js.Object

/**
  * [Api set: OneNoteApi 1.3]
  */
@JSGlobal("OneNote.EventType")
@js.native
object EventType extends js.Object {
  @js.native
  sealed trait notebookChanged extends EventType
  
  @js.native
  sealed trait pageSelectionChanged extends EventType
  
  @js.native
  sealed trait sectionSelectionChanged extends EventType
  
  @js.native
  sealed trait stickyNotesContextMenuExecuted extends EventType
  
  /* "NotebookChanged" */ val notebookChanged: typingsSlinky.officeDashJsDashPreview.OneNote.EventType.notebookChanged with String = js.native
  /* "PageSelectionChanged" */ val pageSelectionChanged: typingsSlinky.officeDashJsDashPreview.OneNote.EventType.pageSelectionChanged with String = js.native
  /* "SectionSelectionChanged" */ val sectionSelectionChanged: typingsSlinky.officeDashJsDashPreview.OneNote.EventType.sectionSelectionChanged with String = js.native
  /* "StickyNotesContextMenuExecuted" */ val stickyNotesContextMenuExecuted: typingsSlinky.officeDashJsDashPreview.OneNote.EventType.stickyNotesContextMenuExecuted with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EventType with String] = js.native
}

