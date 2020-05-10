package typingsSlinky.circuitBreakerJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var errorThreshold: js.UndefOr[Double] = js.native
  var numBuckets: js.UndefOr[Double] = js.native
  var onCircuitClose: js.UndefOr[js.Function1[/* m */ Metrics, Unit]] = js.native
  var onCircuitOpen: js.UndefOr[js.Function1[/* m */ Metrics, Unit]] = js.native
  var timeoutDuration: js.UndefOr[Double] = js.native
  var volumeThreshold: js.UndefOr[Double] = js.native
  var windowDuration: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withNumBuckets(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numBuckets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumBuckets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numBuckets")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCircuitClose(value: /* m */ Metrics => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCircuitClose")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCircuitClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCircuitClose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCircuitOpen(value: /* m */ Metrics => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCircuitOpen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCircuitOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCircuitOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeoutDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumeThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowDuration")(js.undefined)
        ret
    }
  }
  
}

