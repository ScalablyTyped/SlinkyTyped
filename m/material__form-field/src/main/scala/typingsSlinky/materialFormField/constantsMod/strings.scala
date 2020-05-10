package typingsSlinky.materialFormField.constantsMod

import typingsSlinky.materialBase.foundationMod.MDCStrings
import typingsSlinky.materialFormField.materialFormFieldStrings.`Dotmdc-form-field Greaterthansign label`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait strings extends MDCStrings {
  var LABEL_SELECTOR: `Dotmdc-form-field Greaterthansign label` = js.native
}

object strings {
  @scala.inline
  def apply(LABEL_SELECTOR: `Dotmdc-form-field Greaterthansign label`): strings = {
    val __obj = js.Dynamic.literal(LABEL_SELECTOR = LABEL_SELECTOR.asInstanceOf[js.Any])
    __obj.asInstanceOf[strings]
  }
  @scala.inline
  implicit class stringsOps[Self <: strings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLABEL_SELECTOR(value: `Dotmdc-form-field Greaterthansign label`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LABEL_SELECTOR")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

