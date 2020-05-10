package typingsSlinky.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BotAliasMetadata extends js.Object {
  /**
    * The name of the bot to which the alias points.
    */
  var botName: js.UndefOr[BotName] = js.native
  /**
    * The version of the Amazon Lex bot to which the alias points.
    */
  var botVersion: js.UndefOr[Version] = js.native
  /**
    * Checksum of the bot alias.
    */
  var checksum: js.UndefOr[String] = js.native
  /**
    * Settings that determine how Amazon Lex uses conversation logs for the alias.
    */
  var conversationLogs: js.UndefOr[ConversationLogsResponse] = js.native
  /**
    * The date that the bot alias was created.
    */
  var createdDate: js.UndefOr[js.Date] = js.native
  /**
    * A description of the bot alias.
    */
  var description: js.UndefOr[Description] = js.native
  /**
    * The date that the bot alias was updated. When you create a resource, the creation date and last updated date are the same.
    */
  var lastUpdatedDate: js.UndefOr[js.Date] = js.native
  /**
    * The name of the bot alias.
    */
  var name: js.UndefOr[AliasName] = js.native
}

object BotAliasMetadata {
  @scala.inline
  def apply(): BotAliasMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BotAliasMetadata]
  }
  @scala.inline
  implicit class BotAliasMetadataOps[Self <: BotAliasMetadata] (val x: Self) extends AnyVal {
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
    def withoutBotName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("botName")(js.undefined)
        ret
    }
    @scala.inline
    def withBotVersion(value: Version): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("botVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBotVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("botVersion")(js.undefined)
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
    def withConversationLogs(value: ConversationLogsResponse): Self = {
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
    def withCreatedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdDate")(js.undefined)
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
    def withLastUpdatedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdatedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: AliasName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

