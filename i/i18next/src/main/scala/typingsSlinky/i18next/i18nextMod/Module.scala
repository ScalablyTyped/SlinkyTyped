package typingsSlinky.i18next.i18nextMod

import typingsSlinky.i18next.i18nextStrings.`3rdParty`
import typingsSlinky.i18next.i18nextStrings.backend
import typingsSlinky.i18next.i18nextStrings.i18nFormat
import typingsSlinky.i18next.i18nextStrings.languageDetector
import typingsSlinky.i18next.i18nextStrings.logger
import typingsSlinky.i18next.i18nextStrings.postProcessor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Module extends js.Object {
  var `type`: backend | logger | languageDetector | postProcessor | i18nFormat | `3rdParty`
}

object Module {
  @scala.inline
  def apply(`type`: backend | logger | languageDetector | postProcessor | i18nFormat | `3rdParty`): Module = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Module]
  }
}

