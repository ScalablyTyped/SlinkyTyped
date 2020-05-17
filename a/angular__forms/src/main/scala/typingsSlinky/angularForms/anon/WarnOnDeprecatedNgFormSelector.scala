package typingsSlinky.angularForms.anon

import typingsSlinky.angularForms.angularFormsStrings.always
import typingsSlinky.angularForms.angularFormsStrings.never
import typingsSlinky.angularForms.angularFormsStrings.once
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WarnOnDeprecatedNgFormSelector extends js.Object {
  /** @deprecated as of v6 */ var warnOnDeprecatedNgFormSelector: js.UndefOr[never | once | always] = js.native
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
    def withWarnOnDeprecatedNgFormSelector(value: never | once | always): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnOnDeprecatedNgFormSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarnOnDeprecatedNgFormSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnOnDeprecatedNgFormSelector")(js.undefined)
        ret
    }
  }
  
}

