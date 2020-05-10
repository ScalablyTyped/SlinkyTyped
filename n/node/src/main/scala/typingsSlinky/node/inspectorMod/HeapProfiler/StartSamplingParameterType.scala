package typingsSlinky.node.inspectorMod.HeapProfiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartSamplingParameterType extends js.Object {
  /**
    * Average sample interval in bytes. Poisson distribution is used for the intervals. The default value is 32768 bytes.
    */
  var samplingInterval: js.UndefOr[Double] = js.native
}

object StartSamplingParameterType {
  @scala.inline
  def apply(): StartSamplingParameterType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartSamplingParameterType]
  }
  @scala.inline
  implicit class StartSamplingParameterTypeOps[Self <: StartSamplingParameterType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSamplingInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("samplingInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSamplingInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("samplingInterval")(js.undefined)
        ret
    }
  }
  
}

