package typingsSlinky.kendoDashUi.kendo.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.kendoDashUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.Draggable")
@js.native
class Draggable protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: DraggableOptions) = this()
  var currentTarget: JQuery = js.native
  @JSName("options")
  var options_Draggable: DraggableOptions = js.native
  def cancelHold(): Unit = js.native
}

