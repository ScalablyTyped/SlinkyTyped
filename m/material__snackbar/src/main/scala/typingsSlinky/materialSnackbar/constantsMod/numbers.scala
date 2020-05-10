package typingsSlinky.materialSnackbar.constantsMod

import typingsSlinky.materialBase.foundationMod.MDCNumbers
import typingsSlinky.materialSnackbar.materialSnackbarNumbers.`2750`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait numbers extends MDCNumbers {
  var MESSAGE_TIMEOUT: `2750` = js.native
}

object numbers {
  @scala.inline
  def apply(MESSAGE_TIMEOUT: `2750`): numbers = {
    val __obj = js.Dynamic.literal(MESSAGE_TIMEOUT = MESSAGE_TIMEOUT.asInstanceOf[js.Any])
    __obj.asInstanceOf[numbers]
  }
  @scala.inline
  implicit class numbersOps[Self <: numbers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMESSAGE_TIMEOUT(value: `2750`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MESSAGE_TIMEOUT")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

