package typingsSlinky.materialToolbar.constantsMod

import typingsSlinky.materialBase.foundationMod.MDCNumbers
import typingsSlinky.materialToolbar.materialToolbarNumbers.`1.25`
import typingsSlinky.materialToolbar.materialToolbarNumbers.`2.125`
import typingsSlinky.materialToolbar.materialToolbarNumbers.`56`
import typingsSlinky.materialToolbar.materialToolbarNumbers.`600`
import typingsSlinky.materialToolbar.materialToolbarNumbers.`64`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait numbers extends MDCNumbers {
  var MAX_TITLE_SIZE: `2.125` = js.native
  var MIN_TITLE_SIZE: `1.25` = js.native
  var TOOLBAR_MOBILE_BREAKPOINT: `600` = js.native
  var TOOLBAR_ROW_HEIGHT: `64` = js.native
  var TOOLBAR_ROW_MOBILE_HEIGHT: `56` = js.native
}

object numbers {
  @scala.inline
  def apply(
    MAX_TITLE_SIZE: `2.125`,
    MIN_TITLE_SIZE: `1.25`,
    TOOLBAR_MOBILE_BREAKPOINT: `600`,
    TOOLBAR_ROW_HEIGHT: `64`,
    TOOLBAR_ROW_MOBILE_HEIGHT: `56`
  ): numbers = {
    val __obj = js.Dynamic.literal(MAX_TITLE_SIZE = MAX_TITLE_SIZE.asInstanceOf[js.Any], MIN_TITLE_SIZE = MIN_TITLE_SIZE.asInstanceOf[js.Any], TOOLBAR_MOBILE_BREAKPOINT = TOOLBAR_MOBILE_BREAKPOINT.asInstanceOf[js.Any], TOOLBAR_ROW_HEIGHT = TOOLBAR_ROW_HEIGHT.asInstanceOf[js.Any], TOOLBAR_ROW_MOBILE_HEIGHT = TOOLBAR_ROW_MOBILE_HEIGHT.asInstanceOf[js.Any])
    __obj.asInstanceOf[numbers]
  }
  @scala.inline
  implicit class numbersOps[Self <: numbers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMAX_TITLE_SIZE(value: `2.125`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MAX_TITLE_SIZE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMIN_TITLE_SIZE(value: `1.25`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MIN_TITLE_SIZE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTOOLBAR_MOBILE_BREAKPOINT(value: `600`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TOOLBAR_MOBILE_BREAKPOINT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTOOLBAR_ROW_HEIGHT(value: `64`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TOOLBAR_ROW_HEIGHT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTOOLBAR_ROW_MOBILE_HEIGHT(value: `56`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TOOLBAR_ROW_MOBILE_HEIGHT")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

