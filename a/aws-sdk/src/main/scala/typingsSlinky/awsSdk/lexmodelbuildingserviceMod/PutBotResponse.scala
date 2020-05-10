package typingsSlinky.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutBotResponse extends js.Object {
  /**
    * The message that Amazon Lex uses to abort a conversation. For more information, see PutBot.
    */
  var abortStatement: js.UndefOr[Statement] = js.native
  /**
    * Checksum of the bot that you created.
    */
  var checksum: js.UndefOr[String] = js.native
  /**
    * For each Amazon Lex bot created with the Amazon Lex Model Building Service, you must specify whether your use of Amazon Lex is related to a website, program, or other application that is directed or targeted, in whole or in part, to children under age 13 and subject to the Children's Online Privacy Protection Act (COPPA) by specifying true or false in the childDirected field. By specifying true in the childDirected field, you confirm that your use of Amazon Lex is related to a website, program, or other application that is directed or targeted, in whole or in part, to children under age 13 and subject to COPPA. By specifying false in the childDirected field, you confirm that your use of Amazon Lex is not related to a website, program, or other application that is directed or targeted, in whole or in part, to children under age 13 and subject to COPPA. You may not specify a default value for the childDirected field that does not accurately reflect whether your use of Amazon Lex is related to a website, program, or other application that is directed or targeted, in whole or in part, to children under age 13 and subject to COPPA. If your use of Amazon Lex relates to a website, program, or other application that is directed in whole or in part, to children under age 13, you must obtain any required verifiable parental consent under COPPA. For information regarding the use of Amazon Lex in connection with websites, programs, or other applications that are directed or targeted, in whole or in part, to children under age 13, see the Amazon Lex FAQ. 
    */
  var childDirected: js.UndefOr[Boolean] = js.native
  /**
    *  The prompts that Amazon Lex uses when it doesn't understand the user's intent. For more information, see PutBot. 
    */
  var clarificationPrompt: js.UndefOr[Prompt] = js.native
  /**
    *  True if a new version of the bot was created. If the createVersion field was not specified in the request, the createVersion field is set to false in the response.
    */
  var createVersion: js.UndefOr[Boolean] = js.native
  /**
    * The date that the bot was created.
    */
  var createdDate: js.UndefOr[js.Date] = js.native
  /**
    * A description of the bot.
    */
  var description: js.UndefOr[Description] = js.native
  /**
    *  true if the bot is configured to send user utterances to Amazon Comprehend for sentiment analysis. If the detectSentiment field was not specified in the request, the detectSentiment field is false in the response.
    */
  var detectSentiment: js.UndefOr[Boolean] = js.native
  /**
    * If status is FAILED, Amazon Lex provides the reason that it failed to build the bot.
    */
  var failureReason: js.UndefOr[String] = js.native
  /**
    * The maximum length of time that Amazon Lex retains the data gathered in a conversation. For more information, see PutBot.
    */
  var idleSessionTTLInSeconds: js.UndefOr[SessionTTL] = js.native
  /**
    * An array of Intent objects. For more information, see PutBot.
    */
  var intents: js.UndefOr[IntentList] = js.native
  /**
    * The date that the bot was updated. When you create a resource, the creation date and last updated date are the same.
    */
  var lastUpdatedDate: js.UndefOr[js.Date] = js.native
  /**
    *  The target locale for the bot. 
    */
  var locale: js.UndefOr[Locale] = js.native
  /**
    * The name of the bot.
    */
  var name: js.UndefOr[BotName] = js.native
  /**
    *  When you send a request to create a bot with processBehavior set to BUILD, Amazon Lex sets the status response element to BUILDING. In the READY_BASIC_TESTING state you can test the bot with user inputs that exactly match the utterances configured for the bot's intents and values in the slot types. If Amazon Lex can't build the bot, Amazon Lex sets status to FAILED. Amazon Lex returns the reason for the failure in the failureReason response element.  When you set processBehavior to SAVE, Amazon Lex sets the status code to NOT BUILT. When the bot is in the READY state you can test and publish the bot.
    */
  var status: js.UndefOr[Status] = js.native
  /**
    * A list of tags associated with the bot.
    */
  var tags: js.UndefOr[TagList] = js.native
  /**
    * The version of the bot. For a new bot, the version is always $LATEST.
    */
  var version: js.UndefOr[Version] = js.native
  /**
    * The Amazon Polly voice ID that Amazon Lex uses for voice interaction with the user. For more information, see PutBot.
    */
  var voiceId: js.UndefOr[String] = js.native
}

object PutBotResponse {
  @scala.inline
  def apply(): PutBotResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutBotResponse]
  }
  @scala.inline
  implicit class PutBotResponseOps[Self <: PutBotResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withChildDirected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childDirected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildDirected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childDirected")(js.undefined)
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
    def withLocale(value: Locale): Self = {
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
    def withName(value: BotName): Self = {
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
    def withStatus(value: Status): Self = {
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
    def withVersion(value: Version): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
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

