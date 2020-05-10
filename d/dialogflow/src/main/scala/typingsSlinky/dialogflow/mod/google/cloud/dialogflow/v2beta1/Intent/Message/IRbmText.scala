package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a RbmText. */
@js.native
trait IRbmText extends js.Object {
  /** RbmText rbmSuggestion */
  var rbmSuggestion: js.UndefOr[js.Array[IRbmSuggestion] | Null] = js.native
  /** RbmText text */
  var text: js.UndefOr[String | Null] = js.native
}

object IRbmText {
  @scala.inline
  def apply(): IRbmText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRbmText]
  }
  @scala.inline
  implicit class IRbmTextOps[Self <: IRbmText] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRbmSuggestion(value: js.Array[IRbmSuggestion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rbmSuggestion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRbmSuggestion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rbmSuggestion")(js.undefined)
        ret
    }
    @scala.inline
    def withRbmSuggestionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rbmSuggestion")(null)
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

