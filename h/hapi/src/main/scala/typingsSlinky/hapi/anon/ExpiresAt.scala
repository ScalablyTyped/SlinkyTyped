package typingsSlinky.hapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpiresAt extends js.Object {
  var expiresAt: js.UndefOr[scala.Nothing] = js.native
  var expiresIn: js.UndefOr[Double] = js.native
}

object ExpiresAt {
  @scala.inline
  def apply(): ExpiresAt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpiresAt]
  }
  @scala.inline
  implicit class ExpiresAtOps[Self <: ExpiresAt] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpiresIn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiresIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpiresIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiresIn")(js.undefined)
        ret
    }
  }
  
}

