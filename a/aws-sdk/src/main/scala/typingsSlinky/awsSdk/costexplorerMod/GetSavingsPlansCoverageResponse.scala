package typingsSlinky.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSavingsPlansCoverageResponse extends js.Object {
  /**
    * The token to retrieve the next set of results. Amazon Web Services provides the token when the response from a previous call has more results than the maximum page size.
    */
  var NextToken: js.UndefOr[NextPageToken] = js.native
  /**
    * The amount of spend that your Savings Plans covered.
    */
  var SavingsPlansCoverages: typingsSlinky.awsSdk.costexplorerMod.SavingsPlansCoverages = js.native
}

object GetSavingsPlansCoverageResponse {
  @scala.inline
  def apply(SavingsPlansCoverages: SavingsPlansCoverages): GetSavingsPlansCoverageResponse = {
    val __obj = js.Dynamic.literal(SavingsPlansCoverages = SavingsPlansCoverages.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSavingsPlansCoverageResponse]
  }
  @scala.inline
  implicit class GetSavingsPlansCoverageResponseOps[Self <: GetSavingsPlansCoverageResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSavingsPlansCoverages(value: SavingsPlansCoverages): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SavingsPlansCoverages")(value.asInstanceOf[js.Any])
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

