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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAffectedResource(value: AffectedResource): Self = this.set("AffectedResource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAffectedResource: Self = this.set("AffectedResource", js.undefined)
    @scala.inline
    def setEndTime(value: js.Date): Self = this.set("EndTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("EndTime", js.undefined)
    @scala.inline
    def setFeedback(value: Feedback): Self = this.set("Feedback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeedback: Self = this.set("Feedback", js.undefined)
    @scala.inline
    def setId(value: ProblemId): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setInsights(value: Insights): Self = this.set("Insights", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsights: Self = this.set("Insights", js.undefined)
    @scala.inline
    def setResourceGroupName(value: ResourceGroupName): Self = this.set("ResourceGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceGroupName: Self = this.set("ResourceGroupName", js.undefined)
    @scala.inline
    def setSeverityLevel(value: SeverityLevel): Self = this.set("SeverityLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeverityLevel: Self = this.set("SeverityLevel", js.undefined)
    @scala.inline
    def setStartTime(value: js.Date): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("StartTime", js.undefined)
    @scala.inline
    def setStatus(value: Status): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setTitle(value: Title): Self = this.set("Title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("Title", js.undefined)
  }
  
}

