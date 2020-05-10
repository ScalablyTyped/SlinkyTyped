package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurityProfileTarget extends js.Object {
  /**
    * The ARN of the security profile.
    */
  var arn: SecurityProfileTargetArn = js.native
}

object SecurityProfileTarget {
  @scala.inline
  def apply(arn: SecurityProfileTargetArn): SecurityProfileTarget = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityProfileTarget]
  }
  @scala.inline
  implicit class SecurityProfileTargetOps[Self <: SecurityProfileTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: SecurityProfileTargetArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

