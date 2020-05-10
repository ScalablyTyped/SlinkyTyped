package typingsSlinky.reactCountdownCircleTimer.mod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  var colors: ColorType = js.native
  var durationSeconds: Double = js.native
  var gradientUniqueKey: js.UndefOr[String] = js.native
  var isLinearGradient: js.UndefOr[Boolean] = js.native
  var isPlaying: js.UndefOr[Boolean] = js.native
  var onComplete: js.UndefOr[OnCompleteFunctionType] = js.native
  var renderTime: js.UndefOr[RenderTimeFunctionType] = js.native
  var size: js.UndefOr[Double] = js.native
  var strokeLinecap: js.UndefOr[StrokeLinecapType] = js.native
  var strokeWidth: js.UndefOr[Double] = js.native
  var trailColor: js.UndefOr[String] = js.native
}

object Props {
  @scala.inline
  def apply(colors: ColorType, durationSeconds: Double): Props = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], durationSeconds = durationSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColors(value: ColorType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDurationSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGradientUniqueKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientUniqueKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGradientUniqueKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientUniqueKey")(js.undefined)
        ret
    }
    @scala.inline
    def withIsLinearGradient(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLinearGradient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsLinearGradient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLinearGradient")(js.undefined)
        ret
    }
    @scala.inline
    def withIsPlaying(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPlaying")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsPlaying: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPlaying")(js.undefined)
        ret
    }
    @scala.inline
    def withOnComplete(value: () => js.UndefOr[(js.Tuple2[Boolean, Double]) | Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderTime(
      value: (/* remainingTime */ Double, /* elapsedTime */ Double, /* isPlaying */ Boolean) => TagMod[Any]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTime")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutRenderTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTime")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeLinecap(value: StrokeLinecapType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeLinecap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeLinecap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeLinecap")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withTrailColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trailColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrailColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trailColor")(js.undefined)
        ret
    }
  }
  
}

