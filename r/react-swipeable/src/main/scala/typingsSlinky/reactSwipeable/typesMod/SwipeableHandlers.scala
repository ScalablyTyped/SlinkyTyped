package typingsSlinky.reactSwipeable.typesMod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwipeableHandlers extends js.Object {
  
  var onMouseDown: js.UndefOr[js.Function1[/* event */ SyntheticMouseEvent[Element], Unit]] = js.native
  
  def ref(): Unit = js.native
  def ref(element: HTMLElement): Unit = js.native
}
