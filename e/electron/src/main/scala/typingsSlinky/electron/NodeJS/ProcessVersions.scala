package typingsSlinky.electron.NodeJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessVersions extends js.Object {
  var chrome: String = js.native
  var electron: String = js.native
}

object ProcessVersions {
  @scala.inline
  def apply(chrome: String, electron: String): ProcessVersions = {
    val __obj = js.Dynamic.literal(chrome = chrome.asInstanceOf[js.Any], electron = electron.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessVersions]
  }
  @scala.inline
  implicit class ProcessVersionsOps[Self <: ProcessVersions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChrome(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chrome")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElectron(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("electron")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

