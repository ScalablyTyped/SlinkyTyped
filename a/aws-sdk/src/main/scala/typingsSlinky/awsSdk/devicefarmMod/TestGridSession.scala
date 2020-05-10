package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestGridSession extends js.Object {
  /**
    * The ARN of the session.
    */
  var arn: js.UndefOr[DeviceFarmArn] = js.native
  /**
    * The number of billed minutes that were used for this session. 
    */
  var billingMinutes: js.UndefOr[Double] = js.native
  /**
    * The time that the session was started.
    */
  var created: js.UndefOr[js.Date] = js.native
  /**
    * The time the session ended.
    */
  var ended: js.UndefOr[js.Date] = js.native
  /**
    * A JSON object of options and parameters passed to the Selenium WebDriver.
    */
  var seleniumProperties: js.UndefOr[String] = js.native
  /**
    * The state of the session.
    */
  var status: js.UndefOr[TestGridSessionStatus] = js.native
}

object TestGridSession {
  @scala.inline
  def apply(): TestGridSession = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestGridSession]
  }
  @scala.inline
  implicit class TestGridSessionOps[Self <: TestGridSession] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: DeviceFarmArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withBillingMinutes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBillingMinutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingMinutes")(js.undefined)
        ret
    }
    @scala.inline
    def withCreated(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(js.undefined)
        ret
    }
    @scala.inline
    def withEnded(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ended")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ended")(js.undefined)
        ret
    }
    @scala.inline
    def withSeleniumProperties(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seleniumProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeleniumProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seleniumProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: TestGridSessionStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

