package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeOpsItemsResponse extends js.Object {
  /**
    * The token for the next set of items to return. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * A list of OpsItems.
    */
  var OpsItemSummaries: js.UndefOr[typingsSlinky.awsSdk.ssmMod.OpsItemSummaries] = js.native
}

object DescribeOpsItemsResponse {
  @scala.inline
  def apply(): DescribeOpsItemsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeOpsItemsResponse]
  }
  @scala.inline
  implicit class DescribeOpsItemsResponseOps[Self <: DescribeOpsItemsResponse] (val x: Self) extends AnyVal {
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
    def withOpsItemSummaries(value: OpsItemSummaries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OpsItemSummaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpsItemSummaries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OpsItemSummaries")(js.undefined)
        ret
    }
  }
  
}

