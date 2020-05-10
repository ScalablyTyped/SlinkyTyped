package typingsSlinky.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response extends js.Object {
  var card: js.UndefOr[Card] = js.native
  var directives: js.UndefOr[js.Any] = js.native
  var outputSpeech: js.UndefOr[OutputSpeech] = js.native
  var reprompt: js.UndefOr[Reprompt] = js.native
  var shouldEndSession: js.UndefOr[Boolean] = js.native
}

object Response {
  @scala.inline
  def apply(): Response = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Response]
  }
  @scala.inline
  implicit class ResponseOps[Self <: Response] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCard(value: Card): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("card")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("card")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectives(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectives: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directives")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputSpeech(value: OutputSpeech): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputSpeech")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputSpeech: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputSpeech")(js.undefined)
        ret
    }
    @scala.inline
    def withReprompt(value: Reprompt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reprompt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReprompt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reprompt")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldEndSession(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldEndSession")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldEndSession: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldEndSession")(js.undefined)
        ret
    }
  }
  
}

