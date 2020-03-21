package typingsSlinky.angularForms

import typingsSlinky.angularForms.angularFormsStrings.always
import typingsSlinky.angularForms.angularFormsStrings.never
import typingsSlinky.angularForms.angularFormsStrings.once
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWarnOnDeprecatedNgFormSelector extends js.Object {
  /** @deprecated as of v6 */ var warnOnDeprecatedNgFormSelector: js.UndefOr[never | once | always] = js.undefined
}

object AnonWarnOnDeprecatedNgFormSelector {
  @scala.inline
  def apply(warnOnDeprecatedNgFormSelector: never | once | always = null): AnonWarnOnDeprecatedNgFormSelector = {
    val __obj = js.Dynamic.literal()
    if (warnOnDeprecatedNgFormSelector != null) __obj.updateDynamic("warnOnDeprecatedNgFormSelector")(warnOnDeprecatedNgFormSelector.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWarnOnDeprecatedNgFormSelector]
  }
}

