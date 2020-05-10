package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PatchBaselineIdentity extends js.Object {
  /**
    * The description of the patch baseline.
    */
  var BaselineDescription: js.UndefOr[typingsSlinky.awsSdk.ssmMod.BaselineDescription] = js.native
  /**
    * The ID of the patch baseline.
    */
  var BaselineId: js.UndefOr[typingsSlinky.awsSdk.ssmMod.BaselineId] = js.native
  /**
    * The name of the patch baseline.
    */
  var BaselineName: js.UndefOr[typingsSlinky.awsSdk.ssmMod.BaselineName] = js.native
  /**
    * Whether this is the default baseline. Note that Systems Manager supports creating multiple default patch baselines. For example, you can create a default patch baseline for each operating system.
    */
  var DefaultBaseline: js.UndefOr[typingsSlinky.awsSdk.ssmMod.DefaultBaseline] = js.native
  /**
    * Defines the operating system the patch baseline applies to. The Default value is WINDOWS. 
    */
  var OperatingSystem: js.UndefOr[typingsSlinky.awsSdk.ssmMod.OperatingSystem] = js.native
}

object PatchBaselineIdentity {
  @scala.inline
  def apply(): PatchBaselineIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatchBaselineIdentity]
  }
  @scala.inline
  implicit class PatchBaselineIdentityOps[Self <: PatchBaselineIdentity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaselineDescription(value: BaselineDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BaselineDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaselineDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BaselineDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withBaselineId(value: BaselineId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BaselineId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaselineId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BaselineId")(js.undefined)
        ret
    }
    @scala.inline
    def withBaselineName(value: BaselineName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BaselineName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaselineName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BaselineName")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultBaseline(value: DefaultBaseline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultBaseline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultBaseline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultBaseline")(js.undefined)
        ret
    }
    @scala.inline
    def withOperatingSystem(value: OperatingSystem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OperatingSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperatingSystem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OperatingSystem")(js.undefined)
        ret
    }
  }
  
}

