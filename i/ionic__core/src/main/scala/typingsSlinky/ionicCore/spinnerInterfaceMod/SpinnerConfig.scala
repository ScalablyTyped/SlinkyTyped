package typingsSlinky.ionicCore.spinnerInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpinnerConfig extends js.Object {
  var circles: js.UndefOr[Double] = js.native
  var dur: Double = js.native
  var elmDuration: js.UndefOr[Boolean] = js.native
  var lines: js.UndefOr[Double] = js.native
  def fn(dur: Double, index: Double, total: Double): SpinnerData = js.native
}

object SpinnerConfig {
  @scala.inline
  def apply(dur: Double, fn: (Double, Double, Double) => SpinnerData): SpinnerConfig = {
    val __obj = js.Dynamic.literal(dur = dur.asInstanceOf[js.Any], fn = js.Any.fromFunction3(fn))
    __obj.asInstanceOf[SpinnerConfig]
  }
  @scala.inline
  implicit class SpinnerConfigOps[Self <: SpinnerConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDur(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFn(value: (Double, Double, Double) => SpinnerData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fn")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withCircles(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCircles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circles")(js.undefined)
        ret
    }
    @scala.inline
    def withElmDuration(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elmDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElmDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elmDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withLines(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lines")(js.undefined)
        ret
    }
  }
  
}

