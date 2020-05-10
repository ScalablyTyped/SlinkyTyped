package typingsSlinky.awsSdk.lexruntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSessionResponse extends js.Object {
  /**
    * Describes the current state of the bot.
    */
  var dialogAction: js.UndefOr[DialogAction] = js.native
  /**
    * An array of information about the intents used in the session. The array can contain a maximum of three summaries. If more than three intents are used in the session, the recentIntentSummaryView operation contains information about the last three intents used. If you set the checkpointLabelFilter parameter in the request, the array contains only the intents with the specified label.
    */
  var recentIntentSummaryView: js.UndefOr[IntentSummaryList] = js.native
  /**
    * Map of key/value pairs representing the session-specific context information. It contains application information passed between Amazon Lex and a client application.
    */
  var sessionAttributes: js.UndefOr[StringMap] = js.native
  /**
    * A unique identifier for the session.
    */
  var sessionId: js.UndefOr[String] = js.native
}

object GetSessionResponse {
  @scala.inline
  def apply(): GetSessionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSessionResponse]
  }
  @scala.inline
  implicit class GetSessionResponseOps[Self <: GetSessionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialogAction(value: DialogAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDialogAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogAction")(js.undefined)
        ret
    }
    @scala.inline
    def withRecentIntentSummaryView(value: IntentSummaryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recentIntentSummaryView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecentIntentSummaryView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recentIntentSummaryView")(js.undefined)
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
  }
  
}

