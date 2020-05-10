package typingsSlinky.hapiAddress.mod.domain.Tlds

import typingsSlinky.hapiAddress.hapiAddressBooleans.`true`
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Allow extends js.Object {
  val allow: Set[String] | `true` = js.native
}

object Allow {
  @scala.inline
  def apply(allow: Set[String] | `true`): Allow = {
    val __obj = js.Dynamic.literal(allow = allow.asInstanceOf[js.Any])
    __obj.asInstanceOf[Allow]
  }
  @scala.inline
  implicit class AllowOps[Self <: Allow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllow(value: Set[String] | `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

