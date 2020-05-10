package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutScalingPolicyInput extends js.Object {
  /**
    * Comparison operator to use when measuring the metric against the threshold value.
    */
  var ComparisonOperator: js.UndefOr[ComparisonOperatorType] = js.native
  /**
    * Length of time (in minutes) the metric must be at or beyond the threshold before a scaling event is triggered.
    */
  var EvaluationPeriods: js.UndefOr[PositiveInteger] = js.native
  /**
    * A unique identifier for a fleet to apply this policy to. You can use either the fleet ID or ARN value. The fleet cannot be in any of the following statuses: ERROR or DELETING.
    */
  var FleetId: typingsSlinky.awsSdk.gameliftMod.FleetId = js.native
  /**
    * Name of the Amazon GameLift-defined metric that is used to trigger a scaling adjustment. For detailed descriptions of fleet metrics, see Monitor Amazon GameLift with Amazon CloudWatch.     ActivatingGameSessions -- Game sessions in the process of being created.    ActiveGameSessions -- Game sessions that are currently running.    ActiveInstances -- Fleet instances that are currently running at least one game session.    AvailableGameSessions -- Additional game sessions that fleet could host simultaneously, given current capacity.    AvailablePlayerSessions -- Empty player slots in currently active game sessions. This includes game sessions that are not currently accepting players. Reserved player slots are not included.    CurrentPlayerSessions -- Player slots in active game sessions that are being used by a player or are reserved for a player.     IdleInstances -- Active instances that are currently hosting zero game sessions.     PercentAvailableGameSessions -- Unused percentage of the total number of game sessions that a fleet could host simultaneously, given current capacity. Use this metric for a target-based scaling policy.    PercentIdleInstances -- Percentage of the total number of active instances that are hosting zero game sessions.    QueueDepth -- Pending game session placement requests, in any queue, where the current fleet is the top-priority destination.    WaitTime -- Current wait time for pending game session placement requests, in any queue, where the current fleet is the top-priority destination.   
    */
  var MetricName: typingsSlinky.awsSdk.gameliftMod.MetricName = js.native
  /**
    * A descriptive label that is associated with a scaling policy. Policy names do not need to be unique. A fleet can have only one scaling policy with the same name.
    */
  var Name: NonZeroAndMaxString = js.native
  /**
    * The type of scaling policy to create. For a target-based policy, set the parameter MetricName to 'PercentAvailableGameSessions' and specify a TargetConfiguration. For a rule-based policy set the following parameters: MetricName, ComparisonOperator, Threshold, EvaluationPeriods, ScalingAdjustmentType, and ScalingAdjustment.
    */
  var PolicyType: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.PolicyType] = js.native
  /**
    * Amount of adjustment to make, based on the scaling adjustment type.
    */
  var ScalingAdjustment: js.UndefOr[Integer] = js.native
  /**
    * The type of adjustment to make to a fleet's instance count (see FleetCapacity):    ChangeInCapacity -- add (or subtract) the scaling adjustment value from the current instance count. Positive values scale up while negative values scale down.    ExactCapacity -- set the instance count to the scaling adjustment value.    PercentChangeInCapacity -- increase or reduce the current instance count by the scaling adjustment, read as a percentage. Positive values scale up while negative values scale down; for example, a value of "-10" scales the fleet down by 10%.  
    */
  var ScalingAdjustmentType: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.ScalingAdjustmentType] = js.native
  /**
    * The settings for a target-based scaling policy.
    */
  var TargetConfiguration: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.TargetConfiguration] = js.native
  /**
    * Metric value used to trigger a scaling event.
    */
  var Threshold: js.UndefOr[Double] = js.native
}

object PutScalingPolicyInput {
  @scala.inline
  def apply(FleetId: FleetId, MetricName: MetricName, Name: NonZeroAndMaxString): PutScalingPolicyInput = {
    val __obj = js.Dynamic.literal(FleetId = FleetId.asInstanceOf[js.Any], MetricName = MetricName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutScalingPolicyInput]
  }
  @scala.inline
  implicit class PutScalingPolicyInputOps[Self <: PutScalingPolicyInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFleetId(value: FleetId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FleetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetricName(value: MetricName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetricName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: NonZeroAndMaxString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComparisonOperator(value: ComparisonOperatorType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComparisonOperator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComparisonOperator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComparisonOperator")(js.undefined)
        ret
    }
    @scala.inline
    def withEvaluationPeriods(value: PositiveInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EvaluationPeriods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvaluationPeriods: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EvaluationPeriods")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicyType(value: PolicyType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyType")(js.undefined)
        ret
    }
    @scala.inline
    def withScalingAdjustment(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScalingAdjustment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScalingAdjustment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScalingAdjustment")(js.undefined)
        ret
    }
    @scala.inline
    def withScalingAdjustmentType(value: ScalingAdjustmentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScalingAdjustmentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScalingAdjustmentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScalingAdjustmentType")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetConfiguration(value: TargetConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Threshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Threshold")(js.undefined)
        ret
    }
  }
  
}

