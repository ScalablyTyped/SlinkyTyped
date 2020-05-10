package typingsSlinky.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIsInTrial extends js.Object {
  var isInTrial: js.UndefOr[Boolean] = js.native
  var trialEndTime: js.UndefOr[String] = js.native
}

object AnonIsInTrial {
  @scala.inline
  def apply(): AnonIsInTrial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonIsInTrial]
  }
  @scala.inline
  implicit class AnonIsInTrialOps[Self <: AnonIsInTrial] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsInTrial(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInTrial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsInTrial: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInTrial")(js.undefined)
        ret
    }
    @scala.inline
    def withTrialEndTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trialEndTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrialEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trialEndTime")(js.undefined)
        ret
    }
  }
  
}

