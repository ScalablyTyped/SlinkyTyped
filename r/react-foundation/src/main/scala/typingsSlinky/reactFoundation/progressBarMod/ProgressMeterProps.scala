package typingsSlinky.reactFoundation.progressBarMod

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.reactFoundation.enumsMod.Breakpoints
import typingsSlinky.reactFoundation.enumsMod.FloatTypes
import typingsSlinky.reactFoundation.reactFoundationStrings.large
import typingsSlinky.reactFoundation.reactFoundationStrings.medium
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.reactFoundation.utilsMod.ClassNameProps because var conflicts: className. Inlined noDefaultClassName
- typingsSlinky.reactFoundation.utilsMod.GeneralPropTypes because var conflicts: className. Inlined showFor, showOnlyFor, hideFor, hideOnlyFor, isHidden, isInvisible, showForLandscape, showForPortrait, showForSr, showOnFocus, isClearfix, float */ @js.native
trait ProgressMeterProps extends HTMLAttributes[HTMLDivElement] {
  var float: js.UndefOr[FloatTypes] = js.native
  var hideFor: js.UndefOr[medium | large] = js.native
  var hideOnlyFor: js.UndefOr[Breakpoints] = js.native
  var isClearfix: js.UndefOr[Boolean] = js.native
  var isHidden: js.UndefOr[Boolean] = js.native
  var isInvisible: js.UndefOr[Boolean] = js.native
  var noDefaultClassName: js.UndefOr[String] = js.native
  var showFor: js.UndefOr[Breakpoints] = js.native
  var showForLandscape: js.UndefOr[Boolean] = js.native
  var showForPortrait: js.UndefOr[Boolean] = js.native
  var showForSr: js.UndefOr[Boolean] = js.native
  var showOnFocus: js.UndefOr[Boolean] = js.native
  var showOnlyFor: js.UndefOr[Breakpoints] = js.native
}

object ProgressMeterProps {
  @scala.inline
  def apply(): ProgressMeterProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressMeterProps]
  }
  @scala.inline
  implicit class ProgressMeterPropsOps[Self <: ProgressMeterProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

