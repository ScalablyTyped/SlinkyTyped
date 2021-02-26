package typingsSlinky.jqueryValidation

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLFormElement
import typingsSlinky.jquery.JQueryEventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JQueryValidation {
  
  type ErrorDictionary = StringDictionary[String]
  
  @js.native
  trait ErrorListItem extends StObject {
    
    var element: HTMLElement = js.native
    
    var message: String = js.native
  }
  object ErrorListItem {
    
    @scala.inline
    def apply(element: HTMLElement, message: String): ErrorListItem = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorListItem]
    }
    
    @scala.inline
    implicit class ErrorListItemMutableBuilder[Self <: ErrorListItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  type RulesDictionary = StringDictionary[js.Any]
  
  type ShouldValidatePredicate = Boolean | ValidatePredicate
  
  type ValidatePredicate = js.Function2[/* element */ HTMLElement, /* event */ JQueryEventObject, Unit]
  
  @js.native
  trait ValidationOptions extends StObject {
    
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
    implicit class ValidationOptionsMutableBuilder[Self <: ValidationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setErrorClass(value: String): Self = StObject.set(x, "errorClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorClassUndefined: Self = StObject.set(x, "errorClass", js.undefined)
      
      @scala.inline
      def setErrorContainer(value: String): Self = StObject.set(x, "errorContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorContainerUndefined: Self = StObject.set(x, "errorContainer", js.undefined)
      
      @scala.inline
      def setErrorElement(value: String): Self = StObject.set(x, "errorElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorElementUndefined: Self = StObject.set(x, "errorElement", js.undefined)
      
      @scala.inline
      def setErrorLabelContainer(value: String): Self = StObject.set(x, "errorLabelContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorLabelContainerUndefined: Self = StObject.set(x, "errorLabelContainer", js.undefined)
      
      @scala.inline
      def setErrorPlacement(value: (/* error */ JQuery, /* element */ JQuery) => Unit): Self = StObject.set(x, "errorPlacement", js.Any.fromFunction2(value))
      
      @scala.inline
      def setErrorPlacementUndefined: Self = StObject.set(x, "errorPlacement", js.undefined)
      
      @scala.inline
      def setFocusCleanup(value: Boolean): Self = StObject.set(x, "focusCleanup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusCleanupUndefined: Self = StObject.set(x, "focusCleanup", js.undefined)
      
      @scala.inline
      def setFocusInvalid(value: Boolean): Self = StObject.set(x, "focusInvalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusInvalidUndefined: Self = StObject.set(x, "focusInvalid", js.undefined)
      
      @scala.inline
      def setGroups(value: StringDictionary[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
      
      @scala.inline
      def setHighlight(value: (/* element */ HTMLElement, /* errorClass */ String, /* validClass */ String) => Unit): Self = StObject.set(x, "highlight", js.Any.fromFunction3(value))
      
      @scala.inline
      def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
      
      @scala.inline
      def setIgnore(value: String): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreTitle(value: Boolean): Self = StObject.set(x, "ignoreTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreTitleUndefined: Self = StObject.set(x, "ignoreTitle", js.undefined)
      
      @scala.inline
      def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      @scala.inline
      def setInvalidHandler(value: (/* event */ JQueryEventObject, /* validator */ Validator) => Unit): Self = StObject.set(x, "invalidHandler", js.Any.fromFunction2(value))
      
      @scala.inline
      def setInvalidHandlerUndefined: Self = StObject.set(x, "invalidHandler", js.undefined)
      
      @scala.inline
      def setMessages(value: js.Object): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      @scala.inline
      def setMeta(value: String): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      @scala.inline
      def setOnclick(value: ShouldValidatePredicate): Self = StObject.set(x, "onclick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnclickFunction2(value: (/* element */ HTMLElement, /* event */ JQueryEventObject) => Unit): Self = StObject.set(x, "onclick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnclickUndefined: Self = StObject.set(x, "onclick", js.undefined)
      
      @scala.inline
      def setOnfocusin(value: (/* element */ HTMLElement, /* event */ JQueryEventObject) => Unit): Self = StObject.set(x, "onfocusin", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnfocusinUndefined: Self = StObject.set(x, "onfocusin", js.undefined)
      
      @scala.inline
      def setOnfocusout(value: ShouldValidatePredicate): Self = StObject.set(x, "onfocusout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnfocusoutFunction2(value: (/* element */ HTMLElement, /* event */ JQueryEventObject) => Unit): Self = StObject.set(x, "onfocusout", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnfocusoutUndefined: Self = StObject.set(x, "onfocusout", js.undefined)
      
      @scala.inline
      def setOnkeyup(value: ShouldValidatePredicate): Self = StObject.set(x, "onkeyup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnkeyupFunction2(value: (/* element */ HTMLElement, /* event */ JQueryEventObject) => Unit): Self = StObject.set(x, "onkeyup", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnkeyupUndefined: Self = StObject.set(x, "onkeyup", js.undefined)
      
      @scala.inline
      def setOnsubmit(value: Boolean): Self = StObject.set(x, "onsubmit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnsubmitUndefined: Self = StObject.set(x, "onsubmit", js.undefined)
      
      @scala.inline
      def setRules(value: RulesDictionary): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      @scala.inline
      def setShowErrors(value: (/* errorMap */ ErrorDictionary, /* errorList */ js.Array[ErrorListItem]) => Unit): Self = StObject.set(x, "showErrors", js.Any.fromFunction2(value))
      
      @scala.inline
      def setShowErrorsUndefined: Self = StObject.set(x, "showErrors", js.undefined)
      
      @scala.inline
      def setSubmitHandler(value: (/* form */ HTMLFormElement, /* event */ js.UndefOr[JQueryEventObject]) => Unit): Self = StObject.set(x, "submitHandler", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSubmitHandlerUndefined: Self = StObject.set(x, "submitHandler", js.undefined)
      
      @scala.inline
      def setSuccess(value: String | (js.Function2[/* $label */ JQuery, /* validatedInput */ HTMLElement, Unit])): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessFunction2(value: (/* $label */ JQuery, /* validatedInput */ HTMLElement) => Unit): Self = StObject.set(x, "success", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
      
      @scala.inline
      def setUnhighlight(value: (/* element */ HTMLElement, /* errorClass */ String, /* validClass */ String) => Unit): Self = StObject.set(x, "unhighlight", js.Any.fromFunction3(value))
      
      @scala.inline
      def setUnhighlightUndefined: Self = StObject.set(x, "unhighlight", js.undefined)
      
      @scala.inline
      def setValidClass(value: String): Self = StObject.set(x, "validClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidClassUndefined: Self = StObject.set(x, "validClass", js.undefined)
      
      @scala.inline
      def setWrapper(value: String): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
    }
  }
  
  @js.native
  trait Validator extends StObject {
    
    def checkForm(): Boolean = js.native
    
    def destroy(): Unit = js.native
    
    def element(element: String): Boolean = js.native
    def element(element: JQuery): Boolean = js.native
    
    def elementValue(element: Element): js.Any = js.native
    
    var errorList: js.Array[ErrorListItem] = js.native
    
    var errorMap: ErrorDictionary = js.native
    
    def focusInvalid(): Unit = js.native
    
    /**
      * Validates the form, returns true if it is valid, false otherwise.
      */
    def form(): Boolean = js.native
    
    def hideErrors(): Unit = js.native
    
    def invalidElements(): js.Array[HTMLElement] = js.native
    
    /**
      * Returns the number of invalid fields.
      */
    def numberOfInvalids(): Double = js.native
    
    /**
      * Resets the controlled form.
      */
    def resetForm(): Unit = js.native
    
    var settings: ValidationOptions = js.native
    
    /**
      * Show the specified messages.
      *
      * @param errors One or more key/value pairs of input names and messages.
      */
    def showErrors(errors: js.Any): Unit = js.native
    
    def size(): Double = js.native
    
    def valid(): Boolean = js.native
    
    def validElements(): js.Array[HTMLElement] = js.native
  }
  
  @js.native
  trait ValidatorStatic extends StObject {
    
    /**
      * Add a compound class method - useful to refactor common combinations of rules into a single class.
      *
      * @param name The name of the class rule to add
      * @param rules The compound rules
      */
    def addClassRules(name: String, rules: RulesDictionary): Unit = js.native
    /**
      * Add a compound class method - useful to refactor common combinations of rules into a single class.
      *
      * @param rules A map of className-rules pairs
      */
    def addClassRules(rules: RulesDictionary): Unit = js.native
    
    /**
      * Add a custom validation method. It must consist of a name (must be a legal javascript identifier), a javascript based function and a default string message or a message generating function.
      *
      * @param name The name of the method used to identify it and referencing it; this must be a valid JavaScript identifier
      * @param method The actual method implementation, returning true if an element is valid. First argument: Current value. Second argument: Validated element. Third argument: Parameters.
      * @param message a default string message or a Message generator. First argument: Parameters. Second argument: Validated element.
      */
    def addMethod(
      name: String,
      method: js.Function3[/* value */ js.Any, /* element */ HTMLElement, /* params */ js.Any, Boolean]
    ): Unit = js.native
    def addMethod(
      name: String,
      method: js.Function3[/* value */ js.Any, /* element */ HTMLElement, /* params */ js.Any, Boolean],
      message: String
    ): Unit = js.native
    def addMethod(
      name: String,
      method: js.Function3[/* value */ js.Any, /* element */ HTMLElement, /* params */ js.Any, Boolean],
      message: js.Function2[/* params */ js.Any, /* element */ HTMLElement, String]
    ): Unit = js.native
    
    /**
      * Replaces {n} placeholders with arguments.
      *
      * @param template The string to format.
      */
    def format(template: String): js.Function1[/* repeated */ js.Any, String] = js.native
    def format(template: String, args: js.Any*): String = js.native
    
    var messages: StringDictionary[String] = js.native
    
    var methods: StringDictionary[js.Function] = js.native
    
    /**
      * Modify default settings for validation.
      *
      * @param options Options to set as default.
      */
    def setDefaults(defaults: ValidationOptions): Unit = js.native
  }
}
