package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeExportTasksMessage extends js.Object {
  /**
    * The identifier of the snapshot export task to be described.
    */
  var ExportTaskIdentifier: js.UndefOr[String] = js.native
  /**
    * Filters specify one or more snapshot exports to describe. The filters are specified as name-value pairs that define what to include in the output. Supported filters include the following:     export-task-identifier - An identifier for the snapshot export task.    s3-bucket - The Amazon S3 bucket the snapshot is exported to.    source-arn - The Amazon Resource Name (ARN) of the snapshot exported to Amazon S3    status - The status of the export task.  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    *  An optional pagination token provided by a previous DescribeExportTasks request. If you specify this parameter, the response includes only records beyond the marker, up to the value specified by the MaxRecords parameter. 
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    *  The maximum number of records to include in the response. If more records exist than the specified value, a pagination token called a marker is included in the response. You can use the marker in a later DescribeExportTasks request to retrieve the remaining results.  Default: 100 Constraints: Minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[typingsSlinky.awsSdk.rdsMod.MaxRecords] = js.native
  /**
    * The Amazon Resource Name (ARN) of the snapshot exported to Amazon S3.
    */
  var SourceArn: js.UndefOr[String] = js.native
}

object DescribeExportTasksMessage {
  @scala.inline
  def apply(): DescribeExportTasksMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeExportTasksMessage]
  }
  @scala.inline
  implicit class DescribeExportTasksMessageOps[Self <: DescribeExportTasksMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExportTaskIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportTaskIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportTaskIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportTaskIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withFilters(value: FilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filters")(js.undefined)
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
    @scala.inline
    def withMaxRecords(value: MaxRecords): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxRecords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxRecords")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceArn")(js.undefined)
        ret
    }
  }
  
}

