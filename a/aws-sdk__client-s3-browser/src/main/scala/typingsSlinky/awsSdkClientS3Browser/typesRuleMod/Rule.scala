package typingsSlinky.awsSdkClientS3Browser.typesRuleMod

import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Disabled
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Enabled
import typingsSlinky.awsSdkClientS3Browser.typesAbortIncompleteMultipartUploadMod.AbortIncompleteMultipartUpload
import typingsSlinky.awsSdkClientS3Browser.typesLifecycleExpirationMod.LifecycleExpiration
import typingsSlinky.awsSdkClientS3Browser.typesNoncurrentVersionExpirationMod.NoncurrentVersionExpiration
import typingsSlinky.awsSdkClientS3Browser.typesNoncurrentVersionTransitionMod.NoncurrentVersionTransition
import typingsSlinky.awsSdkClientS3Browser.typesTransitionMod.Transition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rule extends js.Object {
  /**
    * <p>Specifies the days since the initiation of an Incomplete Multipart Upload that Lifecycle will wait before permanently removing all parts of the upload.</p>
    */
  var AbortIncompleteMultipartUpload: js.UndefOr[
    typingsSlinky.awsSdkClientS3Browser.typesAbortIncompleteMultipartUploadMod.AbortIncompleteMultipartUpload
  ] = js.native
  /**
    * _LifecycleExpiration shape
    */
  var Expiration: js.UndefOr[LifecycleExpiration] = js.native
  /**
    * <p>Unique identifier for the rule. The value cannot be longer than 255 characters.</p>
    */
  var ID: js.UndefOr[String] = js.native
  /**
    * <p>Specifies when noncurrent object versions expire. Upon expiration, Amazon S3 permanently deletes the noncurrent object versions. You set this lifecycle configuration action on a bucket that has versioning enabled (or suspended) to request that Amazon S3 delete noncurrent object versions at a specific period in the object's lifetime.</p>
    */
  var NoncurrentVersionExpiration: js.UndefOr[
    typingsSlinky.awsSdkClientS3Browser.typesNoncurrentVersionExpirationMod.NoncurrentVersionExpiration
  ] = js.native
  /**
    * <p>Container for the transition rule that describes when noncurrent objects transition to the STANDARD_IA, ONEZONE_IA or GLACIER storage class. If your bucket is versioning-enabled (or versioning is suspended), you can set this action to request that Amazon S3 transition noncurrent object versions to the STANDARD_IA, ONEZONE_IA or GLACIER storage class at a specific period in the object's lifetime.</p>
    */
  var NoncurrentVersionTransition: js.UndefOr[
    typingsSlinky.awsSdkClientS3Browser.typesNoncurrentVersionTransitionMod.NoncurrentVersionTransition
  ] = js.native
  /**
    * <p>Prefix identifying one or more objects to which the rule applies.</p>
    */
  var Prefix: String = js.native
  /**
    * <p>If 'Enabled', the rule is currently being applied. If 'Disabled', the rule is not currently being applied.</p>
    */
  var Status: Enabled | Disabled | String = js.native
  /**
    * _Transition shape
    */
  var Transition: js.UndefOr[typingsSlinky.awsSdkClientS3Browser.typesTransitionMod.Transition] = js.native
}

object Rule {
  @scala.inline
  def apply(Prefix: String, Status: Enabled | Disabled | String): Rule = {
    val __obj = js.Dynamic.literal(Prefix = Prefix.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rule]
  }
  @scala.inline
  implicit class RuleOps[Self <: Rule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: Enabled | Disabled | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAbortIncompleteMultipartUpload(value: AbortIncompleteMultipartUpload): Self = {
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
    def withExpiration(value: LifecycleExpiration): Self = {
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
    def withID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ID")(js.undefined)
        ret
    }
    @scala.inline
    def withNoncurrentVersionExpiration(value: NoncurrentVersionExpiration): Self = {
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
    def withNoncurrentVersionTransition(value: NoncurrentVersionTransition): Self = {
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
    def withTransition(value: Transition): Self = {
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

