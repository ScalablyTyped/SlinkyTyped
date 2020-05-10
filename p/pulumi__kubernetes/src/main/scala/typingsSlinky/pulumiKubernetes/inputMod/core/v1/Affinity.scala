package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Affinity is a group of affinity scheduling rules.
  */
@js.native
trait Affinity extends js.Object {
  /**
    * Describes node affinity scheduling rules for the pod.
    */
  var nodeAffinity: js.UndefOr[Input[NodeAffinity]] = js.native
  /**
    * Describes pod affinity scheduling rules (e.g. co-locate this pod in the same node, zone,
    * etc. as some other pod(s)).
    */
  var podAffinity: js.UndefOr[Input[PodAffinity]] = js.native
  /**
    * Describes pod anti-affinity scheduling rules (e.g. avoid putting this pod in the same node,
    * zone, etc. as some other pod(s)).
    */
  var podAntiAffinity: js.UndefOr[Input[PodAntiAffinity]] = js.native
}

object Affinity {
  @scala.inline
  def apply(): Affinity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Affinity]
  }
  @scala.inline
  implicit class AffinityOps[Self <: Affinity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNodeAffinity(value: Input[NodeAffinity]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeAffinity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeAffinity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeAffinity")(js.undefined)
        ret
    }
    @scala.inline
    def withPodAffinity(value: Input[PodAffinity]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("podAffinity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPodAffinity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("podAffinity")(js.undefined)
        ret
    }
    @scala.inline
    def withPodAntiAffinity(value: Input[PodAntiAffinity]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("podAntiAffinity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPodAntiAffinity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("podAntiAffinity")(js.undefined)
        ret
    }
  }
  
}

