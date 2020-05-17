package typingsSlinky.materialTabBar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ARROWLEFTKEYCODE extends js.Object {
  var ARROW_LEFT_KEYCODE: Double = js.native
  var ARROW_RIGHT_KEYCODE: Double = js.native
  var END_KEYCODE: Double = js.native
  var ENTER_KEYCODE: Double = js.native
  var EXTRA_SCROLL_AMOUNT: Double = js.native
  var HOME_KEYCODE: Double = js.native
  var SPACE_KEYCODE: Double = js.native
}

object ARROWLEFTKEYCODE {
  @scala.inline
  def apply(
    ARROW_LEFT_KEYCODE: Double,
    ARROW_RIGHT_KEYCODE: Double,
    END_KEYCODE: Double,
    ENTER_KEYCODE: Double,
    EXTRA_SCROLL_AMOUNT: Double,
    HOME_KEYCODE: Double,
    SPACE_KEYCODE: Double
  ): ARROWLEFTKEYCODE = {
    val __obj = js.Dynamic.literal(ARROW_LEFT_KEYCODE = ARROW_LEFT_KEYCODE.asInstanceOf[js.Any], ARROW_RIGHT_KEYCODE = ARROW_RIGHT_KEYCODE.asInstanceOf[js.Any], END_KEYCODE = END_KEYCODE.asInstanceOf[js.Any], ENTER_KEYCODE = ENTER_KEYCODE.asInstanceOf[js.Any], EXTRA_SCROLL_AMOUNT = EXTRA_SCROLL_AMOUNT.asInstanceOf[js.Any], HOME_KEYCODE = HOME_KEYCODE.asInstanceOf[js.Any], SPACE_KEYCODE = SPACE_KEYCODE.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARROWLEFTKEYCODE]
  }
  @scala.inline
  implicit class ARROWLEFTKEYCODEOps[Self <: ARROWLEFTKEYCODE] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withARROW_LEFT_KEYCODE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ARROW_LEFT_KEYCODE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withARROW_RIGHT_KEYCODE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ARROW_RIGHT_KEYCODE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEND_KEYCODE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("END_KEYCODE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withENTER_KEYCODE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ENTER_KEYCODE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEXTRA_SCROLL_AMOUNT(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EXTRA_SCROLL_AMOUNT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHOME_KEYCODE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HOME_KEYCODE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSPACE_KEYCODE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SPACE_KEYCODE")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

