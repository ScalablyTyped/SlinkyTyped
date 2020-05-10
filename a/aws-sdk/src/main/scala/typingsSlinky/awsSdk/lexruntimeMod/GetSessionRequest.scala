package typingsSlinky.awsSdk.lexruntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSessionRequest extends js.Object {
  /**
    * The alias in use for the bot that contains the session data.
    */
  var botAlias: BotAlias = js.native
  /**
    * The name of the bot that contains the session data.
    */
  var botName: BotName = js.native
  /**
    * A string used to filter the intents returned in the recentIntentSummaryView structure.  When you specify a filter, only intents with their checkpointLabel field set to that string are returned.
    */
  var checkpointLabelFilter: js.UndefOr[IntentSummaryCheckpointLabel] = js.native
  /**
    * The ID of the client application user. Amazon Lex uses this to identify a user's conversation with your bot. 
    */
  var userId: UserId = js.native
}

object GetSessionRequest {
  @scala.inline
  def apply(botAlias: BotAlias, botName: BotName, userId: UserId): GetSessionRequest = {
    val __obj = js.Dynamic.literal(botAlias = botAlias.asInstanceOf[js.Any], botName = botName.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSessionRequest]
  }
  @scala.inline
  implicit class GetSessionRequestOps[Self <: GetSessionRequest] (val x: Self) extends AnyVal {
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
    def withBotName(value: BotName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("botName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserId(value: UserId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckpointLabelFilter(value: IntentSummaryCheckpointLabel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkpointLabelFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckpointLabelFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkpointLabelFilter")(js.undefined)
        ret
    }
  }
  
}

