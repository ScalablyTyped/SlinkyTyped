package typingsSlinky.angularForms.anon

import typingsSlinky.angularForms.angularFormsStrings.always
import typingsSlinky.angularForms.angularFormsStrings.never
import typingsSlinky.angularForms.angularFormsStrings.once
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WarnOnDeprecatedNgFormSelector extends js.Object {
  /** @deprecated as of v6 */ var warnOnDeprecatedNgFormSelector: js.UndefOr[never | once | always] = js.undefined
}

object WarnOnDeprecatedNgFormSelector {
  @scala.inline
  def apply(): WarnOnDeprecatedNgFormSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WarnOnDeprecatedNgFormSelector]
  }
  @scala.inline
  implicit class WarnOnDeprecatedNgFormSelectorOps[Self <: WarnOnDeprecatedNgFormSelector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setWarnOnDeprecatedNgFormSelector(value: never | once | always): Self = this.set("warnOnDeprecatedNgFormSelector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarnOnDeprecatedNgFormSelector: Self = this.set("warnOnDeprecatedNgFormSelector", js.undefined)
  }
  
}

