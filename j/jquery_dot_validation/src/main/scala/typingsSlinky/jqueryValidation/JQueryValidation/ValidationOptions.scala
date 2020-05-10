package typingsSlinky.jqueryValidation.JQueryValidation

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLFormElement
import typingsSlinky.jquery.JQueryEventObject
import typingsSlinky.jqueryValidation.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationOptions extends js.Object {
  /**
    * Enables debug mode. If true, the form is not submitted and certain errors are displayed on the console
    * (will check if a window.console property exists). Try to enable when a form is just submitted instead of validation stopping the submit.
    *
    * default: false
    */
  var debug: js.UndefOr[Boolean] = js.native
  /**
    * Use this class to create error labels, to look for existing error labels and to add it to invalid elements.
    *
    * default: "error"
    */
  var errorClass: js.UndefOr[String] = js.native
  /**
    * Hide and show this container when validating.
    */
  var errorContainer: js.UndefOr[String] = js.native
  /**
    * Use this element type to create error messages and to look for existing error messages. The default, "label",
    * has the advantage of creating a meaningful link between error message and invalid field using the for attribute (which is always used, regardless of element type).
    *
    * default: "label"
    */
  var errorElement: js.UndefOr[String] = js.native
  /**
    * Hide and show this container when validating. (eg "#messageBox")
    */
  var errorLabelContainer: js.UndefOr[String] = js.native
  /**
    * Customize placement of created error labels. First argument: The created error label as a jQuery object. Second argument: The invalid element as a jQuery object.
    *
    * default: Places the error label after the invalid element
    */
  var errorPlacement: js.UndefOr[js.Function2[/* error */ JQuery, /* element */ JQuery, Unit]] = js.native
  /**
    * If enabled, removes the errorClass from the invalid elements and hides all error messages whenever the element is focused.
    * Avoid combination with focusInvalid.
    *
    * default: false
    */
  var focusCleanup: js.UndefOr[Boolean] = js.native
  /**
    * Focus the last active or first invalid element on submit via validator.focusInvalid(). The last active element is the one
    * that had focus when the form was submitted, avoiding stealing its focus. If there was no element focused, the first one
    * in the form gets it, unless this option is turned off.
    *
    * default: true
    */
  var focusInvalid: js.UndefOr[Boolean] = js.native
  /**
    * Specify grouping of error messages. A group consists of an arbitrary group name as the key and a space separated list of
    * element names as the value. Use errorPlacement to control where the group message is placed.
    */
  var groups: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * How to highlight invalid fields. Override to decide which fields and how to highlight.
    *
    * default: Adds errorClass (see the option) to the element
    */
  var highlight: js.UndefOr[
    js.Function3[/* element */ HTMLElement, /* errorClass */ String, /* validClass */ String, Unit]
  ] = js.native
  /**
    * Elements to ignore when validating, simply filtering them out. jQuery's not-method is used, therefore everything that is
    * accepted by not() can be passed as this option. Inputs of type submit and reset are always ignored, so are disabled elements.
    */
  var ignore: js.UndefOr[String] = js.native
  /**
    * Set to skip reading messages from the title attribute, helps to avoid issues with Google Toolbar; default is false for compability,
    * the message-from-title is likely to be completely removed in a future release.
    *
    * default: false
    */
  var ignoreTitle: js.UndefOr[Boolean] = js.native
  /**
    * Callback for custom code when an invalid form is submitted. Called with an event object as the first argument, and the validator
    * as the second.
    */
  var invalidHandler: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* validator */ Validator, Unit]] = js.native
  /**
    * Key/value pairs defining custom messages. Key is the name of an element, value the message to display for that element. Instead
    * of a plain message, another map with specific messages for each rule can be used. Overrides the title attribute of an element or
    * the default message for the method (in that order). Each message can be a String or a Callback. The callback is called in the scope
    * of the validator, with the rule's parameters as the first argument and the element as the second, and must return a String to display
    * as the message.
    *
    * default: the default message for the method used
    */
  var messages: js.UndefOr[js.Object] = js.native
  var meta: js.UndefOr[String] = js.native
  /**
    * Boolean or Function. Validate checkboxes and radio buttons on click. Set to false to disable.
    *
    * Set to a Function to decide for yourself when to run validation.
    * A boolean true is not a valid value.
    */
  var onclick: js.UndefOr[ShouldValidatePredicate] = js.native
  /**
    * Function. Validate elements when user focuses in. If omitted hides all other fields marked as invalid.
    *
    * Set to a custom Function to decide for yourself when to run validation.
    */
  var onfocusin: js.UndefOr[ValidatePredicate] = js.native
  /**
    * Boolean or Function. Validate elements (except checkboxes/radio buttons) on blur. If nothing is entered, all rules are skipped, except when the field was already marked as invalid.
    *
    * Set to a Function to decide for yourself when to run validation.
    * A boolean true is not a valid value.
    */
  var onfocusout: js.UndefOr[ShouldValidatePredicate] = js.native
  /**
    * Boolean or Function. Validate elements on keyup. As long as the field is not marked as invalid, nothing happens.
    * Otherwise, all rules are checked on each key up event. Set to false to disable.
    *
    * Set to a Function to decide for yourself when to run validation.
    * A boolean true is not a valid value.
    */
  var onkeyup: js.UndefOr[ShouldValidatePredicate] = js.native
  /**
    * Validate the form on submit. Set to false to use only other events for validation.
    * Set to a Function to decide for yourself when to run validation.
    * A boolean true is not a valid value.
    *
    * default: true
    */
  var onsubmit: js.UndefOr[Boolean] = js.native
  /**
    * A custom message display handler. Gets the map of errors as the first argument and an array of errors as the second,
    * called in the context of the validator object. The arguments contain only those elements currently validated,
    * which can be a single element when doing validation onblur/keyup. You can trigger (in addition to your own messages)
    * the default behaviour by calling this.defaultShowErrors().
    */
  var rules: js.UndefOr[RulesDictionary] = js.native
  /**
    * A custom message display handler. Gets the map of errors as the first argument and an array of errors as the second,
    * called in the context of the validator object. The arguments contain only those elements currently validated, which can
    * be a single element when doing validation onblur/keyup. You can trigger (in addition to your own messages) the default
    * behaviour by calling this.defaultShowErrors().
    */
  var showErrors: js.UndefOr[
    js.Function2[/* errorMap */ ErrorDictionary, /* errorList */ js.Array[ErrorListItem], Unit]
  ] = js.native
  /**
    * Callback for handling the actual submit when the form is valid. Gets the form and the event object. Replaces the default submit.
    * The right place to submit a form via Ajax after it is validated.
    */
  var submitHandler: js.UndefOr[
    js.Function2[/* form */ HTMLFormElement, /* event */ js.UndefOr[JQueryEventObject], Unit]
  ] = js.native
  /**
    * String or Function. If specified, the error label is displayed to show a valid element. If a String is given, it is added as
    * a class to the label. If a Function is given, it is called with the label (as a jQuery object) and the validated input (as a DOM element).
    * The label can be used to add a text like "ok!".
    */
  var success: js.UndefOr[
    String | (js.Function2[/* $label */ JQuery, /* validatedInput */ HTMLElement, Unit])
  ] = js.native
  /**
    * Called to revert changes made by option highlight, same arguments as highlight.
    *
    * default: Removes the errorClass
    */
  var unhighlight: js.UndefOr[
    js.Function3[/* element */ HTMLElement, /* errorClass */ String, /* validClass */ String, Unit]
  ] = js.native
  /**
    * This class is added to an element after it was validated and considered valid.
    *
    * default: "valid"
    */
  var validClass: js.UndefOr[String] = js.native
  /**
    * Wrap error labels with the specified element. Useful in combination with errorLabelContainer to create a list of error messages.
    *
    * default: window
    */
  var wrapper: js.UndefOr[String] = js.native
}

