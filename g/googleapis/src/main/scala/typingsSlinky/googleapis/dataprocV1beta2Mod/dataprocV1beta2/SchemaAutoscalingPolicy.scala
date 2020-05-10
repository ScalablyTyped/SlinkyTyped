package typingsSlinky.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes an autoscaling policy for Dataproc cluster autoscaler.
  */
@js.native
trait SchemaAutoscalingPolicy extends js.Object {
  var basicAlgorithm: js.UndefOr[SchemaBasicAutoscalingAlgorithm] = js.native
  /**
    * Required. The policy id.The id must contain only letters (a-z, A-Z),
    * numbers (0-9), underscores (_), and hyphens (-). Cannot begin or end with
    * underscore or hyphen. Must consist of between 3 and 50 characters.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Output only. The &quot;resource name&quot; of the policy, as described in
    * https://cloud.google.com/apis/design/resource_names of the form
    * projects/{project_id}/regions/{region}/autoscalingPolicies/{policy_id}.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Optional. Describes how the autoscaler will operate for secondary
    * workers.
    */
  var secondaryWorkerConfig: js.UndefOr[SchemaInstanceGroupAutoscalingPolicyConfig] = js.native
  /**
    * Required. Describes how the autoscaler will operate for primary workers.
    */
  var workerConfig: js.UndefOr[SchemaInstanceGroupAutoscalingPolicyConfig] = js.native
}

object SchemaAutoscalingPolicy {
  @scala.inline
  def apply(): SchemaAutoscalingPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAutoscalingPolicy]
  }
  @scala.inline
  implicit class SchemaAutoscalingPolicyOps[Self <: SchemaAutoscalingPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBasicAlgorithm(value: SchemaBasicAutoscalingAlgorithm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basicAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBasicAlgorithm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basicAlgorithm")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondaryWorkerConfig(value: SchemaInstanceGroupAutoscalingPolicyConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryWorkerConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondaryWorkerConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryWorkerConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkerConfig(value: SchemaInstanceGroupAutoscalingPolicyConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkerConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerConfig")(js.undefined)
        ret
    }
  }
  
}

