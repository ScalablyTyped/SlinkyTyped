package typingsSlinky.reactNativeEasyUpgrade

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonVERSIONCODE extends js.Object {
  var VERSION_CODE: String = js.native
  var VERSION_NAME: String = js.native
}

object AnonVERSIONCODE {
  @scala.inline
  def apply(VERSION_CODE: String, VERSION_NAME: String): AnonVERSIONCODE = {
    val __obj = js.Dynamic.literal(VERSION_CODE = VERSION_CODE.asInstanceOf[js.Any], VERSION_NAME = VERSION_NAME.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonVERSIONCODE]
  }
  @scala.inline
  implicit class AnonVERSIONCODEOps[Self <: AnonVERSIONCODE] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVERSION_CODE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VERSION_CODE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVERSION_NAME(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VERSION_NAME")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

