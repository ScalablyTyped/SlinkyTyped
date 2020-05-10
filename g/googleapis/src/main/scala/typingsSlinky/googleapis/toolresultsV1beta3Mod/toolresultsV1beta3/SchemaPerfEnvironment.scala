package typingsSlinky.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Encapsulates performance environment info
  */
@js.native
trait SchemaPerfEnvironment extends js.Object {
  /**
    * CPU related environment info
    */
  var cpuInfo: js.UndefOr[SchemaCPUInfo] = js.native
  /**
    * Memory related environment info
    */
  var memoryInfo: js.UndefOr[SchemaMemoryInfo] = js.native
}

object SchemaPerfEnvironment {
  @scala.inline
  def apply(): SchemaPerfEnvironment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPerfEnvironment]
  }
  @scala.inline
  implicit class SchemaPerfEnvironmentOps[Self <: SchemaPerfEnvironment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCpuInfo(value: SchemaCPUInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpuInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCpuInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpuInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withMemoryInfo(value: SchemaMemoryInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memoryInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemoryInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memoryInfo")(js.undefined)
        ret
    }
  }
  
}

