package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgValidator
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Gets/Sets Credit Card number validation rule options.Note: This rule will only validate the checksum of the number using Luhn algorithm irregardless of card type.
  	 *
  	 *
  	 * Valid values:
  	 * "boolean" A boolean value indicating if the field should be a valid Credit Card number.
  	 * "object" A configuration object with optional error message (e.g. creditCard: { errorMessage: "Enter a valid card number"} )
  	 */
  var creditCard: js.UndefOr[Boolean | js.Object] = js.native
  /**
  	 * Gets/Sets a custom function to perform validation. Use 'this' to reference the calling validator and the value and optional field settings arguments to determine and return the state of the field.
  	 *
  	 *
  	 * Valid values:
  	 * "function" The function to call
  	 * "string" Function name, must be in global namespace (window["name"])
  	 * "object" A configuration object with method property being the function and optional error message.
  	 */
  var custom: js.UndefOr[js.Function | String | js.Object] = js.native
  /**
  	 * Gets/Sets date validation rule options. This can additionally help guide the [valueRange](ui.igvalidator#options:valueRange) validation.Note: Dependant on JavaScript Date parsing which will accept a wide range of values.
  	 *
  	 *
  	 * Valid values:
  	 * "boolean" A boolean value indicating if the field should be a valid JavaScript Date or can be parsed as one.
  	 * "object" A configuration object with optional error message (e.g. date: { errorMessage: "Enter a valid number"} )
  	 */
  var date: js.UndefOr[Boolean | js.Object] = js.native
  /**
  	 * Gets/Sets email validation rule options. Uses a RegExp defined in the "$.ui.igValidator.defaults" object.
  	 *
  	 *
  	 * Valid values:
  	 * "boolean" A boolean value indicating if the field should be an email.
  	 * "object" A configuration object with optional error message (e.g. email: { errorMessage: "Enter a valid email"} )
  	 */
  var email: js.UndefOr[Boolean | js.Object] = js.native
  /**
  	 * Gets/Sets a requirement for the value in this field to be the same as another input element or editor control.
  	 *
  	 *
  	 * Valid values:
  	 * "string" A valid jQuery selector for the target element
  	 * "object" A reference to the jQuery object for the target or an object with selector property and custom errorMessage.
  	 */
  var equalTo: js.UndefOr[String | js.Object] = js.native
  /**
  	 * Event raised for invalid field after value was validated but before any action takes effect.
  	 * Function takes arguments evt and ui.
  	 */
  var error: js.UndefOr[ErrorEvent] = js.native
  /**
  	 * Event which is raised after error message was hidden.
  	 *
  	 * Function takes arguments evt and ui.
  	 */
  var errorHidden: js.UndefOr[ErrorHiddenEvent] = js.native
  /**
  	 * Event which is raised before error message is hidden.
  	 * Return false in order to keep the error message displayed.
  	 *
  	 * Function takes arguments evt and ui.
  	 */
  var errorHiding: js.UndefOr[ErrorHidingEvent] = js.native
  /**
  	 * Gets/Sets text for an error message to be used if none is set for the particular rule. Overrides default rule-specific error messages.
  	 *
  	 */
  var errorMessage: js.UndefOr[String] = js.native
  /**
  	 * Event which is raised before error message is displayed.
  	 * Return false in order to prevent error message display.
  	 *
  	 * Function takes arguments evt and ui.
  	 */
  var errorShowing: js.UndefOr[ErrorShowingEvent] = js.native
  /**
  	 * Event which is raised after error message was displayed.
  	 *
  	 * Function takes arguments evt and ui.
  	 */
  var errorShown: js.UndefOr[ErrorShownEvent] = js.native
  /**
  	 * Gets/Sets if all rules for a field should be checked, so even if one fails the rest will continue executing.
  	 * Note: This will not force checks on an empty field for rules that don't normally execute without a value.
  	 *
  	 */
  var executeAllRules: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets a list of target field items describing each with validation options and a required selector. Fields can contain any of the validation rules and triggers but not other fields or event handlers.
  	 * Applicable options are also inherited from the global control configuration if not set.
  	 *
  	 */
  var fields: js.UndefOr[js.Array[IgValidatorField]] = js.native
  /**
  	 * Event triggered on Validator instance level after failed validation on form submit event.
  	 *
  	 * Function takes arguments evt and ui.
  	 */
  var formError: js.UndefOr[FormErrorEvent] = js.native
  /**
  	 * Event triggered on Validator instance level after successful validation on form submit event.
  	 *
  	 * Function takes arguments evt and ui.
  	 */
  var formSuccess: js.UndefOr[FormSuccessEvent] = js.native
  /**
  	 * Event triggered on Validator instance level after validation on form submit event..
  	 *
  	 * Function takes arguments evt and ui.
  	 */
  var formValidated: js.UndefOr[FormValidatedEvent] = js.native
  /**
  	 * Event triggered on Validator instance level before handling a form submit event.
  	 * Return false to cancel to skip validating and potentially allow the submit if no other other validators return error.
  	 *
  	 * Function takes arguments evt and ui.
  	 */
  var formValidating: js.UndefOr[FormValidatingEvent] = js.native
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets a minimum and/or maximum length of text or number of selected items. Null or 0 values are ignored.
  	 *
  	 *
  	 * Valid values:
  	 * "array" An array of two numbers, where the first value is the minimum and the second is the maximum. (e.g. lengthRange: [ 1, 10] )
  	 * "object" A configuration object with optional error message. Message strings can contain format items for min and max respectively (e.g. lengthRange: { min: 6, max: 20, errorMessage: "Password must be at least {0} long and no more than {1}." } )
  	 */
  var lengthRange: js.UndefOr[js.Array[_] | js.Object] = js.native
  /**
  	 * Set/Get the locale setting for the widget.
  	 *
  	 */
  var locale: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets/Sets a custom jQuery element to be used for validation messages. That inner HTML of the target is modified, can be a SPAN, LABEL or DIV.
  	 *
  	 */
  var messageTarget: js.UndefOr[Element] = js.native
  /**
  	 * Gets/Sets the options for the [igNotifier](ui.ignotifier#options) used to show error messages.
  	 *
  	 */
  var notificationOptions: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets/Sets number validation rule options.Default separators for decimals and thousands are '.' and ',' respectively and are defined in the "$.ui.igValidator.defaults" object.
  	 *
  	 *
  	 * Valid values:
  	 * "boolean" A boolean value indicating if the field should be a number. Default separators are used.
  	 * "object" A configuration object with errorMessage, decimalSeparator and thousandsSeparator. Those properties are all optional.
  	 */
  var number: js.UndefOr[Boolean | js.Object] = js.native
  /**
  	 * Gets/Sets whether validation is triggered when the editor loses focus.
  	 *
  	 */
  var onblur: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets/Sets whether validation is triggered when the text in editor changes.
  	 * Note that this is more appropriate for selection controls such as checkbox, combo or rating.
  	 * As it can cause excessive messages with text-based fields, the initial validation can be delayed via the [threshold](ui.igvalidator#options:threshold) option.
  	 *
  	 */
  var onchange: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets/Sets whether validation is triggered when a form containing validation targets is submitting. If any of the validations fail, the submit action will be prevented.
  	 * Note that this doesn't apply to the native JavaScript submit function, but will handle the jQuery equivalent and the browser default action.
  	 *
  	 */
  var onsubmit: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets/Sets the option to show a label indication next to optional fields.
  	 * Note: Indicators are not supported on grouped controls such as checkbox or radio button sets and the igRating control.
  	 *
  	 */
  var optionalIndication: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets/Sets regular expression validation rule options.
  	 *
  	 *
  	 * Valid values:
  	 * "string" A string containing regular expression.
  	 * "object" A RegExp object or an object with expression and errorMessage properties.
  	 */
  var pattern: js.UndefOr[String | js.Object] = js.native
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[String | js.Object] = js.native
  /**
  	 * Gets/Sets option to validate if a value was entered (not empty text, selected item, etc.)
  	 *
  	 *
  	 * Valid values:
  	 * "boolean" A boolean value indicating if the field is required.
  	 * "object" A configuration object with optional error message (e.g. required: { errorMessage: "Error!"} )
  	 */
  var required: js.UndefOr[Boolean | js.Object] = js.native
  /**
  	 * Gets/Sets the option to show an asterisks indication next to required fields.
  	 * Note: Indicators are not supported on grouped controls such as checkbox or radio button sets and the igRating control.
  	 *
  	 */
  var requiredIndication: js.UndefOr[Boolean] = js.native
  /**
  	 * Event raised for valid field after value was validated but before any action takes effect.
  	 * Function takes arguments evt and ui.
  	 */
  var success: js.UndefOr[SuccessEvent] = js.native
  /**
  	 * Event which is raised after success message was hidden.
  	 *
  	 * Function takes arguments evt and ui.
  	 */
  var successHidden: js.UndefOr[SuccessHiddenEvent] = js.native
  /**
  	 * Event which is raised before success message is hidden.
  	 * Return false in order to keep success message displayed.
  	 *
  	 * Function takes arguments evt and ui.
  	 */
  var successHiding: js.UndefOr[SuccessHidingEvent] = js.native
  /**
  	 * Gets/Sets text for a success message. Note that since there is no default, setting this message will enable showing success indication.
  	 *
  	 */
  var successMessage: js.UndefOr[String] = js.native
  /**
  	 * Event which is raised before success message is displayed.
  	 * Return false in order to prevent success message display.
  	 *
  	 * Function takes arguments evt and ui.
  	 */
  var successShowing: js.UndefOr[SuccessShowingEvent] = js.native
  /**
  	 * Event which is raised after success message was displayed.
  	 *
  	 * Function takes arguments evt and ui.
  	 */
  var successShown: js.UndefOr[SuccessShownEvent] = js.native
  /**
  	 * Gets/Sets validation minimum input length. Validation won't be triggered for input before that value is reached on change and focus loss.
  	 * Note: This will not affect required fields on form submit.
  	 *
  	 */
  var threshold: js.UndefOr[Double] = js.native
  /**
  	 * Event which is raised after value was validated but before any action takes effect.
  	 *
  	 * Function takes arguments evt and ui.
  	 */
  var validated: js.UndefOr[ValidatedEvent] = js.native
  /**
  	 * Event which is raised on validation before default validation logic is applied.
  	 * Return false in order to cancel the event and consider the field valid.
  	 *
  	 * Function takes arguments evt and ui.
  	 */
  var validating: js.UndefOr[ValidatingEvent] = js.native
  /**
  	 * Gets/Sets a minimum and/or maximum value. Null values are ignored.
  	 *
  	 *
  	 * Valid values:
  	 * "array" An array of two numbers or dates, where the first is the minimum and the second is the maximum. (e.g. valueRange: [ 1, 10] )
  	 * "object" A configuration object with optional error message. Message strings can contain format items for min and max respectively (e.g. lengthRange: { min: 6, max: 20, errorMessage: "Value must be between {0} and {1}." } )
  	 */
  var valueRange: js.UndefOr[js.Array[_] | js.Object] = js.native
}

