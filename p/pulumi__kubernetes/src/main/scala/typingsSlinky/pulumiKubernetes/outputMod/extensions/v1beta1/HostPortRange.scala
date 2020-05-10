package typingsSlinky.pulumiKubernetes.outputMod.extensions.v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * HostPortRange defines a range of host ports that will be enabled by a policy for pods to use.
  * It requires both the start and end to be defined. Deprecated: use HostPortRange from policy
  * API Group instead.
  */
@js.native
trait HostPortRange extends js.Object {
  /**
    * max is the end of the range, inclusive.
    */
  val max: Double = js.native
  /**
    * min is the start of the range, inclusive.
    */
  val min: Double = js.native
}

object HostPortRange {
  @scala.inline
  def apply(max: Double, min: Double): HostPortRange = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostPortRange]
  }
  @scala.inline
  implicit class HostPortRangeOps[Self <: HostPortRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

