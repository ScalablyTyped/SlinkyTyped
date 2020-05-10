package typingsSlinky.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssessmentRunAgent extends js.Object {
  /**
    * The current health state of the agent.
    */
  var agentHealth: AgentHealth = js.native
  /**
    * The detailed health state of the agent.
    */
  var agentHealthCode: AgentHealthCode = js.native
  /**
    * The description for the agent health code.
    */
  var agentHealthDetails: js.UndefOr[Message] = js.native
  /**
    * The AWS account of the EC2 instance where the agent is installed.
    */
  var agentId: AgentId = js.native
  /**
    * The ARN of the assessment run that is associated with the agent.
    */
  var assessmentRunArn: Arn = js.native
  /**
    * The Auto Scaling group of the EC2 instance that is specified by the agent ID.
    */
  var autoScalingGroup: js.UndefOr[AutoScalingGroup] = js.native
  /**
    * The Amazon Inspector application data metrics that are collected by the agent.
    */
  var telemetryMetadata: TelemetryMetadataList = js.native
}

object AssessmentRunAgent {
  @scala.inline
  def apply(
    agentHealth: AgentHealth,
    agentHealthCode: AgentHealthCode,
    agentId: AgentId,
    assessmentRunArn: Arn,
    telemetryMetadata: TelemetryMetadataList
  ): AssessmentRunAgent = {
    val __obj = js.Dynamic.literal(agentHealth = agentHealth.asInstanceOf[js.Any], agentHealthCode = agentHealthCode.asInstanceOf[js.Any], agentId = agentId.asInstanceOf[js.Any], assessmentRunArn = assessmentRunArn.asInstanceOf[js.Any], telemetryMetadata = telemetryMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssessmentRunAgent]
  }
  @scala.inline
  implicit class AssessmentRunAgentOps[Self <: AssessmentRunAgent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgentHealth(value: AgentHealth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentHealth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAgentHealthCode(value: AgentHealthCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentHealthCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAgentId(value: AgentId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssessmentRunArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assessmentRunArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTelemetryMetadata(value: TelemetryMetadataList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("telemetryMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAgentHealthDetails(value: Message): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentHealthDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgentHealthDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentHealthDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoScalingGroup(value: AutoScalingGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoScalingGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoScalingGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoScalingGroup")(js.undefined)
        ret
    }
  }
  
}

