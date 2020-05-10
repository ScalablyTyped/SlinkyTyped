package typingsSlinky.reactAce.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICommandBindKey extends js.Object {
  var mac: String = js.native
  var win: String = js.native
}

object ICommandBindKey {
  @scala.inline
  def apply(mac: String, win: String): ICommandBindKey = {
    val __obj = js.Dynamic.literal(mac = mac.asInstanceOf[js.Any], win = win.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICommandBindKey]
  }
  @scala.inline
  implicit class ICommandBindKeyOps[Self <: ICommandBindKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMac(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mac")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("win")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

