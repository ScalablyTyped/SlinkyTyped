package typingsSlinky.materialToolbar.constantsMod

import typingsSlinky.materialBase.foundationMod.MDCStrings
import typingsSlinky.materialToolbar.materialToolbarStrings.`mdc-toolbar--fixed-at-last-row`
import typingsSlinky.materialToolbar.materialToolbarStrings.`mdc-toolbar--fixed-lastrow-only`
import typingsSlinky.materialToolbar.materialToolbarStrings.`mdc-toolbar--fixed`
import typingsSlinky.materialToolbar.materialToolbarStrings.`mdc-toolbar--flexible-default-behavior`
import typingsSlinky.materialToolbar.materialToolbarStrings.`mdc-toolbar--flexible-space-maximized`
import typingsSlinky.materialToolbar.materialToolbarStrings.`mdc-toolbar--flexible-space-minimized`
import typingsSlinky.materialToolbar.materialToolbarStrings.`mdc-toolbar--flexible`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait cssClasses extends MDCStrings {
  var FIXED: `mdc-toolbar--fixed` = js.native
  var FIXED_AT_LAST_ROW: `mdc-toolbar--fixed-at-last-row` = js.native
  var FIXED_LASTROW: `mdc-toolbar--fixed-lastrow-only` = js.native
  var FLEXIBLE_DEFAULT_BEHAVIOR: `mdc-toolbar--flexible-default-behavior` = js.native
  var FLEXIBLE_MAX: `mdc-toolbar--flexible-space-maximized` = js.native
  var FLEXIBLE_MIN: `mdc-toolbar--flexible-space-minimized` = js.native
  var TOOLBAR_ROW_FLEXIBLE: `mdc-toolbar--flexible` = js.native
}

object cssClasses {
  @scala.inline
  def apply(
    FIXED: `mdc-toolbar--fixed`,
    FIXED_AT_LAST_ROW: `mdc-toolbar--fixed-at-last-row`,
    FIXED_LASTROW: `mdc-toolbar--fixed-lastrow-only`,
    FLEXIBLE_DEFAULT_BEHAVIOR: `mdc-toolbar--flexible-default-behavior`,
    FLEXIBLE_MAX: `mdc-toolbar--flexible-space-maximized`,
    FLEXIBLE_MIN: `mdc-toolbar--flexible-space-minimized`,
    TOOLBAR_ROW_FLEXIBLE: `mdc-toolbar--flexible`
  ): cssClasses = {
    val __obj = js.Dynamic.literal(FIXED = FIXED.asInstanceOf[js.Any], FIXED_AT_LAST_ROW = FIXED_AT_LAST_ROW.asInstanceOf[js.Any], FIXED_LASTROW = FIXED_LASTROW.asInstanceOf[js.Any], FLEXIBLE_DEFAULT_BEHAVIOR = FLEXIBLE_DEFAULT_BEHAVIOR.asInstanceOf[js.Any], FLEXIBLE_MAX = FLEXIBLE_MAX.asInstanceOf[js.Any], FLEXIBLE_MIN = FLEXIBLE_MIN.asInstanceOf[js.Any], TOOLBAR_ROW_FLEXIBLE = TOOLBAR_ROW_FLEXIBLE.asInstanceOf[js.Any])
    __obj.asInstanceOf[cssClasses]
  }
  @scala.inline
  implicit class cssClassesOps[Self <: cssClasses] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFIXED(value: `mdc-toolbar--fixed`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FIXED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFIXED_AT_LAST_ROW(value: `mdc-toolbar--fixed-at-last-row`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FIXED_AT_LAST_ROW")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFIXED_LASTROW(value: `mdc-toolbar--fixed-lastrow-only`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FIXED_LASTROW")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFLEXIBLE_DEFAULT_BEHAVIOR(value: `mdc-toolbar--flexible-default-behavior`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FLEXIBLE_DEFAULT_BEHAVIOR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFLEXIBLE_MAX(value: `mdc-toolbar--flexible-space-maximized`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FLEXIBLE_MAX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFLEXIBLE_MIN(value: `mdc-toolbar--flexible-space-minimized`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FLEXIBLE_MIN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTOOLBAR_ROW_FLEXIBLE(value: `mdc-toolbar--flexible`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TOOLBAR_ROW_FLEXIBLE")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

