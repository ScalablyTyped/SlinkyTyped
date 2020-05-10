package typingsSlinky.reactToastify.mod

import typingsSlinky.reactToastify.reactToastifyStrings.default
import typingsSlinky.reactToastify.reactToastifyStrings.error
import typingsSlinky.reactToastify.reactToastifyStrings.info
import typingsSlinky.reactToastify.reactToastifyStrings.success
import typingsSlinky.reactToastify.reactToastifyStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Type extends js.Object {
  /**
    * Set notification type to `'default'`
    */
  var DEFAULT: default = js.native
  /**
    * Set notification type to `'error'`
    */
  var ERROR: error = js.native
  /**
    * Set notification type to `'info'`
    */
  var INFO: info = js.native
  /**
    * Set notification type to `'success'`
    */
  var SUCCESS: success = js.native
  /**
    * Set notification type to `'warning'`
    */
  var WARNING: warning = js.native
}

object Type {
  @scala.inline
  def apply(DEFAULT: default, ERROR: error, INFO: info, SUCCESS: success, WARNING: warning): Type = {
    val __obj = js.Dynamic.literal(DEFAULT = DEFAULT.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], INFO = INFO.asInstanceOf[js.Any], SUCCESS = SUCCESS.asInstanceOf[js.Any], WARNING = WARNING.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  @scala.inline
  implicit class TypeOps[Self <: Type] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDEFAULT(value: default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT")(value.asInstanceOf[js.Any])
        ret
    }
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
    @scala.inline
    def withWARNING(value: warning): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WARNING")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