object ValidationOptions {
  @scala.inline
  def apply(): ValidationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidationOptions]
  }
  @scala.inline
  implicit class ValidationOptionsOps[Self <: ValidationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorClass")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorContainer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorElement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorElement")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorLabelContainer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorLabelContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorLabelContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorLabelContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorPlacement(value: (/* error */ JQuery, /* element */ JQuery) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorPlacement")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutErrorPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorPlacement")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusCleanup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusCleanup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusCleanup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusCleanup")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusInvalid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusInvalid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusInvalid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusInvalid")(js.undefined)
        ret
    }
    @scala.inline
    def withGroups(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlight(value: (/* element */ HTMLElement, /* errorClass */ String, /* validClass */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlight")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutHighlight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlight")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnore(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreTitle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withInvalidHandler(value: (/* event */ JQueryEventObject, /* validator */ Validator) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidHandler")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutInvalidHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withMessages(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(js.undefined)
        ret
    }
    @scala.inline
    def withMeta(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(js.undefined)
        ret
    }
    @scala.inline
    def withOnclickFunction2(value: (/* element */ HTMLElement, /* event */ JQueryEventObject) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onclick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnclick(value: ShouldValidatePredicate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onclick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnclick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onclick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnfocusin(value: (/* element */ HTMLElement, /* event */ JQueryEventObject) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onfocusin")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnfocusin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onfocusin")(js.undefined)
        ret
    }
    @scala.inline
    def withOnfocusoutFunction2(value: (/* element */ HTMLElement, /* event */ JQueryEventObject) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onfocusout")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnfocusout(value: ShouldValidatePredicate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onfocusout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnfocusout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onfocusout")(js.undefined)
        ret
    }
    @scala.inline
    def withOnkeyupFunction2(value: (/* element */ HTMLElement, /* event */ JQueryEventObject) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onkeyup")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnkeyup(value: ShouldValidatePredicate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onkeyup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnkeyup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onkeyup")(js.undefined)
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
    def withRules(value: RulesDictionary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(js.undefined)
        ret
    }
    @scala.inline
    def withShowErrors(value: (/* errorMap */ ErrorDictionary, /* errorList */ js.Array[ErrorListItem]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showErrors")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutShowErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withSubmitHandler(value: (/* form */ HTMLFormElement, /* event */ js.UndefOr[JQueryEventObject]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submitHandler")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSubmitHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submitHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccessFunction2(value: (/* $label */ JQuery, /* validatedInput */ HTMLElement) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSuccess(value: String | (js.Function2[/* $label */ JQuery, /* validatedInput */ HTMLElement, Unit])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.undefined)
        ret
    }
    @scala.inline
    def withUnhighlight(value: (/* element */ HTMLElement, /* errorClass */ String, /* validClass */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unhighlight")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutUnhighlight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unhighlight")(js.undefined)
        ret
    }
    @scala.inline
    def withValidClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validClass")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapper(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapper")(js.undefined)
        ret
    }
  }
  
}

