package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLastreadat extends js.Object {
  var last_read_at: AnonType = js.native
}

object AnonLastreadat {
  @scala.inline
  def apply(last_read_at: AnonType): AnonLastreadat = {
    val __obj = js.Dynamic.literal(last_read_at = last_read_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLastreadat]
  }
  @scala.inline
  implicit class AnonLastreadatOps[Self <: AnonLastreadat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLast_read_at(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_read_at")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

