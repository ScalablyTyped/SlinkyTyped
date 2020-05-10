package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Worker metrics exported from workers. This contains resource utilization
  * metrics accumulated from a variety of sources. For more information, see
  * go/df-resource-signals.
  */
@js.native
trait SchemaResourceUtilizationReport extends js.Object {
  /**
    * CPU utilization samples.
    */
  var cpuTime: js.UndefOr[js.Array[SchemaCPUTime]] = js.native
}

object SchemaResourceUtilizationReport {
  @scala.inline
  def apply(): SchemaResourceUtilizationReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourceUtilizationReport]
  }
  @scala.inline
  implicit class SchemaResourceUtilizationReportOps[Self <: SchemaResourceUtilizationReport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCpuTime(value: js.Array[SchemaCPUTime]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpuTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCpuTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpuTime")(js.undefined)
        ret
    }
  }
  
}

