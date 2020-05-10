package typingsSlinky.easyApiRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCb extends js.Object {
  var cb: js.Any = js.native
  var opts: js.Any = js.native
}

object AnonCb {
  @scala.inline
  def apply(cb: js.Any, opts: js.Any): AnonCb = {
    val __obj = js.Dynamic.literal(cb = cb.asInstanceOf[js.Any], opts = opts.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCb]
  }
  @scala.inline
  implicit class AnonCbOps[Self <: AnonCb] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCb(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpts(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opts")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

