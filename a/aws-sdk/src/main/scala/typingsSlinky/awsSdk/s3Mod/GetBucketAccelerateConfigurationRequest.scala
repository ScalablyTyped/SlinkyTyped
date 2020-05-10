package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketAccelerateConfigurationRequest extends js.Object {
  /**
    * Name of the bucket for which the accelerate configuration is retrieved.
    */
  var Bucket: BucketName = js.native
}

object GetBucketAccelerateConfigurationRequest {
  @scala.inline
  def apply(Bucket: BucketName): GetBucketAccelerateConfigurationRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketAccelerateConfigurationRequest]
  }
  @scala.inline
  implicit class GetBucketAccelerateConfigurationRequestOps[Self <: GetBucketAccelerateConfigurationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucket(value: BucketName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bucket")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

