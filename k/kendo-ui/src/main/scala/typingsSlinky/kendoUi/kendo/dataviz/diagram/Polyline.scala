package typingsSlinky.kendoUi.kendo.dataviz.diagram

import typingsSlinky.kendoUi.kendo.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Polyline extends Observable {
  var drawingElement: typingsSlinky.kendoUi.kendo.drawing.Path = js.native
  var options: PolylineOptions = js.native
  def points(): js.Any = js.native
  def points(points: js.Any): Unit = js.native
  def visible(): Boolean = js.native
  def visible(visible: Boolean): Unit = js.native
}

