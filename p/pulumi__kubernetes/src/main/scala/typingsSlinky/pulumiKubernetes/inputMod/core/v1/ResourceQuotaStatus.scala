package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
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
  var hard: js.UndefOr[Input[js.Object]] = js.native
  /**
    * Used is the current observed total usage of the resource in the namespace.
    */
  var used: js.UndefOr[Input[js.Object]] = js.native
}

object ResourceQuotaStatus {
  @scala.inline
  def apply(): ResourceQuotaStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceQuotaStatus]
  }
  @scala.inline
  implicit class ResourceQuotaStatusOps[Self <: ResourceQuotaStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHard(value: Input[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hard")(js.undefined)
        ret
    }
    @scala.inline
    def withUsed(value: Input[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("used")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("used")(js.undefined)
        ret
    }
  }
  
}

