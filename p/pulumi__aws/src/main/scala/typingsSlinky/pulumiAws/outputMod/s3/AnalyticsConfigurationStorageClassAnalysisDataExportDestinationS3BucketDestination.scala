package typingsSlinky.pulumiAws.outputMod.s3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination extends js.Object {
  var bucketAccountId: js.UndefOr[String] = js.native
  var bucketArn: String = js.native
  var format: js.UndefOr[String] = js.native
  var prefix: js.UndefOr[String] = js.native
}

object AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination {
  @scala.inline
  def apply(bucketArn: String): AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination = {
    val __obj = js.Dynamic.literal(bucketArn = bucketArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination]
  }
  @scala.inline
  implicit class AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestinationOps[Self <: AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucketArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBucketAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBucketAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketAccountId")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.undefined)
        ret
    }
  }
  
}

