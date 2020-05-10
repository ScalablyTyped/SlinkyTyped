package typingsSlinky.raygun

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonArchitecture extends js.Object {
  var architecture: String = js.native
  var availablePhysicalMemory: Double = js.native
  var cpu: AnonModel = js.native
  var osVersion: String = js.native
  var processorCount: js.UndefOr[Double] = js.native
  var totalPhysicalMemory: Double = js.native
  var utcOffset: Double = js.native
}

object AnonArchitecture {
  @scala.inline
  def apply(
    architecture: String,
    availablePhysicalMemory: Double,
    cpu: AnonModel,
    osVersion: String,
    totalPhysicalMemory: Double,
    utcOffset: Double
  ): AnonArchitecture = {
    val __obj = js.Dynamic.literal(architecture = architecture.asInstanceOf[js.Any], availablePhysicalMemory = availablePhysicalMemory.asInstanceOf[js.Any], cpu = cpu.asInstanceOf[js.Any], osVersion = osVersion.asInstanceOf[js.Any], totalPhysicalMemory = totalPhysicalMemory.asInstanceOf[js.Any], utcOffset = utcOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArchitecture]
  }
  @scala.inline
  implicit class AnonArchitectureOps[Self <: AnonArchitecture] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArchitecture(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("architecture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAvailablePhysicalMemory(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availablePhysicalMemory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCpu(value: AnonModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOsVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("osVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalPhysicalMemory(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalPhysicalMemory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUtcOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utcOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProcessorCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processorCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessorCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processorCount")(js.undefined)
        ret
    }
  }
  
}

