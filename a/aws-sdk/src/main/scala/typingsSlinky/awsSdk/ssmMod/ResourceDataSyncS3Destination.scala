package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceDataSyncS3Destination extends js.Object {
  /**
    * The ARN of an encryption key for a destination in Amazon S3. Must belong to the same Region as the destination Amazon S3 bucket.
    */
  var AWSKMSKeyARN: js.UndefOr[ResourceDataSyncAWSKMSKeyARN] = js.native
  /**
    * The name of the Amazon S3 bucket where the aggregated data is stored.
    */
  var BucketName: ResourceDataSyncS3BucketName = js.native
  /**
    * Enables destination data sharing. By default, this field is null.
    */
  var DestinationDataSharing: js.UndefOr[ResourceDataSyncDestinationDataSharing] = js.native
  /**
    * An Amazon S3 prefix for the bucket.
    */
  var Prefix: js.UndefOr[ResourceDataSyncS3Prefix] = js.native
  /**
    * The AWS Region with the Amazon S3 bucket targeted by the Resource Data Sync.
    */
  var Region: ResourceDataSyncS3Region = js.native
  /**
    * A supported sync format. The following format is currently supported: JsonSerDe
    */
  var SyncFormat: ResourceDataSyncS3Format = js.native
}

object ResourceDataSyncS3Destination {
  @scala.inline
  def apply(
    BucketName: ResourceDataSyncS3BucketName,
    Region: ResourceDataSyncS3Region,
    SyncFormat: ResourceDataSyncS3Format
  ): ResourceDataSyncS3Destination = {
    val __obj = js.Dynamic.literal(BucketName = BucketName.asInstanceOf[js.Any], Region = Region.asInstanceOf[js.Any], SyncFormat = SyncFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceDataSyncS3Destination]
  }
  @scala.inline
  implicit class ResourceDataSyncS3DestinationOps[Self <: ResourceDataSyncS3Destination] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucketName(value: ResourceDataSyncS3BucketName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BucketName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegion(value: ResourceDataSyncS3Region): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSyncFormat(value: ResourceDataSyncS3Format): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SyncFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAWSKMSKeyARN(value: ResourceDataSyncAWSKMSKeyARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AWSKMSKeyARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAWSKMSKeyARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AWSKMSKeyARN")(js.undefined)
        ret
    }
    @scala.inline
    def withDestinationDataSharing(value: ResourceDataSyncDestinationDataSharing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationDataSharing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationDataSharing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationDataSharing")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefix(value: ResourceDataSyncS3Prefix): Self = {
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

