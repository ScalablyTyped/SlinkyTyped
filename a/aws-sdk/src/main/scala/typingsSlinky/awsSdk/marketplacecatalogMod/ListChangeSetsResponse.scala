package typingsSlinky.awsSdk.marketplacecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListChangeSetsResponse extends js.Object {
  /**
    *  Array of ChangeSetSummaryListItem objects.
    */
  var ChangeSetSummaryList: js.UndefOr[typingsSlinky.awsSdk.marketplacecatalogMod.ChangeSetSummaryList] = js.native
  /**
    * The value of the next token, if it exists. Null if there are no more results.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.marketplacecatalogMod.NextToken] = js.native
}

object ListChangeSetsResponse {
  @scala.inline
  def apply(): ListChangeSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListChangeSetsResponse]
  }
  @scala.inline
  implicit class ListChangeSetsResponseOps[Self <: ListChangeSetsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeSetSummaryList(value: ChangeSetSummaryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChangeSetSummaryList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChangeSetSummaryList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChangeSetSummaryList")(js.undefined)
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

