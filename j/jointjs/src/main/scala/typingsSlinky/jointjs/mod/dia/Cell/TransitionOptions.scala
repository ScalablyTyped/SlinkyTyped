package typingsSlinky.jointjs.mod.dia.Cell

import typingsSlinky.jointjs.mod.util.interpolate.InterpolateFunction
import typingsSlinky.jointjs.mod.util.timing.TimingFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitionOptions extends Options {
  var delay: js.UndefOr[Double] = js.native
  var duration: js.UndefOr[Double] = js.native
  var timingFunction: js.UndefOr[TimingFunction] = js.native
  var valueFunction: js.UndefOr[InterpolateFunction[_]] = js.native
}

object TransitionOptions {
  @scala.inline
  def apply(): TransitionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitionOptions]
  }
  @scala.inline
  implicit class TransitionOptionsOps[Self <: TransitionOptions] (val x: Self) extends AnyVal {
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
    def withTimingFunction(value: /* time */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timingFunction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTimingFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timingFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withValueFunction(value: (_, _) => js.Function1[/* time */ Double, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueFunction")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutValueFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueFunction")(js.undefined)
        ret
    }
  }
  
}

