package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a TelephonySynthesizeSpeech. */
@js.native
trait ITelephonySynthesizeSpeech extends js.Object {
  /** TelephonySynthesizeSpeech ssml */
  var ssml: js.UndefOr[String | Null] = js.native
  /** TelephonySynthesizeSpeech text */
  var text: js.UndefOr[String | Null] = js.native
}

object ITelephonySynthesizeSpeech {
  @scala.inline
  def apply(): ITelephonySynthesizeSpeech = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITelephonySynthesizeSpeech]
  }
  @scala.inline
  implicit class ITelephonySynthesizeSpeechOps[Self <: ITelephonySynthesizeSpeech] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSsml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSsml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssml")(js.undefined)
        ret
    }
    @scala.inline
    def withSsmlNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssml")(null)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withTextNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(null)
        ret
    }
  }
  
}

