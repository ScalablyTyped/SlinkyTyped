package typingsSlinky.materialSelect.constantsMod

import typingsSlinky.materialBase.foundationMod.MDCStrings
import typingsSlinky.materialSelect.materialSelectStrings.MDCSelectColonchange
import typingsSlinky.materialSelect.materialSelectStrings.`Dotmdc-floating-label`
import typingsSlinky.materialSelect.materialSelectStrings.`Dotmdc-line-ripple`
import typingsSlinky.materialSelect.materialSelectStrings.`Dotmdc-select__native-control`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait strings extends MDCStrings {
  var CHANGE_EVENT: MDCSelectColonchange = js.native
  var LABEL_SELECTOR: `Dotmdc-floating-label` = js.native
  var LINE_RIPPLE_SELECTOR: `Dotmdc-line-ripple` = js.native
  var NATIVE_CONTROL_SELECTOR: `Dotmdc-select__native-control` = js.native
}

object strings {
  @scala.inline
  def apply(
    CHANGE_EVENT: MDCSelectColonchange,
    LABEL_SELECTOR: `Dotmdc-floating-label`,
    LINE_RIPPLE_SELECTOR: `Dotmdc-line-ripple`,
    NATIVE_CONTROL_SELECTOR: `Dotmdc-select__native-control`
  ): strings = {
    val __obj = js.Dynamic.literal(CHANGE_EVENT = CHANGE_EVENT.asInstanceOf[js.Any], LABEL_SELECTOR = LABEL_SELECTOR.asInstanceOf[js.Any], LINE_RIPPLE_SELECTOR = LINE_RIPPLE_SELECTOR.asInstanceOf[js.Any], NATIVE_CONTROL_SELECTOR = NATIVE_CONTROL_SELECTOR.asInstanceOf[js.Any])
    __obj.asInstanceOf[strings]
  }
  @scala.inline
  implicit class stringsOps[Self <: strings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCHANGE_EVENT(value: MDCSelectColonchange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CHANGE_EVENT")(value.asInstanceOf[js.Any])
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
    def withNATIVE_CONTROL_SELECTOR(value: `Dotmdc-select__native-control`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NATIVE_CONTROL_SELECTOR")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

