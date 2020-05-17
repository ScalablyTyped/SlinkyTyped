package typingsSlinky.adalAngular.anon

import typingsSlinky.adalAngular.adalAngularNumbers.`1`
import typingsSlinky.adalAngular.adalAngularNumbers.`2`
import typingsSlinky.adalAngular.adalAngularNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ERROR extends js.Object {
  var ERROR: typingsSlinky.adalAngular.adalAngularNumbers.`0` = js.native
  var INFO: `2` = js.native
  var VERBOSE: `3` = js.native
  var WARN: `1` = js.native
}

object ERROR {
  @scala.inline
  def apply(ERROR: typingsSlinky.adalAngular.adalAngularNumbers.`0`, INFO: `2`, VERBOSE: `3`, WARN: `1`): ERROR = {
    val __obj = js.Dynamic.literal(ERROR = ERROR.asInstanceOf[js.Any], INFO = INFO.asInstanceOf[js.Any], VERBOSE = VERBOSE.asInstanceOf[js.Any], WARN = WARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[ERROR]
  }
  @scala.inline
  implicit class ERROROps[Self <: ERROR] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withERROR(value: typingsSlinky.adalAngular.adalAngularNumbers.`0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withINFO(value: `2`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INFO")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVERBOSE(value: `3`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VERBOSE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWARN(value: `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WARN")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

