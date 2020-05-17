package typingsSlinky.officeJsPreview.global.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the type of a raised event. For each object type, please keep the order of: deleted, selection changed, data changed, added.
  *
  * [Api set: WordApi]
  */
@JSGlobal("Word.EventType")
@js.native
object EventType extends js.Object {
  /* "AnnotationAdded" */ val annotationAdded: typingsSlinky.officeJsPreview.Word.EventType.annotationAdded with String = js.native
  /* "AnnotationChanged" */ val annotationChanged: typingsSlinky.officeJsPreview.Word.EventType.annotationChanged with String = js.native
  /* "AnnotationDeleted" */ val annotationDeleted: typingsSlinky.officeJsPreview.Word.EventType.annotationDeleted with String = js.native
  /* "ContentControlAdded" */ val contentControlAdded: typingsSlinky.officeJsPreview.Word.EventType.contentControlAdded with String = js.native
  /* "ContentControlDataChanged" */ val contentControlDataChanged: typingsSlinky.officeJsPreview.Word.EventType.contentControlDataChanged with String = js.native
  /* "ContentControlDeleted" */ val contentControlDeleted: typingsSlinky.officeJsPreview.Word.EventType.contentControlDeleted with String = js.native
  /* "ContentControlSelectionChanged" */ val contentControlSelectionChanged: typingsSlinky.officeJsPreview.Word.EventType.contentControlSelectionChanged with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsSlinky.officeJsPreview.Word.EventType with String] = js.native
}

