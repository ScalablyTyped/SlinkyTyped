package typingsSlinky.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAccountSummaryResponse extends js.Object {
  /**
    * A set of key–value pairs containing information about IAM entity usage and IAM quotas.
    */
  var SummaryMap: js.UndefOr[summaryMapType] = js.native
}

object GetAccountSummaryResponse {
  @scala.inline
  def apply(): GetAccountSummaryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccountSummaryResponse]
  }
  @scala.inline
  implicit class GetAccountSummaryResponseOps[Self <: GetAccountSummaryResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSummaryMap(value: summaryMapType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SummaryMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummaryMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SummaryMap")(js.undefined)
        ret
    }
  }
  
}

