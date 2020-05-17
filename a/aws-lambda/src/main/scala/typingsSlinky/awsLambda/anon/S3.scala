package typingsSlinky.awsLambda.anon

import typingsSlinky.awsLambda.cloudfrontMod.CloudFrontOrigin
import typingsSlinky.awsLambda.cloudfrontMod.CloudFrontS3Origin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3 extends CloudFrontOrigin {
  var s3: CloudFrontS3Origin = js.native
}

object S3 {
  @scala.inline
  def apply(s3: CloudFrontS3Origin): S3 = {
    val __obj = js.Dynamic.literal(s3 = s3.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3]
  }
  @scala.inline
  implicit class S3Ops[Self <: S3] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withS3(value: CloudFrontS3Origin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

