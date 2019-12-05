package typingsSlinky.kendoDashUi.kendo.dataviz.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.kendoDashUi.JQuery
import typingsSlinky.kendoDashUi.kendo.data.DataSource
import typingsSlinky.kendoDashUi.kendo.ui.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.ui.TreeMap")
@js.native
class TreeMap protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: TreeMapOptions) = this()
  var dataSource: DataSource = js.native
  @JSName("options")
  var options_TreeMap: TreeMapOptions = js.native
  var wrapper: JQuery = js.native
}

/* static members */
@JSGlobal("kendo.dataviz.ui.TreeMap")
@js.native
object TreeMap extends js.Object {
  var fn: TreeMap = js.native
  def extend(proto: js.Object): TreeMap = js.native
}

