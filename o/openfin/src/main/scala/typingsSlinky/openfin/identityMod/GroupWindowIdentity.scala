package typingsSlinky.openfin.identityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupWindowIdentity extends Identity {
  var isExternalWindow: js.UndefOr[Boolean] = js.native
}

object GroupWindowIdentity {
  @scala.inline
  def apply(uuid: String): GroupWindowIdentity = {
    val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupWindowIdentity]
  }
  @scala.inline
  implicit class GroupWindowIdentityOps[Self <: GroupWindowIdentity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsExternalWindow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExternalWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsExternalWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExternalWindow")(js.undefined)
        ret
    }
  }
  
}

