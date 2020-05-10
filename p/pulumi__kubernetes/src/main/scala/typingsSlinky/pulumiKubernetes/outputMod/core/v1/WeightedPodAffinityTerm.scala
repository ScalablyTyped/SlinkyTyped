package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The weights of all of the matched WeightedPodAffinityTerm fields are added per-node to find
  * the most preferred node(s)
  */
@js.native
trait WeightedPodAffinityTerm extends js.Object {
  /**
    * Required. A pod affinity term, associated with the corresponding weight.
    */
  val podAffinityTerm: PodAffinityTerm = js.native
  /**
    * weight associated with matching the corresponding podAffinityTerm, in the range 1-100.
    */
  val weight: Double = js.native
}

object WeightedPodAffinityTerm {
  @scala.inline
  def apply(podAffinityTerm: PodAffinityTerm, weight: Double): WeightedPodAffinityTerm = {
    val __obj = js.Dynamic.literal(podAffinityTerm = podAffinityTerm.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeightedPodAffinityTerm]
  }
  @scala.inline
  implicit class WeightedPodAffinityTermOps[Self <: WeightedPodAffinityTerm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPodAffinityTerm(value: PodAffinityTerm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("podAffinityTerm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

