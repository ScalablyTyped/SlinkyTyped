package typingsSlinky.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateReportGroupOutput extends js.Object {
  /**
    *  Information about the report group that was created. 
    */
  var reportGroup: js.UndefOr[ReportGroup] = js.native
}

object CreateReportGroupOutput {
  @scala.inline
  def apply(): CreateReportGroupOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateReportGroupOutput]
  }
  @scala.inline
  implicit class CreateReportGroupOutputOps[Self <: CreateReportGroupOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReportGroup(value: ReportGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportGroup")(js.undefined)
        ret
    }
  }
  
}

