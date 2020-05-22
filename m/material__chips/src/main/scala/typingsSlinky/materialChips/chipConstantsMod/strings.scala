package typingsSlinky.materialChips.chipConstantsMod

import org.scalablytyped.runtime.StringDictionary
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

trait strings extends MDCStrings {
  var CHECKMARK_SELECTOR: `Dotmdc-chip__checkmark`
  var ENTRY_ANIMATION_NAME: `mdc-chip-entry`
  var INTERACTION_EVENT: MDCChipColoninteraction
  var LEADING_ICON_SELECTOR: `Dotmdc-chip__icon--leading`
  var REMOVAL_EVENT: MDCChipColonremoval
  var TRAILING_ICON_INTERACTION_EVENT: MDCChipColontrailingIconInteraction
  var TRAILING_ICON_SELECTOR: `Dotmdc-chip__icon--trailing`
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
    TRAILING_ICON_SELECTOR: `Dotmdc-chip__icon--trailing`,
    StringDictionary: StringDictionary[String] = null
  ): strings = {
    val __obj = js.Dynamic.literal(CHECKMARK_SELECTOR = CHECKMARK_SELECTOR.asInstanceOf[js.Any], ENTRY_ANIMATION_NAME = ENTRY_ANIMATION_NAME.asInstanceOf[js.Any], INTERACTION_EVENT = INTERACTION_EVENT.asInstanceOf[js.Any], LEADING_ICON_SELECTOR = LEADING_ICON_SELECTOR.asInstanceOf[js.Any], REMOVAL_EVENT = REMOVAL_EVENT.asInstanceOf[js.Any], TRAILING_ICON_INTERACTION_EVENT = TRAILING_ICON_INTERACTION_EVENT.asInstanceOf[js.Any], TRAILING_ICON_SELECTOR = TRAILING_ICON_SELECTOR.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[strings]
  }
}

