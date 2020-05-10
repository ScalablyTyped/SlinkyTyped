package typingsSlinky.actionsOnGoogle.v2Mod

import typingsSlinky.actionsOnGoogle.commonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2Argument extends js.Object {
  /**
    * Specified when query pattern includes a `$org.schema.type.YesNo` type or
    * expected input has a built-in intent: `actions.intent.CONFIRMATION`.
    * NOTE: if the boolean value is missing, it represents `false`.
    */
  var boolValue: js.UndefOr[Boolean] = js.native
  /**
    * Specified for the built-in intent: `actions.intent.DATETIME`.
    */
  var datetimeValue: js.UndefOr[GoogleActionsV2DateTime] = js.native
  /**
    * Extension whose type depends on the argument.
    * For example, if the argument name is `SIGN_IN` for the
    * `actions.intent.SIGN_IN` intent, then this extension will
    * contain a SignInValue value.
    */
  var extension: js.UndefOr[ApiClientObjectMap[_]] = js.native
  /**
    * Specified for built-in intent: \"actions.intent.NUMBER\"
    */
  var floatValue: js.UndefOr[Double] = js.native
  /**
    * Specified when query pattern includes a $org.schema.type.Number type or
    * expected input has a built-in intent: \"assistant.intent.action.NUMBER\".
    */
  var intValue: js.UndefOr[String] = js.native
  /**
    * Name of the argument being provided for the input.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Specified when query pattern includes a $org.schema.type.Location type or
    * expected input has a built-in intent: \"actions.intent.PLACE\".
    */
  var placeValue: js.UndefOr[GoogleActionsV2Location] = js.native
  /**
    * The raw text, typed or spoken, that provided the value for the argument.
    */
  var rawText: js.UndefOr[String] = js.native
  /**
    * Specified when an error was encountered while computing the argument. For
    * example, the built-in intent \"actions.intent.PLACE\" can return an error
    * status if the user denied the permission to access their device location.
    */
  var status: js.UndefOr[GoogleRpcStatus] = js.native
  /**
    * Specified when Google needs to pass data value in JSON format.
    */
  var structuredValue: js.UndefOr[ApiClientObjectMap[_]] = js.native
  /**
    * Specified when query pattern includes a `$org.schema.type.Text` type or
    * expected input has a built-in intent: `actions.intent.TEXT`, or
    * `actions.intent.OPTION`. Note that for the `OPTION` intent, we set the
    * `text_value` as option key, the `raw_text` above will indicate the raw
    * span in user's query.
    */
  var textValue: js.UndefOr[String] = js.native
}

object GoogleActionsV2Argument {
  @scala.inline
  def apply(): GoogleActionsV2Argument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2Argument]
  }
  @scala.inline
  implicit class GoogleActionsV2ArgumentOps[Self <: GoogleActionsV2Argument] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoolValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boolValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoolValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boolValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDatetimeValue(value: GoogleActionsV2DateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datetimeValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatetimeValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datetimeValue")(js.undefined)
        ret
    }
    @scala.inline
    def withExtension(value: ApiClientObjectMap[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extension")(js.undefined)
        ret
    }
    @scala.inline
    def withFloatValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloatValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatValue")(js.undefined)
        ret
    }
    @scala.inline
    def withIntValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intValue")(js.undefined)
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
    def withPlaceValue(value: GoogleActionsV2Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeValue")(js.undefined)
        ret
    }
    @scala.inline
    def withRawText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRawText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawText")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: GoogleRpcStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withStructuredValue(value: ApiClientObjectMap[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structuredValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStructuredValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structuredValue")(js.undefined)
        ret
    }
    @scala.inline
    def withTextValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textValue")(js.undefined)
        ret
    }
  }
  
}

