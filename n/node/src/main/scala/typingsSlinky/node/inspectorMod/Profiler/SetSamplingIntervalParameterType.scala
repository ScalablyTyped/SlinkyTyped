package typingsSlinky.node.inspectorMod.Profiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetSamplingIntervalParameterType extends js.Object {
  /**
    * New sampling interval in microseconds.
    */
  var interval: Double = js.native
}

object SetSamplingIntervalParameterType {
  @scala.inline
  def apply(interval: Double): SetSamplingIntervalParameterType = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetSamplingIntervalParameterType]
  }
  @scala.inline
  implicit class SetSamplingIntervalParameterTypeOps[Self <: SetSamplingIntervalParameterType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

