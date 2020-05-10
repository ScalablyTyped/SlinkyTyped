package typingsSlinky.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutBotAliasRequest extends js.Object {
  /**
    * The name of the bot.
    */
  var botName: BotName = js.native
  /**
    * The version of the bot.
    */
  var botVersion: Version = js.native
  /**
    * Identifies a specific revision of the $LATEST version. When you create a new bot alias, leave the checksum field blank. If you specify a checksum you get a BadRequestException exception. When you want to update a bot alias, set the checksum field to the checksum of the most recent revision of the $LATEST version. If you don't specify the  checksum field, or if the checksum does not match the $LATEST version, you get a PreconditionFailedException exception.
    */
  var checksum: js.UndefOr[String] = js.native
  /**
    * Settings for conversation logs for the alias.
    */
  var conversationLogs: js.UndefOr[ConversationLogsRequest] = js.native
  /**
    * A description of the alias.
    */
  var description: js.UndefOr[Description] = js.native
  /**
    * The name of the alias. The name is not case sensitive.
    */
  var name: AliasName = js.native
  /**
    * A list of tags to add to the bot alias. You can only add tags when you create an alias, you can't use the PutBotAlias operation to update the tags on a bot alias. To update tags, use the TagResource operation.
    */
  var tags: js.UndefOr[TagList] = js.native
}

object PutBotAliasRequest {
  @scala.inline
  def apply(botName: BotName, botVersion: Version, name: AliasName): PutBotAliasRequest = {
    val __obj = js.Dynamic.literal(botName = botName.asInstanceOf[js.Any], botVersion = botVersion.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBotAliasRequest]
  }
  @scala.inline
  implicit class PutBotAliasRequestOps[Self <: PutBotAliasRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBotName(value: BotName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("botName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBotVersion(value: Version): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("botVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: AliasName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChecksum(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checksum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChecksum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checksum")(js.undefined)
        ret
    }
    @scala.inline
    def withConversationLogs(value: ConversationLogsRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conversationLogs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConversationLogs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conversationLogs")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: Description): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

