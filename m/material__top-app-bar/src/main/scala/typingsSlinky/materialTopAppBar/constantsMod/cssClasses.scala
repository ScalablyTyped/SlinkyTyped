package typingsSlinky.materialTopAppBar.constantsMod

import typingsSlinky.materialBase.foundationMod.MDCStrings
import typingsSlinky.materialTopAppBar.materialTopAppBarStrings.`mdc-top-app-bar--fixed-scrolled`
import typingsSlinky.materialTopAppBar.materialTopAppBarStrings.`mdc-top-app-bar--fixed`
import typingsSlinky.materialTopAppBar.materialTopAppBarStrings.`mdc-top-app-bar--short-collapsed`
import typingsSlinky.materialTopAppBar.materialTopAppBarStrings.`mdc-top-app-bar--short-has-action-item`
import typingsSlinky.materialTopAppBar.materialTopAppBarStrings.`mdc-top-app-bar--short`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait cssClasses extends MDCStrings {
  var FIXED_CLASS: `mdc-top-app-bar--fixed` = js.native
  var FIXED_SCROLLED_CLASS: `mdc-top-app-bar--fixed-scrolled` = js.native
  var SHORT_CLASS: `mdc-top-app-bar--short` = js.native
  var SHORT_COLLAPSED_CLASS: `mdc-top-app-bar--short-collapsed` = js.native
  var SHORT_HAS_ACTION_ITEM_CLASS: `mdc-top-app-bar--short-has-action-item` = js.native
}

object cssClasses {
  @scala.inline
  def apply(
    FIXED_CLASS: `mdc-top-app-bar--fixed`,
    FIXED_SCROLLED_CLASS: `mdc-top-app-bar--fixed-scrolled`,
    SHORT_CLASS: `mdc-top-app-bar--short`,
    SHORT_COLLAPSED_CLASS: `mdc-top-app-bar--short-collapsed`,
    SHORT_HAS_ACTION_ITEM_CLASS: `mdc-top-app-bar--short-has-action-item`
  ): cssClasses = {
    val __obj = js.Dynamic.literal(FIXED_CLASS = FIXED_CLASS.asInstanceOf[js.Any], FIXED_SCROLLED_CLASS = FIXED_SCROLLED_CLASS.asInstanceOf[js.Any], SHORT_CLASS = SHORT_CLASS.asInstanceOf[js.Any], SHORT_COLLAPSED_CLASS = SHORT_COLLAPSED_CLASS.asInstanceOf[js.Any], SHORT_HAS_ACTION_ITEM_CLASS = SHORT_HAS_ACTION_ITEM_CLASS.asInstanceOf[js.Any])
    __obj.asInstanceOf[cssClasses]
  }
  @scala.inline
  implicit class cssClassesOps[Self <: cssClasses] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFIXED_CLASS(value: `mdc-top-app-bar--fixed`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FIXED_CLASS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFIXED_SCROLLED_CLASS(value: `mdc-top-app-bar--fixed-scrolled`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FIXED_SCROLLED_CLASS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSHORT_CLASS(value: `mdc-top-app-bar--short`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SHORT_CLASS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSHORT_COLLAPSED_CLASS(value: `mdc-top-app-bar--short-collapsed`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SHORT_COLLAPSED_CLASS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSHORT_HAS_ACTION_ITEM_CLASS(value: `mdc-top-app-bar--short-has-action-item`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SHORT_HAS_ACTION_ITEM_CLASS")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

