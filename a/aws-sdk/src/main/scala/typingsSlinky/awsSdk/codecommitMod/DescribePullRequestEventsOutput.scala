package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePullRequestEventsOutput extends js.Object {
  /**
    * An enumeration token that can be used in a request to return the next batch of the results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * Information about the pull request events.
    */
  var pullRequestEvents: PullRequestEventList = js.native
}

object DescribePullRequestEventsOutput {
  @scala.inline
  def apply(pullRequestEvents: PullRequestEventList): DescribePullRequestEventsOutput = {
    val __obj = js.Dynamic.literal(pullRequestEvents = pullRequestEvents.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePullRequestEventsOutput]
  }
  @scala.inline
  implicit class DescribePullRequestEventsOutputOps[Self <: DescribePullRequestEventsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPullRequestEvents(value: PullRequestEventList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullRequestEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
  }
  
}

