package typingsSlinky.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateReportGroupInput extends js.Object {
  /**
    *  The ARN of the report group to update. 
    */
  var arn: NonEmptyString = js.native
  /**
    *  Used to specify an updated export type. Valid values are:     S3: The report results are exported to an S3 bucket.     NO_EXPORT: The report results are not exported.   
    */
  var exportConfig: js.UndefOr[ReportExportConfig] = js.native
}

object UpdateReportGroupInput {
  @scala.inline
  def apply(arn: NonEmptyString): UpdateReportGroupInput = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateReportGroupInput]
  }
  @scala.inline
  implicit class UpdateReportGroupInputOps[Self <: UpdateReportGroupInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExportConfig(value: ReportExportConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportConfig")(js.undefined)
        ret
    }
  }
  
}

