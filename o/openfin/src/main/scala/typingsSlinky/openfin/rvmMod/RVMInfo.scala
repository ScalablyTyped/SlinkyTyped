package typingsSlinky.openfin.rvmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RVMInfo extends js.Object {
  var action: String = js.native
  var appLogDirectory: String = js.native
  var path: String = js.native
  var `start-time`: String = js.native
  var version: String = js.native
  var `working-dir`: String = js.native
}

object RVMInfo {
  @scala.inline
  def apply(
    action: String,
    appLogDirectory: String,
    path: String,
    `start-time`: String,
    version: String,
    `working-dir`: String
  ): RVMInfo = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], appLogDirectory = appLogDirectory.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("start-time")(`start-time`.asInstanceOf[js.Any])
    __obj.updateDynamic("working-dir")(`working-dir`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RVMInfo]
  }
  @scala.inline
  implicit class RVMInfoOps[Self <: RVMInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppLogDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appLogDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withStart-time`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start-time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWorking-dir`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("working-dir")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

