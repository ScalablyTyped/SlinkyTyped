package typingsSlinky.kendoUi.kendo.dataviz

import typingsSlinky.kendoUi.kendo.Observable_
import typingsSlinky.kendoUi.kendo.geometry.Point
import typingsSlinky.kendoUi.kendo.geometry.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.ChartAxis")
@js.native
class ChartAxis () extends Observable_ {
  var options: ChartAxisOptions = js.native
  def range(): js.Any = js.native
  def slot(from: String): Rect = js.native
  def slot(from: String, to: String): Rect = js.native
  def slot(from: String, to: String, limit: Boolean): Rect = js.native
  def slot(from: String, to: Double): Rect = js.native
  def slot(from: String, to: Double, limit: Boolean): Rect = js.native
  def slot(from: String, to: js.Date): Rect = js.native
  def slot(from: String, to: js.Date, limit: Boolean): Rect = js.native
  def slot(from: Double): Rect = js.native
  def slot(from: Double, to: String): Rect = js.native
  def slot(from: Double, to: String, limit: Boolean): Rect = js.native
  def slot(from: Double, to: Double): Rect = js.native
  def slot(from: Double, to: Double, limit: Boolean): Rect = js.native
  def slot(from: Double, to: js.Date): Rect = js.native
  def slot(from: Double, to: js.Date, limit: Boolean): Rect = js.native
  def slot(from: js.Date): Rect = js.native
  def slot(from: js.Date, to: String): Rect = js.native
  def slot(from: js.Date, to: String, limit: Boolean): Rect = js.native
  def slot(from: js.Date, to: Double): Rect = js.native
  def slot(from: js.Date, to: Double, limit: Boolean): Rect = js.native
  def slot(from: js.Date, to: js.Date): Rect = js.native
  def slot(from: js.Date, to: js.Date, limit: Boolean): Rect = js.native
  def value(point: Point): Unit = js.native
  def valueRange(): Unit = js.native
}

