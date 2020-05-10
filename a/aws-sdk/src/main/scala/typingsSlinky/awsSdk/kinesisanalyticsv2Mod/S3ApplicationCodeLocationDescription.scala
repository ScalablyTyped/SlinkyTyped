package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3ApplicationCodeLocationDescription extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the S3 bucket containing the application code.
    */
  var BucketARN: typingsSlinky.awsSdk.kinesisanalyticsv2Mod.BucketARN = js.native
  /**
    * The file key for the object containing the application code.
    */
  var FileKey: typingsSlinky.awsSdk.kinesisanalyticsv2Mod.FileKey = js.native
  /**
    * The version of the object containing the application code.
    */
  var ObjectVersion: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ObjectVersion] = js.native
}

object S3ApplicationCodeLocationDescription {
  @scala.inline
  def apply(BucketARN: BucketARN, FileKey: FileKey): S3ApplicationCodeLocationDescription = {
    val __obj = js.Dynamic.literal(BucketARN = BucketARN.asInstanceOf[js.Any], FileKey = FileKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3ApplicationCodeLocationDescription]
  }
  @scala.inline
  implicit class S3ApplicationCodeLocationDescriptionOps[Self <: S3ApplicationCodeLocationDescription] (val x: Self) extends AnyVal {
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
    def withObjectVersion(value: ObjectVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectVersion")(js.undefined)
        ret
    }
  }
  
}

