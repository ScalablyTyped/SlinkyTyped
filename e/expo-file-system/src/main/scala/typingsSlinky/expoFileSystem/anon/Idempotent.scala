package typingsSlinky.expoFileSystem.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Idempotent extends js.Object {
  var idempotent: js.UndefOr[Boolean] = js.native
}

object Idempotent {
  @scala.inline
  def apply(): Idempotent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Idempotent]
  }
  @scala.inline
  implicit class IdempotentOps[Self <: Idempotent] (val x: Self) extends AnyVal {
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

