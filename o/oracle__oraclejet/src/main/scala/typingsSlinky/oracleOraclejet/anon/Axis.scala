package typingsSlinky.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Axis extends js.Object {
  var axis: js.UndefOr[String] = js.native
  var backfaceVisibility: js.UndefOr[String] = js.native
  var delay: js.UndefOr[String] = js.native
  var duration: js.UndefOr[String] = js.native
  var endAngle: js.UndefOr[String] = js.native
  var flipTarget: js.UndefOr[String] = js.native
  var persist: js.UndefOr[String] = js.native
  var perspective: js.UndefOr[String] = js.native
  var startAngle: js.UndefOr[String] = js.native
  var timingFunction: js.UndefOr[String] = js.native
  var transformOrigin: js.UndefOr[String] = js.native
}

object Axis {
  @scala.inline
  def apply(): Axis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Axis]
  }
  @scala.inline
  implicit class AxisOps[Self <: Axis] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(js.undefined)
        ret
    }
    @scala.inline
    def withBackfaceVisibility(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backfaceVisibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackfaceVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backfaceVisibility")(js.undefined)
        ret
    }
    @scala.inline
    def withDelay(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withEndAngle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withFlipTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flipTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlipTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flipTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withPersist(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persist")(js.undefined)
        ret
    }
    @scala.inline
    def withPerspective(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perspective")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerspective: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perspective")(js.undefined)
        ret
    }
    @scala.inline
    def withStartAngle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withTimingFunction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timingFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimingFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timingFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformOrigin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformOrigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransformOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformOrigin")(js.undefined)
        ret
    }
  }
  
}

