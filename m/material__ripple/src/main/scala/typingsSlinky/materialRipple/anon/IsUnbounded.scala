package typingsSlinky.materialRipple.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsUnbounded extends js.Object {
  var isUnbounded: js.UndefOr[Boolean] = js.native
}

object IsUnbounded {
  @scala.inline
  def apply(): IsUnbounded = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsUnbounded]
  }
  @scala.inline
  implicit class IsUnboundedOps[Self <: IsUnbounded] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsUnbounded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUnbounded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsUnbounded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUnbounded")(js.undefined)
        ret
    }
  }
  
}

