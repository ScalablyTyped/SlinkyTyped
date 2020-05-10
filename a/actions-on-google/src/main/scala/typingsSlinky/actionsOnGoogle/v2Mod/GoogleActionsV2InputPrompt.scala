package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2InputPrompt extends js.Object {
  /**
    * Initial prompts asking user to provide an input.
    * Only a single initial_prompt is supported.
    */
  var initialPrompts: js.UndefOr[js.Array[GoogleActionsV2SpeechResponse]] = js.native
  /**
    * Prompt used to ask user when there is no input from user.
    */
  var noInputPrompts: js.UndefOr[js.Array[GoogleActionsV2SimpleResponse]] = js.native
  /**
    * Prompt payload.
    */
  var richInitialPrompt: js.UndefOr[GoogleActionsV2RichResponse] = js.native
}

object GoogleActionsV2InputPrompt {
  @scala.inline
  def apply(): GoogleActionsV2InputPrompt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2InputPrompt]
  }
  @scala.inline
  implicit class GoogleActionsV2InputPromptOps[Self <: GoogleActionsV2InputPrompt] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInitialPrompts(value: js.Array[GoogleActionsV2SpeechResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialPrompts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialPrompts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialPrompts")(js.undefined)
        ret
    }
    @scala.inline
    def withNoInputPrompts(value: js.Array[GoogleActionsV2SimpleResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noInputPrompts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoInputPrompts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noInputPrompts")(js.undefined)
        ret
    }
    @scala.inline
    def withRichInitialPrompt(value: GoogleActionsV2RichResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("richInitialPrompt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRichInitialPrompt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("richInitialPrompt")(js.undefined)
        ret
    }
  }
  
}

