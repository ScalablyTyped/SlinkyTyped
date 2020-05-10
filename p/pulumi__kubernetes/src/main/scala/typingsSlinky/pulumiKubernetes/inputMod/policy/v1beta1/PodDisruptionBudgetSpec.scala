package typingsSlinky.pulumiKubernetes.inputMod.policy.v1beta1

import typingsSlinky.pulumiKubernetes.inputMod.meta.v1.LabelSelector
import typingsSlinky.pulumiPulumi.outputMod.Input
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
  var maxUnavailable: js.UndefOr[Input[Double | String]] = js.native
  /**
    * An eviction is allowed if at least "minAvailable" pods selected by "selector" will still be
    * available after the eviction, i.e. even in the absence of the evicted pod.  So for example
    * you can prevent all voluntary evictions by specifying "100%".
    */
  var minAvailable: js.UndefOr[Input[Double | String]] = js.native
  /**
    * Label query over pods whose evictions are managed by the disruption budget.
    */
  var selector: js.UndefOr[Input[LabelSelector]] = js.native
}

object PodDisruptionBudgetSpec {
  @scala.inline
  def apply(): PodDisruptionBudgetSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PodDisruptionBudgetSpec]
  }
  @scala.inline
  implicit class PodDisruptionBudgetSpecOps[Self <: PodDisruptionBudgetSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxUnavailable(value: Input[Double | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxUnavailable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxUnavailable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxUnavailable")(js.undefined)
        ret
    }
    @scala.inline
    def withMinAvailable(value: Input[Double | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minAvailable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinAvailable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minAvailable")(js.undefined)
        ret
    }
    @scala.inline
    def withSelector(value: Input[LabelSelector]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(js.undefined)
        ret
    }
  }
  
}

