package typingsSlinky.kendoDashUi.kendo.dataviz.drawing

import typingsSlinky.kendoDashUi.kendo.Class
import typingsSlinky.kendoDashUi.kendo.geometry.Point
import typingsSlinky.kendoDashUi.kendo.geometry.Transformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.drawing.Element")
@js.native
class Element () extends Class {
  def this(options: ElementOptions) = this()
  var options: ElementOptions = js.native
  var parent: typingsSlinky.kendoDashUi.kendo.drawing.Group = js.native
  def bbox(): typingsSlinky.kendoDashUi.kendo.geometry.Rect = js.native
  def clip(): typingsSlinky.kendoDashUi.kendo.drawing.Path = js.native
  def clip(clip: typingsSlinky.kendoDashUi.kendo.drawing.Path): Unit = js.native
  def clippedBBox(): typingsSlinky.kendoDashUi.kendo.geometry.Rect = js.native
  def containsPoint(point: Point): Boolean = js.native
  def opacity(): Double = js.native
  def opacity(opacity: Double): Unit = js.native
  def transform(): Transformation = js.native
  def transform(transform: Transformation): Unit = js.native
  def visible(): Boolean = js.native
  def visible(visible: Boolean): Unit = js.native
}

