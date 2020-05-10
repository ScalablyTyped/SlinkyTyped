package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3ReferenceDataSource extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the S3 bucket.
    */
  var BucketARN: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.BucketARN] = js.native
  /**
    * The object key name containing the reference data.
    */
  var FileKey: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.FileKey] = js.native
}

object S3ReferenceDataSource {
  @scala.inline
  def apply(): S3ReferenceDataSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3ReferenceDataSource]
  }
  @scala.inline
  implicit class S3ReferenceDataSourceOps[Self <: S3ReferenceDataSource] (val x: Self) extends AnyVal {
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
    def withoutBucketARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BucketARN")(js.undefined)
        ret
    }
    @scala.inline
    def withFileKey(value: FileKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileKey")(js.undefined)
        ret
    }
  }
  
}

