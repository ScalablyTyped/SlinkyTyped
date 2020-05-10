package typingsSlinky.koaSession

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRolling extends js.Object {
  var rolling: js.UndefOr[Boolean] = js.native
}

object AnonRolling {
  @scala.inline
  def apply(): AnonRolling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonRolling]
  }
  @scala.inline
  implicit class AnonRollingOps[Self <: AnonRolling] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRolling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRolling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rolling")(js.undefined)
        ret
    }
  }
  
}

