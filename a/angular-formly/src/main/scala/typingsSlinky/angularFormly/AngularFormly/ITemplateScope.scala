package typingsSlinky.angularFormly.AngularFormly

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.angular.mod.IFormController
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * see http://docs.angular-formly.com/docs/custom-templates#templates-scope
	 */
@js.native
trait ITemplateScope extends js.Object {
  //Shortcut to options.formControl
  var fc: IFormController | js.Array[IFormController] = js.native
  //all the fields for the form
  var fields: IFieldArray = js.native
  //the form controller the field is in
  var form: js.Any = js.native
  //The object passed as options.formState to the formly-form directive. Use this to share state between fields.
  var formState: js.Object = js.native
  //The id of the field. You shouldn't have to use this.
  var id: String = js.native
  //The index of the field the form is on (in ng-repeat)
  var index: Double = js.native
  //the model of the form (or the model specified by the field if it was specified).
  var model: js.UndefOr[StringDictionary[js.Any]] = js.native
  var options: ITemplateScopeOptions = js.native
  //Shortcut to options.validation.errorExistsAndShouldBeVisible
  var showError: Boolean = js.native
  //Shortcut to options.templateOptions
  var to: ITemplateOptions = js.native
}

object ITemplateScope {
  @scala.inline
  def apply(
    fc: IFormController | js.Array[IFormController],
    fields: IFieldArray,
    form: js.Any,
    formState: js.Object,
    id: String,
    index: Double,
    options: ITemplateScopeOptions,
    showError: Boolean,
    to: ITemplateOptions
  ): ITemplateScope = {
    val __obj = js.Dynamic.literal(fc = fc.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], form = form.asInstanceOf[js.Any], formState = formState.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], showError = showError.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITemplateScope]
  }
  @scala.inline
  implicit class ITemplateScopeOps[Self <: ITemplateScope] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFc(value: IFormController | js.Array[IFormController]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFields(value: IFieldArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForm(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("form")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormState(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: ITemplateScopeOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTo(value: ITemplateOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModel(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(js.undefined)
        ret
    }
  }
  
}

