package typingsSlinky.kendoUi.kendo.mobile.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.mobile.ui.Layout")
@js.native
class Layout protected ()
  extends typingsSlinky.kendoUi.kendo.ui.Widget {
  def this(element: Element) = this()
  def this(element: Element, options: LayoutOptions) = this()
  @JSName("options")
  var options_Layout: LayoutOptions = js.native
  var wrapper: JQuery = js.native
}

/* static members */
@JSGlobal("kendo.mobile.ui.Layout")
@js.native
object Layout extends js.Object {
  var fn: Layout = js.native
  def extend(proto: js.Object): Layout = js.native
}

