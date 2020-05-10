package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GradientColorObject extends _ColorType {
  /**
    * Holds an object that defines the start position and the end position
    * relative to the shape.
    */
  var linearGradient: js.UndefOr[LinearGradientColorObject] = js.native
  /**
    * Holds an object that defines the center position and the radius.
    */
  var radialGradient: js.UndefOr[RadialGradientColorObject] = js.native
  /**
    * The first item in each tuple is the position in the gradient, where 0 is
    * the start of the gradient and 1 is the end of the gradient. Multiple
    * stops can be applied. The second item is the color for each stop. This
    * color can also be given in the rgba format.
    */
  var stops: js.Array[GradientColorStopObject] = js.native
}

object GradientColorObject {
  @scala.inline
  def apply(stops: js.Array[GradientColorStopObject]): GradientColorObject = {
    val __obj = js.Dynamic.literal(stops = stops.asInstanceOf[js.Any])
    __obj.asInstanceOf[GradientColorObject]
  }
  @scala.inline
  implicit class GradientColorObjectOps[Self <: GradientColorObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStops(value: js.Array[GradientColorStopObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinearGradient(value: LinearGradientColorObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linearGradient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinearGradient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linearGradient")(js.undefined)
        ret
    }
    @scala.inline
    def withRadialGradient(value: RadialGradientColorObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radialGradient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadialGradient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radialGradient")(js.undefined)
        ret
    }
  }
  
}

