package typingsSlinky.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetUpgradeHistoryResponse extends js.Object {
  /**
    * Pagination token that needs to be supplied to the next call to get the next page of results
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    *  A list of  UpgradeHistory  objects corresponding to each Upgrade or Upgrade Eligibility Check performed on a domain returned as part of  GetUpgradeHistoryResponse  object. 
    */
  var UpgradeHistories: js.UndefOr[UpgradeHistoryList] = js.native
}

object GetUpgradeHistoryResponse {
  @scala.inline
  def apply(): GetUpgradeHistoryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUpgradeHistoryResponse]
  }
  @scala.inline
  implicit class GetUpgradeHistoryResponseOps[Self <: GetUpgradeHistoryResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withUpgradeHistories(value: UpgradeHistoryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpgradeHistories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpgradeHistories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpgradeHistories")(js.undefined)
        ret
    }
  }
  
}

