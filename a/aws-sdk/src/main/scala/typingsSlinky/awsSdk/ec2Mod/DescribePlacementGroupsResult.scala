package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePlacementGroupsResult extends js.Object {
  /**
    * Information about the placement groups.
    */
  var PlacementGroups: js.UndefOr[PlacementGroupList] = js.native
}

object DescribePlacementGroupsResult {
  @scala.inline
  def apply(): DescribePlacementGroupsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePlacementGroupsResult]
  }
  @scala.inline
  implicit class DescribePlacementGroupsResultOps[Self <: DescribePlacementGroupsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPlacementGroups(value: PlacementGroupList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlacementGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacementGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlacementGroups")(js.undefined)
        ret
    }
  }
  
}

