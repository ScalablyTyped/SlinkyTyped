package typingsSlinky.browserfs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOpts extends js.Object {
  var opts: AnonRoot = js.native
}

object AnonOpts {
  @scala.inline
  def apply(opts: AnonRoot): AnonOpts = {
    val __obj = js.Dynamic.literal(opts = opts.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOpts]
  }
  @scala.inline
  implicit class AnonOptsOps[Self <: AnonOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOpts(value: AnonRoot): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opts")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

