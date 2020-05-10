package typingsSlinky.materialFloatingLabel.constantsMod

import typingsSlinky.materialBase.foundationMod.MDCStrings
import typingsSlinky.materialFloatingLabel.materialFloatingLabelStrings.`mdc-floating-label--float-above`
import typingsSlinky.materialFloatingLabel.materialFloatingLabelStrings.`mdc-floating-label--shake`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait cssClasses extends MDCStrings {
  var LABEL_FLOAT_ABOVE: `mdc-floating-label--float-above` = js.native
  var LABEL_SHAKE: `mdc-floating-label--shake` = js.native
}

object cssClasses {
  @scala.inline
  def apply(LABEL_FLOAT_ABOVE: `mdc-floating-label--float-above`, LABEL_SHAKE: `mdc-floating-label--shake`): cssClasses = {
    val __obj = js.Dynamic.literal(LABEL_FLOAT_ABOVE = LABEL_FLOAT_ABOVE.asInstanceOf[js.Any], LABEL_SHAKE = LABEL_SHAKE.asInstanceOf[js.Any])
    __obj.asInstanceOf[cssClasses]
  }
  @scala.inline
  implicit class cssClassesOps[Self <: cssClasses] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLABEL_FLOAT_ABOVE(value: `mdc-floating-label--float-above`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LABEL_FLOAT_ABOVE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLABEL_SHAKE(value: `mdc-floating-label--shake`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LABEL_SHAKE")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

