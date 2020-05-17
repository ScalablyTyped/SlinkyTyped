package typingsSlinky.awsLambda.lexMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsLambda.anon.Alias
import typingsSlinky.awsLambda.anon.ConfirmationStatus
import typingsSlinky.awsLambda.awsLambdaStrings.DialogCodeHook
import typingsSlinky.awsLambda.awsLambdaStrings.FulfillmentCodeHook
import typingsSlinky.awsLambda.awsLambdaStrings.Text
import typingsSlinky.awsLambda.awsLambdaStrings.Voice
import typingsSlinky.awsLambda.awsLambdaStrings.`1Dot0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LexEvent extends js.Object {
  var bot: Alias = js.native
  var currentIntent: ConfirmationStatus = js.native
  var inputTranscript: String = js.native
  var invocationSource: DialogCodeHook | FulfillmentCodeHook = js.native
  var messageVersion: `1Dot0` = js.native
  var outputDialogMode: Text | Voice = js.native
  var requestAttributes: StringDictionary[String] | Null = js.native
  var sessionAttributes: StringDictionary[String] = js.native
  var userId: String = js.native
}

object LexEvent {
  @scala.inline
  def apply(
    bot: Alias,
    currentIntent: ConfirmationStatus,
    inputTranscript: String,
    invocationSource: DialogCodeHook | FulfillmentCodeHook,
    messageVersion: `1Dot0`,
    outputDialogMode: Text | Voice,
    sessionAttributes: StringDictionary[String],
    userId: String
  ): LexEvent = {
    val __obj = js.Dynamic.literal(bot = bot.asInstanceOf[js.Any], currentIntent = currentIntent.asInstanceOf[js.Any], inputTranscript = inputTranscript.asInstanceOf[js.Any], invocationSource = invocationSource.asInstanceOf[js.Any], messageVersion = messageVersion.asInstanceOf[js.Any], outputDialogMode = outputDialogMode.asInstanceOf[js.Any], sessionAttributes = sessionAttributes.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexEvent]
  }
  @scala.inline
  implicit class LexEventOps[Self <: LexEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBot(value: Alias): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentIntent(value: ConfirmationStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentIntent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputTranscript(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputTranscript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvocationSource(value: DialogCodeHook | FulfillmentCodeHook): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invocationSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageVersion(value: `1Dot0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputDialogMode(value: Text | Voice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputDialogMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSessionAttributes(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestAttributes(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestAttributesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestAttributes")(null)
        ret
    }
  }
  
}

