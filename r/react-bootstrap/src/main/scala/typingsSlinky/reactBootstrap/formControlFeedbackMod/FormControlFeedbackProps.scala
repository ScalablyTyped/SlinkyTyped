package typingsSlinky.reactBootstrap.formControlFeedbackMod

import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormControlFeedbackProps
  extends AllHTMLAttributes[FormControlFeedback]
     with ClassAttributes[FormControlFeedback] {
  var bsClass: js.UndefOr[String] = js.native
}

object FormControlFeedbackProps {
  @scala.inline
  def apply(): FormControlFeedbackProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormControlFeedbackProps]
  }
  @scala.inline
  implicit class FormControlFeedbackPropsOps[Self <: FormControlFeedbackProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBsClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bsClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBsClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bsClass")(js.undefined)
        ret
    }
  }
  
}

