package typingsSlinky.reactDndTouchBackend

import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.Touch
import org.scalajs.dom.raw.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object predicatesMod {
  
  @JSImport("react-dnd-touch-backend/lib/utils/predicates", "eventShouldEndDrag")
  @js.native
  def eventShouldEndDrag(e: MouseEvent): Boolean = js.native
  
  @JSImport("react-dnd-touch-backend/lib/utils/predicates", "eventShouldStartDrag")
  @js.native
  def eventShouldStartDrag(e: MouseEvent): Boolean = js.native
  
  @JSImport("react-dnd-touch-backend/lib/utils/predicates", "isTouchEvent")
  @js.native
  def isTouchEvent(e: MouseEvent): /* is std.TouchEvent */ Boolean = js.native
  @JSImport("react-dnd-touch-backend/lib/utils/predicates", "isTouchEvent")
  @js.native
  def isTouchEvent(e: Touch): /* is std.TouchEvent */ Boolean = js.native
  @JSImport("react-dnd-touch-backend/lib/utils/predicates", "isTouchEvent")
  @js.native
  def isTouchEvent(e: TouchEvent): /* is std.TouchEvent */ Boolean = js.native
}
