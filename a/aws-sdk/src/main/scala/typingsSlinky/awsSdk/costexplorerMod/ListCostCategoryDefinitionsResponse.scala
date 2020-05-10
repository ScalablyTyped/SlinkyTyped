package typingsSlinky.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCostCategoryDefinitionsResponse extends js.Object {
  /**
    *  A reference to a Cost Category containing enough information to identify the Cost Category. 
    */
  var CostCategoryReferences: js.UndefOr[CostCategoryReferencesList] = js.native
  /**
    *  The token to retrieve the next set of results. Amazon Web Services provides the token when the response from a previous call has more results than the maximum page size. 
    */
  var NextToken: js.UndefOr[NextPageToken] = js.native
}

object ListCostCategoryDefinitionsResponse {
  @scala.inline
  def apply(): ListCostCategoryDefinitionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCostCategoryDefinitionsResponse]
  }
  @scala.inline
  implicit class ListCostCategoryDefinitionsResponseOps[Self <: ListCostCategoryDefinitionsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCostCategoryReferences(value: CostCategoryReferencesList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CostCategoryReferences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCostCategoryReferences: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CostCategoryReferences")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextPageToken): Self = {
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

