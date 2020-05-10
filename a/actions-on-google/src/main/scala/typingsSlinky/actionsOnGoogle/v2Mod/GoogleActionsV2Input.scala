package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2Input extends js.Object {
  /**
    * A list of provided argument values for the input requested by the Action.
    */
  var arguments: js.UndefOr[js.Array[GoogleActionsV2Argument]] = js.native
  /**
    * Indicates the user's intent. For the first conversation turn, the intent
    * will refer to the triggering intent for the Action. For
    * subsequent conversation turns, the intent will be a common Actions on
    * Google intent (starts with 'actions.').
    * For example, if the expected input is `actions.intent.OPTION`, then the
    * the intent specified here will either be `actions.intent.OPTION` if the
    * Google Assistant was able to satisfy that intent, or
    * `actions.intent.TEXT` if the user provided other information.
    * See https://developers.google.com/actions/reference/rest/intents.
    */
  var intent: js.UndefOr[String] = js.native
  /**
    * Raw input transcription from each turn of conversation.
    * Multiple conversation turns may be required for Actions on Google to
    * provide some types of input to the Action.
    */
  var rawInputs: js.UndefOr[js.Array[GoogleActionsV2RawInput]] = js.native
}

object GoogleActionsV2Input {
  @scala.inline
  def apply(): GoogleActionsV2Input = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2Input]
  }
  @scala.inline
  implicit class GoogleActionsV2InputOps[Self <: GoogleActionsV2Input] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArguments(value: js.Array[GoogleActionsV2Argument]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arguments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArguments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arguments")(js.undefined)
        ret
    }
    @scala.inline
    def withIntent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intent")(js.undefined)
        ret
    }
    @scala.inline
    def withRawInputs(value: js.Array[GoogleActionsV2RawInput]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawInputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRawInputs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawInputs")(js.undefined)
        ret
    }
  }
  
}

