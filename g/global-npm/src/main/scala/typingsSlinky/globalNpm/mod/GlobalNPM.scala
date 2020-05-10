package typingsSlinky.globalNpm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalNPM extends js.Object {
  var GLOBAL_NPM_BIN: String = js.native
  var GLOBAL_NPM_PATH: String = js.native
}

object GlobalNPM {
  @scala.inline
  def apply(GLOBAL_NPM_BIN: String, GLOBAL_NPM_PATH: String): GlobalNPM = {
    val __obj = js.Dynamic.literal(GLOBAL_NPM_BIN = GLOBAL_NPM_BIN.asInstanceOf[js.Any], GLOBAL_NPM_PATH = GLOBAL_NPM_PATH.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalNPM]
  }
  @scala.inline
  implicit class GlobalNPMOps[Self <: GlobalNPM] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGLOBAL_NPM_BIN(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GLOBAL_NPM_BIN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGLOBAL_NPM_PATH(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GLOBAL_NPM_PATH")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

