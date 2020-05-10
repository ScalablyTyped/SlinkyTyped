package typingsSlinky.awsSdkClientS3Browser.typesRuleMod

import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Disabled
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Enabled
import typingsSlinky.awsSdkClientS3Browser.typesAbortIncompleteMultipartUploadMod.UnmarshalledAbortIncompleteMultipartUpload
import typingsSlinky.awsSdkClientS3Browser.typesLifecycleExpirationMod.UnmarshalledLifecycleExpiration
import typingsSlinky.awsSdkClientS3Browser.typesNoncurrentVersionExpirationMod.UnmarshalledNoncurrentVersionExpiration
import typingsSlinky.awsSdkClientS3Browser.typesNoncurrentVersionTransitionMod.UnmarshalledNoncurrentVersionTransition
import typingsSlinky.awsSdkClientS3Browser.typesTransitionMod.UnmarshalledTransition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledRule extends Rule {
  /**
    * <p>Specifies the days since the initiation of an Incomplete Multipart Upload that Lifecycle will wait before permanently removing all parts of the upload.</p>
    */
  @JSName("AbortIncompleteMultipartUpload")
  var AbortIncompleteMultipartUpload_UnmarshalledRule: js.UndefOr[UnmarshalledAbortIncompleteMultipartUpload] = js.native
  /**
    * _LifecycleExpiration shape
    */
  @JSName("Expiration")
  var Expiration_UnmarshalledRule: js.UndefOr[UnmarshalledLifecycleExpiration] = js.native
  /**
    * <p>Specifies when noncurrent object versions expire. Upon expiration, Amazon S3 permanently deletes the noncurrent object versions. You set this lifecycle configuration action on a bucket that has versioning enabled (or suspended) to request that Amazon S3 delete noncurrent object versions at a specific period in the object's lifetime.</p>
    */
  @JSName("NoncurrentVersionExpiration")
  var NoncurrentVersionExpiration_UnmarshalledRule: js.UndefOr[UnmarshalledNoncurrentVersionExpiration] = js.native
  /**
    * <p>Container for the transition rule that describes when noncurrent objects transition to the STANDARD_IA, ONEZONE_IA or GLACIER storage class. If your bucket is versioning-enabled (or versioning is suspended), you can set this action to request that Amazon S3 transition noncurrent object versions to the STANDARD_IA, ONEZONE_IA or GLACIER storage class at a specific period in the object's lifetime.</p>
    */
  @JSName("NoncurrentVersionTransition")
  var NoncurrentVersionTransition_UnmarshalledRule: js.UndefOr[UnmarshalledNoncurrentVersionTransition] = js.native
  /**
    * _Transition shape
    */
  @JSName("Transition")
  var Transition_UnmarshalledRule: js.UndefOr[UnmarshalledTransition] = js.native
}

object UnmarshalledRule {
  @scala.inline
  def apply(Prefix: String, Status: Enabled | Disabled | String): UnmarshalledRule = {
    val __obj = js.Dynamic.literal(Prefix = Prefix.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledRule]
  }
  @scala.inline
  implicit class UnmarshalledRuleOps[Self <: UnmarshalledRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbortIncompleteMultipartUpload(value: UnmarshalledAbortIncompleteMultipartUpload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AbortIncompleteMultipartUpload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbortIncompleteMultipartUpload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AbortIncompleteMultipartUpload")(js.undefined)
        ret
    }
    @scala.inline
    def withExpiration(value: UnmarshalledLifecycleExpiration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Expiration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpiration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Expiration")(js.undefined)
        ret
    }
    @scala.inline
    def withNoncurrentVersionExpiration(value: UnmarshalledNoncurrentVersionExpiration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoncurrentVersionExpiration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoncurrentVersionExpiration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoncurrentVersionExpiration")(js.undefined)
        ret
    }
    @scala.inline
    def withNoncurrentVersionTransition(value: UnmarshalledNoncurrentVersionTransition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoncurrentVersionTransition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoncurrentVersionTransition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoncurrentVersionTransition")(js.undefined)
        ret
    }
    @scala.inline
    def withTransition(value: UnmarshalledTransition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Transition")(js.undefined)
        ret
    }
  }
  
}

