package typingsSlinky.blueprintjsTable.esmRegionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStyledRegionGroup extends js.Object {
  var className: js.UndefOr[String] = js.native
  var regions: js.Array[IRegion] = js.native
}

object IStyledRegionGroup {
  @scala.inline
  def apply(regions: js.Array[IRegion]): IStyledRegionGroup = {
    val __obj = js.Dynamic.literal(regions = regions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStyledRegionGroup]
  }
  @scala.inline
  implicit class IStyledRegionGroupOps[Self <: IStyledRegionGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRegions(value: js.Array[IRegion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
  }
  
}

