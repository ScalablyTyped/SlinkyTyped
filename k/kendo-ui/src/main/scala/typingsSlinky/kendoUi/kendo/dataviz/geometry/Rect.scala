package typingsSlinky.kendoUi.kendo.dataviz.geometry

import typingsSlinky.kendoUi.kendo.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rect extends Observable {
  var options: RectOptions = js.native
  var origin: typingsSlinky.kendoUi.kendo.geometry.Point = js.native
  var size: typingsSlinky.kendoUi.kendo.geometry.Size = js.native
  def bbox(matrix: typingsSlinky.kendoUi.kendo.geometry.Matrix): typingsSlinky.kendoUi.kendo.geometry.Rect = js.native
  def bottomLeft(): typingsSlinky.kendoUi.kendo.geometry.Point = js.native
  def bottomRight(): typingsSlinky.kendoUi.kendo.geometry.Point = js.native
  def center(): typingsSlinky.kendoUi.kendo.geometry.Point = js.native
  def equals(other: typingsSlinky.kendoUi.kendo.geometry.Rect): Boolean = js.native
  def getOrigin(): typingsSlinky.kendoUi.kendo.geometry.Point = js.native
  def getSize(): typingsSlinky.kendoUi.kendo.geometry.Size = js.native
  def height(): Double = js.native
  def setOrigin(value: js.Any): typingsSlinky.kendoUi.kendo.geometry.Rect = js.native
  def setOrigin(value: typingsSlinky.kendoUi.kendo.geometry.Point): typingsSlinky.kendoUi.kendo.geometry.Rect = js.native
  def setSize(value: js.Any): typingsSlinky.kendoUi.kendo.geometry.Rect = js.native
  def setSize(value: typingsSlinky.kendoUi.kendo.geometry.Size): typingsSlinky.kendoUi.kendo.geometry.Rect = js.native
  def topLeft(): typingsSlinky.kendoUi.kendo.geometry.Point = js.native
  def topRight(): typingsSlinky.kendoUi.kendo.geometry.Point = js.native
  def width(): Double = js.native
}

