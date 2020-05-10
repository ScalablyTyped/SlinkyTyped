package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2SignInValueSpec extends js.Object {
  /**
    * The optional context why the app needs to ask the user to sign in, as a
    * prefix of a prompt for user consent, e.g. \"To track your exercise\", or
    * \"To check your account balance\".
    */
  var optContext: js.UndefOr[String] = js.native
}

object GoogleActionsV2SignInValueSpec {
  @scala.inline
  def apply(): GoogleActionsV2SignInValueSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2SignInValueSpec]
  }
  @scala.inline
  implicit class GoogleActionsV2SignInValueSpecOps[Self <: GoogleActionsV2SignInValueSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOptContext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optContext")(js.undefined)
        ret
    }
  }
  
}

