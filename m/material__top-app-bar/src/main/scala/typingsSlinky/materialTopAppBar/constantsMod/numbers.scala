package typingsSlinky.materialTopAppBar.constantsMod

import typingsSlinky.materialBase.foundationMod.MDCNumbers
import typingsSlinky.materialTopAppBar.materialTopAppBarNumbers.`100`
import typingsSlinky.materialTopAppBar.materialTopAppBarNumbers.`128`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait numbers extends MDCNumbers {
  var DEBOUNCE_THROTTLE_RESIZE_TIME_MS: `100` = js.native
  var MAX_TOP_APP_BAR_HEIGHT: `128` = js.native
}

object numbers {
  @scala.inline
  def apply(DEBOUNCE_THROTTLE_RESIZE_TIME_MS: `100`, MAX_TOP_APP_BAR_HEIGHT: `128`): numbers = {
    val __obj = js.Dynamic.literal(DEBOUNCE_THROTTLE_RESIZE_TIME_MS = DEBOUNCE_THROTTLE_RESIZE_TIME_MS.asInstanceOf[js.Any], MAX_TOP_APP_BAR_HEIGHT = MAX_TOP_APP_BAR_HEIGHT.asInstanceOf[js.Any])
    __obj.asInstanceOf[numbers]
  }
  @scala.inline
  implicit class numbersOps[Self <: numbers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDEBOUNCE_THROTTLE_RESIZE_TIME_MS(value: `100`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DEBOUNCE_THROTTLE_RESIZE_TIME_MS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMAX_TOP_APP_BAR_HEIGHT(value: `128`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MAX_TOP_APP_BAR_HEIGHT")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

