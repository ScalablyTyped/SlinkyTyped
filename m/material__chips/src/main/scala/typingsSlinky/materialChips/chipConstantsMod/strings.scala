package typingsSlinky.materialChips.chipConstantsMod

import typingsSlinky.materialBase.foundationMod.MDCStrings
import typingsSlinky.materialChips.materialChipsStrings.MDCChipColoninteraction
import typingsSlinky.materialChips.materialChipsStrings.MDCChipColonremoval
import typingsSlinky.materialChips.materialChipsStrings.MDCChipColontrailingIconInteraction
import typingsSlinky.materialChips.materialChipsStrings.`Dotmdc-chip__checkmark`
import typingsSlinky.materialChips.materialChipsStrings.`Dotmdc-chip__icon--leading`
import typingsSlinky.materialChips.materialChipsStrings.`Dotmdc-chip__icon--trailing`
import typingsSlinky.materialChips.materialChipsStrings.`mdc-chip-entry`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait strings extends MDCStrings {
  var CHECKMARK_SELECTOR: `Dotmdc-chip__checkmark` = js.native
  var ENTRY_ANIMATION_NAME: `mdc-chip-entry` = js.native
  var INTERACTION_EVENT: MDCChipColoninteraction = js.native
  var LEADING_ICON_SELECTOR: `Dotmdc-chip__icon--leading` = js.native
  var REMOVAL_EVENT: MDCChipColonremoval = js.native
  var TRAILING_ICON_INTERACTION_EVENT: MDCChipColontrailingIconInteraction = js.native
  var TRAILING_ICON_SELECTOR: `Dotmdc-chip__icon--trailing` = js.native
}

object strings {
  @scala.inline
  def apply(
    CHECKMARK_SELECTOR: `Dotmdc-chip__checkmark`,
    ENTRY_ANIMATION_NAME: `mdc-chip-entry`,
    INTERACTION_EVENT: MDCChipColoninteraction,
    LEADING_ICON_SELECTOR: `Dotmdc-chip__icon--leading`,
    REMOVAL_EVENT: MDCChipColonremoval,
    TRAILING_ICON_INTERACTION_EVENT: MDCChipColontrailingIconInteraction,
    TRAILING_ICON_SELECTOR: `Dotmdc-chip__icon--trailing`
  ): strings = {
    val __obj = js.Dynamic.literal(CHECKMARK_SELECTOR = CHECKMARK_SELECTOR.asInstanceOf[js.Any], ENTRY_ANIMATION_NAME = ENTRY_ANIMATION_NAME.asInstanceOf[js.Any], INTERACTION_EVENT = INTERACTION_EVENT.asInstanceOf[js.Any], LEADING_ICON_SELECTOR = LEADING_ICON_SELECTOR.asInstanceOf[js.Any], REMOVAL_EVENT = REMOVAL_EVENT.asInstanceOf[js.Any], TRAILING_ICON_INTERACTION_EVENT = TRAILING_ICON_INTERACTION_EVENT.asInstanceOf[js.Any], TRAILING_ICON_SELECTOR = TRAILING_ICON_SELECTOR.asInstanceOf[js.Any])
    __obj.asInstanceOf[strings]
  }
  @scala.inline
  implicit class stringsOps[Self <: strings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCHECKMARK_SELECTOR(value: `Dotmdc-chip__checkmark`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CHECKMARK_SELECTOR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withENTRY_ANIMATION_NAME(value: `mdc-chip-entry`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ENTRY_ANIMATION_NAME")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withINTERACTION_EVENT(value: MDCChipColoninteraction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INTERACTION_EVENT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLEADING_ICON_SELECTOR(value: `Dotmdc-chip__icon--leading`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LEADING_ICON_SELECTOR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withREMOVAL_EVENT(value: MDCChipColonremoval): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("REMOVAL_EVENT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTRAILING_ICON_INTERACTION_EVENT(value: MDCChipColontrailingIconInteraction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TRAILING_ICON_INTERACTION_EVENT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTRAILING_ICON_SELECTOR(value: `Dotmdc-chip__icon--trailing`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TRAILING_ICON_SELECTOR")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

