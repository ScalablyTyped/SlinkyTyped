package typingsSlinky.pulumiAws.outputMod.s3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsConfigurationStorageClassAnalysisDataExportDestination extends js.Object {
  var s3BucketDestination: AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination = js.native
}

object AnalyticsConfigurationStorageClassAnalysisDataExportDestination {
  @scala.inline
  def apply(
    s3BucketDestination: AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination
  ): AnalyticsConfigurationStorageClassAnalysisDataExportDestination = {
    val __obj = js.Dynamic.literal(s3BucketDestination = s3BucketDestination.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsConfigurationStorageClassAnalysisDataExportDestination]
  }
  @scala.inline
  implicit class AnalyticsConfigurationStorageClassAnalysisDataExportDestinationOps[Self <: AnalyticsConfigurationStorageClassAnalysisDataExportDestination] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withS3BucketDestination(value: AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3BucketDestination")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

