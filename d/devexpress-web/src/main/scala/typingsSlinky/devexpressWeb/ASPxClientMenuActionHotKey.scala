package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ASPxClientMenuActionHotKey extends js.Object {
  var ctrlKey: Boolean = js.native
  var keyCode: Double = js.native
}

object ASPxClientMenuActionHotKey {
  @scala.inline
  def apply(ctrlKey: Boolean, keyCode: Double): ASPxClientMenuActionHotKey = {
    val __obj = js.Dynamic.literal(ctrlKey = ctrlKey.asInstanceOf[js.Any], keyCode = keyCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientMenuActionHotKey]
  }
  @scala.inline
  implicit class ASPxClientMenuActionHotKeyOps[Self <: ASPxClientMenuActionHotKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCtrlKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctrlKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyCode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

