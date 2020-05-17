package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lastreadat extends js.Object {
  var last_read_at: Type = js.native
}

object Lastreadat {
  @scala.inline
  def apply(last_read_at: Type): Lastreadat = {
    val __obj = js.Dynamic.literal(last_read_at = last_read_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lastreadat]
  }
  @scala.inline
  implicit class LastreadatOps[Self <: Lastreadat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLast_read_at(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_read_at")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

