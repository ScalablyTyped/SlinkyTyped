package typingsSlinky.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListIndicesResponse extends js.Object {
  /**
    * An array of summary information for one or more indexes.
    */
  var IndexConfigurationSummaryItems: js.UndefOr[IndexConfigurationSummaryList] = js.native
  /**
    * If the response is truncated, Amazon Kendra returns this token that you can use in the subsequent request to retrieve the next set of indexes.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.kendraMod.NextToken] = js.native
}

object ListIndicesResponse {
  @scala.inline
  def apply(): ListIndicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListIndicesResponse]
  }
  @scala.inline
  implicit class ListIndicesResponseOps[Self <: ListIndicesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndexConfigurationSummaryItems(value: IndexConfigurationSummaryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndexConfigurationSummaryItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexConfigurationSummaryItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndexConfigurationSummaryItems")(js.undefined)
        ret
    }
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

