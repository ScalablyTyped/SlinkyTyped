package typingsSlinky.reactDndTouchBackend

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.Touch
import org.scalajs.dom.raw.TouchEvent
import typingsSlinky.dndCore.interfacesMod.XYCoord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object offsetsMod {
  
  @JSImport("react-dnd-touch-backend/lib/utils/offsets", "getEventClientOffset")
  @js.native
  def getEventClientOffset(e: MouseEvent): js.UndefOr[XYCoord] = js.native
  @JSImport("react-dnd-touch-backend/lib/utils/offsets", "getEventClientOffset")
  @js.native
  def getEventClientOffset(e: MouseEvent, lastTargetTouchFallback: Touch): js.UndefOr[XYCoord] = js.native
  @JSImport("react-dnd-touch-backend/lib/utils/offsets", "getEventClientOffset")
  @js.native
  def getEventClientOffset(e: Touch): js.UndefOr[XYCoord] = js.native
  @JSImport("react-dnd-touch-backend/lib/utils/offsets", "getEventClientOffset")
  @js.native
  def getEventClientOffset(e: TouchEvent): js.UndefOr[XYCoord] = js.native
  @JSImport("react-dnd-touch-backend/lib/utils/offsets", "getEventClientOffset")
  @js.native
  def getEventClientOffset(e: TouchEvent, lastTargetTouchFallback: Touch): js.UndefOr[XYCoord] = js.native
  @JSImport("react-dnd-touch-backend/lib/utils/offsets", "getEventClientOffset")
  @js.native
  def getEventClientOffset(e: Touch, lastTargetTouchFallback: Touch): js.UndefOr[XYCoord] = js.native
  
  @JSImport("react-dnd-touch-backend/lib/utils/offsets", "getEventClientTouchOffset")
  @js.native
  def getEventClientTouchOffset(e: TouchEvent): js.UndefOr[XYCoord] = js.native
  @JSImport("react-dnd-touch-backend/lib/utils/offsets", "getEventClientTouchOffset")
  @js.native
  def getEventClientTouchOffset(e: TouchEvent, lastTargetTouchFallback: Touch): js.UndefOr[XYCoord] = js.native
  
  @JSImport("react-dnd-touch-backend/lib/utils/offsets", "getNodeClientOffset")
  @js.native
  def getNodeClientOffset(node: Element): js.UndefOr[XYCoord] = js.native
}
