package typingsSlinky.officeUiFabricReact.detailsColumnTypesMod

import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDetailsColumnStyles extends js.Object {
  /**
    * Styleable label region.
    */
  var accessibleLabel: IStyle = js.native
  /**
    * Styleable border region after drag & drop.
    */
  var borderAfterDropping: IStyle = js.native
  /**
    * Styleable border while drag & drop occurs.
    */
  var borderWhileDragging: IStyle = js.native
  /**
    * Styleable cell name region.
    */
  var cellName: IStyle = js.native
  /**
    * Styleable cell title region.
    */
  var cellTitle: IStyle = js.native
  /**
    * Styleable cell tooltip region.
    */
  var cellTooltip: IStyle = js.native
  /**
    * Styleable filter glyph.
    */
  var filterChevron: IStyle = js.native
  /**
    * Styleable resize glyph region.
    */
  var gripperBarVerticalStyle: IStyle = js.native
  /**
    * Styleable icon region.
    */
  var iconClassName: IStyle = js.native
  /**
    * Styleable margin by icon region.
    */
  var nearIcon: IStyle = js.native
  /**
    * Transparent no border region after drag & drop to avoid content shift.
    */
  var noBorderAfterDropping: IStyle = js.native
  /**
    * Transparent no border region while drag & drop occurs to avoid content shift.
    */
  var noBorderWhileDragging: IStyle = js.native
  /**
    * Styleable root region.
    */
  var root: IStyle = js.native
  /**
    * Styleable column sort icon region.
    */
  var sortIcon: IStyle = js.native
}

object IDetailsColumnStyles {
  @scala.inline
  def apply(): IDetailsColumnStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDetailsColumnStyles]
  }
  @scala.inline
  implicit class IDetailsColumnStylesOps[Self <: IDetailsColumnStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessibleLabel(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibleLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibleLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibleLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessibleLabelNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibleLabel")(null)
        ret
    }
    @scala.inline
    def withBorderAfterDropping(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderAfterDropping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderAfterDropping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderAfterDropping")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderAfterDroppingNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderAfterDropping")(null)
        ret
    }
    @scala.inline
    def withBorderWhileDragging(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWhileDragging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderWhileDragging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWhileDragging")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderWhileDraggingNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWhileDragging")(null)
        ret
    }
    @scala.inline
    def withCellName(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellName")(js.undefined)
        ret
    }
    @scala.inline
    def withCellNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellName")(null)
        ret
    }
    @scala.inline
    def withCellTitle(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withCellTitleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellTitle")(null)
        ret
    }
    @scala.inline
    def withCellTooltip(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withCellTooltipNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellTooltip")(null)
        ret
    }
    @scala.inline
    def withFilterChevron(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterChevron")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterChevron: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterChevron")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterChevronNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterChevron")(null)
        ret
    }
    @scala.inline
    def withGripperBarVerticalStyle(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gripperBarVerticalStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGripperBarVerticalStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gripperBarVerticalStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withGripperBarVerticalStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gripperBarVerticalStyle")(null)
        ret
    }
    @scala.inline
    def withIconClassName(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withIconClassNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconClassName")(null)
        ret
    }
    @scala.inline
    def withNearIcon(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nearIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNearIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nearIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withNearIconNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nearIcon")(null)
        ret
    }
    @scala.inline
    def withNoBorderAfterDropping(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noBorderAfterDropping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoBorderAfterDropping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noBorderAfterDropping")(js.undefined)
        ret
    }
    @scala.inline
    def withNoBorderAfterDroppingNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noBorderAfterDropping")(null)
        ret
    }
    @scala.inline
    def withNoBorderWhileDragging(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noBorderWhileDragging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoBorderWhileDragging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noBorderWhileDragging")(js.undefined)
        ret
    }
    @scala.inline
    def withNoBorderWhileDraggingNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noBorderWhileDragging")(null)
        ret
    }
    @scala.inline
    def withRoot(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(js.undefined)
        ret
    }
    @scala.inline
    def withRootNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(null)
        ret
    }
    @scala.inline
    def withSortIcon(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withSortIconNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortIcon")(null)
        ret
    }
  }
  
}

