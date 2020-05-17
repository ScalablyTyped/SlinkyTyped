package typingsSlinky.nodeHueApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait On extends js.Object {
  var on: Boolean = js.native
}

object On {
  @scala.inline
  def apply(on: Boolean): On = {
    val __obj = js.Dynamic.literal(on = on.asInstanceOf[js.Any])
    __obj.asInstanceOf[On]
  }
  @scala.inline
  implicit class OnOps[Self <: On] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

