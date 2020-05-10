package typingsSlinky.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Resolution extends js.Object {
  var authority: String = js.native
  var status: ResolutionStatus = js.native
  var values: js.Array[ResolutionValueContainer] = js.native
}

object Resolution {
  @scala.inline
  def apply(authority: String, status: ResolutionStatus, values: js.Array[ResolutionValueContainer]): Resolution = {
    val __obj = js.Dynamic.literal(authority = authority.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resolution]
  }
  @scala.inline
  implicit class ResolutionOps[Self <: Resolution] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthority(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: ResolutionStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: js.Array[ResolutionValueContainer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

