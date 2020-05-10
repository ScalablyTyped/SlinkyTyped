package typingsSlinky.pem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDhparam extends js.Object {
  var dhparam: js.Any = js.native
}

object AnonDhparam {
  @scala.inline
  def apply(dhparam: js.Any): AnonDhparam = {
    val __obj = js.Dynamic.literal(dhparam = dhparam.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDhparam]
  }
  @scala.inline
  implicit class AnonDhparamOps[Self <: AnonDhparam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDhparam(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dhparam")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

