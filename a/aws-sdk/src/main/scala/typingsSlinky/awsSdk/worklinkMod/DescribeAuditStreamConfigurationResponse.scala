package typingsSlinky.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAuditStreamConfigurationResponse extends js.Object {
  /**
    * The ARN of the Amazon Kinesis data stream that will receive the audit events.
    */
  var AuditStreamArn: js.UndefOr[typingsSlinky.awsSdk.worklinkMod.AuditStreamArn] = js.native
}

object DescribeAuditStreamConfigurationResponse {
  @scala.inline
  def apply(): DescribeAuditStreamConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAuditStreamConfigurationResponse]
  }
  @scala.inline
  implicit class DescribeAuditStreamConfigurationResponseOps[Self <: DescribeAuditStreamConfigurationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuditStreamArn(value: AuditStreamArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuditStreamArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuditStreamArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuditStreamArn")(js.undefined)
        ret
    }
  }
  
}

