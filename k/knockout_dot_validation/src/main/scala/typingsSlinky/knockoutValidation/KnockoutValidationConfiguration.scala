package typingsSlinky.knockoutValidation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutValidationConfiguration extends js.Object {
  /**
    * Allows HTML in validation messages
    */
  var allowHtmlMessages: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether css error classes are added only
    * when properties are modified or at all times
    * @type {[type]}
    */
  var decorateElementOnModified: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether to assign an error class to the <input> tag
    * when your property is invalid
    */
  var decorateInputElement: js.UndefOr[Boolean] = js.native
  /**
    * If defined, the CSS class assigned to both <input> and validation message elements
    */
  var errorClass: js.UndefOr[String] = js.native
  /**
    * The CSS class assigned to validation error <input> elements, must have decorateInputElement set to true
    */
  var errorElementClass: js.UndefOr[String] = js.native
  /**
    * The CSS class assigned to validation error messages
    */
  var errorMessageClass: js.UndefOr[String] = js.native
  /**
    * Shows tooltips using input 'title' attribute. False hides them
    */
  var errorsAsTitle: js.UndefOr[Boolean] = js.native
  /**
    * Shows the error when hovering the input field (decorateElement must be true)
    */
  var errorsAsTitleOnModified: js.UndefOr[Boolean] = js.native
  var grouping: js.UndefOr[KnockoutValidationGroupingOptions] = js.native
  /**
    * Supply the HTML5 input types validation will be
    * added to. Defaults to ["email", "number", "date"]
    */
  var html5InputTypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * If true validation will insert either a <span> element or the template
    * specified by messageTemplate after any element (e.g. <input>)
    * that uses a KO value binding with a validated field
    */
  var insertMessages: js.UndefOr[Boolean] = js.native
  /**
    * The id of the <script type="text/html"></script>
    * that you want to use for all your validation messages
    */
  var messageTemplate: js.UndefOr[String] = js.native
  /**
    * Indicates whether validation messages are triggered only
    * when properties are modified or at all times
    */
  var messagesOnModified: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether to assign validation rules to your ViewModel
    * using HTML5 validation attributes
    */
  var parseInputAttributes: js.UndefOr[Boolean] = js.native
  /**
    * Register custom validation rules defined via ko.validation.rules
    */
  var registerExtenders: js.UndefOr[Boolean] = js.native
  var validate: js.UndefOr[KnockoutValidationValidateOptions] = js.native
  /**
    * Add HTML5 input validation attributes to form elements
    * that ko observable's are bound to
    */
  var writeInputAttributes: js.UndefOr[Boolean] = js.native
}

object KnockoutValidationConfiguration {
  @scala.inline
  def apply(): KnockoutValidationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KnockoutValidationConfiguration]
  }
  @scala.inline
  implicit class KnockoutValidationConfigurationOps[Self <: KnockoutValidationConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowHtmlMessages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowHtmlMessages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowHtmlMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowHtmlMessages")(js.undefined)
        ret
    }
    @scala.inline
    def withDecorateElementOnModified(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decorateElementOnModified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecorateElementOnModified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decorateElementOnModified")(js.undefined)
        ret
    }
    @scala.inline
    def withDecorateInputElement(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decorateInputElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecorateInputElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decorateInputElement")(js.undefined)
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
    def withErrorElementClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorElementClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorElementClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorElementClass")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorMessageClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessageClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessageClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessageClass")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorsAsTitle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorsAsTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorsAsTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorsAsTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorsAsTitleOnModified(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorsAsTitleOnModified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorsAsTitleOnModified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorsAsTitleOnModified")(js.undefined)
        ret
    }
    @scala.inline
    def withGrouping(value: KnockoutValidationGroupingOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grouping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrouping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grouping")(js.undefined)
        ret
    }
    @scala.inline
    def withHtml5InputTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html5InputTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtml5InputTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html5InputTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertMessages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertMessages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertMessages")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withMessagesOnModified(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messagesOnModified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessagesOnModified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messagesOnModified")(js.undefined)
        ret
    }
    @scala.inline
    def withParseInputAttributes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseInputAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParseInputAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseInputAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withRegisterExtenders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerExtenders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegisterExtenders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerExtenders")(js.undefined)
        ret
    }
    @scala.inline
    def withValidate(value: KnockoutValidationValidateOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.undefined)
        ret
    }
    @scala.inline
    def withWriteInputAttributes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeInputAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWriteInputAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeInputAttributes")(js.undefined)
        ret
    }
  }
  
}

