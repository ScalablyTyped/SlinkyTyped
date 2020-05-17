package typingsSlinky.officeUiFabricReact.anon

import typingsSlinky.officeUiFabricReact.detailsHeaderTypesMod.SelectAllVisibility
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollapseAllVisibility extends js.Object {
  var collapseAllVisibility: typingsSlinky.officeUiFabricReact.groupedListTypesMod.CollapseAllVisibility = js.native
  var selectAllVisibility: SelectAllVisibility = js.native
  var useFastIcons: Boolean = js.native
}

object CollapseAllVisibility {
  @scala.inline
  def apply(
    collapseAllVisibility: typingsSlinky.officeUiFabricReact.groupedListTypesMod.CollapseAllVisibility,
    selectAllVisibility: SelectAllVisibility,
    useFastIcons: Boolean
  ): CollapseAllVisibility = {
    val __obj = js.Dynamic.literal(collapseAllVisibility = collapseAllVisibility.asInstanceOf[js.Any], selectAllVisibility = selectAllVisibility.asInstanceOf[js.Any], useFastIcons = useFastIcons.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollapseAllVisibility]
  }
  @scala.inline
  implicit class CollapseAllVisibilityOps[Self <: CollapseAllVisibility] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollapseAllVisibility(value: typingsSlinky.officeUiFabricReact.groupedListTypesMod.CollapseAllVisibility): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseAllVisibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectAllVisibility(value: SelectAllVisibility): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAllVisibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseFastIcons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useFastIcons")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

