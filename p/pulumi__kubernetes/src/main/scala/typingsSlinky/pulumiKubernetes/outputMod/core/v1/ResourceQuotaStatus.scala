package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ResourceQuotaStatus defines the enforced hard limits and observed use.
  */
@js.native
trait ResourceQuotaStatus extends js.Object {
  /**
    * Hard is the set of enforced hard limits for each named resource. More info:
    * https://kubernetes.io/docs/concepts/policy/resource-quotas/
    */
  val hard: js.Object = js.native
  /**
    * Used is the current observed total usage of the resource in the namespace.
    */
  val used: js.Object = js.native
}

object ResourceQuotaStatus {
  @scala.inline
  def apply(hard: js.Object, used: js.Object): ResourceQuotaStatus = {
    val __obj = js.Dynamic.literal(hard = hard.asInstanceOf[js.Any], used = used.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceQuotaStatus]
  }
  @scala.inline
  implicit class ResourceQuotaStatusOps[Self <: ResourceQuotaStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHard(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsed(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("used")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

