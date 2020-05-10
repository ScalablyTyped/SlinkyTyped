package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAuditFindingResponse extends js.Object {
  var finding: js.UndefOr[AuditFinding] = js.native
}

object DescribeAuditFindingResponse {
  @scala.inline
  def apply(): DescribeAuditFindingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAuditFindingResponse]
  }
  @scala.inline
  implicit class DescribeAuditFindingResponseOps[Self <: DescribeAuditFindingResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFinding(value: AuditFinding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finding")(js.undefined)
        ret
    }
  }
  
}

