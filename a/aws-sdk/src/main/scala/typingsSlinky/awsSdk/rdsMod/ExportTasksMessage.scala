package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportTasksMessage extends js.Object {
  /**
    * Information about an export of a snapshot to Amazon S3.
    */
  var ExportTasks: js.UndefOr[ExportTasksList] = js.native
  /**
    * A pagination token that can be used in a later DescribeExportTasks request. A marker is used for pagination to identify the location to begin output for the next response of DescribeExportTasks.
    */
  var Marker: js.UndefOr[String] = js.native
}

object ExportTasksMessage {
  @scala.inline
  def apply(): ExportTasksMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportTasksMessage]
  }
  @scala.inline
  implicit class ExportTasksMessageOps[Self <: ExportTasksMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExportTasks(value: ExportTasksList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportTasks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportTasks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportTasks")(js.undefined)
        ret
    }
    @scala.inline
    def withMarker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(js.undefined)
        ret
    }
  }
  
}

