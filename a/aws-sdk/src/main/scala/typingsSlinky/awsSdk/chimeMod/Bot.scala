package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bot extends js.Object {
  /**
    * The bot email address.
    */
  var BotEmail: js.UndefOr[SensitiveString] = js.native
  /**
    * The bot ID.
    */
  var BotId: js.UndefOr[String] = js.native
  /**
    * The bot type.
    */
  var BotType: js.UndefOr[typingsSlinky.awsSdk.chimeMod.BotType] = js.native
  /**
    * The bot creation timestamp, in ISO 8601 format.
    */
  var CreatedTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * When true, the bot is stopped from running in your account.
    */
  var Disabled: js.UndefOr[NullableBoolean] = js.native
  /**
    * The bot display name.
    */
  var DisplayName: js.UndefOr[SensitiveString] = js.native
  /**
    * The security token used to authenticate Amazon Chime with the outgoing event endpoint.
    */
  var SecurityToken: js.UndefOr[SensitiveString] = js.native
  /**
    * The updated bot timestamp, in ISO 8601 format.
    */
  var UpdatedTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * The unique ID for the bot user.
    */
  var UserId: js.UndefOr[String] = js.native
}

object Bot {
  @scala.inline
  def apply(): Bot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bot]
  }
  @scala.inline
  implicit class BotOps[Self <: Bot] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBotEmail(value: SensitiveString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BotEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBotEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BotEmail")(js.undefined)
        ret
    }
    @scala.inline
    def withBotId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BotId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBotId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BotId")(js.undefined)
        ret
    }
    @scala.inline
    def withBotType(value: BotType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BotType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBotType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BotType")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: NullableBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: SensitiveString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayName")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityToken(value: SensitiveString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityToken")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdatedTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdatedTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdatedTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdatedTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserId")(js.undefined)
        ret
    }
  }
  
}