object IgValidator {
  @scala.inline
  def apply(): IgValidator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgValidator]
  }
  @scala.inline
  implicit class IgValidatorOps[Self <: IgValidator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreditCard(value: Boolean | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creditCard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreditCard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creditCard")(js.undefined)
        ret
    }
    @scala.inline
    def withCustom(value: js.Function | String | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(js.undefined)
        ret
    }
    @scala.inline
    def withDate(value: Boolean | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(js.undefined)
        ret
    }
    @scala.inline
    def withEmail(value: Boolean | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.undefined)
        ret
    }
    @scala.inline
    def withEqualTo(value: String | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equalTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEqualTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equalTo")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: (/* event */ Event_, /* ui */ ErrorEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorHidden(value: (/* event */ Event_, /* ui */ ErrorHiddenEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorHidden")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutErrorHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorHiding(value: (/* event */ Event_, /* ui */ ErrorHidingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorHiding")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutErrorHiding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorHiding")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorShowing(value: (/* event */ Event_, /* ui */ ErrorShowingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorShowing")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutErrorShowing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorShowing")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorShown(value: (/* event */ Event_, /* ui */ ErrorShownEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorShown")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutErrorShown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorShown")(js.undefined)
        ret
    }
    @scala.inline
    def withExecuteAllRules(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executeAllRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecuteAllRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executeAllRules")(js.undefined)
        ret
    }
    @scala.inline
    def withFields(value: js.Array[IgValidatorField]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withFormError(value: (/* event */ Event_, /* ui */ FormErrorEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formError")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFormError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formError")(js.undefined)
        ret
    }
    @scala.inline
    def withFormSuccess(value: (/* event */ Event_, /* ui */ FormSuccessEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formSuccess")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFormSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formSuccess")(js.undefined)
        ret
    }
    @scala.inline
    def withFormValidated(value: (/* event */ Event_, /* ui */ FormValidatedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formValidated")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFormValidated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formValidated")(js.undefined)
        ret
    }
    @scala.inline
    def withFormValidating(value: (/* event */ Event_, /* ui */ FormValidatingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formValidating")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFormValidating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formValidating")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withLengthRange(value: js.Array[_] | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lengthRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLengthRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lengthRange")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageTarget(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withNumber(value: Boolean | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(js.undefined)
        ret
    }
    @scala.inline
    def withOnblur(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onblur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnblur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onblur")(js.undefined)
        ret
    }
    @scala.inline
    def withOnchange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onchange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnchange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onchange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnsubmit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onsubmit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnsubmit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onsubmit")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionalIndication(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionalIndication")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionalIndication: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionalIndication")(js.undefined)
        ret
    }
    @scala.inline
    def withPattern(value: String | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(js.undefined)
        ret
    }
    @scala.inline
    def withRegional(value: String | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegional: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regional")(js.undefined)
        ret
    }
    @scala.inline
    def withRequired(value: Boolean | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(js.undefined)
        ret
    }
    @scala.inline
    def withRequiredIndication(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredIndication")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequiredIndication: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredIndication")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(value: (/* event */ Event_, /* ui */ SuccessEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccessHidden(value: (/* event */ Event_, /* ui */ SuccessHiddenEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successHidden")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSuccessHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccessHiding(value: (/* event */ Event_, /* ui */ SuccessHidingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successHiding")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSuccessHiding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successHiding")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccessMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuccessMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccessShowing(value: (/* event */ Event_, /* ui */ SuccessShowingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successShowing")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSuccessShowing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successShowing")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccessShown(value: (/* event */ Event_, /* ui */ SuccessShownEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successShown")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSuccessShown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successShown")(js.undefined)
        ret
    }
    @scala.inline
    def withThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(js.undefined)
        ret
    }
    @scala.inline
    def withValidated(value: (/* event */ Event_, /* ui */ ValidatedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validated")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutValidated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validated")(js.undefined)
        ret
    }
    @scala.inline
    def withValidating(value: (/* event */ Event_, /* ui */ ValidatingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validating")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutValidating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validating")(js.undefined)
        ret
    }
    @scala.inline
    def withValueRange(value: js.Array[_] | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueRange")(js.undefined)
        ret
    }
  }
  
}

