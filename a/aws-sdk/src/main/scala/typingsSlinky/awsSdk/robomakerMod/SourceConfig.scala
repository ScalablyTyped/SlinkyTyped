package typingsSlinky.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceConfig extends js.Object {
  /**
    * The target processor architecture for the application.
    */
  var architecture: js.UndefOr[Architecture] = js.native
  /**
    * The Amazon S3 bucket name.
    */
  var s3Bucket: js.UndefOr[S3Bucket] = js.native
  /**
    * The s3 object key.
    */
  var s3Key: js.UndefOr[S3Key] = js.native
}

object SourceConfig {
  @scala.inline
  def apply(): SourceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceConfig]
  }
  @scala.inline
  implicit class SourceConfigOps[Self <: SourceConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArchitecture(value: Architecture): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("architecture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArchitecture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("architecture")(js.undefined)
        ret
    }
    @scala.inline
    def withS3Bucket(value: S3Bucket): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3Bucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3Bucket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3Bucket")(js.undefined)
        ret
    }
    @scala.inline
    def withS3Key(value: S3Key): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3Key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3Key: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3Key")(js.undefined)
        ret
    }
  }
  
}

