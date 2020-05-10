package typingsSlinky.reactAlert.mod

import typingsSlinky.reactAlert.reactAlertStrings.error
import typingsSlinky.reactAlert.reactAlertStrings.info
import typingsSlinky.reactAlert.reactAlertStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Types_ extends js.Object {
  var ERROR: error = js.native
  var INFO: info = js.native
  var SUCCESS: success = js.native
}

object Types_ {
  @scala.inline
  def apply(ERROR: error, INFO: info, SUCCESS: success): Types_ = {
    val __obj = js.Dynamic.literal(ERROR = ERROR.asInstanceOf[js.Any], INFO = INFO.asInstanceOf[js.Any], SUCCESS = SUCCESS.asInstanceOf[js.Any])
    __obj.asInstanceOf[Types_]
  }
  @scala.inline
  implicit class Types_Ops[Self <: Types_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withERROR(value: error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withINFO(value: info): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INFO")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSUCCESS(value: success): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SUCCESS")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

