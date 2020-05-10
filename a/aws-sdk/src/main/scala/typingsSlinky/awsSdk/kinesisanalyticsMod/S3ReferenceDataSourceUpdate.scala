package typingsSlinky.awsSdk.kinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3ReferenceDataSourceUpdate extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the S3 bucket.
    */
  var BucketARNUpdate: js.UndefOr[BucketARN] = js.native
  /**
    * Object key name.
    */
  var FileKeyUpdate: js.UndefOr[FileKey] = js.native
  /**
    * ARN of the IAM role that Amazon Kinesis Analytics can assume to read the Amazon S3 object and populate the in-application.
    */
  var ReferenceRoleARNUpdate: js.UndefOr[RoleARN] = js.native
}

object S3ReferenceDataSourceUpdate {
  @scala.inline
  def apply(): S3ReferenceDataSourceUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3ReferenceDataSourceUpdate]
  }
  @scala.inline
  implicit class S3ReferenceDataSourceUpdateOps[Self <: S3ReferenceDataSourceUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucketARNUpdate(value: BucketARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BucketARNUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBucketARNUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BucketARNUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withFileKeyUpdate(value: FileKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileKeyUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileKeyUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileKeyUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withReferenceRoleARNUpdate(value: RoleARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReferenceRoleARNUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferenceRoleARNUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReferenceRoleARNUpdate")(js.undefined)
        ret
    }
  }
  
}

