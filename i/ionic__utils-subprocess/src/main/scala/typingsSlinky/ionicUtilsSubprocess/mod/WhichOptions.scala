package typingsSlinky.ionicUtilsSubprocess.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WhichOptions extends js.Object {
  var PATH: js.UndefOr[String] = js.native
  var PATHEXT: js.UndefOr[String] = js.native
}

object WhichOptions {
  @scala.inline
  def apply(): WhichOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WhichOptions]
  }
  @scala.inline
  implicit class WhichOptionsOps[Self <: WhichOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPATH(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PATH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPATH: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PATH")(js.undefined)
        ret
    }
    @scala.inline
    def withPATHEXT(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PATHEXT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPATHEXT: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PATHEXT")(js.undefined)
        ret
    }
  }
  
}

