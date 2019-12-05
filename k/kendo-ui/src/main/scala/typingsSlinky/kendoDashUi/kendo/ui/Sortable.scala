package typingsSlinky.kendoDashUi.kendo.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.kendoDashUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.Sortable")
@js.native
class Sortable protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: SortableOptions) = this()
  @JSName("options")
  var options_Sortable: SortableOptions = js.native
  var wrapper: JQuery = js.native
  def indexOf(element: JQuery): Double = js.native
  def items(): JQuery = js.native
}

/* static members */
@JSGlobal("kendo.ui.Sortable")
@js.native
object Sortable extends js.Object {
  var fn: Sortable = js.native
  def extend(proto: js.Object): Sortable = js.native
}

