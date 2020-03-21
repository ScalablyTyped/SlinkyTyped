package typingsSlinky.kendoUi.kendo.dataviz.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.drawing.Group")
@js.native
class Group ()
  extends typingsSlinky.kendoUi.kendo.drawing.Element {
  def this(options: GroupOptions) = this()
  var children: js.Any = js.native
  @JSName("options")
  var options_Group: GroupOptions = js.native
  def append(element: typingsSlinky.kendoUi.kendo.drawing.Element): Unit = js.native
  def clear(): Unit = js.native
  def insert(position: Double, element: typingsSlinky.kendoUi.kendo.drawing.Element): Unit = js.native
  def remove(element: typingsSlinky.kendoUi.kendo.drawing.Element): Unit = js.native
  def removeAt(index: Double): Unit = js.native
}

