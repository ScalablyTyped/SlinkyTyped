package typingsSlinky.momentRange.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExclusiveBoolean extends js.Object {
  var exclusive: js.UndefOr[Boolean] = js.native
}

object ExclusiveBoolean {
  @scala.inline
  def apply(): ExclusiveBoolean = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExclusiveBoolean]
  }
  @scala.inline
  implicit class ExclusiveBooleanOps[Self <: ExclusiveBoolean] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExclusive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclusive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclusive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclusive")(js.undefined)
        ret
    }
  }
  
}

