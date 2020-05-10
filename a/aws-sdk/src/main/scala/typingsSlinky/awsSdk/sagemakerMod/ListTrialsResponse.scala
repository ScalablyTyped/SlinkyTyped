package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTrialsResponse extends js.Object {
  /**
    * A token for getting the next set of trials, if there are any.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.NextToken] = js.native
  /**
    * A list of the summaries of your trials.
    */
  var TrialSummaries: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.TrialSummaries] = js.native
}

object ListTrialsResponse {
  @scala.inline
  def apply(): ListTrialsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTrialsResponse]
  }
  @scala.inline
  implicit class ListTrialsResponseOps[Self <: ListTrialsResponse] (val x: Self) extends AnyVal {
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
    def withTrialSummaries(value: TrialSummaries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrialSummaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrialSummaries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrialSummaries")(js.undefined)
        ret
    }
  }
  
}

