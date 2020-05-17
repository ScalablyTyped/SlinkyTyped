package typingsSlinky.kendoUi.kendo.dataviz.geometry

import typingsSlinky.kendoUi.kendo.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Matrix extends Observable {
  var a: Double = js.native
  var b: Double = js.native
  var c: Double = js.native
  var d: Double = js.native
  var e: Double = js.native
  var f: Double = js.native
  var options: MatrixOptions = js.native
  def equals(other: typingsSlinky.kendoUi.kendo.geometry.Matrix): Boolean = js.native
  def multiplyCopy(matrix: typingsSlinky.kendoUi.kendo.geometry.Matrix): typingsSlinky.kendoUi.kendo.geometry.Matrix = js.native
  def round(digits: Double): typingsSlinky.kendoUi.kendo.geometry.Matrix = js.native
  def toArray(digits: Double): js.Any = js.native
  def toString(digits: Double, separator: String): String = js.native
}

