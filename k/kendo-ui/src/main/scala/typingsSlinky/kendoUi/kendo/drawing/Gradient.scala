package typingsSlinky.kendoUi.kendo.drawing

import typingsSlinky.kendoUi.kendo.Class
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Gradient extends Class {
  var options: GradientOptions = js.native
  var stops: js.Any = js.native
  def addStop(offset: Double, color: String, opacity: Double): GradientStop = js.native
  def removeStop(stop: GradientStop): Unit = js.native
}

object Gradient {
  @scala.inline
  def apply(
    addStop: (Double, String, Double) => GradientStop,
    options: GradientOptions,
    removeStop: GradientStop => Unit,
    stops: js.Any
  ): Gradient = {
    val __obj = js.Dynamic.literal(addStop = js.Any.fromFunction3(addStop), options = options.asInstanceOf[js.Any], removeStop = js.Any.fromFunction1(removeStop), stops = stops.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gradient]
  }
  @scala.inline
  implicit class GradientOps[Self <: Gradient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddStop(value: (Double, String, Double) => GradientStop): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addStop")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withOptions(value: GradientOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveStop(value: GradientStop => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeStop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStops(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stops")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

