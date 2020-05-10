package typingsSlinky.officeUiFabricReact

import typingsSlinky.officeUiFabricReact.detailsListTypesMod.CheckboxVisibility
import typingsSlinky.officeUiFabricReact.detailsListTypesMod.ConstrainMode
import typingsSlinky.officeUiFabricReact.detailsListTypesMod.DetailsListLayoutMode
import typingsSlinky.uifabricUtilities.selectionTypesMod.SelectionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCheckboxVisibility extends js.Object {
  var checkboxVisibility: CheckboxVisibility = js.native
  var compact: Boolean = js.native
  var constrainMode: ConstrainMode = js.native
  var isHeaderVisible: Boolean = js.native
  var layoutMode: DetailsListLayoutMode = js.native
  var selectionMode: SelectionMode = js.native
  var useFastIcons: Boolean = js.native
}

object AnonCheckboxVisibility {
  @scala.inline
  def apply(
    checkboxVisibility: CheckboxVisibility,
    compact: Boolean,
    constrainMode: ConstrainMode,
    isHeaderVisible: Boolean,
    layoutMode: DetailsListLayoutMode,
    selectionMode: SelectionMode,
    useFastIcons: Boolean
  ): AnonCheckboxVisibility = {
    val __obj = js.Dynamic.literal(checkboxVisibility = checkboxVisibility.asInstanceOf[js.Any], compact = compact.asInstanceOf[js.Any], constrainMode = constrainMode.asInstanceOf[js.Any], isHeaderVisible = isHeaderVisible.asInstanceOf[js.Any], layoutMode = layoutMode.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any], useFastIcons = useFastIcons.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCheckboxVisibility]
  }
  @scala.inline
  implicit class AnonCheckboxVisibilityOps[Self <: AnonCheckboxVisibility] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckboxVisibility(value: CheckboxVisibility): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkboxVisibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompact(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConstrainMode(value: ConstrainMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrainMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsHeaderVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHeaderVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayoutMode(value: DetailsListLayoutMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectionMode(value: SelectionMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(value.asInstanceOf[js.Any])
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

