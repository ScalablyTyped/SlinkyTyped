package typingsSlinky.pulumiKubernetes.outputMod.policy.v1beta1

import typingsSlinky.pulumiKubernetes.outputMod.meta.v1.LabelSelector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PodDisruptionBudgetSpec is a description of a PodDisruptionBudget.
  */
@js.native
trait PodDisruptionBudgetSpec extends js.Object {
  /**
    * An eviction is allowed if at most "maxUnavailable" pods selected by "selector" are
    * unavailable after the eviction, i.e. even in absence of the evicted pod. For example, one
    * can prevent all voluntary evictions by specifying 0. This is a mutually exclusive setting
    * with "minAvailable".
    */
  val maxUnavailable: Double | String = js.native
  /**
    * An eviction is allowed if at least "minAvailable" pods selected by "selector" will still be
    * available after the eviction, i.e. even in the absence of the evicted pod.  So for example
    * you can prevent all voluntary evictions by specifying "100%".
    */
  val minAvailable: Double | String = js.native
  /**
    * Label query over pods whose evictions are managed by the disruption budget.
    */
  val selector: LabelSelector = js.native
}

object PodDisruptionBudgetSpec {
  @scala.inline
  def apply(maxUnavailable: Double | String, minAvailable: Double | String, selector: LabelSelector): PodDisruptionBudgetSpec = {
    val __obj = js.Dynamic.literal(maxUnavailable = maxUnavailable.asInstanceOf[js.Any], minAvailable = minAvailable.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodDisruptionBudgetSpec]
  }
  @scala.inline
  implicit class PodDisruptionBudgetSpecOps[Self <: PodDisruptionBudgetSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxUnavailable(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxUnavailable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinAvailable(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minAvailable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelector(value: LabelSelector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

