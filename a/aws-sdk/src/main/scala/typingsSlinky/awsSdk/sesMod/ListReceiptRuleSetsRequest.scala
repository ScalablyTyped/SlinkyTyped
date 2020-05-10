package typingsSlinky.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListReceiptRuleSetsRequest extends js.Object {
  /**
    * A token returned from a previous call to ListReceiptRuleSets to indicate the position in the receipt rule set list.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.sesMod.NextToken] = js.native
}

object ListReceiptRuleSetsRequest {
  @scala.inline
  def apply(): ListReceiptRuleSetsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReceiptRuleSetsRequest]
  }
  @scala.inline
  implicit class ListReceiptRuleSetsRequestOps[Self <: ListReceiptRuleSetsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: NextToken): Self = {
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
  }
  
}

