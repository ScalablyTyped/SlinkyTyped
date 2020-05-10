package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2ExpectedInput extends js.Object {
  /**
    * The customized prompt used to ask user for input.
    */
  var inputPrompt: js.UndefOr[GoogleActionsV2InputPrompt] = js.native
  /**
    * List of intents that can be used to fulfill this input.
    * To have Actions on Google just return the raw user input, the app
    * should ask for the `actions.intent.TEXT` intent.
    */
  var possibleIntents: js.UndefOr[js.Array[GoogleActionsV2ExpectedIntent]] = js.native
  /**
    * List of phrases the Action wants Google to use for speech biasing.
    * Up to 1000 phrases are allowed.
    */
  var speechBiasingHints: js.UndefOr[js.Array[String]] = js.native
}

object GoogleActionsV2ExpectedInput {
  @scala.inline
  def apply(): GoogleActionsV2ExpectedInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2ExpectedInput]
  }
  @scala.inline
  implicit class GoogleActionsV2ExpectedInputOps[Self <: GoogleActionsV2ExpectedInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputPrompt(value: GoogleActionsV2InputPrompt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputPrompt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputPrompt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputPrompt")(js.undefined)
        ret
    }
    @scala.inline
    def withPossibleIntents(value: js.Array[GoogleActionsV2ExpectedIntent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("possibleIntents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPossibleIntents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("possibleIntents")(js.undefined)
        ret
    }
    @scala.inline
    def withSpeechBiasingHints(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speechBiasingHints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpeechBiasingHints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speechBiasingHints")(js.undefined)
        ret
    }
  }
  
}

