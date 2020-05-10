package typingsSlinky.materialTextfield.constantsMod

import typingsSlinky.materialBase.foundationMod.MDCStrings
import typingsSlinky.materialTextfield.materialTextfieldStrings.`Dotmdc-floating-label`
import typingsSlinky.materialTextfield.materialTextfieldStrings.`Dotmdc-line-ripple`
import typingsSlinky.materialTextfield.materialTextfieldStrings.`Dotmdc-notched-outline`
import typingsSlinky.materialTextfield.materialTextfieldStrings.`Dotmdc-text-field__icon`
import typingsSlinky.materialTextfield.materialTextfieldStrings.`Dotmdc-text-field__input`
import typingsSlinky.materialTextfield.materialTextfieldStrings.`aria-controls`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait strings extends MDCStrings {
  var ARIA_CONTROLS: `aria-controls` = js.native
  var ICON_SELECTOR: `Dotmdc-text-field__icon` = js.native
  var INPUT_SELECTOR: `Dotmdc-text-field__input` = js.native
  var LABEL_SELECTOR: `Dotmdc-floating-label` = js.native
  var LINE_RIPPLE_SELECTOR: `Dotmdc-line-ripple` = js.native
  var OUTLINE_SELECTOR: `Dotmdc-notched-outline` = js.native
}

object strings {
  @scala.inline
  def apply(
    ARIA_CONTROLS: `aria-controls`,
    ICON_SELECTOR: `Dotmdc-text-field__icon`,
    INPUT_SELECTOR: `Dotmdc-text-field__input`,
    LABEL_SELECTOR: `Dotmdc-floating-label`,
    LINE_RIPPLE_SELECTOR: `Dotmdc-line-ripple`,
    OUTLINE_SELECTOR: `Dotmdc-notched-outline`
  ): strings = {
    val __obj = js.Dynamic.literal(ARIA_CONTROLS = ARIA_CONTROLS.asInstanceOf[js.Any], ICON_SELECTOR = ICON_SELECTOR.asInstanceOf[js.Any], INPUT_SELECTOR = INPUT_SELECTOR.asInstanceOf[js.Any], LABEL_SELECTOR = LABEL_SELECTOR.asInstanceOf[js.Any], LINE_RIPPLE_SELECTOR = LINE_RIPPLE_SELECTOR.asInstanceOf[js.Any], OUTLINE_SELECTOR = OUTLINE_SELECTOR.asInstanceOf[js.Any])
    __obj.asInstanceOf[strings]
  }
  @scala.inline
  implicit class stringsOps[Self <: strings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withARIA_CONTROLS(value: `aria-controls`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ARIA_CONTROLS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withICON_SELECTOR(value: `Dotmdc-text-field__icon`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ICON_SELECTOR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withINPUT_SELECTOR(value: `Dotmdc-text-field__input`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INPUT_SELECTOR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLABEL_SELECTOR(value: `Dotmdc-floating-label`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LABEL_SELECTOR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLINE_RIPPLE_SELECTOR(value: `Dotmdc-line-ripple`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LINE_RIPPLE_SELECTOR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOUTLINE_SELECTOR(value: `Dotmdc-notched-outline`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OUTLINE_SELECTOR")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

