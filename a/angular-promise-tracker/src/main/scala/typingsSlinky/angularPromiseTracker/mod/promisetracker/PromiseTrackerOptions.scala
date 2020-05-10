package typingsSlinky.angularPromiseTracker.mod.promisetracker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromiseTrackerOptions extends js.Object {
  var activationDelay: js.UndefOr[Double] = js.native
  var minDuration: js.UndefOr[Double] = js.native
}

object PromiseTrackerOptions {
  @scala.inline
  def apply(): PromiseTrackerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PromiseTrackerOptions]
  }
  @scala.inline
  implicit class PromiseTrackerOptionsOps[Self <: PromiseTrackerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivationDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activationDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivationDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activationDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withMinDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDuration")(js.undefined)
        ret
    }
  }
  
}

