package typingsSlinky.pulumiKubernetes.inputMod.rbac.v1alpha1

import typingsSlinky.pulumiKubernetes.inputMod.meta.v1.LabelSelector
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AggregationRule describes how to locate ClusterRoles to aggregate into the ClusterRole
  */
@js.native
trait AggregationRule extends js.Object {
  /**
    * ClusterRoleSelectors holds a list of selectors which will be used to find ClusterRoles and
    * create the rules. If any of the selectors match, then the ClusterRole's permissions will be
    * added
    */
  var clusterRoleSelectors: js.UndefOr[Input[js.Array[Input[LabelSelector]]]] = js.native
}

object AggregationRule {
  @scala.inline
  def apply(): AggregationRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationRule]
  }
  @scala.inline
  implicit class AggregationRuleOps[Self <: AggregationRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusterRoleSelectors(value: Input[js.Array[Input[LabelSelector]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterRoleSelectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterRoleSelectors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterRoleSelectors")(js.undefined)
        ret
    }
  }
  
}

