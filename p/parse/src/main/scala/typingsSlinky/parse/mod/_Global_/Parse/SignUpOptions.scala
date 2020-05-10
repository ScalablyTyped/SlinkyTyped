package typingsSlinky.parse.mod._Global_.Parse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignUpOptions extends js.Object {
  var installationId: js.UndefOr[String] = js.native
  var useMasterKey: js.UndefOr[Boolean] = js.native
}

object SignUpOptions {
  @scala.inline
  def apply(): SignUpOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignUpOptions]
  }
  @scala.inline
  implicit class SignUpOptionsOps[Self <: SignUpOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstallationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstallationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installationId")(js.undefined)
        ret
    }
    @scala.inline
    def withUseMasterKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useMasterKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseMasterKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useMasterKey")(js.undefined)
        ret
    }
  }
  
}

