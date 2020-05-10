package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpotInstanceStatus extends js.Object {
  /**
    * The status code. For a list of status codes, see Spot Status Codes in the Amazon EC2 User Guide for Linux Instances.
    */
  var Code: js.UndefOr[String] = js.native
  /**
    * The description for the status code.
    */
  var Message: js.UndefOr[String] = js.native
  /**
    * The date and time of the most recent status update, in UTC format (for example, YYYY-MM-DDTHH:MM:SSZ).
    */
  var UpdateTime: js.UndefOr[js.Date] = js.native
}

object SpotInstanceStatus {
  @scala.inline
  def apply(): SpotInstanceStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpotInstanceStatus]
  }
  @scala.inline
  implicit class SpotInstanceStatusOps[Self <: SpotInstanceStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Code")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
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
    def withUpdateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateTime")(js.undefined)
        ret
    }
  }
  
}

