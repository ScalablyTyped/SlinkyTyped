package typingsSlinky.facebookJsSdk.facebook

import typingsSlinky.facebookJsSdk.anon.Name
import typingsSlinky.facebookJsSdk.facebookJsSdkStrings.app_non_users
import typingsSlinky.facebookJsSdk.facebookJsSdkStrings.app_users
import typingsSlinky.facebookJsSdk.facebookJsSdkStrings.apprequests
import typingsSlinky.facebookJsSdk.facebookJsSdkStrings.askfor
import typingsSlinky.facebookJsSdk.facebookJsSdkStrings.send
import typingsSlinky.facebookJsSdk.facebookJsSdkStrings.turn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GameRequestDialogParams extends DialogParams {
  var action_type: js.UndefOr[send | askfor | turn] = js.native
  var data: js.UndefOr[String] = js.native
  var exclude_ids: js.UndefOr[js.Array[String]] = js.native
  var filters: js.UndefOr[app_users | app_non_users | js.Array[Name]] = js.native
  var max_recipients: js.UndefOr[Double] = js.native
  var message: String = js.native
  var method: apprequests = js.native
  var object_id: js.UndefOr[String] = js.native
  var suggestions: js.UndefOr[js.Array[String]] = js.native
  var title: js.UndefOr[String] = js.native
  var to: js.UndefOr[String | Double] = js.native
}

object GameRequestDialogParams {
  @scala.inline
  def apply(message: String, method: apprequests): GameRequestDialogParams = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[GameRequestDialogParams]
  }
  @scala.inline
  implicit class GameRequestDialogParamsOps[Self <: GameRequestDialogParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethod(value: apprequests): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAction_type(value: send | askfor | turn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action_type")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withExclude_ids(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude_ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclude_ids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude_ids")(js.undefined)
        ret
    }
    @scala.inline
    def withFilters(value: app_users | app_non_users | js.Array[Name]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(js.undefined)
        ret
    }
    @scala.inline
    def withMax_recipients(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_recipients")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax_recipients: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_recipients")(js.undefined)
        ret
    }
    @scala.inline
    def withObject_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObject_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object_id")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestions")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTo(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(js.undefined)
        ret
    }
  }
  
}

