package typingsSlinky.ol.dragBoxMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DragBoxEventType extends js.Object
@JSImport("ol/interaction/DragBox", "DragBoxEventType")
@js.native
object DragBoxEventType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DragBoxEventType with String] = js.native
  
  @js.native
  sealed trait BOXDRAG extends DragBoxEventType
  /* "boxdrag" */ @js.native
  object BOXDRAG extends TopLevel[BOXDRAG with String]
  
  @js.native
  sealed trait BOXEND extends DragBoxEventType
  /* "boxend" */ @js.native
  object BOXEND extends TopLevel[BOXEND with String]
  
  @js.native
  sealed trait BOXSTART extends DragBoxEventType
  /* "boxstart" */ @js.native
  object BOXSTART extends TopLevel[BOXSTART with String]
}
