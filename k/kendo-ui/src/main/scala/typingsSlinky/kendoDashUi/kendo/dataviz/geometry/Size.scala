package typingsSlinky.kendoDashUi.kendo.dataviz.geometry

import typingsSlinky.kendoDashUi.kendo.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.geometry.Size")
@js.native
class Size () extends Observable {
  var height: Double = js.native
  var options: SizeOptions = js.native
  var width: Double = js.native
  def equals(other: typingsSlinky.kendoDashUi.kendo.geometry.Size): Boolean = js.native
  def getHeight(): Double = js.native
  def getWidth(): Double = js.native
  def setHeight(value: Double): typingsSlinky.kendoDashUi.kendo.geometry.Size = js.native
  def setWidth(value: Double): typingsSlinky.kendoDashUi.kendo.geometry.Size = js.native
}

/* static members */
@JSGlobal("kendo.dataviz.geometry.Size")
@js.native
object Size extends js.Object {
  def create(width: js.Any, height: Double): typingsSlinky.kendoDashUi.kendo.geometry.Size = js.native
  def create(width: Double, height: Double): typingsSlinky.kendoDashUi.kendo.geometry.Size = js.native
  def create(width: typingsSlinky.kendoDashUi.kendo.geometry.Size, height: Double): typingsSlinky.kendoDashUi.kendo.geometry.Size = js.native
}

