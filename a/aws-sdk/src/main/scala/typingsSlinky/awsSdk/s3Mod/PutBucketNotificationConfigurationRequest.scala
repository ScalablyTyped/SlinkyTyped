package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutBucketNotificationConfigurationRequest extends js.Object {
  /**
    * The name of the bucket.
    */
  var Bucket: BucketName = js.native
  var NotificationConfiguration: typingsSlinky.awsSdk.s3Mod.NotificationConfiguration = js.native
}

object PutBucketNotificationConfigurationRequest {
  @scala.inline
  def apply(Bucket: BucketName, NotificationConfiguration: NotificationConfiguration): PutBucketNotificationConfigurationRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], NotificationConfiguration = NotificationConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketNotificationConfigurationRequest]
  }
  @scala.inline
  implicit class PutBucketNotificationConfigurationRequestOps[Self <: PutBucketNotificationConfigurationRequest] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withNotificationConfiguration(value: NotificationConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotificationConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

