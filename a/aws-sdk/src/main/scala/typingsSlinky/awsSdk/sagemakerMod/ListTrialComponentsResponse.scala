package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTrialComponentsResponse extends js.Object {
  /**
    * A token for getting the next set of components, if there are any.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.NextToken] = js.native
  /**
    * A list of the summaries of your trial components.
    */
  var TrialComponentSummaries: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.TrialComponentSummaries] = js.native
}

object ListTrialComponentsResponse {
  @scala.inline
  def apply(): ListTrialComponentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTrialComponentsResponse]
  }
  @scala.inline
  implicit class ListTrialComponentsResponseOps[Self <: ListTrialComponentsResponse] (val x: Self) extends AnyVal {
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
    def withTrialComponentSummaries(value: TrialComponentSummaries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrialComponentSummaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrialComponentSummaries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrialComponentSummaries")(js.undefined)
        ret
    }
  }
  
}

