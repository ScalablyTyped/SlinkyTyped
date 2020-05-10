package typingsSlinky.dbus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIn extends js.Object {
  var in: String = js.native
  var out: String = js.native
}

object AnonIn {
  @scala.inline
  def apply(in: String, out: String): AnonIn = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], out = out.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIn]
  }
  @scala.inline
  implicit class AnonInOps[Self <: AnonIn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("in")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOut(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("out")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

