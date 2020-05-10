package typingsSlinky.expoFileSystem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIdempotent extends js.Object {
  var idempotent: js.UndefOr[Boolean] = js.native
}

object AnonIdempotent {
  @scala.inline
  def apply(): AnonIdempotent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonIdempotent]
  }
  @scala.inline
  implicit class AnonIdempotentOps[Self <: AnonIdempotent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdempotent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idempotent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdempotent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idempotent")(js.undefined)
        ret
    }
  }
  
}

