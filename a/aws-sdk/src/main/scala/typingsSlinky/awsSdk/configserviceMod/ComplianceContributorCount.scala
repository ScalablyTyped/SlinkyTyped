package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComplianceContributorCount extends js.Object {
  /**
    * Indicates whether the maximum count is reached.
    */
  var CapExceeded: js.UndefOr[Boolean] = js.native
  /**
    * The number of AWS resources or AWS Config rules responsible for the current compliance of the item.
    */
  var CappedCount: js.UndefOr[Integer] = js.native
}

object ComplianceContributorCount {
  @scala.inline
  def apply(): ComplianceContributorCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComplianceContributorCount]
  }
  @scala.inline
  implicit class ComplianceContributorCountOps[Self <: ComplianceContributorCount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCapExceeded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CapExceeded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapExceeded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CapExceeded")(js.undefined)
        ret
    }
    @scala.inline
    def withCappedCount(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CappedCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCappedCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CappedCount")(js.undefined)
        ret
    }
  }
  
}

