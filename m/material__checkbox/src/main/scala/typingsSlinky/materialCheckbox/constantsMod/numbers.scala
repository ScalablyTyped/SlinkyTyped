package typingsSlinky.materialCheckbox.constantsMod

import typingsSlinky.materialBase.foundationMod.MDCNumbers
import typingsSlinky.materialCheckbox.materialCheckboxNumbers.`250`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait numbers extends MDCNumbers {
  var ANIM_END_LATCH_MS: `250` = js.native
}

object numbers {
  @scala.inline
  def apply(ANIM_END_LATCH_MS: `250`): numbers = {
    val __obj = js.Dynamic.literal(ANIM_END_LATCH_MS = ANIM_END_LATCH_MS.asInstanceOf[js.Any])
    __obj.asInstanceOf[numbers]
  }
  @scala.inline
  implicit class numbersOps[Self <: numbers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withANIM_END_LATCH_MS(value: `250`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ANIM_END_LATCH_MS")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

