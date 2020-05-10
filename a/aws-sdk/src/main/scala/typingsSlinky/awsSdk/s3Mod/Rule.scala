package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rule extends js.Object {
  var AbortIncompleteMultipartUpload: js.UndefOr[typingsSlinky.awsSdk.s3Mod.AbortIncompleteMultipartUpload] = js.native
  /**
    * Specifies the expiration for the lifecycle of the object.
    */
  var Expiration: js.UndefOr[LifecycleExpiration] = js.native
  /**
    * Unique identifier for the rule. The value can't be longer than 255 characters.
    */
  var ID: js.UndefOr[typingsSlinky.awsSdk.s3Mod.ID] = js.native
  var NoncurrentVersionExpiration: js.UndefOr[typingsSlinky.awsSdk.s3Mod.NoncurrentVersionExpiration] = js.native
  var NoncurrentVersionTransition: js.UndefOr[typingsSlinky.awsSdk.s3Mod.NoncurrentVersionTransition] = js.native
  /**
    * Object key prefix that identifies one or more objects to which this rule applies.
    */
  var Prefix: typingsSlinky.awsSdk.s3Mod.Prefix = js.native
  /**
    * If Enabled, the rule is currently being applied. If Disabled, the rule is not currently being applied.
    */
  var Status: ExpirationStatus = js.native
  /**
    * Specifies when an object transitions to a specified storage class.
    */
  var Transition: js.UndefOr[typingsSlinky.awsSdk.s3Mod.Transition] = js.native
}

object Rule {
  @scala.inline
  def apply(Prefix: Prefix, Status: ExpirationStatus): Rule = {
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
    def withPrefix(value: Prefix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Prefix")(value.asInstanceOf[js.Any])
        ret
    }
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

