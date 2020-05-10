package typingsSlinky.materialMenu.constantsMod

import typingsSlinky.materialBase.foundationMod.MDCNumbers
import typingsSlinky.materialMenu.materialMenuNumbers.`1`
import typingsSlinky.materialMenu.materialMenuNumbers.`2`
import typingsSlinky.materialMenu.materialMenuNumbers.`4`
import typingsSlinky.materialMenu.materialMenuNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CornerBit extends MDCNumbers {
  var BOTTOM: `1` = js.native
  var CENTER: `2` = js.native
  var FLIP_RTL: `8` = js.native
  var RIGHT: `4` = js.native
}

object CornerBit {
  @scala.inline
  def apply(BOTTOM: `1`, CENTER: `2`, FLIP_RTL: `8`, RIGHT: `4`): CornerBit = {
    val __obj = js.Dynamic.literal(BOTTOM = BOTTOM.asInstanceOf[js.Any], CENTER = CENTER.asInstanceOf[js.Any], FLIP_RTL = FLIP_RTL.asInstanceOf[js.Any], RIGHT = RIGHT.asInstanceOf[js.Any])
    __obj.asInstanceOf[CornerBit]
  }
  @scala.inline
  implicit class CornerBitOps[Self <: CornerBit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBOTTOM(value: `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BOTTOM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCENTER(value: `2`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CENTER")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFLIP_RTL(value: `8`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FLIP_RTL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRIGHT(value: `4`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RIGHT")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

