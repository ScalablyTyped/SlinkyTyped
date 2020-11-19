package typingsSlinky.ol.dragAndDropMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DragAndDropEventType extends js.Object
@JSImport("ol/interaction/DragAndDrop", "DragAndDropEventType")
@js.native
object DragAndDropEventType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DragAndDropEventType with String] = js.native
  
  @js.native
  sealed trait ADD_FEATURES extends DragAndDropEventType
  /* "addfeatures" */ @js.native
  object ADD_FEATURES extends TopLevel[ADD_FEATURES with String]
}
