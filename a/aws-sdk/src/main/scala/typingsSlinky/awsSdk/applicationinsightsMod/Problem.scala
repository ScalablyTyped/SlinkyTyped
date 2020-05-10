package typingsSlinky.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Problem extends js.Object {
  /**
    * The resource affected by the problem.
    */
  var AffectedResource: js.UndefOr[typingsSlinky.awsSdk.applicationinsightsMod.AffectedResource] = js.native
  /**
    * The time when the problem ended, in epoch seconds.
    */
  var EndTime: js.UndefOr[js.Date] = js.native
  /**
    * Feedback provided by the user about the problem.
    */
  var Feedback: js.UndefOr[typingsSlinky.awsSdk.applicationinsightsMod.Feedback] = js.native
  /**
    * The ID of the problem.
    */
  var Id: js.UndefOr[ProblemId] = js.native
  /**
    * A detailed analysis of the problem using machine learning.
    */
  var Insights: js.UndefOr[typingsSlinky.awsSdk.applicationinsightsMod.Insights] = js.native
  /**
    * The name of the resource group affected by the problem.
    */
  var ResourceGroupName: js.UndefOr[typingsSlinky.awsSdk.applicationinsightsMod.ResourceGroupName] = js.native
  /**
    * A measure of the level of impact of the problem.
    */
  var SeverityLevel: js.UndefOr[typingsSlinky.awsSdk.applicationinsightsMod.SeverityLevel] = js.native
  /**
    * The time when the problem started, in epoch seconds.
    */
  var StartTime: js.UndefOr[js.Date] = js.native
  /**
    * The status of the problem.
    */
  var Status: js.UndefOr[typingsSlinky.awsSdk.applicationinsightsMod.Status] = js.native
  /**
    * The name of the problem.
    */
  var Title: js.UndefOr[typingsSlinky.awsSdk.applicationinsightsMod.Title] = js.native
}

object Problem {
  @scala.inline
  def apply(): Problem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Problem]
  }
  @scala.inline
  implicit class ProblemOps[Self <: Problem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAffectedResource(value: AffectedResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AffectedResource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAffectedResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AffectedResource")(js.undefined)
        ret
    }
    @scala.inline
    def withEndTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndTime")(js.undefined)
        ret
    }
    @scala.inline
    def withFeedback(value: Feedback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Feedback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeedback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Feedback")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: ProblemId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
    @scala.inline
    def withInsights(value: Insights): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Insights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsights: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Insights")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceGroupName(value: ResourceGroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceGroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withSeverityLevel(value: SeverityLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SeverityLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeverityLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SeverityLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartTime")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: Status): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: Title): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Title")(js.undefined)
        ret
    }
  }
  
}

