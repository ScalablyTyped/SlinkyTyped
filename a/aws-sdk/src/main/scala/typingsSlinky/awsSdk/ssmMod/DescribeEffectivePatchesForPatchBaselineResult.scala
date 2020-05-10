package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEffectivePatchesForPatchBaselineResult extends js.Object {
  /**
    * An array of patches and patch status.
    */
  var EffectivePatches: js.UndefOr[EffectivePatchList] = js.native
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.ssmMod.NextToken] = js.native
}

object DescribeEffectivePatchesForPatchBaselineResult {
  @scala.inline
  def apply(): DescribeEffectivePatchesForPatchBaselineResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEffectivePatchesForPatchBaselineResult]
  }
  @scala.inline
  implicit class DescribeEffectivePatchesForPatchBaselineResultOps[Self <: DescribeEffectivePatchesForPatchBaselineResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEffectivePatches(value: EffectivePatchList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EffectivePatches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEffectivePatches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EffectivePatches")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

