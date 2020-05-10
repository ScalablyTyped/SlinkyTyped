package typingsSlinky.actionsOnGoogle.v1Mod

import typingsSlinky.actionsOnGoogle.actionsOnGoogleNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialogflowV1MessageText
  extends DialogflowV1BaseMessage[`0`]
     with DialogflowV1Message {
  var speech: js.UndefOr[String] = js.native
}

object DialogflowV1MessageText {
  @scala.inline
  def apply(): DialogflowV1MessageText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogflowV1MessageText]
  }
  @scala.inline
  implicit class DialogflowV1MessageTextOps[Self <: DialogflowV1MessageText] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSpeech(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speech")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpeech: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speech")(js.undefined)
        ret
    }
  }
  
}

