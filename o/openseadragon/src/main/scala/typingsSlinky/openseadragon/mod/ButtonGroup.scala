package typingsSlinky.openseadragon.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.openseadragon.AnonButtons
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openseadragon", "ButtonGroup")
@js.native
class ButtonGroup protected () extends js.Object {
  def this(options: AnonButtons) = this()
  var buttons: js.Array[Button] = js.native
  var element: Element = js.native
  var tracker: MouseTracker = js.native
}

