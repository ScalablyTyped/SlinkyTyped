package typingsSlinky.electronUtil.mod

import typingsSlinky.electron.mod.Session_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetContentSecurityPolicyOptions extends js.Object {
  /**
  	The session to apply the policy to.
  	Default: [`electron.session.defaultSession`](https://electronjs.org/docs/api/session#sessiondefaultsession)
  	*/
  val session: js.UndefOr[Session_] = js.native
}

object SetContentSecurityPolicyOptions {
  @scala.inline
  def apply(): SetContentSecurityPolicyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetContentSecurityPolicyOptions]
  }
  @scala.inline
  implicit class SetContentSecurityPolicyOptionsOps[Self <: SetContentSecurityPolicyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSession(value: Session_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSession: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(js.undefined)
        ret
    }
  }
  
}

