package typingsSlinky.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssessmentRun extends js.Object {
  /**
    * The ARN of the assessment run.
    */
  var arn: Arn = js.native
  /**
    * The ARN of the assessment template that is associated with the assessment run.
    */
  var assessmentTemplateArn: Arn = js.native
  /**
    * The assessment run completion time that corresponds to the rules packages evaluation completion time or failure.
    */
  var completedAt: js.UndefOr[js.Date] = js.native
  /**
    * The time when StartAssessmentRun was called.
    */
  var createdAt: js.Date = js.native
  /**
    * A Boolean value (true or false) that specifies whether the process of collecting data from the agents is completed.
    */
  var dataCollected: Bool = js.native
  /**
    * The duration of the assessment run.
    */
  var durationInSeconds: AssessmentRunDuration = js.native
  /**
    * Provides a total count of generated findings per severity.
    */
  var findingCounts: AssessmentRunFindingCounts = js.native
  /**
    * The auto-generated name for the assessment run.
    */
  var name: AssessmentRunName = js.native
  /**
    * A list of notifications for the event subscriptions. A notification about a particular generated finding is added to this list only once.
    */
  var notifications: AssessmentRunNotificationList = js.native
  /**
    * The rules packages selected for the assessment run.
    */
  var rulesPackageArns: AssessmentRulesPackageArnList = js.native
  /**
    * The time when StartAssessmentRun was called.
    */
  var startedAt: js.UndefOr[js.Date] = js.native
  /**
    * The state of the assessment run.
    */
  var state: AssessmentRunState = js.native
  /**
    * The last time when the assessment run's state changed.
    */
  var stateChangedAt: js.Date = js.native
  /**
    * A list of the assessment run state changes.
    */
  var stateChanges: AssessmentRunStateChangeList = js.native
  /**
    * The user-defined attributes that are assigned to every generated finding.
    */
  var userAttributesForFindings: UserAttributeList = js.native
}

object AssessmentRun {
  @scala.inline
  def apply(
    arn: Arn,
    assessmentTemplateArn: Arn,
    createdAt: js.Date,
    dataCollected: Bool,
    durationInSeconds: AssessmentRunDuration,
    findingCounts: AssessmentRunFindingCounts,
    name: AssessmentRunName,
    notifications: AssessmentRunNotificationList,
    rulesPackageArns: AssessmentRulesPackageArnList,
    state: AssessmentRunState,
    stateChangedAt: js.Date,
    stateChanges: AssessmentRunStateChangeList,
    userAttributesForFindings: UserAttributeList
  ): AssessmentRun = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], assessmentTemplateArn = assessmentTemplateArn.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], dataCollected = dataCollected.asInstanceOf[js.Any], durationInSeconds = durationInSeconds.asInstanceOf[js.Any], findingCounts = findingCounts.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], notifications = notifications.asInstanceOf[js.Any], rulesPackageArns = rulesPackageArns.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], stateChangedAt = stateChangedAt.asInstanceOf[js.Any], stateChanges = stateChanges.asInstanceOf[js.Any], userAttributesForFindings = userAttributesForFindings.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssessmentRun]
  }
  @scala.inline
  implicit class AssessmentRunOps[Self <: AssessmentRun] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssessmentTemplateArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assessmentTemplateArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataCollected(value: Bool): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataCollected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDurationInSeconds(value: AssessmentRunDuration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationInSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFindingCounts(value: AssessmentRunFindingCounts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findingCounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: AssessmentRunName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotifications(value: AssessmentRunNotificationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRulesPackageArns(value: AssessmentRulesPackageArnList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rulesPackageArns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: AssessmentRunState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStateChangedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateChangedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStateChanges(value: AssessmentRunStateChangeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateChanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserAttributesForFindings(value: UserAttributeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAttributesForFindings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompletedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompletedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withStartedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startedAt")(js.undefined)
        ret
    }
  }
  
}

