package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2FinalResponse extends js.Object {
  /**
    * Rich response when user is not required to provide an input.
    */
  var richResponse: js.UndefOr[GoogleActionsV2RichResponse] = js.native
  /**
    * Spoken response when user is not required to provide an input.
    */
  var speechResponse: js.UndefOr[GoogleActionsV2SpeechResponse] = js.native
}

object GoogleActionsV2FinalResponse {
  @scala.inline
  def apply(): GoogleActionsV2FinalResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2FinalResponse]
  }
  @scala.inline
  implicit class GoogleActionsV2FinalResponseOps[Self <: GoogleActionsV2FinalResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withSpeechResponse(value: GoogleActionsV2SpeechResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speechResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpeechResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speechResponse")(js.undefined)
        ret
    }
  }
  
}

