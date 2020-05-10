package typingsSlinky.openfin.hostSpecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HostSpecs extends js.Object {
  var aeroGlassEnabled: js.UndefOr[Boolean] = js.native
  var arch: String = js.native
  var cpus: js.Array[CpuInfo] = js.native
  var gpu: GpuInfo = js.native
  var memory: Double = js.native
  var name: String = js.native
  var screenSaver: js.UndefOr[Boolean] = js.native
}

object HostSpecs {
  @scala.inline
  def apply(arch: String, cpus: js.Array[CpuInfo], gpu: GpuInfo, memory: Double, name: String): HostSpecs = {
    val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], cpus = cpus.asInstanceOf[js.Any], gpu = gpu.asInstanceOf[js.Any], memory = memory.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostSpecs]
  }
  @scala.inline
  implicit class HostSpecsOps[Self <: HostSpecs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCpus(value: js.Array[CpuInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGpu(value: GpuInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gpu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMemory(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAeroGlassEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aeroGlassEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAeroGlassEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aeroGlassEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withScreenSaver(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenSaver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreenSaver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenSaver")(js.undefined)
        ret
    }
  }
  
}

