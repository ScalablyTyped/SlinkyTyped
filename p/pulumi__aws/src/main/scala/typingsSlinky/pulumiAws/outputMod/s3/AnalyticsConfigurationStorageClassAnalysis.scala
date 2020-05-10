package typingsSlinky.pulumiAws.outputMod.s3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsConfigurationStorageClassAnalysis extends js.Object {
  var dataExport: AnalyticsConfigurationStorageClassAnalysisDataExport = js.native
}

object AnalyticsConfigurationStorageClassAnalysis {
  @scala.inline
  def apply(dataExport: AnalyticsConfigurationStorageClassAnalysisDataExport): AnalyticsConfigurationStorageClassAnalysis = {
    val __obj = js.Dynamic.literal(dataExport = dataExport.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsConfigurationStorageClassAnalysis]
  }
  @scala.inline
  implicit class AnalyticsConfigurationStorageClassAnalysisOps[Self <: AnalyticsConfigurationStorageClassAnalysis] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataExport(value: AnalyticsConfigurationStorageClassAnalysisDataExport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataExport")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

