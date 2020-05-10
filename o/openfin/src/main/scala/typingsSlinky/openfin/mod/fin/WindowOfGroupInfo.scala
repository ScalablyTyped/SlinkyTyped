package typingsSlinky.openfin.mod.fin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowOfGroupInfo extends js.Object {
  /**
    * The UUID of the application this window entry belongs to.
    */
  var appUuid: String = js.native
  /**
    * The name of this window entry.
    */
  var windowName: String = js.native
}

object WindowOfGroupInfo {
  @scala.inline
  def apply(appUuid: String, windowName: String): WindowOfGroupInfo = {
    val __obj = js.Dynamic.literal(appUuid = appUuid.asInstanceOf[js.Any], windowName = windowName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowOfGroupInfo]
  }
  @scala.inline
  implicit class WindowOfGroupInfoOps[Self <: WindowOfGroupInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppUuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appUuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindowName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

