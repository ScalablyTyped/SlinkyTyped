package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3ContentLocationUpdate extends js.Object {
  /**
    * The new Amazon Resource Name (ARN) for the S3 bucket containing the application code.
    */
  var BucketARNUpdate: js.UndefOr[BucketARN] = js.native
  /**
    * The new file key for the object containing the application code.
    */
  var FileKeyUpdate: js.UndefOr[FileKey] = js.native
  /**
    * The new version of the object containing the application code.
    */
  var ObjectVersionUpdate: js.UndefOr[ObjectVersion] = js.native
}

object S3ContentLocationUpdate {
  @scala.inline
  def apply(): S3ContentLocationUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3ContentLocationUpdate]
  }
  @scala.inline
  implicit class S3ContentLocationUpdateOps[Self <: S3ContentLocationUpdate] (val x: Self) extends AnyVal {
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
    def withObjectVersionUpdate(value: ObjectVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectVersionUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectVersionUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectVersionUpdate")(js.undefined)
        ret
    }
  }
  
}

