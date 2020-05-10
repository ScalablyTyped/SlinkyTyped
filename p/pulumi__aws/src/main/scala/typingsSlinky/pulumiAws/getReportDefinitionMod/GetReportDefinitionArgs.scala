package typingsSlinky.pulumiAws.getReportDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetReportDefinitionArgs extends js.Object {
  /**
    * The name of the report definition to match.
    */
  val reportName: String = js.native
}

object GetReportDefinitionArgs {
  @scala.inline
  def apply(reportName: String): GetReportDefinitionArgs = {
    val __obj = js.Dynamic.literal(reportName = reportName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetReportDefinitionArgs]
  }
  @scala.inline
  implicit class GetReportDefinitionArgsOps[Self <: GetReportDefinitionArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReportName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

