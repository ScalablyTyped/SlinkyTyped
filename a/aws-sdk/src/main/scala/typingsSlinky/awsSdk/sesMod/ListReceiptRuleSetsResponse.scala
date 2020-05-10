package typingsSlinky.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListReceiptRuleSetsResponse extends js.Object {
  /**
    * A token indicating that there are additional receipt rule sets available to be listed. Pass this token to successive calls of ListReceiptRuleSets to retrieve up to 100 receipt rule sets at a time.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.sesMod.NextToken] = js.native
  /**
    * The metadata for the currently active receipt rule set. The metadata consists of the rule set name and the timestamp of when the rule set was created.
    */
  var RuleSets: js.UndefOr[ReceiptRuleSetsLists] = js.native
}

object ListReceiptRuleSetsResponse {
  @scala.inline
  def apply(): ListReceiptRuleSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReceiptRuleSetsResponse]
  }
  @scala.inline
  implicit class ListReceiptRuleSetsResponseOps[Self <: ListReceiptRuleSetsResponse] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withRuleSets(value: ReceiptRuleSetsLists): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleSets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuleSets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleSets")(js.undefined)
        ret
    }
  }
  
}

