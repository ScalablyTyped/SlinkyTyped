package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a SimpleResponse. */
@js.native
trait ISimpleResponse extends js.Object {
  /** SimpleResponse displayText */
  var displayText: js.UndefOr[String | Null] = js.native
  /** SimpleResponse ssml */
  var ssml: js.UndefOr[String | Null] = js.native
  /** SimpleResponse textToSpeech */
  var textToSpeech: js.UndefOr[String | Null] = js.native
}

object ISimpleResponse {
  @scala.inline
  def apply(): ISimpleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISimpleResponse]
  }
  @scala.inline
  implicit class ISimpleResponseOps[Self <: ISimpleResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayText")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayTextNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayText")(null)
        ret
    }
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
    def withTextToSpeech(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textToSpeech")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextToSpeech: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textToSpeech")(js.undefined)
        ret
    }
    @scala.inline
    def withTextToSpeechNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textToSpeech")(null)
        ret
    }
  }
  
}

