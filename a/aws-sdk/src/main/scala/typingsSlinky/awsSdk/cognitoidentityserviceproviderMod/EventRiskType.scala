package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventRiskType extends js.Object {
  /**
    * Indicates whether compromised credentials were detected during an authentication event.
    */
  var CompromisedCredentialsDetected: js.UndefOr[WrappedBooleanType] = js.native
  /**
    * The risk decision.
    */
  var RiskDecision: js.UndefOr[RiskDecisionType] = js.native
  /**
    * The risk level.
    */
  var RiskLevel: js.UndefOr[RiskLevelType] = js.native
}

object EventRiskType {
  @scala.inline
  def apply(): EventRiskType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventRiskType]
  }
  @scala.inline
  implicit class EventRiskTypeOps[Self <: EventRiskType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompromisedCredentialsDetected(value: WrappedBooleanType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompromisedCredentialsDetected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompromisedCredentialsDetected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompromisedCredentialsDetected")(js.undefined)
        ret
    }
    @scala.inline
    def withRiskDecision(value: RiskDecisionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RiskDecision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRiskDecision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RiskDecision")(js.undefined)
        ret
    }
    @scala.inline
    def withRiskLevel(value: RiskLevelType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RiskLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRiskLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RiskLevel")(js.undefined)
        ret
    }
  }
  
}

