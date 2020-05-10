package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * VolumeNodeAffinity defines constraints that limit what nodes this volume can be accessed
  * from.
  */
@js.native
trait VolumeNodeAffinity extends js.Object {
  /**
    * Required specifies hard node constraints that must be met.
    */
  var required: js.UndefOr[Input[NodeSelector]] = js.native
}

object VolumeNodeAffinity {
  @scala.inline
  def apply(): VolumeNodeAffinity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeNodeAffinity]
  }
  @scala.inline
  implicit class VolumeNodeAffinityOps[Self <: VolumeNodeAffinity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequired(value: Input[NodeSelector]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(js.undefined)
        ret
    }
  }
  
}

