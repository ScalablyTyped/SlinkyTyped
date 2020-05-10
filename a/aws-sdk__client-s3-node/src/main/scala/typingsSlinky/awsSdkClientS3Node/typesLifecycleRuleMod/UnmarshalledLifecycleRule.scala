package typingsSlinky.awsSdkClientS3Node.typesLifecycleRuleMod

import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Disabled
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Enabled
import typingsSlinky.awsSdkClientS3Node.typesAbortIncompleteMultipartUploadMod.UnmarshalledAbortIncompleteMultipartUpload
import typingsSlinky.awsSdkClientS3Node.typesLifecycleExpirationMod.UnmarshalledLifecycleExpiration
import typingsSlinky.awsSdkClientS3Node.typesLifecycleRuleFilterMod.UnmarshalledLifecycleRuleFilter
import typingsSlinky.awsSdkClientS3Node.typesNoncurrentVersionExpirationMod.UnmarshalledNoncurrentVersionExpiration
import typingsSlinky.awsSdkClientS3Node.typesNoncurrentVersionTransitionMod.UnmarshalledNoncurrentVersionTransition
import typingsSlinky.awsSdkClientS3Node.typesTransitionMod.UnmarshalledTransition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledLifecycleRule extends LifecycleRule {
  /**
    * <p>Specifies the days since the initiation of an Incomplete Multipart Upload that Lifecycle will wait before permanently removing all parts of the upload.</p>
    */
  @JSName("AbortIncompleteMultipartUpload")
  var AbortIncompleteMultipartUpload_UnmarshalledLifecycleRule: js.UndefOr[UnmarshalledAbortIncompleteMultipartUpload] = js.native
  /**
    * _LifecycleExpiration shape
    */
  @JSName("Expiration")
  var Expiration_UnmarshalledLifecycleRule: js.UndefOr[UnmarshalledLifecycleExpiration] = js.native
  /**
    * <p>The Filter is used to identify objects that a Lifecycle Rule applies to. A Filter must have exactly one of Prefix, Tag, or And specified.</p>
    */
  @JSName("Filter")
  var Filter_UnmarshalledLifecycleRule: js.UndefOr[UnmarshalledLifecycleRuleFilter] = js.native
  /**
    * <p>Specifies when noncurrent object versions expire. Upon expiration, Amazon S3 permanently deletes the noncurrent object versions. You set this lifecycle configuration action on a bucket that has versioning enabled (or suspended) to request that Amazon S3 delete noncurrent object versions at a specific period in the object's lifetime.</p>
    */
  @JSName("NoncurrentVersionExpiration")
  var NoncurrentVersionExpiration_UnmarshalledLifecycleRule: js.UndefOr[UnmarshalledNoncurrentVersionExpiration] = js.native
  /**
    * _NoncurrentVersionTransitionList shape
    */
  @JSName("NoncurrentVersionTransitions")
  var NoncurrentVersionTransitions_UnmarshalledLifecycleRule: js.UndefOr[js.Array[UnmarshalledNoncurrentVersionTransition]] = js.native
  /**
    * _TransitionList shape
    */
  @JSName("Transitions")
  var Transitions_UnmarshalledLifecycleRule: js.UndefOr[js.Array[UnmarshalledTransition]] = js.native
}

object UnmarshalledLifecycleRule {
  @scala.inline
  def apply(Status: Enabled | Disabled | String): UnmarshalledLifecycleRule = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledLifecycleRule]
  }
  @scala.inline
  implicit class UnmarshalledLifecycleRuleOps[Self <: UnmarshalledLifecycleRule] (val x: Self) extends AnyVal {
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
    def withFilter(value: UnmarshalledLifecycleRuleFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filter")(js.undefined)
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
    def withNoncurrentVersionTransitions(value: js.Array[UnmarshalledNoncurrentVersionTransition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoncurrentVersionTransitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoncurrentVersionTransitions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoncurrentVersionTransitions")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitions(value: js.Array[UnmarshalledTransition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Transitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Transitions")(js.undefined)
        ret
    }
  }
  
}

