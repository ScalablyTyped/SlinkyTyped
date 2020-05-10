package typingsSlinky.materialMenu.constantsMod

import typingsSlinky.materialBase.foundationMod.MDCNumbers
import typingsSlinky.materialMenu.materialMenuNumbers.`0`
import typingsSlinky.materialMenu.materialMenuNumbers.`12`
import typingsSlinky.materialMenu.materialMenuNumbers.`13`
import typingsSlinky.materialMenu.materialMenuNumbers.`1`
import typingsSlinky.materialMenu.materialMenuNumbers.`4`
import typingsSlinky.materialMenu.materialMenuNumbers.`5`
import typingsSlinky.materialMenu.materialMenuNumbers.`8`
import typingsSlinky.materialMenu.materialMenuNumbers.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Corner extends MDCNumbers {
  var BOTTOM_END: `13` = js.native
  var BOTTOM_LEFT: `1` = js.native
  var BOTTOM_RIGHT: `5` = js.native
  var BOTTOM_START: `9` = js.native
  var TOP_END: `12` = js.native
  var TOP_LEFT: `0` = js.native
  var TOP_RIGHT: `4` = js.native
  var TOP_START: `8` = js.native
}

object Corner {
  @scala.inline
  def apply(
    BOTTOM_END: `13`,
    BOTTOM_LEFT: `1`,
    BOTTOM_RIGHT: `5`,
    BOTTOM_START: `9`,
    TOP_END: `12`,
    TOP_LEFT: `0`,
    TOP_RIGHT: `4`,
    TOP_START: `8`
  ): Corner = {
    val __obj = js.Dynamic.literal(BOTTOM_END = BOTTOM_END.asInstanceOf[js.Any], BOTTOM_LEFT = BOTTOM_LEFT.asInstanceOf[js.Any], BOTTOM_RIGHT = BOTTOM_RIGHT.asInstanceOf[js.Any], BOTTOM_START = BOTTOM_START.asInstanceOf[js.Any], TOP_END = TOP_END.asInstanceOf[js.Any], TOP_LEFT = TOP_LEFT.asInstanceOf[js.Any], TOP_RIGHT = TOP_RIGHT.asInstanceOf[js.Any], TOP_START = TOP_START.asInstanceOf[js.Any])
    __obj.asInstanceOf[Corner]
  }
  @scala.inline
  implicit class CornerOps[Self <: Corner] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBOTTOM_END(value: `13`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BOTTOM_END")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBOTTOM_LEFT(value: `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BOTTOM_LEFT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBOTTOM_RIGHT(value: `5`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BOTTOM_RIGHT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBOTTOM_START(value: `9`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BOTTOM_START")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTOP_END(value: `12`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TOP_END")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTOP_LEFT(value: `0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TOP_LEFT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTOP_RIGHT(value: `4`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TOP_RIGHT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTOP_START(value: `8`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TOP_START")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

