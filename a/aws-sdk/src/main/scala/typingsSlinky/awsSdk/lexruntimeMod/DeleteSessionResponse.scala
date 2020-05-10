package typingsSlinky.awsSdk.lexruntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSessionResponse extends js.Object {
  /**
    * The alias in use for the bot associated with the session data.
    */
  var botAlias: js.UndefOr[BotAlias] = js.native
  /**
    * The name of the bot associated with the session data.
    */
  var botName: js.UndefOr[BotName] = js.native
  /**
    * The unique identifier for the session.
    */
  var sessionId: js.UndefOr[String] = js.native
  /**
    * The ID of the client application user.
    */
  var userId: js.UndefOr[UserId] = js.native
}

object DeleteSessionResponse {
  @scala.inline
  def apply(): DeleteSessionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteSessionResponse]
  }
  @scala.inline
  implicit class DeleteSessionResponseOps[Self <: DeleteSessionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBotAlias(value: BotAlias): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("botAlias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBotAlias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("botAlias")(js.undefined)
        ret
    }
    @scala.inline
    def withBotName(value: BotName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("botName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBotName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("botName")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionId")(js.undefined)
        ret
    }
    @scala.inline
    def withUserId(value: UserId): Self = {
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

