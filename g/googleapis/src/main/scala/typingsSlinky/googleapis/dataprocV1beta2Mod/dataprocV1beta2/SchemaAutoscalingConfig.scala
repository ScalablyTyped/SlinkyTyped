package typingsSlinky.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Autoscaling Policy config associated with the cluster.
  */
@js.native
trait SchemaAutoscalingConfig extends js.Object {
  /**
    * Optional. The autoscaling policy used by the cluster.Only resource names
    * including projectid and location (region) are valid. Examples:
    * https://www.googleapis.com/compute/v1/projects/[project_id]/locations/[dataproc_region]/autoscalingPolicies/[policy_id]
    * projects/[project_id]/locations/[dataproc_region]/autoscalingPolicies/[policy_id]Note
    * that the policy must be in the same project and Cloud Dataproc region.
    */
  var policyUri: js.UndefOr[String] = js.native
}

object SchemaAutoscalingConfig {
  @scala.inline
  def apply(): SchemaAutoscalingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAutoscalingConfig]
  }
  @scala.inline
  implicit class SchemaAutoscalingConfigOps[Self <: SchemaAutoscalingConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPolicyUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyUri")(js.undefined)
        ret
    }
  }
  
}

