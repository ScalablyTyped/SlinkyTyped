package typingsSlinky.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPrivilegeName extends js.Object {
  var privilegeName: js.UndefOr[String] = js.native
  var serviceId: js.UndefOr[String] = js.native
}

object AnonPrivilegeName {
  @scala.inline
  def apply(): AnonPrivilegeName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonPrivilegeName]
  }
  @scala.inline
  implicit class AnonPrivilegeNameOps[Self <: AnonPrivilegeName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrivilegeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privilegeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivilegeName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privilegeName")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceId")(js.undefined)
        ret
    }
  }
  
}

