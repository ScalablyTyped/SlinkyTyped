package typingsSlinky.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetentionPeriod extends js.Object {
  /**
    * The number of days that message data is kept. The "unlimited" parameter must be false.
    */
  var numberOfDays: js.UndefOr[RetentionPeriodInDays] = js.native
  /**
    * If true, message data is kept indefinitely.
    */
  var unlimited: js.UndefOr[UnlimitedRetentionPeriod] = js.native
}

object RetentionPeriod {
  @scala.inline
  def apply(): RetentionPeriod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetentionPeriod]
  }
  @scala.inline
  implicit class RetentionPeriodOps[Self <: RetentionPeriod] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNumberOfDays(value: RetentionPeriodInDays): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfDays")(js.undefined)
        ret
    }
    @scala.inline
    def withUnlimited(value: UnlimitedRetentionPeriod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlimited")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnlimited: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlimited")(js.undefined)
        ret
    }
  }
  
}

