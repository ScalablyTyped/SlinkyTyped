package typingsSlinky.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBotChannelAssociationResponse extends js.Object {
  /**
    * An alias pointing to the specific version of the Amazon Lex bot to which this association is being made.
    */
  var botAlias: js.UndefOr[AliasName] = js.native
  /**
    * Provides information that the messaging platform needs to communicate with the Amazon Lex bot.
    */
  var botConfiguration: js.UndefOr[ChannelConfigurationMap] = js.native
  /**
    * The name of the Amazon Lex bot.
    */
  var botName: js.UndefOr[BotName] = js.native
  /**
    * The date that the association between the bot and the channel was created.
    */
  var createdDate: js.UndefOr[js.Date] = js.native
  /**
    * A description of the association between the bot and the channel.
    */
  var description: js.UndefOr[Description] = js.native
  /**
    * If status is FAILED, Amazon Lex provides the reason that it failed to create the association.
    */
  var failureReason: js.UndefOr[String] = js.native
  /**
    * The name of the association between the bot and the channel.
    */
  var name: js.UndefOr[BotChannelName] = js.native
  /**
    * The status of the bot channel.     CREATED - The channel has been created and is ready for use.    IN_PROGRESS - Channel creation is in progress.    FAILED - There was an error creating the channel. For information about the reason for the failure, see the failureReason field.  
    */
  var status: js.UndefOr[ChannelStatus] = js.native
  /**
    * The type of the messaging platform.
    */
  var `type`: js.UndefOr[ChannelType] = js.native
}

object GetBotChannelAssociationResponse {
  @scala.inline
  def apply(): GetBotChannelAssociationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBotChannelAssociationResponse]
  }
  @scala.inline
  implicit class GetBotChannelAssociationResponseOps[Self <: GetBotChannelAssociationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBotAlias(value: AliasName): Self = {
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
    def withBotConfiguration(value: ChannelConfigurationMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("botConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBotConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("botConfiguration")(js.undefined)
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
    def withFailureReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureReason")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: BotChannelName): Self = {
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
    @scala.inline
    def withStatus(value: ChannelStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: ChannelType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

