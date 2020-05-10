package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3OutputLocation extends js.Object {
  /**
    * The name of the Amazon S3 bucket.
    */
  var OutputS3BucketName: js.UndefOr[S3BucketName] = js.native
  /**
    * The Amazon S3 bucket subfolder.
    */
  var OutputS3KeyPrefix: js.UndefOr[S3KeyPrefix] = js.native
  /**
    * (Deprecated) You can no longer specify this parameter. The system ignores it. Instead, Systems Manager automatically determines the Amazon S3 bucket region.
    */
  var OutputS3Region: js.UndefOr[S3Region] = js.native
}

object S3OutputLocation {
  @scala.inline
  def apply(): S3OutputLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3OutputLocation]
  }
  @scala.inline
  implicit class S3OutputLocationOps[Self <: S3OutputLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOutputS3BucketName(value: S3BucketName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputS3BucketName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputS3BucketName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputS3BucketName")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputS3KeyPrefix(value: S3KeyPrefix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputS3KeyPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputS3KeyPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputS3KeyPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputS3Region(value: S3Region): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputS3Region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputS3Region: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputS3Region")(js.undefined)
        ret
    }
  }
  
}

