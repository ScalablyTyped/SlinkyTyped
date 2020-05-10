package typingsSlinky.mongoose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNoop extends js.Object {
  var noop: js.UndefOr[Boolean] = js.native
}

object AnonNoop {
  @scala.inline
  def apply(): AnonNoop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonNoop]
  }
  @scala.inline
  implicit class AnonNoopOps[Self <: AnonNoop] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNoop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noop")(js.undefined)
        ret
    }
  }
  
}

