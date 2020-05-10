package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ResourceRequirements describes the compute resource requirements.
  */
@js.native
trait ResourceRequirements extends js.Object {
  /**
    * Limits describes the maximum amount of compute resources allowed. More info:
    * https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
    */
  var limits: js.UndefOr[Input[js.Object]] = js.native
  /**
    * Requests describes the minimum amount of compute resources required. If Requests is omitted
    * for a container, it defaults to Limits if that is explicitly specified, otherwise to an
    * implementation-defined value. More info:
    * https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
    */
  var requests: js.UndefOr[Input[js.Object]] = js.native
}

object ResourceRequirements {
  @scala.inline
  def apply(): ResourceRequirements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceRequirements]
  }
  @scala.inline
  implicit class ResourceRequirementsOps[Self <: ResourceRequirements] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLimits(value: Input[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limits")(js.undefined)
        ret
    }
    @scala.inline
    def withRequests(value: Input[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requests")(js.undefined)
        ret
    }
  }
  
}

