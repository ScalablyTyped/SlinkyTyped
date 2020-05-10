package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * LimitRangeSpec defines a min/max usage limit for resources that match on kind.
  */
@js.native
trait LimitRangeSpec extends js.Object {
  /**
    * Limits is the list of LimitRangeItem objects that are enforced.
    */
  var limits: Input[js.Array[Input[LimitRangeItem]]] = js.native
}

object LimitRangeSpec {
  @scala.inline
  def apply(limits: Input[js.Array[Input[LimitRangeItem]]]): LimitRangeSpec = {
    val __obj = js.Dynamic.literal(limits = limits.asInstanceOf[js.Any])
    __obj.asInstanceOf[LimitRangeSpec]
  }
  @scala.inline
  implicit class LimitRangeSpecOps[Self <: LimitRangeSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLimits(value: Input[js.Array[Input[LimitRangeItem]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limits")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

