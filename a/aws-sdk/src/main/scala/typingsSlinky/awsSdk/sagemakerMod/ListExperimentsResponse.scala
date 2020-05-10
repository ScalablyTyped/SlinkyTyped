package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListExperimentsResponse extends js.Object {
  /**
    * A list of the summaries of your experiments.
    */
  var ExperimentSummaries: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.ExperimentSummaries] = js.native
  /**
    * A token for getting the next set of experiments, if there are any.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.NextToken] = js.native
}

object ListExperimentsResponse {
  @scala.inline
  def apply(): ListExperimentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListExperimentsResponse]
  }
  @scala.inline
  implicit class ListExperimentsResponseOps[Self <: ListExperimentsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExperimentSummaries(value: ExperimentSummaries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExperimentSummaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExperimentSummaries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExperimentSummaries")(js.undefined)
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

