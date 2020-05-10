package typingsSlinky.reactFoundation.progressBarMod

import org.scalajs.dom.raw.HTMLProgressElement
import typingsSlinky.react.mod.ProgressHTMLAttributes
import typingsSlinky.reactFoundation.enumsMod.Breakpoints
import typingsSlinky.reactFoundation.enumsMod.ExtendedBreakpoints
import typingsSlinky.reactFoundation.enumsMod.FloatTypes
import typingsSlinky.reactFoundation.enumsMod.HorizontalAlignments
import typingsSlinky.reactFoundation.enumsMod.ProgressColors
import typingsSlinky.reactFoundation.enumsMod.SpaceControls
import typingsSlinky.reactFoundation.enumsMod.VerticalAlignments
import typingsSlinky.reactFoundation.reactFoundationStrings.large
import typingsSlinky.reactFoundation.reactFoundationStrings.medium
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.reactFoundation.utilsMod.ClassNameProps because var conflicts: className. Inlined noDefaultClassName
- typingsSlinky.reactFoundation.utilsMod.GeneralPropTypes because var conflicts: className. Inlined showFor, showOnlyFor, hideFor, hideOnlyFor, isHidden, isInvisible, showForLandscape, showForPortrait, showForSr, showOnFocus, isClearfix, float
- typingsSlinky.reactFoundation.utilsMod.FlexboxPropTypes because var conflicts: className. Inlined alignX, alignY, selfAlignX, selfAlignY, centerAlign, flexContainer, flexDirRow, flexDirRowRev, flexDirCol, flexDirColRev, flexChild, flexOrder, flexOrderSmall, flexOrderMedium, flexOrderLarge */ @js.native
trait NativeProgressProps extends ProgressHTMLAttributes[HTMLProgressElement] {
  var alignX: js.UndefOr[HorizontalAlignments] = js.native
  var alignY: js.UndefOr[VerticalAlignments] = js.native
  var centerAlign: js.UndefOr[Boolean] = js.native
  @JSName("color")
  var color_NativeProgressProps: js.UndefOr[ProgressColors] = js.native
  var flexChild: js.UndefOr[SpaceControls] = js.native
  var flexContainer: js.UndefOr[Boolean] = js.native
  var flexDirCol: js.UndefOr[ExtendedBreakpoints] = js.native
  var flexDirColRev: js.UndefOr[ExtendedBreakpoints] = js.native
  var flexDirRow: js.UndefOr[ExtendedBreakpoints] = js.native
  var flexDirRowRev: js.UndefOr[ExtendedBreakpoints] = js.native
  var flexOrder: js.UndefOr[Double] = js.native
  var flexOrderLarge: js.UndefOr[Double] = js.native
  var flexOrderMedium: js.UndefOr[Double] = js.native
  var flexOrderSmall: js.UndefOr[Double] = js.native
  var float: js.UndefOr[FloatTypes] = js.native
  var hideFor: js.UndefOr[medium | large] = js.native
  var hideOnlyFor: js.UndefOr[Breakpoints] = js.native
  var isClearfix: js.UndefOr[Boolean] = js.native
  var isHidden: js.UndefOr[Boolean] = js.native
  var isInvisible: js.UndefOr[Boolean] = js.native
  @JSName("max")
  var max_NativeProgressProps: js.UndefOr[Double] = js.native
  var noDefaultClassName: js.UndefOr[String] = js.native
  var selfAlignX: js.UndefOr[HorizontalAlignments] = js.native
  var selfAlignY: js.UndefOr[VerticalAlignments] = js.native
  var showFor: js.UndefOr[Breakpoints] = js.native
  var showForLandscape: js.UndefOr[Boolean] = js.native
  var showForPortrait: js.UndefOr[Boolean] = js.native
  var showForSr: js.UndefOr[Boolean] = js.native
  var showOnFocus: js.UndefOr[Boolean] = js.native
  var showOnlyFor: js.UndefOr[Breakpoints] = js.native
  @JSName("value")
  var value_NativeProgressProps: js.UndefOr[Double] = js.native
}

object NativeProgressProps {
  @scala.inline
  def apply(): NativeProgressProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NativeProgressProps]
  }
  @scala.inline
  implicit class NativeProgressPropsOps[Self <: NativeProgressProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignX(value: HorizontalAlignments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignX")(js.undefined)
        ret
    }
    @scala.inline
    def withAlignY(value: VerticalAlignments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignY")(js.undefined)
        ret
    }
    @scala.inline
    def withCenterAlign(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenterAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: ProgressColors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withFlexChild(value: SpaceControls): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexChild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlexChild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexChild")(js.undefined)
        ret
    }
    @scala.inline
    def withFlexContainer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlexContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withFlexDirCol(value: ExtendedBreakpoints): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexDirCol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlexDirCol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexDirCol")(js.undefined)
        ret
    }
    @scala.inline
    def withFlexDirColRev(value: ExtendedBreakpoints): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexDirColRev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlexDirColRev: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexDirColRev")(js.undefined)
        ret
    }
    @scala.inline
    def withFlexDirRow(value: ExtendedBreakpoints): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexDirRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlexDirRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexDirRow")(js.undefined)
        ret
    }
    @scala.inline
    def withFlexDirRowRev(value: ExtendedBreakpoints): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexDirRowRev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlexDirRowRev: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexDirRowRev")(js.undefined)
        ret
    }
    @scala.inline
    def withFlexOrder(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlexOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withFlexOrderLarge(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexOrderLarge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlexOrderLarge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexOrderLarge")(js.undefined)
        ret
    }
    @scala.inline
    def withFlexOrderMedium(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexOrderMedium")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlexOrderMedium: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexOrderMedium")(js.undefined)
        ret
    }
    @scala.inline
    def withFlexOrderSmall(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexOrderSmall")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlexOrderSmall: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexOrderSmall")(js.undefined)
        ret
    }
    @scala.inline
    def withFloat(value: FloatTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("float")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("float")(js.undefined)
        ret
    }
    @scala.inline
    def withHideFor(value: medium | large): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideFor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideFor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideFor")(js.undefined)
        ret
    }
    @scala.inline
    def withHideOnlyFor(value: Breakpoints): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideOnlyFor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideOnlyFor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideOnlyFor")(js.undefined)
        ret
    }
    @scala.inline
    def withIsClearfix(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isClearfix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsClearfix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isClearfix")(js.undefined)
        ret
    }
    @scala.inline
    def withIsHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withIsInvisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInvisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsInvisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInvisible")(js.undefined)
        ret
    }
    @scala.inline
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withNoDefaultClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noDefaultClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoDefaultClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noDefaultClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withSelfAlignX(value: HorizontalAlignments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfAlignX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelfAlignX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfAlignX")(js.undefined)
        ret
    }
    @scala.inline
    def withSelfAlignY(value: VerticalAlignments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfAlignY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelfAlignY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfAlignY")(js.undefined)
        ret
    }
    @scala.inline
    def withShowFor(value: Breakpoints): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowFor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFor")(js.undefined)
        ret
    }
    @scala.inline
    def withShowForLandscape(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showForLandscape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowForLandscape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showForLandscape")(js.undefined)
        ret
    }
    @scala.inline
    def withShowForPortrait(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showForPortrait")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowForPortrait: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showForPortrait")(js.undefined)
        ret
    }
    @scala.inline
    def withShowForSr(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showForSr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowForSr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showForSr")(js.undefined)
        ret
    }
    @scala.inline
    def withShowOnFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOnFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOnFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withShowOnlyFor(value: Breakpoints): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOnlyFor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowOnlyFor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOnlyFor")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

