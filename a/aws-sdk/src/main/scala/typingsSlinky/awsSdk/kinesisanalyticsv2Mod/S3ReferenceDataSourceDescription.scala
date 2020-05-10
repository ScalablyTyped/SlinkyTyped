package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3ReferenceDataSourceDescription extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the S3 bucket.
    */
  var BucketARN: typingsSlinky.awsSdk.kinesisanalyticsv2Mod.BucketARN = js.native
  /**
    * Amazon S3 object key name.
    */
  var FileKey: typingsSlinky.awsSdk.kinesisanalyticsv2Mod.FileKey = js.native
  /**
    * The ARN of the IAM role that Kinesis Data Analytics can assume to read the Amazon S3 object on your behalf to populate the in-application reference table.   Provided for backward compatibility. Applications that are created with the current API version have an application-level service execution role rather than a resource-level role. 
    */
  var ReferenceRoleARN: js.UndefOr[RoleARN] = js.native
}

object S3ReferenceDataSourceDescription {
  @scala.inline
  def apply(BucketARN: BucketARN, FileKey: FileKey): S3ReferenceDataSourceDescription = {
    val __obj = js.Dynamic.literal(BucketARN = BucketARN.asInstanceOf[js.Any], FileKey = FileKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3ReferenceDataSourceDescription]
  }
  @scala.inline
  implicit class S3ReferenceDataSourceDescriptionOps[Self <: S3ReferenceDataSourceDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucketARN(value: BucketARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BucketARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileKey(value: FileKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReferenceRoleARN(value: RoleARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReferenceRoleARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferenceRoleARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReferenceRoleARN")(js.undefined)
        ret
    }
  }
  
}

