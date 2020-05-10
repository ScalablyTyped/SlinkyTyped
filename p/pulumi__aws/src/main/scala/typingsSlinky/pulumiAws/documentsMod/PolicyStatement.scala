package typingsSlinky.pulumiAws.documentsMod

import typingsSlinky.pulumiAws.pulumiAwsStrings.Allow
import typingsSlinky.pulumiAws.pulumiAwsStrings.Deny
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyStatement extends js.Object {
  var Action: js.UndefOr[Input[js.Array[Input[String]] | String]] = js.native
  var Condition: js.UndefOr[Input[Conditions]] = js.native
  var Effect: Input[Allow | Deny] = js.native
  var NotAction: js.UndefOr[Input[js.Array[Input[String]] | String]] = js.native
  var NotPrincipal: js.UndefOr[Input[Principal]] = js.native
  var NotResource: js.UndefOr[Input[js.Array[Input[String]] | String]] = js.native
  var Principal: js.UndefOr[Input[typingsSlinky.pulumiAws.documentsMod.Principal]] = js.native
  var Resource: js.UndefOr[Input[js.Array[Input[String]] | String]] = js.native
  var Sid: js.UndefOr[Input[String]] = js.native
}

object PolicyStatement {
  @scala.inline
  def apply(Effect: Input[Allow | Deny]): PolicyStatement = {
    val __obj = js.Dynamic.literal(Effect = Effect.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyStatement]
  }
  @scala.inline
  implicit class PolicyStatementOps[Self <: PolicyStatement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEffect(value: Input[Allow | Deny]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Effect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAction(value: Input[js.Array[Input[String]] | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Action")(js.undefined)
        ret
    }
    @scala.inline
    def withCondition(value: Input[Conditions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Condition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Condition")(js.undefined)
        ret
    }
    @scala.inline
    def withNotAction(value: Input[js.Array[Input[String]] | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotAction")(js.undefined)
        ret
    }
    @scala.inline
    def withNotPrincipal(value: Input[Principal]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotPrincipal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotPrincipal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotPrincipal")(js.undefined)
        ret
    }
    @scala.inline
    def withNotResource(value: Input[js.Array[Input[String]] | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotResource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotResource")(js.undefined)
        ret
    }
    @scala.inline
    def withPrincipal(value: Input[Principal]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Principal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrincipal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Principal")(js.undefined)
        ret
    }
    @scala.inline
    def withResource(value: Input[js.Array[Input[String]] | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Resource")(js.undefined)
        ret
    }
    @scala.inline
    def withSid(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sid")(js.undefined)
        ret
    }
  }
  
}

