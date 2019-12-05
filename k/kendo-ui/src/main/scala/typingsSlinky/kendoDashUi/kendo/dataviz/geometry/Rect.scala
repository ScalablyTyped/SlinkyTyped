package typingsSlinky.kendoDashUi.kendo.dataviz.geometry

import typingsSlinky.kendoDashUi.kendo.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.geometry.Rect")
@js.native
class Rect protected () extends Observable {
  def this(origin: js.Any, size: js.Any) = this()
  def this(origin: js.Any, size: typingsSlinky.kendoDashUi.kendo.geometry.Size) = this()
  def this(origin: typingsSlinky.kendoDashUi.kendo.geometry.Point, size: js.Any) = this()
  def this(
    origin: typingsSlinky.kendoDashUi.kendo.geometry.Point,
    size: typingsSlinky.kendoDashUi.kendo.geometry.Size
  ) = this()
  var options: RectOptions = js.native
  var origin: typingsSlinky.kendoDashUi.kendo.geometry.Point = js.native
  var size: typingsSlinky.kendoDashUi.kendo.geometry.Size = js.native
  def bbox(matrix: typingsSlinky.kendoDashUi.kendo.geometry.Matrix): typingsSlinky.kendoDashUi.kendo.geometry.Rect = js.native
  def bottomLeft(): typingsSlinky.kendoDashUi.kendo.geometry.Point = js.native
  def bottomRight(): typingsSlinky.kendoDashUi.kendo.geometry.Point = js.native
  def center(): typingsSlinky.kendoDashUi.kendo.geometry.Point = js.native
  def equals(other: typingsSlinky.kendoDashUi.kendo.geometry.Rect): Boolean = js.native
  def getOrigin(): typingsSlinky.kendoDashUi.kendo.geometry.Point = js.native
  def getSize(): typingsSlinky.kendoDashUi.kendo.geometry.Size = js.native
  def height(): Double = js.native
  def setOrigin(value: js.Any): typingsSlinky.kendoDashUi.kendo.geometry.Rect = js.native
  def setOrigin(value: typingsSlinky.kendoDashUi.kendo.geometry.Point): typingsSlinky.kendoDashUi.kendo.geometry.Rect = js.native
  def setSize(value: js.Any): typingsSlinky.kendoDashUi.kendo.geometry.Rect = js.native
  def setSize(value: typingsSlinky.kendoDashUi.kendo.geometry.Size): typingsSlinky.kendoDashUi.kendo.geometry.Rect = js.native
  def topLeft(): typingsSlinky.kendoDashUi.kendo.geometry.Point = js.native
  def topRight(): typingsSlinky.kendoDashUi.kendo.geometry.Point = js.native
  def width(): Double = js.native
}

/* static members */
@JSGlobal("kendo.dataviz.geometry.Rect")
@js.native
object Rect extends js.Object {
  def fromPoints(
    pointA: typingsSlinky.kendoDashUi.kendo.geometry.Point,
    pointB: typingsSlinky.kendoDashUi.kendo.geometry.Point
  ): typingsSlinky.kendoDashUi.kendo.geometry.Rect = js.native
  def union(
    rectA: typingsSlinky.kendoDashUi.kendo.geometry.Rect,
    rectB: typingsSlinky.kendoDashUi.kendo.geometry.Rect
  ): typingsSlinky.kendoDashUi.kendo.geometry.Rect = js.native
}

