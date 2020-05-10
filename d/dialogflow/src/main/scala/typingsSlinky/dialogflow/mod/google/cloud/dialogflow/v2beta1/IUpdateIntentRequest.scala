package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1

import typingsSlinky.dialogflow.mod.google.protobuf.IFieldMask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an UpdateIntentRequest. */
@js.native
trait IUpdateIntentRequest extends js.Object {
  /** UpdateIntentRequest intent */
  var intent: js.UndefOr[IIntent | Null] = js.native
  /** UpdateIntentRequest intentView */
  var intentView: js.UndefOr[IntentView | Null] = js.native
  /** UpdateIntentRequest languageCode */
  var languageCode: js.UndefOr[String | Null] = js.native
  /** UpdateIntentRequest updateMask */
  var updateMask: js.UndefOr[IFieldMask | Null] = js.native
}

object IUpdateIntentRequest {
  @scala.inline
  def apply(): IUpdateIntentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IUpdateIntentRequest]
  }
  @scala.inline
  implicit class IUpdateIntentRequestOps[Self <: IUpdateIntentRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIntent(value: IIntent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intent")(js.undefined)
        ret
    }
    @scala.inline
    def withIntentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intent")(null)
        ret
    }
    @scala.inline
    def withIntentView(value: IntentView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intentView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntentView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intentView")(js.undefined)
        ret
    }
    @scala.inline
    def withIntentViewNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intentView")(null)
        ret
    }
    @scala.inline
    def withLanguageCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguageCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageCode")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguageCodeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageCode")(null)
        ret
    }
    @scala.inline
    def withUpdateMask(value: IFieldMask): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMask")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateMaskNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMask")(null)
        ret
    }
  }
  
}

