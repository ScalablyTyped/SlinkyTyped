package typingsSlinky.reapop.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait STATUS_TYPES extends js.Object {
  var default: DEFAULT_STATUS = js.native
  var error: ERROR_STATUS = js.native
  var info: INFO_STATUS = js.native
  var success: SUCCESS_STATUS = js.native
  var warning: WARNING_STATUS = js.native
}

object STATUS_TYPES {
  @scala.inline
  def apply(
    default: DEFAULT_STATUS,
    error: ERROR_STATUS,
    info: INFO_STATUS,
    success: SUCCESS_STATUS,
    warning: WARNING_STATUS
  ): STATUS_TYPES = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[STATUS_TYPES]
  }
  @scala.inline
  implicit class STATUS_TYPESOps[Self <: STATUS_TYPES] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefault(value: DEFAULT_STATUS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: ERROR_STATUS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfo(value: INFO_STATUS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccess(value: SUCCESS_STATUS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarning(value: WARNING_STATUS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

