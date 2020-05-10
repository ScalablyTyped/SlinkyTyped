package typingsSlinky.angularForms

import typingsSlinky.angularForms.angularFormsStrings.always
import typingsSlinky.angularForms.angularFormsStrings.never
import typingsSlinky.angularForms.angularFormsStrings.once
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonWarnOnNgModelWithFormControl extends js.Object {
  /** @deprecated as of v6 */ var warnOnNgModelWithFormControl: never | once | always = js.native
}

object AnonWarnOnNgModelWithFormControl {
  @scala.inline
  def apply(warnOnNgModelWithFormControl: never | once | always): AnonWarnOnNgModelWithFormControl = {
    val __obj = js.Dynamic.literal(warnOnNgModelWithFormControl = warnOnNgModelWithFormControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWarnOnNgModelWithFormControl]
  }
  @scala.inline
  implicit class AnonWarnOnNgModelWithFormControlOps[Self <: AnonWarnOnNgModelWithFormControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWarnOnNgModelWithFormControl(value: never | once | always): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnOnNgModelWithFormControl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

