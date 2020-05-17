package typingsSlinky.kendoUi.kendo.dataviz.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Group
  extends typingsSlinky.kendoUi.kendo.drawing.Element {
  var children: js.Any = js.native
  @JSName("options")
  var options_Group: GroupOptions = js.native
  def append(element: typingsSlinky.kendoUi.kendo.drawing.Element): Unit = js.native
  def clear(): Unit = js.native
  def insert(position: Double, element: typingsSlinky.kendoUi.kendo.drawing.Element): Unit = js.native
  def remove(element: typingsSlinky.kendoUi.kendo.drawing.Element): Unit = js.native
  def removeAt(index: Double): Unit = js.native
}

