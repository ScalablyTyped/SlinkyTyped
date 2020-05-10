package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RateIncreaseCriteria extends js.Object {
  /**
    * The threshold for number of notified things that will initiate the increase in rate of rollout.
    */
  var numberOfNotifiedThings: js.UndefOr[NumberOfThings] = js.native
  /**
    * The threshold for number of succeeded things that will initiate the increase in rate of rollout.
    */
  var numberOfSucceededThings: js.UndefOr[NumberOfThings] = js.native
}

object RateIncreaseCriteria {
  @scala.inline
  def apply(): RateIncreaseCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RateIncreaseCriteria]
  }
  @scala.inline
  implicit class RateIncreaseCriteriaOps[Self <: RateIncreaseCriteria] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNumberOfNotifiedThings(value: NumberOfThings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfNotifiedThings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfNotifiedThings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfNotifiedThings")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfSucceededThings(value: NumberOfThings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfSucceededThings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfSucceededThings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfSucceededThings")(js.undefined)
        ret
    }
  }
  
}

