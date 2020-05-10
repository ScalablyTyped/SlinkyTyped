package typingsSlinky.angularFormly.AngularFormly

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * see http://docs.angular-formly.com/docs/ngmodelattrstemplatemanipulator
	 */
@js.native
trait ITemplateOptions
  extends /* key */ StringDictionary[js.Any] {
  var description: js.UndefOr[String] = js.native
  // both attribute or regular attribute
  var disabled: js.UndefOr[Boolean] = js.native
  var groupProp: js.UndefOr[String] = js.native
  //Bootstrap types
  var label: js.UndefOr[String] = js.native
    // default: value
  var labelProp: js.UndefOr[String] = js.native
  //attribute only
  var max: js.UndefOr[Double] = js.native
  var maxlength: js.UndefOr[Double] = js.native
  var min: js.UndefOr[Double] = js.native
  var minlength: js.UndefOr[Double] = js.native
  //expression types
  var onBlur: js.UndefOr[String | IExpressionFunction] = js.native
  var onChange: js.UndefOr[String | IExpressionFunction] = js.native
  var onClick: js.UndefOr[String | IExpressionFunction] = js.native
  var onFocus: js.UndefOr[String | IExpressionFunction] = js.native
  var onKeydown: js.UndefOr[String | IExpressionFunction] = js.native
  var onKeypress: js.UndefOr[String | IExpressionFunction] = js.native
  var onKeyup: js.UndefOr[String | IExpressionFunction] = js.native
  // types for select/radio fields
  var options: js.UndefOr[js.Array[ISelectOption]] = js.native
  var pattern: js.UndefOr[String] = js.native
  var placeholder: js.UndefOr[Double | String] = js.native
  var required: js.UndefOr[Boolean] = js.native
  var tabindex: js.UndefOr[Double] = js.native
  var `type`: js.UndefOr[String] = js.native
    // default: group
  var valueProp: js.UndefOr[String] = js.native
}

object ITemplateOptions {
  @scala.inline
  def apply(): ITemplateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITemplateOptions]
  }
  @scala.inline
  implicit class ITemplateOptionsOps[Self <: ITemplateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupProp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupProp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupProp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupProp")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelProp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelProp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelProp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelProp")(js.undefined)
        ret
    }
    @scala.inline
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
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
    def withMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
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
    def withOnBlurFunction3(value: (/* $viewValue */ js.Any, /* $modelValue */ js.Any, /* scope */ ITemplateScope) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withOnBlur(value: String | IExpressionFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChangeFunction3(value: (/* $viewValue */ js.Any, /* $modelValue */ js.Any, /* scope */ ITemplateScope) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withOnChange(value: String | IExpressionFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClickFunction3(value: (/* $viewValue */ js.Any, /* $modelValue */ js.Any, /* scope */ ITemplateScope) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withOnClick(value: String | IExpressionFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFocusFunction3(value: (/* $viewValue */ js.Any, /* $modelValue */ js.Any, /* scope */ ITemplateScope) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withOnFocus(value: String | IExpressionFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeydownFunction3(value: (/* $viewValue */ js.Any, /* $modelValue */ js.Any, /* scope */ ITemplateScope) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeydown")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withOnKeydown(value: String | IExpressionFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeydown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnKeydown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeydown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeypressFunction3(value: (/* $viewValue */ js.Any, /* $modelValue */ js.Any, /* scope */ ITemplateScope) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeypress")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withOnKeypress(value: String | IExpressionFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeypress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnKeypress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeypress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyupFunction3(value: (/* $viewValue */ js.Any, /* $modelValue */ js.Any, /* scope */ ITemplateScope) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyup")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withOnKeyup(value: String | IExpressionFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnKeyup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyup")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: js.Array[ISelectOption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withPattern(value: String): Self = {
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
    def withPlaceholder(value: Double | String): Self = {
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
    def withRequired(value: Boolean): Self = {
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
    def withTabindex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabindex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabindex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabindex")(js.undefined)
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
    @scala.inline
    def withValueProp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueProp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueProp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueProp")(js.undefined)
        ret
    }
  }
  
}

