package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LifecycleRule extends js.Object {
  var AbortIncompleteMultipartUpload: js.UndefOr[typingsSlinky.awsSdk.s3Mod.AbortIncompleteMultipartUpload] = js.native
  /**
    * Specifies the expiration for the lifecycle of the object in the form of date, days and, whether the object has a delete marker.
    */
  var Expiration: js.UndefOr[LifecycleExpiration] = js.native
  var Filter: js.UndefOr[LifecycleRuleFilter] = js.native
  /**
    * Unique identifier for the rule. The value cannot be longer than 255 characters.
    */
  var ID: js.UndefOr[typingsSlinky.awsSdk.s3Mod.ID] = js.native
  var NoncurrentVersionExpiration: js.UndefOr[typingsSlinky.awsSdk.s3Mod.NoncurrentVersionExpiration] = js.native
  /**
    *  Specifies the transition rule for the lifecycle rule that describes when noncurrent objects transition to a specific storage class. If your bucket is versioning-enabled (or versioning is suspended), you can set this action to request that Amazon S3 transition noncurrent object versions to a specific storage class at a set period in the object's lifetime. 
    */
  var NoncurrentVersionTransitions: js.UndefOr[NoncurrentVersionTransitionList] = js.native
  /**
    * Prefix identifying one or more objects to which the rule applies. This is No longer used; use Filter instead.
    */
  var Prefix: js.UndefOr[typingsSlinky.awsSdk.s3Mod.Prefix] = js.native
  /**
    * If 'Enabled', the rule is currently being applied. If 'Disabled', the rule is not currently being applied.
    */
  var Status: ExpirationStatus = js.native
  /**
    * Specifies when an Amazon S3 object transitions to a specified storage class.
    */
  var Transitions: js.UndefOr[TransitionList] = js.native
}

object LifecycleRule {
  @scala.inline
  def apply(Status: ExpirationStatus): LifecycleRule = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecycleRule]
  }
  @scala.inline
  implicit class LifecycleRuleOps[Self <: LifecycleRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatus(value: ExpirationStatus): Self = {
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
    def withFilter(value: LifecycleRuleFilter): Self = {
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
    def withID(value: ID): Self = {
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
    def withNoncurrentVersionTransitions(value: NoncurrentVersionTransitionList): Self = {
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
    def withPrefix(value: Prefix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitions(value: TransitionList): Self = {
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

