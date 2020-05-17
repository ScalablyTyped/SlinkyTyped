package typingsSlinky.koaSession.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rolling extends js.Object {
  var rolling: js.UndefOr[Boolean] = js.native
}

object Rolling {
  @scala.inline
  def apply(): Rolling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Rolling]
  }
  @scala.inline
  implicit class RollingOps[Self <: Rolling] (val x: Self) extends AnyVal {
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

