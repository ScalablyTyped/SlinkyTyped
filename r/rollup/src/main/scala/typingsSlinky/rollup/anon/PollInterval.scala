package typingsSlinky.rollup.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PollInterval extends js.Object {
  var pollInterval: js.UndefOr[Double] = js.native
  var stabilityThreshold: js.UndefOr[Double] = js.native
}

object PollInterval {
  @scala.inline
  def apply(): PollInterval = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PollInterval]
  }
  @scala.inline
  implicit class PollIntervalOps[Self <: PollInterval] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPollInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pollInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPollInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pollInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withStabilityThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stabilityThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStabilityThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stabilityThreshold")(js.undefined)
        ret
    }
  }
  
}

