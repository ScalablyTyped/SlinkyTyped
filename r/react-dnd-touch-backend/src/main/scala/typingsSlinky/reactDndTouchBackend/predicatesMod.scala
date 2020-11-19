package typingsSlinky.reactDndTouchBackend

import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.Touch
import org.scalajs.dom.raw.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-dnd-touch-backend/lib/utils/predicates", JSImport.Namespace)
@js.native
object predicatesMod extends js.Object {
  
  def eventShouldEndDrag(e: MouseEvent): Boolean = js.native
  
  def eventShouldStartDrag(e: MouseEvent): Boolean = js.native
  
  def isTouchEvent(e: MouseEvent): /* is std.TouchEvent */ Boolean = js.native
  def isTouchEvent(e: Touch): /* is std.TouchEvent */ Boolean = js.native
  def isTouchEvent(e: TouchEvent): /* is std.TouchEvent */ Boolean = js.native
}
