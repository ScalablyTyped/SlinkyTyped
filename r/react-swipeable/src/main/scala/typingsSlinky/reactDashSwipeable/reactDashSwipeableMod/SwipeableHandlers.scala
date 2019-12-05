package typingsSlinky.reactDashSwipeable.reactDashSwipeableMod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.react.reactMod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwipeableHandlers extends js.Object {
  var onMouseDown: js.UndefOr[MouseEventHandler[Element]] = js.native
  def ref(): Unit = js.native
  def ref(element: HTMLElement): Unit = js.native
}

