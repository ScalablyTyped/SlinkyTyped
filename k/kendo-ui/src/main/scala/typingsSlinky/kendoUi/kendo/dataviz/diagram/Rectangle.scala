package typingsSlinky.kendoUi.kendo.dataviz.diagram

import typingsSlinky.kendoUi.kendo.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rectangle extends Observable {
  var drawingElement: typingsSlinky.kendoUi.kendo.drawing.Path = js.native
  var options: RectangleOptions = js.native
  def visible(): Boolean = js.native
  def visible(visible: Boolean): Unit = js.native
}

