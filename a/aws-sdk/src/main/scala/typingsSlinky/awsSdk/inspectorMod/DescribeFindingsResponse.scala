package typingsSlinky.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeFindingsResponse extends js.Object {
  /**
    * Finding details that cannot be described. An error code is provided for each failed item.
    */
  var failedItems: FailedItems = js.native
  /**
    * Information about the finding.
    */
  var findings: FindingList = js.native
}

object DescribeFindingsResponse {
  @scala.inline
  def apply(failedItems: FailedItems, findings: FindingList): DescribeFindingsResponse = {
    val __obj = js.Dynamic.literal(failedItems = failedItems.asInstanceOf[js.Any], findings = findings.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFindingsResponse]
  }
  @scala.inline
  implicit class DescribeFindingsResponseOps[Self <: DescribeFindingsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailedItems(value: FailedItems): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFindings(value: FindingList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findings")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

