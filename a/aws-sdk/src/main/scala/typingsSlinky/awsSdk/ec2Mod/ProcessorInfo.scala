package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessorInfo extends js.Object {
  /**
    * A list of architectures supported by the instance type.
    */
  var SupportedArchitectures: js.UndefOr[ArchitectureTypeList] = js.native
  /**
    * The speed of the processor, in GHz.
    */
  var SustainedClockSpeedInGhz: js.UndefOr[ProcessorSustainedClockSpeed] = js.native
}

object ProcessorInfo {
  @scala.inline
  def apply(): ProcessorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProcessorInfo]
  }
  @scala.inline
  implicit class ProcessorInfoOps[Self <: ProcessorInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSupportedArchitectures(value: ArchitectureTypeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportedArchitectures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportedArchitectures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportedArchitectures")(js.undefined)
        ret
    }
    @scala.inline
    def withSustainedClockSpeedInGhz(value: ProcessorSustainedClockSpeed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SustainedClockSpeedInGhz")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSustainedClockSpeedInGhz: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SustainedClockSpeedInGhz")(js.undefined)
        ret
    }
  }
  
}

