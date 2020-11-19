package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutBucketVersioningRequest extends js.Object {
  
  /**
    * The bucket name.
    */
  var Bucket: BucketName = js.native
  
  /**
    * &gt;The base64-encoded 128-bit MD5 digest of the data. You must use this header as a message integrity check to verify that the request body was not corrupted in transit. For more information, see RFC 1864.
    */
  var ContentMD5: js.UndefOr[typingsSlinky.awsSdk.s3Mod.ContentMD5] = js.native
  
  /**
    * The concatenation of the authentication device's serial number, a space, and the value that is displayed on your authentication device.
    */
  var MFA: js.UndefOr[typingsSlinky.awsSdk.s3Mod.MFA] = js.native
  
  /**
    * Container for setting the versioning state.
    */
  var VersioningConfiguration: typingsSlinky.awsSdk.s3Mod.VersioningConfiguration = js.native
}
object PutBucketVersioningRequest {
  
  @scala.inline
  def apply(Bucket: BucketName, VersioningConfiguration: VersioningConfiguration): PutBucketVersioningRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], VersioningConfiguration = VersioningConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketVersioningRequest]
  }
  
  @scala.inline
  implicit class PutBucketVersioningRequestOps[Self <: PutBucketVersioningRequest] (val x: Self) extends AnyVal {
    
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
    def setVersioningConfiguration(value: VersioningConfiguration): Self = this.set("VersioningConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentMD5(value: ContentMD5): Self = this.set("ContentMD5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentMD5: Self = this.set("ContentMD5", js.undefined)
    
    @scala.inline
    def setMFA(value: MFA): Self = this.set("MFA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMFA: Self = this.set("MFA", js.undefined)
  }
}
