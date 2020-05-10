package typingsSlinky.pulumiAws.getPatchBaselineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPatchBaselineArgs extends js.Object {
  /**
    * Filters the results against the baselines defaultBaseline field.
    */
  val defaultBaseline: js.UndefOr[Boolean] = js.native
  /**
    * Filter results by the baseline name prefix.
    */
  val namePrefix: js.UndefOr[String] = js.native
  /**
    * The specified OS for the baseline.
    */
  val operatingSystem: js.UndefOr[String] = js.native
  /**
    * The owner of the baseline. Valid values: `All`, `AWS`, `Self` (the current account).
    */
  val owner: String = js.native
}

object GetPatchBaselineArgs {
  @scala.inline
  def apply(owner: String): GetPatchBaselineArgs = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPatchBaselineArgs]
  }
  @scala.inline
  implicit class GetPatchBaselineArgsOps[Self <: GetPatchBaselineArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOwner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultBaseline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultBaseline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultBaseline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultBaseline")(js.undefined)
        ret
    }
    @scala.inline
    def withNamePrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namePrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamePrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namePrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withOperatingSystem(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operatingSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperatingSystem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operatingSystem")(js.undefined)
        ret
    }
  }
  
}

