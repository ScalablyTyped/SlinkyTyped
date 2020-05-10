package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListConstraintsForPortfolioOutput extends js.Object {
  /**
    * Information about the constraints.
    */
  var ConstraintDetails: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.ConstraintDetails] = js.native
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.native
}

object ListConstraintsForPortfolioOutput {
  @scala.inline
  def apply(): ListConstraintsForPortfolioOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConstraintsForPortfolioOutput]
  }
  @scala.inline
  implicit class ListConstraintsForPortfolioOutputOps[Self <: ListConstraintsForPortfolioOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConstraintDetails(value: ConstraintDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConstraintDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstraintDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConstraintDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withNextPageToken(value: PageToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextPageToken")(js.undefined)
        ret
    }
  }
  
}

