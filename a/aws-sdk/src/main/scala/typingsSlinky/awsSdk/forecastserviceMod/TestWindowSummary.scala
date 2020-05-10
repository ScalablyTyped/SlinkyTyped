package typingsSlinky.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestWindowSummary extends js.Object {
  /**
    * If the test failed, the reason why it failed.
    */
  var Message: js.UndefOr[ErrorMessage] = js.native
  /**
    * The status of the test. Possible status values are:    ACTIVE     CREATE_IN_PROGRESS     CREATE_FAILED   
    */
  var Status: js.UndefOr[typingsSlinky.awsSdk.forecastserviceMod.Status] = js.native
  /**
    * The time at which the test ended.
    */
  var TestWindowEnd: js.UndefOr[js.Date] = js.native
  /**
    * The time at which the test began.
    */
  var TestWindowStart: js.UndefOr[js.Date] = js.native
}

object TestWindowSummary {
  @scala.inline
  def apply(): TestWindowSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestWindowSummary]
  }
  @scala.inline
  implicit class TestWindowSummaryOps[Self <: TestWindowSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessage(value: ErrorMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: Status): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withTestWindowEnd(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TestWindowEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestWindowEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TestWindowEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withTestWindowStart(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TestWindowStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestWindowStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TestWindowStart")(js.undefined)
        ret
    }
  }
  
}

