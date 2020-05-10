package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoggingInfo extends js.Object {
  /**
    * The name of an Amazon S3 bucket where execution logs are stored .
    */
  var S3BucketName: typingsSlinky.awsSdk.ssmMod.S3BucketName = js.native
  /**
    * (Optional) The Amazon S3 bucket subfolder. 
    */
  var S3KeyPrefix: js.UndefOr[typingsSlinky.awsSdk.ssmMod.S3KeyPrefix] = js.native
  /**
    * The region where the Amazon S3 bucket is located.
    */
  var S3Region: typingsSlinky.awsSdk.ssmMod.S3Region = js.native
}

object LoggingInfo {
  @scala.inline
  def apply(S3BucketName: S3BucketName, S3Region: S3Region): LoggingInfo = {
    val __obj = js.Dynamic.literal(S3BucketName = S3BucketName.asInstanceOf[js.Any], S3Region = S3Region.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggingInfo]
  }
  @scala.inline
  implicit class LoggingInfoOps[Self <: LoggingInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withS3BucketName(value: S3BucketName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3BucketName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withS3Region(value: S3Region): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withS3KeyPrefix(value: S3KeyPrefix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3KeyPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3KeyPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3KeyPrefix")(js.undefined)
        ret
    }
  }
  
}

