package typingsSlinky.materialChips.chipConstantsMod

import typingsSlinky.materialBase.foundationMod.MDCStrings
import typingsSlinky.materialChips.materialChipsStrings.`mdc-chip--exit`
import typingsSlinky.materialChips.materialChipsStrings.`mdc-chip--selected`
import typingsSlinky.materialChips.materialChipsStrings.`mdc-chip__checkmark`
import typingsSlinky.materialChips.materialChipsStrings.`mdc-chip__icon--leading-hidden`
import typingsSlinky.materialChips.materialChipsStrings.`mdc-chip__icon--leading`
import typingsSlinky.materialChips.materialChipsStrings.`mdc-chip__icon--trailing`
import typingsSlinky.materialChips.materialChipsStrings.`mdc-chip__text`
import typingsSlinky.materialChips.materialChipsStrings.`mdc-chip`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait cssClasses extends MDCStrings {
  var CHECKMARK: `mdc-chip__checkmark` = js.native
  var CHIP: `mdc-chip` = js.native
  var CHIP_EXIT: `mdc-chip--exit` = js.native
  var HIDDEN_LEADING_ICON: `mdc-chip__icon--leading-hidden` = js.native
  var LEADING_ICON: `mdc-chip__icon--leading` = js.native
  var SELECTED: `mdc-chip--selected` = js.native
  var TEXT: `mdc-chip__text` = js.native
  var TRAILING_ICON: `mdc-chip__icon--trailing` = js.native
}

object cssClasses {
  @scala.inline
  def apply(
    CHECKMARK: `mdc-chip__checkmark`,
    CHIP: `mdc-chip`,
    CHIP_EXIT: `mdc-chip--exit`,
    HIDDEN_LEADING_ICON: `mdc-chip__icon--leading-hidden`,
    LEADING_ICON: `mdc-chip__icon--leading`,
    SELECTED: `mdc-chip--selected`,
    TEXT: `mdc-chip__text`,
    TRAILING_ICON: `mdc-chip__icon--trailing`
  ): cssClasses = {
    val __obj = js.Dynamic.literal(CHECKMARK = CHECKMARK.asInstanceOf[js.Any], CHIP = CHIP.asInstanceOf[js.Any], CHIP_EXIT = CHIP_EXIT.asInstanceOf[js.Any], HIDDEN_LEADING_ICON = HIDDEN_LEADING_ICON.asInstanceOf[js.Any], LEADING_ICON = LEADING_ICON.asInstanceOf[js.Any], SELECTED = SELECTED.asInstanceOf[js.Any], TEXT = TEXT.asInstanceOf[js.Any], TRAILING_ICON = TRAILING_ICON.asInstanceOf[js.Any])
    __obj.asInstanceOf[cssClasses]
  }
  @scala.inline
  implicit class cssClassesOps[Self <: cssClasses] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCHECKMARK(value: `mdc-chip__checkmark`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CHECKMARK")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCHIP(value: `mdc-chip`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CHIP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCHIP_EXIT(value: `mdc-chip--exit`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CHIP_EXIT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHIDDEN_LEADING_ICON(value: `mdc-chip__icon--leading-hidden`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HIDDEN_LEADING_ICON")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLEADING_ICON(value: `mdc-chip__icon--leading`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LEADING_ICON")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSELECTED(value: `mdc-chip--selected`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SELECTED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTEXT(value: `mdc-chip__text`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TEXT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTRAILING_ICON(value: `mdc-chip__icon--trailing`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TRAILING_ICON")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

