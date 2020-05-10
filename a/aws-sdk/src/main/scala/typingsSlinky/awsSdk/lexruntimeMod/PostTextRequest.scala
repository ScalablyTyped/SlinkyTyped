package typingsSlinky.awsSdk.lexruntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostTextRequest extends js.Object {
  /**
    * The alias of the Amazon Lex bot.
    */
  var botAlias: BotAlias = js.native
  /**
    * The name of the Amazon Lex bot.
    */
  var botName: BotName = js.native
  /**
    * The text that the user entered (Amazon Lex interprets this text).
    */
  var inputText: Text = js.native
  /**
    * Request-specific information passed between Amazon Lex and a client application. The namespace x-amz-lex: is reserved for special attributes. Don't create any request attributes with the prefix x-amz-lex:. For more information, see Setting Request Attributes.
    */
  var requestAttributes: js.UndefOr[StringMap] = js.native
  /**
    * Application-specific information passed between Amazon Lex and a client application. For more information, see Setting Session Attributes.
    */
  var sessionAttributes: js.UndefOr[StringMap] = js.native
  /**
    * The ID of the client application user. Amazon Lex uses this to identify a user's conversation with your bot. At runtime, each request must contain the userID field. To decide the user ID to use for your application, consider the following factors.   The userID field must not contain any personally identifiable information of the user, for example, name, personal identification numbers, or other end user personal information.   If you want a user to start a conversation on one device and continue on another device, use a user-specific identifier.   If you want the same user to be able to have two independent conversations on two different devices, choose a device-specific identifier.   A user can't have two independent conversations with two different versions of the same bot. For example, a user can't have a conversation with the PROD and BETA versions of the same bot. If you anticipate that a user will need to have conversation with two different versions, for example, while testing, include the bot alias in the user ID to separate the two conversations.  
    */
  var userId: UserId = js.native
}

object PostTextRequest {
  @scala.inline
  def apply(botAlias: BotAlias, botName: BotName, inputText: Text, userId: UserId): PostTextRequest = {
    val __obj = js.Dynamic.literal(botAlias = botAlias.asInstanceOf[js.Any], botName = botName.asInstanceOf[js.Any], inputText = inputText.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostTextRequest]
  }
  @scala.inline
  implicit class PostTextRequestOps[Self <: PostTextRequest] (val x: Self) extends AnyVal {
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
    def withInputText(value: Text): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserId(value: UserId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestAttributes(value: StringMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionAttributes(value: StringMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionAttributes")(js.undefined)
        ret
    }
  }
  
}

