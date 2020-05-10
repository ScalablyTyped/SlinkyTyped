package typingsSlinky.juiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMozilla extends js.Object {
  /** Mozilla 브라우저 체크 */
  var mozilla: Boolean = js.native
  /** IE 브라우저 체크 */
  var msie: Boolean = js.native
  /** Webkit 브라우저 체크 */
  var webkit: Boolean = js.native
}

object AnonMozilla {
  @scala.inline
  def apply(mozilla: Boolean, msie: Boolean, webkit: Boolean): AnonMozilla = {
    val __obj = js.Dynamic.literal(mozilla = mozilla.asInstanceOf[js.Any], msie = msie.asInstanceOf[js.Any], webkit = webkit.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMozilla]
  }
  @scala.inline
  implicit class AnonMozillaOps[Self <: AnonMozilla] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMozilla(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mozilla")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMsie(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebkit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webkit")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

