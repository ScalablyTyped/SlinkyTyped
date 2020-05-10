package typingsSlinky.openfin.systemWindowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowInfo extends js.Object {
  var childWindows: js.Array[WindowDetail] = js.native
  var mainWindow: WindowDetail = js.native
  var uuid: String = js.native
}

object WindowInfo {
  @scala.inline
  def apply(childWindows: js.Array[WindowDetail], mainWindow: WindowDetail, uuid: String): WindowInfo = {
    val __obj = js.Dynamic.literal(childWindows = childWindows.asInstanceOf[js.Any], mainWindow = mainWindow.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowInfo]
  }
  @scala.inline
  implicit class WindowInfoOps[Self <: WindowInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildWindows(value: js.Array[WindowDetail]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childWindows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMainWindow(value: WindowDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

