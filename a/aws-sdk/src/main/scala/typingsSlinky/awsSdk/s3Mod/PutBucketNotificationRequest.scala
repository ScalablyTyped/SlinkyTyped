package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutBucketNotificationRequest extends js.Object {
  
  /**
    * The name of the bucket.
    */
  var Bucket: BucketName = js.native
  
  /**
    * The MD5 hash of the PutPublicAccessBlock request body.
    */
  var ContentMD5: js.UndefOr[typingsSlinky.awsSdk.s3Mod.ContentMD5] = js.native
  
  /**
    * The container for the configuration.
    */
  var NotificationConfiguration: NotificationConfigurationDeprecated = js.native
}
object PutBucketNotificationRequest {
  
  @scala.inline
  def apply(Bucket: BucketName, NotificationConfiguration: NotificationConfigurationDeprecated): PutBucketNotificationRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], NotificationConfiguration = NotificationConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketNotificationRequest]
  }
  
  @scala.inline
  implicit class PutBucketNotificationRequestOps[Self <: PutBucketNotificationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBucket(value: BucketName): Self = this.set("Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationConfiguration(value: NotificationConfigurationDeprecated): Self = this.set("NotificationConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentMD5(value: ContentMD5): Self = this.set("ContentMD5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentMD5: Self = this.set("ContentMD5", js.undefined)
  }
}
