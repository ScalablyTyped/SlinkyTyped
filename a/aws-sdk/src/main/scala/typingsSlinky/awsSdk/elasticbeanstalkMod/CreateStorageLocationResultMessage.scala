package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateStorageLocationResultMessage extends js.Object {
  /**
    * The name of the Amazon S3 bucket created.
    */
  var S3Bucket: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.S3Bucket] = js.native
}

object CreateStorageLocationResultMessage {
  @scala.inline
  def apply(): CreateStorageLocationResultMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateStorageLocationResultMessage]
  }
  @scala.inline
  implicit class CreateStorageLocationResultMessageOps[Self <: CreateStorageLocationResultMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withS3Bucket(value: S3Bucket): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Bucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3Bucket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Bucket")(js.undefined)
        ret
    }
  }
  
}

