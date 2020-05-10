package typingsSlinky.reactNative.mod.Animated

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InterpolationConfigType extends js.Object {
  var easing: js.UndefOr[js.Function1[/* input */ Double, Double]] = js.native
  var extrapolate: js.UndefOr[ExtrapolateType] = js.native
  var extrapolateLeft: js.UndefOr[ExtrapolateType] = js.native
  var extrapolateRight: js.UndefOr[ExtrapolateType] = js.native
  var inputRange: js.Array[Double] = js.native
  var outputRange: js.Array[Double | String] = js.native
}

object InterpolationConfigType {
  @scala.inline
  def apply(inputRange: js.Array[Double], outputRange: js.Array[Double | String]): InterpolationConfigType = {
    val __obj = js.Dynamic.literal(inputRange = inputRange.asInstanceOf[js.Any], outputRange = outputRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterpolationConfigType]
  }
  @scala.inline
  implicit class InterpolationConfigTypeOps[Self <: InterpolationConfigType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputRange(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputRange(value: js.Array[Double | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEasing(value: /* input */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(js.undefined)
        ret
    }
    @scala.inline
    def withExtrapolate(value: ExtrapolateType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extrapolate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtrapolate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extrapolate")(js.undefined)
        ret
    }
    @scala.inline
    def withExtrapolateLeft(value: ExtrapolateType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extrapolateLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtrapolateLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extrapolateLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withExtrapolateRight(value: ExtrapolateType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extrapolateRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtrapolateRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extrapolateRight")(js.undefined)
        ret
    }
  }
  
}

