package typingsSlinky.pulumiKubernetes.inputMod.rbac.v1beta1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PolicyRule holds information that describes a policy rule, but does not contain information
  * about who the rule applies to or which namespace the rule applies to.
  */
@js.native
trait PolicyRule extends js.Object {
  /**
    * APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups
    * are specified, any action requested against one of the enumerated resources in any API
    * group will be allowed.
    */
  var apiGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * NonResourceURLs is a set of partial urls that a user should have access to.  *s are
    * allowed, but only as the full, final step in the path Since non-resource URLs are not
    * namespaced, this field is only applicable for ClusterRoles referenced from a
    * ClusterRoleBinding. Rules can either apply to API resources (such as "pods" or "secrets")
    * or non-resource URL paths (such as "/api"),  but not both.
    */
  var nonResourceURLs: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * ResourceNames is an optional white list of names that the rule applies to.  An empty set
    * means that everything is allowed.
    */
  var resourceNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Resources is a list of resources this rule applies to.  '*' represents all resources in the
    * specified apiGroups. '*&#8205;/foo' represents the subresource 'foo' for all resources in
    * the specified apiGroups.
    */
  var resources: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Verbs is a list of Verbs that apply to ALL the ResourceKinds and AttributeRestrictions
    * contained in this rule.  VerbAll represents all kinds.
    */
  var verbs: Input[js.Array[Input[String]]] = js.native
}

object PolicyRule {
  @scala.inline
  def apply(verbs: Input[js.Array[Input[String]]]): PolicyRule = {
    val __obj = js.Dynamic.literal(verbs = verbs.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyRule]
  }
  @scala.inline
  implicit class PolicyRuleOps[Self <: PolicyRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVerbs(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApiGroups(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withNonResourceURLs(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonResourceURLs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonResourceURLs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonResourceURLs")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceNames(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceNames")(js.undefined)
        ret
    }
    @scala.inline
    def withResources(value: Input[js.Array[Input[String]]]): Self = {
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
  }
  
}

