package typingsSlinky.rcRate.starMod

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.KeyboardEventHandler
import typingsSlinky.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Star
  extends Component[StarProps, js.Object, js.Any] {
  var onHover: MouseEventHandler[HTMLDivElement] = js.native
  var onKeyDown: KeyboardEventHandler[HTMLDivElement] = js.native
  def getClassName(): String = js.native
  def onClick(e: js.Any): Unit = js.native
}

