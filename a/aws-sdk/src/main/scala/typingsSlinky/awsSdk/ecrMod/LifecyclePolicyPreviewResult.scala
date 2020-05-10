package typingsSlinky.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LifecyclePolicyPreviewResult extends js.Object {
  /**
    * The type of action to be taken.
    */
  var action: js.UndefOr[LifecyclePolicyRuleAction] = js.native
  /**
    * The priority of the applied rule.
    */
  var appliedRulePriority: js.UndefOr[LifecyclePolicyRulePriority] = js.native
  /**
    * The sha256 digest of the image manifest.
    */
  var imageDigest: js.UndefOr[ImageDigest] = js.native
  /**
    * The date and time, expressed in standard JavaScript date format, at which the current image was pushed to the repository.
    */
  var imagePushedAt: js.UndefOr[js.Date] = js.native
  /**
    * The list of tags associated with this image.
    */
  var imageTags: js.UndefOr[ImageTagList] = js.native
}

object LifecyclePolicyPreviewResult {
  @scala.inline
  def apply(): LifecyclePolicyPreviewResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifecyclePolicyPreviewResult]
  }
  @scala.inline
  implicit class LifecyclePolicyPreviewResultOps[Self <: LifecyclePolicyPreviewResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: LifecyclePolicyRuleAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.undefined)
        ret
    }
    @scala.inline
    def withAppliedRulePriority(value: LifecyclePolicyRulePriority): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appliedRulePriority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppliedRulePriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appliedRulePriority")(js.undefined)
        ret
    }
    @scala.inline
    def withImageDigest(value: ImageDigest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageDigest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageDigest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageDigest")(js.undefined)
        ret
    }
    @scala.inline
    def withImagePushedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imagePushedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImagePushedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imagePushedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withImageTags(value: ImageTagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageTags")(js.undefined)
        ret
    }
  }
  
}

