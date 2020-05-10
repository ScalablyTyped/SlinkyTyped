package typingsSlinky.pulumiKubernetes.inputMod.admissionregistration.v1beta1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * RuleWithOperations is a tuple of Operations and Resources. It is recommended to make sure
  * that all the tuple expansions are valid.
  */
@js.native
trait RuleWithOperations extends js.Object {
  /**
    * APIGroups is the API groups the resources belong to. '*' is all groups. If '*' is present,
    * the length of the slice must be one. Required.
    */
  var apiGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * APIVersions is the API versions the resources belong to. '*' is all versions. If '*' is
    * present, the length of the slice must be one. Required.
    */
  var apiVersions: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Operations is the operations the admission hook cares about - CREATE, UPDATE, or * for all
    * operations. If '*' is present, the length of the slice must be one. Required.
    */
  var operations: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Resources is a list of resources this rule applies to.
    *
    * For example: 'pods' means pods. 'pods/log' means the log subresource of pods. '*' means all
    * resources, but not subresources. 'pods/ *' means all subresources of pods. '*&#8205;/scale'
    * means all scale subresources. '*&#8205;/ *' means all resources and their subresources.
    *
    * If wildcard is present, the validation rule will ensure resources do not overlap with each
    * other.
    *
    * Depending on the enclosing object, subresources might not be allowed. Required.
    */
  var resources: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * scope specifies the scope of this rule. Valid values are "Cluster", "Namespaced", and "*"
    * "Cluster" means that only cluster-scoped resources will match this rule. Namespace API
    * objects are cluster-scoped. "Namespaced" means that only namespaced resources will match
    * this rule. "*" means that there are no scope restrictions. Subresources match the scope of
    * their parent resource. Default is "*".
    */
  var scope: js.UndefOr[Input[String]] = js.native
}

object RuleWithOperations {
  @scala.inline
  def apply(): RuleWithOperations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleWithOperations]
  }
  @scala.inline
  implicit class RuleWithOperationsOps[Self <: RuleWithOperations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withApiVersions(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiVersions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiVersions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiVersions")(js.undefined)
        ret
    }
    @scala.inline
    def withOperations(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operations")(js.undefined)
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
    @scala.inline
    def withScope(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
  }
  
}

