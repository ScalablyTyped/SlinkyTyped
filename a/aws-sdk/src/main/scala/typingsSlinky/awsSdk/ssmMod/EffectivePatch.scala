package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EffectivePatch extends js.Object {
  /**
    * Provides metadata for a patch, including information such as the KB ID, severity, classification and a URL for where more information can be obtained about the patch.
    */
  var Patch: js.UndefOr[typingsSlinky.awsSdk.ssmMod.Patch] = js.native
  /**
    * The status of the patch in a patch baseline. This includes information about whether the patch is currently approved, due to be approved by a rule, explicitly approved, or explicitly rejected and the date the patch was or will be approved.
    */
  var PatchStatus: js.UndefOr[typingsSlinky.awsSdk.ssmMod.PatchStatus] = js.native
}

object EffectivePatch {
  @scala.inline
  def apply(): EffectivePatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EffectivePatch]
  }
  @scala.inline
  implicit class EffectivePatchOps[Self <: EffectivePatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPatch(value: Patch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Patch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Patch")(js.undefined)
        ret
    }
    @scala.inline
    def withPatchStatus(value: PatchStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PatchStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPatchStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PatchStatus")(js.undefined)
        ret
    }
  }
  
}

