package typingsSlinky.kendoUi.kendo.dataviz.drawing

import typingsSlinky.kendoUi.kendo.Class
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Gradient extends Class {
  var options: GradientOptions
  var stops: js.Any
  def addStop(offset: Double, color: String, opacity: Double): typingsSlinky.kendoUi.kendo.drawing.GradientStop
  def removeStop(stop: typingsSlinky.kendoUi.kendo.drawing.GradientStop): Unit
}

object Gradient {
  @scala.inline
  def apply(
    addStop: (Double, String, Double) => typingsSlinky.kendoUi.kendo.drawing.GradientStop,
    options: GradientOptions,
    removeStop: typingsSlinky.kendoUi.kendo.drawing.GradientStop => Unit,
    stops: js.Any
  ): Gradient = {
    val __obj = js.Dynamic.literal(addStop = js.Any.fromFunction3(addStop), options = options.asInstanceOf[js.Any], removeStop = js.Any.fromFunction1(removeStop), stops = stops.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gradient]
  }
}

