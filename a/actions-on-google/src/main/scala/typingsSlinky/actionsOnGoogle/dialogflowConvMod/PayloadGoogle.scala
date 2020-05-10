package typingsSlinky.actionsOnGoogle.dialogflowConvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PayloadGoogle extends js.Object {
  var google: GoogleAssistantResponse = js.native
}

object PayloadGoogle {
  @scala.inline
  def apply(google: GoogleAssistantResponse): PayloadGoogle = {
    val __obj = js.Dynamic.literal(google = google.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayloadGoogle]
  }
  @scala.inline
  implicit class PayloadGoogleOps[Self <: PayloadGoogle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGoogle(value: GoogleAssistantResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("google")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

