package typingsSlinky.gapiClientSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstancesExportRequest extends js.Object {
  /** Contains details about the export operation. */
  var exportContext: js.UndefOr[ExportContext] = js.native
}

object InstancesExportRequest {
  @scala.inline
  def apply(): InstancesExportRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstancesExportRequest]
  }
  @scala.inline
  implicit class InstancesExportRequestOps[Self <: InstancesExportRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExportContext(value: ExportContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportContext")(js.undefined)
        ret
    }
  }
  
}

