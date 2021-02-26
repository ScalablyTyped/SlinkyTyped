package typingsSlinky.officeJs.global.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Provides information about the type of a raised event. For each object type, please keep the order of: deleted, selection changed, data changed, added.
  *
  * [Api set: WordApi]
  */
@JSGlobal("Word.EventType")
@js.native
object EventType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsSlinky.officeJs.Word.EventType with String] = js.native
  
  /* "AnnotationAdded" */ val annotationAdded: typingsSlinky.officeJs.Word.EventType.annotationAdded with String = js.native
  
  /* "AnnotationChanged" */ val annotationChanged: typingsSlinky.officeJs.Word.EventType.annotationChanged with String = js.native
  
  /* "AnnotationDeleted" */ val annotationDeleted: typingsSlinky.officeJs.Word.EventType.annotationDeleted with String = js.native
  
  /* "ContentControlAdded" */ val contentControlAdded: typingsSlinky.officeJs.Word.EventType.contentControlAdded with String = js.native
  
  /* "ContentControlDataChanged" */ val contentControlDataChanged: typingsSlinky.officeJs.Word.EventType.contentControlDataChanged with String = js.native
  
  /* "ContentControlDeleted" */ val contentControlDeleted: typingsSlinky.officeJs.Word.EventType.contentControlDeleted with String = js.native
  
  /* "ContentControlSelectionChanged" */ val contentControlSelectionChanged: typingsSlinky.officeJs.Word.EventType.contentControlSelectionChanged with String = js.native
}
