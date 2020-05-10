package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2CustomPushMessageTarget extends js.Object {
  /**
    * The argument to target for an intent. For V1, only one Argument is
    * supported.
    */
  var argument: js.UndefOr[GoogleActionsV2Argument] = js.native
  /**
    * The intent to target.
    */
  var intent: js.UndefOr[String] = js.native
  /**
    * The locale to target. Follows IETF BCP-47 language code.
    * Can be used by a multi-lingual app to target a user on a specified
    * localized app. If not specified, it will default to en-US.
    */
  var locale: js.UndefOr[String] = js.native
  /**
    * The user to target.
    */
  var userId: js.UndefOr[String] = js.native
}

object GoogleActionsV2CustomPushMessageTarget {
  @scala.inline
  def apply(): GoogleActionsV2CustomPushMessageTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2CustomPushMessageTarget]
  }
  @scala.inline
  implicit class GoogleActionsV2CustomPushMessageTargetOps[Self <: GoogleActionsV2CustomPushMessageTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgument(value: GoogleActionsV2Argument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgument: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argument")(js.undefined)
        ret
    }
    @scala.inline
    def withIntent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intent")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(js.undefined)
        ret
    }
  }
  
}

