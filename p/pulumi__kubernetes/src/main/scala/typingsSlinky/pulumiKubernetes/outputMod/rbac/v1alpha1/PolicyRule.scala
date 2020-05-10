package typingsSlinky.pulumiKubernetes.outputMod.rbac.v1alpha1

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
  val apiGroups: js.Array[String] = js.native
  /**
    * NonResourceURLs is a set of partial urls that a user should have access to.  *s are
    * allowed, but only as the full, final step in the path This name is intentionally different
    * than the internal type so that the DefaultConvert works nicely and because the ordering may
    * be different. Since non-resource URLs are not namespaced, this field is only applicable for
    * ClusterRoles referenced from a ClusterRoleBinding. Rules can either apply to API resources
    * (such as "pods" or "secrets") or non-resource URL paths (such as "/api"),  but not both.
    */
  val nonResourceURLs: js.Array[String] = js.native
  /**
    * ResourceNames is an optional white list of names that the rule applies to.  An empty set
    * means that everything is allowed.
    */
  val resourceNames: js.Array[String] = js.native
  /**
    * Resources is a list of resources this rule applies to.  ResourceAll represents all
    * resources.
    */
  val resources: js.Array[String] = js.native
  /**
    * Verbs is a list of Verbs that apply to ALL the ResourceKinds and AttributeRestrictions
    * contained in this rule.  VerbAll represents all kinds.
    */
  val verbs: js.Array[String] = js.native
}

object PolicyRule {
  @scala.inline
  def apply(
    apiGroups: js.Array[String],
    nonResourceURLs: js.Array[String],
    resourceNames: js.Array[String],
    resources: js.Array[String],
    verbs: js.Array[String]
  ): PolicyRule = {
    val __obj = js.Dynamic.literal(apiGroups = apiGroups.asInstanceOf[js.Any], nonResourceURLs = nonResourceURLs.asInstanceOf[js.Any], resourceNames = resourceNames.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], verbs = verbs.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyRule]
  }
  @scala.inline
  implicit class PolicyRuleOps[Self <: PolicyRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiGroups(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNonResourceURLs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonResourceURLs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResources(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerbs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

