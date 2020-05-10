package typingsSlinky.awsSdkClientS3Browser.typesAnalyticsExportDestinationMod

import typingsSlinky.awsSdkClientS3Browser.typesAnalyticsS3BucketDestinationMod.UnmarshalledAnalyticsS3BucketDestination
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledAnalyticsExportDestination extends AnalyticsExportDestination {
  /**
    * <p>A destination signifying output to an S3 bucket.</p>
    */
  @JSName("S3BucketDestination")
  var S3BucketDestination_UnmarshalledAnalyticsExportDestination: UnmarshalledAnalyticsS3BucketDestination = js.native
}

object UnmarshalledAnalyticsExportDestination {
  @scala.inline
  def apply(S3BucketDestination: UnmarshalledAnalyticsS3BucketDestination): UnmarshalledAnalyticsExportDestination = {
    val __obj = js.Dynamic.literal(S3BucketDestination = S3BucketDestination.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledAnalyticsExportDestination]
  }
  @scala.inline
  implicit class UnmarshalledAnalyticsExportDestinationOps[Self <: UnmarshalledAnalyticsExportDestination] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withS3BucketDestination(value: UnmarshalledAnalyticsS3BucketDestination): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3BucketDestination")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

