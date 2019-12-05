package typingsSlinky.kendoDashUi.kendo.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.kendoDashUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.Touch")
@js.native
class Touch protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: TouchOptions) = this()
  @JSName("options")
  var options_Touch: TouchOptions = js.native
  var wrapper: JQuery = js.native
  def cancel(): Unit = js.native
}

/* static members */
@JSGlobal("kendo.ui.Touch")
@js.native
object Touch extends js.Object {
  var fn: Touch = js.native
  def extend(proto: js.Object): Touch = js.native
}

