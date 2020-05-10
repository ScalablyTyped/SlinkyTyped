package typingsSlinky.reactFoundation

import typingsSlinky.propTypes.mod.Requireable
import typingsSlinky.propTypes.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAlignX extends js.Object {
  var alignX: Requireable[_] = js.native
  var alignY: Requireable[_] = js.native
  var breakpoint: Validator[_] = js.native
  var centerAlign: Requireable[_] = js.native
  var flexChild: Requireable[_] = js.native
  var flexContainer: Requireable[_] = js.native
  var flexDirCol: Requireable[_] = js.native
  var flexDirColRev: Requireable[_] = js.native
  var flexDirRow: Requireable[_] = js.native
  var flexDirRowRev: Requireable[_] = js.native
  var flexOrder: Requireable[_] = js.native
  var flexOrderLarge: Requireable[_] = js.native
  var flexOrderMedium: Requireable[_] = js.native
  var flexOrderSmall: Requireable[_] = js.native
  var float: Requireable[_] = js.native
  var hideFor: Requireable[_] = js.native
  var hideOnlyFor: Requireable[_] = js.native
  var isClearfix: Requireable[_] = js.native
  var isHidden: Requireable[_] = js.native
  var isInvisible: Requireable[_] = js.native
  var selfAlignX: Requireable[_] = js.native
  var selfAlignY: Requireable[_] = js.native
  var showFor: Requireable[_] = js.native
  var showForLandscape: Requireable[_] = js.native
  var showForPortrait: Requireable[_] = js.native
  var showForSr: Requireable[_] = js.native
  var showOnFocus: Requireable[_] = js.native
  var showOnlyFor: Requireable[_] = js.native
}

object AnonAlignX {
  @scala.inline
  def apply(
    alignX: Requireable[_],
    alignY: Requireable[_],
    breakpoint: Validator[_],
    centerAlign: Requireable[_],
    flexChild: Requireable[_],
    flexContainer: Requireable[_],
    flexDirCol: Requireable[_],
    flexDirColRev: Requireable[_],
    flexDirRow: Requireable[_],
    flexDirRowRev: Requireable[_],
    flexOrder: Requireable[_],
    flexOrderLarge: Requireable[_],
    flexOrderMedium: Requireable[_],
    flexOrderSmall: Requireable[_],
    float: Requireable[_],
    hideFor: Requireable[_],
    hideOnlyFor: Requireable[_],
    isClearfix: Requireable[_],
    isHidden: Requireable[_],
    isInvisible: Requireable[_],
    selfAlignX: Requireable[_],
    selfAlignY: Requireable[_],
    showFor: Requireable[_],
    showForLandscape: Requireable[_],
    showForPortrait: Requireable[_],
    showForSr: Requireable[_],
    showOnFocus: Requireable[_],
    showOnlyFor: Requireable[_]
  ): AnonAlignX = {
    val __obj = js.Dynamic.literal(alignX = alignX.asInstanceOf[js.Any], alignY = alignY.asInstanceOf[js.Any], breakpoint = breakpoint.asInstanceOf[js.Any], centerAlign = centerAlign.asInstanceOf[js.Any], flexChild = flexChild.asInstanceOf[js.Any], flexContainer = flexContainer.asInstanceOf[js.Any], flexDirCol = flexDirCol.asInstanceOf[js.Any], flexDirColRev = flexDirColRev.asInstanceOf[js.Any], flexDirRow = flexDirRow.asInstanceOf[js.Any], flexDirRowRev = flexDirRowRev.asInstanceOf[js.Any], flexOrder = flexOrder.asInstanceOf[js.Any], flexOrderLarge = flexOrderLarge.asInstanceOf[js.Any], flexOrderMedium = flexOrderMedium.asInstanceOf[js.Any], flexOrderSmall = flexOrderSmall.asInstanceOf[js.Any], float = float.asInstanceOf[js.Any], hideFor = hideFor.asInstanceOf[js.Any], hideOnlyFor = hideOnlyFor.asInstanceOf[js.Any], isClearfix = isClearfix.asInstanceOf[js.Any], isHidden = isHidden.asInstanceOf[js.Any], isInvisible = isInvisible.asInstanceOf[js.Any], selfAlignX = selfAlignX.asInstanceOf[js.Any], selfAlignY = selfAlignY.asInstanceOf[js.Any], showFor = showFor.asInstanceOf[js.Any], showForLandscape = showForLandscape.asInstanceOf[js.Any], showForPortrait = showForPortrait.asInstanceOf[js.Any], showForSr = showForSr.asInstanceOf[js.Any], showOnFocus = showOnFocus.asInstanceOf[js.Any], showOnlyFor = showOnlyFor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlignX]
  }
  @scala.inline
  implicit class AnonAlignXOps[Self <: AnonAlignX] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignX(value: Requireable[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlignY(value: Requireable[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBreakpoint(value: Validator[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCenterAlign(value: Requireable[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlexChild(value: Requireable[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexChild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlexContainer(value: Requireable[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlexDirCol(value: Requireable[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexDirCol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlexDirColRev(value: Requireable[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexDirColRev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlexDirRow(value: Requireable[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexDirRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlexDirRowRev(value: Requireable[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexDirRowRev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlexOrder(value: Requireable[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlexOrderLarge(value: Requireable[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexOrderLarge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlexOrderMedium(value: Requireable[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexOrderMedium")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlexOrderSmall(value: Requireable[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexOrderSmall")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFloat(value: Requireable[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("float")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHideFor(value: Requireable[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideFor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHideOnlyFor(value: Requireable[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideOnlyFor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsClearfix(value: Requireable[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isClearfix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsHidden(value: Requireable[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsInvisible(value: Requireable[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInvisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelfAlignX(value: Requireable[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfAlignX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelfAlignY(value: Requireable[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfAlignY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowFor(value: Requireable[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowForLandscape(value: Requireable[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showForLandscape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowForPortrait(value: Requireable[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showForPortrait")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowForSr(value: Requireable[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showForSr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowOnFocus(value: Requireable[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOnFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowOnlyFor(value: Requireable[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOnlyFor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

