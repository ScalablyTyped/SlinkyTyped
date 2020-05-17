package typingsSlinky.aliApp.anon

import typingsSlinky.aliApp.my.TimingFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<ali-app.my.CreateAnimationOptions> */
@js.native
trait PartialCreateAnimationOpt extends js.Object {
  var delay: js.UndefOr[Double] = js.native
  var duration: js.UndefOr[Double] = js.native
  var timeFunction: js.UndefOr[TimingFunction] = js.native
  var transformOrigin: js.UndefOr[String] = js.native
}

object PartialCreateAnimationOpt {
  @scala.inline
  def apply(): PartialCreateAnimationOpt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCreateAnimationOpt]
  }
  @scala.inline
  implicit class PartialCreateAnimationOptOps[Self <: PartialCreateAnimationOpt] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelay(value: Double): Self = {
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
    def withDuration(value: Double): Self = {
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
    def withTimeFunction(value: TimingFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeFunction")(js.undefined)
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

