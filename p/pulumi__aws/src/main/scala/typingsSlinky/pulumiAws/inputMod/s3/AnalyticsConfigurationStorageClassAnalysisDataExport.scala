package typingsSlinky.pulumiAws.inputMod.s3

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsConfigurationStorageClassAnalysisDataExport extends js.Object {
  var destination: Input[AnalyticsConfigurationStorageClassAnalysisDataExportDestination] = js.native
  var outputSchemaVersion: js.UndefOr[Input[String]] = js.native
}

object AnalyticsConfigurationStorageClassAnalysisDataExport {
  @scala.inline
  def apply(destination: Input[AnalyticsConfigurationStorageClassAnalysisDataExportDestination]): AnalyticsConfigurationStorageClassAnalysisDataExport = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsConfigurationStorageClassAnalysisDataExport]
  }
  @scala.inline
  implicit class AnalyticsConfigurationStorageClassAnalysisDataExportOps[Self <: AnalyticsConfigurationStorageClassAnalysisDataExport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestination(value: Input[AnalyticsConfigurationStorageClassAnalysisDataExportDestination]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputSchemaVersion(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputSchemaVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputSchemaVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputSchemaVersion")(js.undefined)
        ret
    }
  }
  
}

