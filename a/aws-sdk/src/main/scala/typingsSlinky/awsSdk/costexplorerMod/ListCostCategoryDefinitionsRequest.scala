package typingsSlinky.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCostCategoryDefinitionsRequest extends js.Object {
  /**
    *  The date when the Cost Category was effective. 
    */
  var EffectiveOn: js.UndefOr[ZonedDateTime] = js.native
  /**
    *  The token to retrieve the next set of results. Amazon Web Services provides the token when the response from a previous call has more results than the maximum page size.  You can use this information to retrieve the full Cost Category information using DescribeCostCategory.
    */
  var NextToken: js.UndefOr[NextPageToken] = js.native
}

object ListCostCategoryDefinitionsRequest {
  @scala.inline
  def apply(): ListCostCategoryDefinitionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCostCategoryDefinitionsRequest]
  }
  @scala.inline
  implicit class ListCostCategoryDefinitionsRequestOps[Self <: ListCostCategoryDefinitionsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEffectiveOn(value: ZonedDateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EffectiveOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEffectiveOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EffectiveOn")(js.undefined)
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

