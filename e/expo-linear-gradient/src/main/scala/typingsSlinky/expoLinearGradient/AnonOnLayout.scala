package typingsSlinky.expoLinearGradient

import typingsSlinky.expoLinearGradient.nativeLinearGradientWebMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOnLayout extends js.Object {
  var colors: js.Array[Double] = js.native
  var endPoint: js.UndefOr[Point | Null] = js.native
  var locations: js.UndefOr[js.Array[Double] | Null] = js.native
  var onLayout: js.UndefOr[js.Function] = js.native
  var startPoint: js.UndefOr[Point | Null] = js.native
}

object AnonOnLayout {
  @scala.inline
  def apply(colors: js.Array[Double]): AnonOnLayout = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOnLayout]
  }
  @scala.inline
  implicit class AnonOnLayoutOps[Self <: AnonOnLayout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColors(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndPoint(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endPoint")(js.undefined)
        ret
    }
    @scala.inline
    def withEndPointNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endPoint")(null)
        ret
    }
    @scala.inline
    def withLocations(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locations")(js.undefined)
        ret
    }
    @scala.inline
    def withLocationsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locations")(null)
        ret
    }
    @scala.inline
    def withOnLayout(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withStartPoint(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startPoint")(js.undefined)
        ret
    }
    @scala.inline
    def withStartPointNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startPoint")(null)
        ret
    }
  }
  
}

