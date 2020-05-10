package typingsSlinky.actionsOnGoogle.dialogflowConvMod

import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2RichResponse
import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2SimpleResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleAssistantResponse extends js.Object {
  var expectUserResponse: js.UndefOr[Boolean] = js.native
  var isSsml: js.UndefOr[Boolean] = js.native
  var noInputPrompts: js.UndefOr[js.Array[GoogleActionsV2SimpleResponse]] = js.native
  var richResponse: js.UndefOr[GoogleActionsV2RichResponse] = js.native
  var speechBiasingHints: js.UndefOr[js.Array[String]] = js.native
  var systemIntent: js.UndefOr[SystemIntent] = js.native
  var userStorage: js.UndefOr[String] = js.native
}

object GoogleAssistantResponse {
  @scala.inline
  def apply(): GoogleAssistantResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAssistantResponse]
  }
  @scala.inline
  implicit class GoogleAssistantResponseOps[Self <: GoogleAssistantResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpectUserResponse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expectUserResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpectUserResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expectUserResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSsml(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSsml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSsml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSsml")(js.undefined)
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
    def withRichResponse(value: GoogleActionsV2RichResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("richResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRichResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("richResponse")(js.undefined)
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
    @scala.inline
    def withSystemIntent(value: SystemIntent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemIntent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSystemIntent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemIntent")(js.undefined)
        ret
    }
    @scala.inline
    def withUserStorage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userStorage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserStorage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userStorage")(js.undefined)
        ret
    }
  }
  
}

