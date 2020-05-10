package typingsSlinky.angularMaterial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCLICKOUTSIDE extends js.Object {
  var CLICK_OUTSIDE: String = js.native
  var ESCAPE: String = js.native
}

object AnonCLICKOUTSIDE {
  @scala.inline
  def apply(CLICK_OUTSIDE: String, ESCAPE: String): AnonCLICKOUTSIDE = {
    val __obj = js.Dynamic.literal(CLICK_OUTSIDE = CLICK_OUTSIDE.asInstanceOf[js.Any], ESCAPE = ESCAPE.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCLICKOUTSIDE]
  }
  @scala.inline
  implicit class AnonCLICKOUTSIDEOps[Self <: AnonCLICKOUTSIDE] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCLICK_OUTSIDE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CLICK_OUTSIDE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withESCAPE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ESCAPE")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

