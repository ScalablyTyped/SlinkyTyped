package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a GetIntentRequest. */
@js.native
trait IGetIntentRequest extends js.Object {
  /** GetIntentRequest intentView */
  var intentView: js.UndefOr[IntentView | Null] = js.native
  /** GetIntentRequest languageCode */
  var languageCode: js.UndefOr[String | Null] = js.native
  /** GetIntentRequest name */
  var name: js.UndefOr[String | Null] = js.native
}

object IGetIntentRequest {
  @scala.inline
  def apply(): IGetIntentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGetIntentRequest]
  }
  @scala.inline
  implicit class IGetIntentRequestOps[Self <: IGetIntentRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

