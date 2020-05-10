package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlertTarget extends js.Object {
  /**
    * The ARN of the notification target to which alerts are sent.
    */
  var alertTargetArn: AlertTargetArn = js.native
  /**
    * The ARN of the role that grants permission to send alerts to the notification target.
    */
  var roleArn: RoleArn = js.native
}

object AlertTarget {
  @scala.inline
  def apply(alertTargetArn: AlertTargetArn, roleArn: RoleArn): AlertTarget = {
    val __obj = js.Dynamic.literal(alertTargetArn = alertTargetArn.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlertTarget]
  }
  @scala.inline
  implicit class AlertTargetOps[Self <: AlertTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlertTargetArn(value: AlertTargetArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alertTargetArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoleArn(value: RoleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

