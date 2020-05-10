package typingsSlinky.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3Config extends js.Object {
  /**
    * The Amazon S3 bucket to access. This bucket is used as a parameter in the CreateLocationS3 operation. 
    */
  var BucketAccessRoleArn: IamRoleArn = js.native
}

object S3Config {
  @scala.inline
  def apply(BucketAccessRoleArn: IamRoleArn): S3Config = {
    val __obj = js.Dynamic.literal(BucketAccessRoleArn = BucketAccessRoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Config]
  }
  @scala.inline
  implicit class S3ConfigOps[Self <: S3Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucketAccessRoleArn(value: IamRoleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BucketAccessRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

