package typingsSlinky.pulumiAws.outputMod.iam

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPolicyDocumentStatement extends js.Object {
  /**
    * A list of actions that this statement either allows
    * or denies. For example, ``["ec2:RunInstances", "s3:*"]``.
    */
  var actions: js.UndefOr[js.Array[String]] = js.native
  /**
    * A nested configuration block (described below)
    * that defines a further, possibly-service-specific condition that constrains
    * whether this statement applies.
    */
  var conditions: js.UndefOr[js.Array[GetPolicyDocumentStatementCondition]] = js.native
  /**
    * Either "Allow" or "Deny", to specify whether this
    * statement allows or denies the given actions. The default is "Allow".
    */
  var effect: js.UndefOr[String] = js.native
  /**
    * A list of actions that this statement does *not*
    * apply to. Used to apply a policy statement to all actions *except* those
    * listed.
    */
  var notActions: js.UndefOr[js.Array[String]] = js.native
  /**
    * Like `principals` except gives resources that
    * the statement does *not* apply to.
    */
  var notPrincipals: js.UndefOr[js.Array[GetPolicyDocumentStatementNotPrincipal]] = js.native
  /**
    * A list of resource ARNs that this statement
    * does *not* apply to. Used to apply a policy statement to all resources
    * *except* those listed.
    */
  var notResources: js.UndefOr[js.Array[String]] = js.native
  /**
    * A nested configuration block (described below)
    * specifying a resource (or resource pattern) to which this statement applies.
    */
  var principals: js.UndefOr[js.Array[GetPolicyDocumentStatementPrincipal]] = js.native
  /**
    * A list of resource ARNs that this statement applies
    * to. This is required by AWS if used for an IAM policy.
    */
  var resources: js.UndefOr[js.Array[String]] = js.native
  /**
    * An ID for the policy statement.
    */
  var sid: js.UndefOr[String] = js.native
}

object GetPolicyDocumentStatement {
  @scala.inline
  def apply(): GetPolicyDocumentStatement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPolicyDocumentStatement]
  }
  @scala.inline
  implicit class GetPolicyDocumentStatementOps[Self <: GetPolicyDocumentStatement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(js.undefined)
        ret
    }
    @scala.inline
    def withConditions(value: js.Array[GetPolicyDocumentStatementCondition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConditions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditions")(js.undefined)
        ret
    }
    @scala.inline
    def withEffect(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEffect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effect")(js.undefined)
        ret
    }
    @scala.inline
    def withNotActions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notActions")(js.undefined)
        ret
    }
    @scala.inline
    def withNotPrincipals(value: js.Array[GetPolicyDocumentStatementNotPrincipal]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notPrincipals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotPrincipals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notPrincipals")(js.undefined)
        ret
    }
    @scala.inline
    def withNotResources(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notResources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notResources")(js.undefined)
        ret
    }
    @scala.inline
    def withPrincipals(value: js.Array[GetPolicyDocumentStatementPrincipal]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("principals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrincipals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("principals")(js.undefined)
        ret
    }
    @scala.inline
    def withResources(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(js.undefined)
        ret
    }
    @scala.inline
    def withSid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sid")(js.undefined)
        ret
    }
  }
  
}

