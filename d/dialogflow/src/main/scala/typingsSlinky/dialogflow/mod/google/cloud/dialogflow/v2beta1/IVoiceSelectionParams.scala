package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a VoiceSelectionParams. */
@js.native
trait IVoiceSelectionParams extends js.Object {
  /** VoiceSelectionParams name */
  var name: js.UndefOr[String | Null] = js.native
  /** VoiceSelectionParams ssmlGender */
  var ssmlGender: js.UndefOr[SsmlVoiceGender | Null] = js.native
}

object IVoiceSelectionParams {
  @scala.inline
  def apply(): IVoiceSelectionParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IVoiceSelectionParams]
  }
  @scala.inline
  implicit class IVoiceSelectionParamsOps[Self <: IVoiceSelectionParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(null)
        ret
    }
    @scala.inline
    def withSsmlGender(value: SsmlVoiceGender): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssmlGender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSsmlGender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssmlGender")(js.undefined)
        ret
    }
    @scala.inline
    def withSsmlGenderNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssmlGender")(null)
        ret
    }
  }
  
}

