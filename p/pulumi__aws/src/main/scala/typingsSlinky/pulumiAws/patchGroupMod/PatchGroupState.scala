package typingsSlinky.pulumiAws.patchGroupMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PatchGroupState extends js.Object {
  /**
    * The ID of the patch baseline to register the patch group with.
    */
  val baselineId: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the patch group that should be registered with the patch baseline.
    */
  val patchGroup: js.UndefOr[Input[String]] = js.native
}

object PatchGroupState {
  @scala.inline
  def apply(): PatchGroupState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatchGroupState]
  }
  @scala.inline
  implicit class PatchGroupStateOps[Self <: PatchGroupState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaselineId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baselineId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaselineId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baselineId")(js.undefined)
        ret
    }
    @scala.inline
    def withPatchGroup(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patchGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPatchGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patchGroup")(js.undefined)
        ret
    }
  }
  
}

