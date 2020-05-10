package typingsSlinky.pulumiKubernetes.inputMod.authorization.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ResourceRule is the list of actions the subject is allowed to perform on resources. The list
  * ordering isn't significant, may contain duplicates, and possibly be incomplete.
  */
@js.native
trait ResourceRule extends js.Object {
  /**
    * APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups
    * are specified, any action requested against one of the enumerated resources in any API
    * group will be allowed.  "*" means all.
    */
  var apiGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * ResourceNames is an optional white list of names that the rule applies to.  An empty set
    * means that everything is allowed.  "*" means all.
    */
  var resourceNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Resources is a list of resources this rule applies to.  "*" means all in the specified
    * apiGroups.
    *  "*&#8205;/foo" represents the subresource 'foo' for all resources in the specified
    * apiGroups.
    */
  var resources: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Verb is a list of kubernetes resource API verbs, like: get, list, watch, create, update,
    * delete, proxy.  "*" means all.
    */
  var verbs: Input[js.Array[Input[String]]] = js.native
}

object ResourceRule {
  @scala.inline
  def apply(verbs: Input[js.Array[Input[String]]]): ResourceRule = {
    val __obj = js.Dynamic.literal(verbs = verbs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceRule]
  }
  @scala.inline
  implicit class ResourceRuleOps[Self <: ResourceRule] (val x: Self) extends AnyVal {
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

