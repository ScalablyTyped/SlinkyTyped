package typingsSlinky.braintreeWeb.mod

import typingsSlinky.braintreeWeb.anon.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fields used in {@link module:braintree-web/hosted-fields~fieldOptions fields options}
  * @typedef {object} field
  * @property {string} selector A CSS selector to find the container where the hosted field will be inserted.
  * @property {string} [placeholder] Will be used as the `placeholder` attribute of the input. If `placeholder` is not natively supported by the browser, it will be polyfilled.
  * @property {string} [type] Will be used as the `type` attribute of the input. To mask `cvv` input, for instance, `type: "password"` can be used.
  * @property {boolean} [formatInput=true] - Enable or disable automatic formatting on this field.
  * @property {object|boolean} [select] If truthy, this field becomes a `<select>` dropdown list. This can only be used for `expirationMonth` and `expirationYear` fields.
  * @property {string[]} [select.options] An array of 12 strings, one per month. This can only be used for the `expirationMonth` field. For example, the array can look like `['01 - January', '02 - February', ...]`.
  * @property {boolean | HostedFieldsFieldMaskInput} [maskInput] Enable or disable input masking when input is not focused. If set to `true` instead of an object, the defaults for the `maskInput` parameters will be used.
  */
@js.native
trait HostedFieldsField extends js.Object {
  var formatInput: js.UndefOr[Boolean] = js.native
  var maskInput: js.UndefOr[Boolean | HostedFieldsFieldMaskInput] = js.native
  var maxCardLength: js.UndefOr[Double] = js.native
  var maxlength: js.UndefOr[Double] = js.native
  var minlength: js.UndefOr[Double] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var prefill: js.UndefOr[String] = js.native
  var rejectUnsupportedCards: js.UndefOr[Boolean] = js.native
  var select: js.UndefOr[Boolean | Options] = js.native
  var selector: String = js.native
  var `type`: js.UndefOr[String] = js.native
}

object HostedFieldsField {
  @scala.inline
  def apply(selector: String): HostedFieldsField = {
    val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostedFieldsField]
  }
  @scala.inline
  implicit class HostedFieldsFieldOps[Self <: HostedFieldsField] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormatInput(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatInput")(js.undefined)
        ret
    }
    @scala.inline
    def withMaskInput(value: Boolean | HostedFieldsFieldMaskInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaskInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskInput")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxCardLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxCardLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxCardLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxCardLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxlength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxlength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxlength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxlength")(js.undefined)
        ret
    }
    @scala.inline
    def withMinlength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minlength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinlength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minlength")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefill(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefill")(js.undefined)
        ret
    }
    @scala.inline
    def withRejectUnsupportedCards(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectUnsupportedCards")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRejectUnsupportedCards: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectUnsupportedCards")(js.undefined)
        ret
    }
    @scala.inline
    def withSelect(value: Boolean | Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

