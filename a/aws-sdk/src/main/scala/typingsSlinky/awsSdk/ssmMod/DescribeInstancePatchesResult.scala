package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeInstancePatchesResult extends js.Object {
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.ssmMod.NextToken] = js.native
  /**
    * Each entry in the array is a structure containing: Title (string) KBId (string) Classification (string) Severity (string) State (string, such as "INSTALLED" or "FAILED") InstalledTime (DateTime) InstalledBy (string)
    */
  var Patches: js.UndefOr[PatchComplianceDataList] = js.native
}

object DescribeInstancePatchesResult {
  @scala.inline
  def apply(): DescribeInstancePatchesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInstancePatchesResult]
  }
  @scala.inline
  implicit class DescribeInstancePatchesResultOps[Self <: DescribeInstancePatchesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withPatches(value: PatchComplianceDataList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Patches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPatches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Patches")(js.undefined)
        ret
    }
  }
  
}

