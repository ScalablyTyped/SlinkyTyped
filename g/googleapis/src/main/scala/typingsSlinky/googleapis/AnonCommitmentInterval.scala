package typingsSlinky.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCommitmentInterval extends js.Object {
  var commitmentInterval: js.UndefOr[AnonEndTime] = js.native
  var isCommitmentPlan: js.UndefOr[Boolean] = js.native
  var planName: js.UndefOr[String] = js.native
}

object AnonCommitmentInterval {
  @scala.inline
  def apply(): AnonCommitmentInterval = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCommitmentInterval]
  }
  @scala.inline
  implicit class AnonCommitmentIntervalOps[Self <: AnonCommitmentInterval] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommitmentInterval(value: AnonEndTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitmentInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommitmentInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitmentInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withIsCommitmentPlan(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCommitmentPlan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCommitmentPlan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCommitmentPlan")(js.undefined)
        ret
    }
    @scala.inline
    def withPlanName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("planName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlanName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("planName")(js.undefined)
        ret
    }
  }
  
}

