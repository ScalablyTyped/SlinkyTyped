package typingsSlinky.awsSdk.dlmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CrossRegionCopyRule extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the AWS KMS customer master key (CMK) to use for EBS encryption. If this parameter is not specified, your AWS managed CMK for EBS is used.
    */
  var CmkArn: js.UndefOr[typingsSlinky.awsSdk.dlmMod.CmkArn] = js.native
  /**
    * Copy all user-defined tags from the source snapshot to the copied snapshot.
    */
  var CopyTags: js.UndefOr[CopyTagsNullable] = js.native
  /**
    * To encrypt a copy of an unencrypted snapshot if encryption by default is not enabled, enable encryption using this parameter. Copies of encrypted snapshots are encrypted, even if this parameter is false or if encryption by default is not enabled.
    */
  var Encrypted: typingsSlinky.awsSdk.dlmMod.Encrypted = js.native
  /**
    * The retention rule.
    */
  var RetainRule: js.UndefOr[CrossRegionCopyRetainRule] = js.native
  /**
    * The target Region.
    */
  var TargetRegion: typingsSlinky.awsSdk.dlmMod.TargetRegion = js.native
}

object CrossRegionCopyRule {
  @scala.inline
  def apply(Encrypted: Encrypted, TargetRegion: TargetRegion): CrossRegionCopyRule = {
    val __obj = js.Dynamic.literal(Encrypted = Encrypted.asInstanceOf[js.Any], TargetRegion = TargetRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrossRegionCopyRule]
  }
  @scala.inline
  implicit class CrossRegionCopyRuleOps[Self <: CrossRegionCopyRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncrypted(value: Encrypted): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Encrypted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetRegion(value: TargetRegion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCmkArn(value: CmkArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CmkArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCmkArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CmkArn")(js.undefined)
        ret
    }
    @scala.inline
    def withCopyTags(value: CopyTagsNullable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopyTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopyTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopyTags")(js.undefined)
        ret
    }
    @scala.inline
    def withRetainRule(value: CrossRegionCopyRetainRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RetainRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetainRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RetainRule")(js.undefined)
        ret
    }
  }
  
}

