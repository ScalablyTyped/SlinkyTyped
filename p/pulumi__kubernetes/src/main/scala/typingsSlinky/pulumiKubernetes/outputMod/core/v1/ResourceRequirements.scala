package typingsSlinky.pulumiKubernetes.outputMod.core.v1

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
  val limits: js.Object = js.native
  /**
    * Requests describes the minimum amount of compute resources required. If Requests is omitted
    * for a container, it defaults to Limits if that is explicitly specified, otherwise to an
    * implementation-defined value. More info:
    * https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
    */
  val requests: js.Object = js.native
}

object ResourceRequirements {
  @scala.inline
  def apply(limits: js.Object, requests: js.Object): ResourceRequirements = {
    val __obj = js.Dynamic.literal(limits = limits.asInstanceOf[js.Any], requests = requests.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceRequirements]
  }
  @scala.inline
  implicit class ResourceRequirementsOps[Self <: ResourceRequirements] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLimits(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequests(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requests")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

