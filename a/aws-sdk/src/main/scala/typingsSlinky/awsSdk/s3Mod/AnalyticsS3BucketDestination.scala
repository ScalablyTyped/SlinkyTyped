package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsS3BucketDestination extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the bucket to which data is exported.
    */
  var Bucket: BucketName = js.native
  /**
    * The account ID that owns the destination bucket. If no account ID is provided, the owner will not be validated prior to exporting data.
    */
  var BucketAccountId: js.UndefOr[AccountId] = js.native
  /**
    * Specifies the file format used when exporting data to Amazon S3.
    */
  var Format: AnalyticsS3ExportFileFormat = js.native
  /**
    * The prefix to use when exporting data. The prefix is prepended to all results.
    */
  var Prefix: js.UndefOr[typingsSlinky.awsSdk.s3Mod.Prefix] = js.native
}

object AnalyticsS3BucketDestination {
  @scala.inline
  def apply(Bucket: BucketName, Format: AnalyticsS3ExportFileFormat): AnalyticsS3BucketDestination = {
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
    def withBucket(value: BucketName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: AnalyticsS3ExportFileFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBucketAccountId(value: AccountId): Self = {
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
    def withPrefix(value: Prefix): Self = {
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

