package typingsSlinky.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutBotRequest extends js.Object {
  /**
    * When Amazon Lex can't understand the user's input in context, it tries to elicit the information a few times. After that, Amazon Lex sends the message defined in abortStatement to the user, and then aborts the conversation. To set the number of retries, use the valueElicitationPrompt field for the slot type.  For example, in a pizza ordering bot, Amazon Lex might ask a user "What type of crust would you like?" If the user's response is not one of the expected responses (for example, "thin crust, "deep dish," etc.), Amazon Lex tries to elicit a correct response a few more times.  For example, in a pizza ordering application, OrderPizza might be one of the intents. This intent might require the CrustType slot. You specify the valueElicitationPrompt field when you create the CrustType slot. If you have defined a fallback intent the abort statement will not be sent to the user, the fallback intent is used instead. For more information, see  AMAZON.FallbackIntent.
    */
  var abortStatement: js.UndefOr[Statement] = js.native
  /**
    * Identifies a specific revision of the $LATEST version. When you create a new bot, leave the checksum field blank. If you specify a checksum you get a BadRequestException exception. When you want to update a bot, set the checksum field to the checksum of the most recent revision of the $LATEST version. If you don't specify the  checksum field, or if the checksum does not match the $LATEST version, you get a PreconditionFailedException exception.
    */
  var checksum: js.UndefOr[String] = js.native
  /**
    * For each Amazon Lex bot created with the Amazon Lex Model Building Service, you must specify whether your use of Amazon Lex is related to a website, program, or other application that is directed or targeted, in whole or in part, to children under age 13 and subject to the Children's Online Privacy Protection Act (COPPA) by specifying true or false in the childDirected field. By specifying true in the childDirected field, you confirm that your use of Amazon Lex is related to a website, program, or other application that is directed or targeted, in whole or in part, to children under age 13 and subject to COPPA. By specifying false in the childDirected field, you confirm that your use of Amazon Lex is not related to a website, program, or other application that is directed or targeted, in whole or in part, to children under age 13 and subject to COPPA. You may not specify a default value for the childDirected field that does not accurately reflect whether your use of Amazon Lex is related to a website, program, or other application that is directed or targeted, in whole or in part, to children under age 13 and subject to COPPA. If your use of Amazon Lex relates to a website, program, or other application that is directed in whole or in part, to children under age 13, you must obtain any required verifiable parental consent under COPPA. For information regarding the use of Amazon Lex in connection with websites, programs, or other applications that are directed or targeted, in whole or in part, to children under age 13, see the Amazon Lex FAQ. 
    */
  var childDirected: Boolean = js.native
  /**
    * When Amazon Lex doesn't understand the user's intent, it uses this message to get clarification. To specify how many times Amazon Lex should repeat the clarification prompt, use the maxAttempts field. If Amazon Lex still doesn't understand, it sends the message in the abortStatement field.  When you create a clarification prompt, make sure that it suggests the correct response from the user. for example, for a bot that orders pizza and drinks, you might create this clarification prompt: "What would you like to do? You can say 'Order a pizza' or 'Order a drink.'" If you have defined a fallback intent, it will be invoked if the clarification prompt is repeated the number of times defined in the maxAttempts field. For more information, see  AMAZON.FallbackIntent. If you don't define a clarification prompt, at runtime Amazon Lex will return a 400 Bad Request exception in three cases:    Follow-up prompt - When the user responds to a follow-up prompt but does not provide an intent. For example, in response to a follow-up prompt that says "Would you like anything else today?" the user says "Yes." Amazon Lex will return a 400 Bad Request exception because it does not have a clarification prompt to send to the user to get an intent.   Lambda function - When using a Lambda function, you return an ElicitIntent dialog type. Since Amazon Lex does not have a clarification prompt to get an intent from the user, it returns a 400 Bad Request exception.   PutSession operation - When using the PutSession operation, you send an ElicitIntent dialog type. Since Amazon Lex does not have a clarification prompt to get an intent from the user, it returns a 400 Bad Request exception.  
    */
  var clarificationPrompt: js.UndefOr[Prompt] = js.native
  /**
    * When set to true a new numbered version of the bot is created. This is the same as calling the CreateBotVersion operation. If you don't specify createVersion, the default is false.
    */
  var createVersion: js.UndefOr[Boolean] = js.native
  /**
    * A description of the bot.
    */
  var description: js.UndefOr[Description] = js.native
  /**
    * When set to true user utterances are sent to Amazon Comprehend for sentiment analysis. If you don't specify detectSentiment, the default is false.
    */
  var detectSentiment: js.UndefOr[Boolean] = js.native
  /**
    * The maximum time in seconds that Amazon Lex retains the data gathered in a conversation. A user interaction session remains active for the amount of time specified. If no conversation occurs during this time, the session expires and Amazon Lex deletes any data provided before the timeout. For example, suppose that a user chooses the OrderPizza intent, but gets sidetracked halfway through placing an order. If the user doesn't complete the order within the specified time, Amazon Lex discards the slot information that it gathered, and the user must start over. If you don't include the idleSessionTTLInSeconds element in a PutBot operation request, Amazon Lex uses the default value. This is also true if the request replaces an existing bot. The default is 300 seconds (5 minutes).
    */
  var idleSessionTTLInSeconds: js.UndefOr[SessionTTL] = js.native
  /**
    * An array of Intent objects. Each intent represents a command that a user can express. For example, a pizza ordering bot might support an OrderPizza intent. For more information, see how-it-works.
    */
  var intents: js.UndefOr[IntentList] = js.native
  /**
    *  Specifies the target locale for the bot. Any intent used in the bot must be compatible with the locale of the bot.  The default is en-US.
    */
  var locale: Locale = js.native
  /**
    * The name of the bot. The name is not case sensitive. 
    */
  var name: BotName = js.native
  /**
    * If you set the processBehavior element to BUILD, Amazon Lex builds the bot so that it can be run. If you set the element to SAVE Amazon Lex saves the bot, but doesn't build it.  If you don't specify this value, the default value is BUILD.
    */
  var processBehavior: js.UndefOr[ProcessBehavior] = js.native
  /**
    * A list of tags to add to the bot. You can only add tags when you create a bot, you can't use the PutBot operation to update the tags on a bot. To update tags, use the TagResource operation.
    */
  var tags: js.UndefOr[TagList] = js.native
  /**
    * The Amazon Polly voice ID that you want Amazon Lex to use for voice interactions with the user. The locale configured for the voice must match the locale of the bot. For more information, see Voices in Amazon Polly in the Amazon Polly Developer Guide.
    */
  var voiceId: js.UndefOr[String] = js.native
}

object PutBotRequest {
  @scala.inline
  def apply(childDirected: Boolean, locale: Locale, name: BotName): PutBotRequest = {
    val __obj = js.Dynamic.literal(childDirected = childDirected.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBotRequest]
  }
  @scala.inline
  implicit class PutBotRequestOps[Self <: PutBotRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildDirected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childDirected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocale(value: Locale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: BotName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAbortStatement(value: Statement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abortStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbortStatement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abortStatement")(js.undefined)
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
    def withClarificationPrompt(value: Prompt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clarificationPrompt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClarificationPrompt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clarificationPrompt")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateVersion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createVersion")(js.undefined)
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
    def withDetectSentiment(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectSentiment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetectSentiment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectSentiment")(js.undefined)
        ret
    }
    @scala.inline
    def withIdleSessionTTLInSeconds(value: SessionTTL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idleSessionTTLInSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdleSessionTTLInSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idleSessionTTLInSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withIntents(value: IntentList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intents")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessBehavior(value: ProcessBehavior): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processBehavior")(js.undefined)
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
    @scala.inline
    def withVoiceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voiceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVoiceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voiceId")(js.undefined)
        ret
    }
  }
  
}

