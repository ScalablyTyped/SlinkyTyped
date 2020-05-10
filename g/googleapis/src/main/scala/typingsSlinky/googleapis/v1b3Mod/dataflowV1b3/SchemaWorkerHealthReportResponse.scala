package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * WorkerHealthReportResponse contains information returned to the worker in
  * response to a health ping.
  */
@js.native
trait SchemaWorkerHealthReportResponse extends js.Object {
  /**
    * A positive value indicates the worker should change its reporting
    * interval to the specified value.  The default value of zero means no
    * change in report rate is requested by the server.
    */
  var reportInterval: js.UndefOr[String] = js.native
}

object SchemaWorkerHealthReportResponse {
  @scala.inline
  def apply(): SchemaWorkerHealthReportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkerHealthReportResponse]
  }
  @scala.inline
  implicit class SchemaWorkerHealthReportResponseOps[Self <: SchemaWorkerHealthReportResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReportInterval(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportInterval")(js.undefined)
        ret
    }
  }
  
}

