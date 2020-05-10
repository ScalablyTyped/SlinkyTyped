package typingsSlinky.awsSdkClientS3Browser.typesAnalyticsS3BucketDestinationMod

import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.CSV
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsS3BucketDestination extends js.Object {
  /**
    * <p>The Amazon resource name (ARN) of the bucket to which data is exported.</p>
    */
  var Bucket: String = js.native
  /**
    * <p>The account ID that owns the destination bucket. If no account ID is provided, the owner will not be validated prior to exporting data.</p>
    */
  var BucketAccountId: js.UndefOr[String] = js.native
  /**
    * <p>The file format used when exporting data to Amazon S3.</p>
    */
  var Format: CSV | String = js.native
  /**
    * <p>The prefix to use when exporting data. The exported data begins with this prefix.</p>
    */
  var Prefix: js.UndefOr[String] = js.native
}

object AnalyticsS3BucketDestination {
  @scala.inline
  def apply(Bucket: String, Format: CSV | String): AnalyticsS3BucketDestination = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsS3BucketDestination]
  }
  @scala.inline
  implicit class AnalyticsS3BucketDestinationOps[Self <: AnalyticsS3BucketDestination] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucket(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: CSV | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBucketAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BucketAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBucketAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BucketAccountId")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Prefix")(js.undefined)
        ret
    }
  }
  
}

