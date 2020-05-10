package typingsSlinky.momentRange

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonExclusiveBoolean extends js.Object {
  var exclusive: js.UndefOr[Boolean] = js.native
}

object AnonExclusiveBoolean {
  @scala.inline
  def apply(): AnonExclusiveBoolean = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonExclusiveBoolean]
  }
  @scala.inline
  implicit class AnonExclusiveBooleanOps[Self <: AnonExclusiveBoolean] (val x: Self) extends AnyVal {
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

