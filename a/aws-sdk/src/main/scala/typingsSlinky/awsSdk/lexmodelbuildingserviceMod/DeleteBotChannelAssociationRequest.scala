package typingsSlinky.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBotChannelAssociationRequest extends js.Object {
  /**
    * An alias that points to the specific version of the Amazon Lex bot to which this association is being made.
    */
  var botAlias: AliasName = js.native
  /**
    * The name of the Amazon Lex bot.
    */
  var botName: BotName = js.native
  /**
    * The name of the association. The name is case sensitive. 
    */
  var name: BotChannelName = js.native
}

object DeleteBotChannelAssociationRequest {
  @scala.inline
  def apply(botAlias: AliasName, botName: BotName, name: BotChannelName): DeleteBotChannelAssociationRequest = {
    val __obj = js.Dynamic.literal(botAlias = botAlias.asInstanceOf[js.Any], botName = botName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBotChannelAssociationRequest]
  }
  @scala.inline
  implicit class DeleteBotChannelAssociationRequestOps[Self <: DeleteBotChannelAssociationRequest] (val x: Self) extends AnyVal {
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
    def withBotName(value: BotName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("botName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: BotChannelName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

