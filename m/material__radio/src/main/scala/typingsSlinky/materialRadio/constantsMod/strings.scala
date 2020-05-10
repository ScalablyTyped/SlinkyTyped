package typingsSlinky.materialRadio.constantsMod

import typingsSlinky.materialBase.foundationMod.MDCStrings
import typingsSlinky.materialRadio.materialRadioStrings.`Dotmdc-radio__native-control`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait strings extends MDCStrings {
  var NATIVE_CONTROL_SELECTOR: `Dotmdc-radio__native-control` = js.native
}

object strings {
  @scala.inline
  def apply(NATIVE_CONTROL_SELECTOR: `Dotmdc-radio__native-control`): strings = {
    val __obj = js.Dynamic.literal(NATIVE_CONTROL_SELECTOR = NATIVE_CONTROL_SELECTOR.asInstanceOf[js.Any])
    __obj.asInstanceOf[strings]
  }
  @scala.inline
  implicit class stringsOps[Self <: strings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNATIVE_CONTROL_SELECTOR(value: `Dotmdc-radio__native-control`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NATIVE_CONTROL_SELECTOR")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

