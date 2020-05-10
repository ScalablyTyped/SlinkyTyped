package typingsSlinky.reactJsonschemaForm.mod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import typingsSlinky.jsonSchema.mod.JSONSchema6
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormProps[T] extends js.Object {
  var ArrayFieldTemplate: js.UndefOr[ReactComponentClass[ArrayFieldTemplateProps[_]]] = js.native
  var ErrorList: js.UndefOr[ReactComponentClass[ErrorListProps]] = js.native
  var FieldTemplate: js.UndefOr[ReactComponentClass[FieldTemplateProps]] = js.native
  var ObjectFieldTemplate: js.UndefOr[ReactComponentClass[ObjectFieldTemplateProps[_]]] = js.native
  var acceptcharset: js.UndefOr[String] = js.native
  var action: js.UndefOr[String] = js.native
  var additionalMetaSchemas: js.UndefOr[js.Array[js.Object]] = js.native
  var autocomplete: js.UndefOr[String] = js.native
  var className: js.UndefOr[String] = js.native
  var customFormats: js.UndefOr[
    StringDictionary[String | js.RegExp | (js.Function1[/* data */ String, Boolean])]
  ] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var enctype: js.UndefOr[String] = js.native
  var fields: js.UndefOr[StringDictionary[Field]] = js.native
  var formContext: js.UndefOr[js.Any] = js.native
  var formData: js.UndefOr[T] = js.native
  // HTML Attributes
  var id: js.UndefOr[String] = js.native
  var idPrefix: js.UndefOr[String] = js.native
  var liveOmit: js.UndefOr[Boolean] = js.native
  var liveValidate: js.UndefOr[Boolean] = js.native
  var method: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var noHtml5Validate: js.UndefOr[Boolean] = js.native
  var noValidate: js.UndefOr[Boolean] = js.native
  var omitExtraData: js.UndefOr[Boolean] = js.native
  var onBlur: js.UndefOr[
    js.Function2[/* id */ String, /* value */ Boolean | Double | String | Null, Unit]
  ] = js.native
  var onChange: js.UndefOr[js.Function2[/* e */ IChangeEvent[T], /* es */ js.UndefOr[ErrorSchema], _]] = js.native
  var onError: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.native
  var onSubmit: js.UndefOr[js.Function1[/* e */ ISubmitEvent[T], _]] = js.native
  var safeRenderCompletion: js.UndefOr[Boolean] = js.native
  var schema: JSONSchema6 = js.native
  var showErrorList: js.UndefOr[Boolean] = js.native
  var tagName: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 177 */ js.Any
  ] = js.native
  var target: js.UndefOr[String] = js.native
  var transformErrors: js.UndefOr[js.Function1[/* errors */ js.Array[AjvError], js.Array[AjvError]]] = js.native
  var uiSchema: js.UndefOr[UiSchema] = js.native
  var validate: js.UndefOr[js.Function2[/* formData */ T, /* errors */ FormValidation, FormValidation]] = js.native
  var widgets: js.UndefOr[StringDictionary[Widget]] = js.native
}

object FormProps {
  @scala.inline
  def apply[T](schema: JSONSchema6): FormProps[T] = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormProps[T]]
  }
  @scala.inline
  implicit class FormPropsOps[Self[t] <: FormProps[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withSchema(value: JSONSchema6): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArrayFieldTemplate(value: ReactComponentClass[ArrayFieldTemplateProps[_]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArrayFieldTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrayFieldTemplate: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArrayFieldTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorList(value: ReactComponentClass[ErrorListProps]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorList: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorList")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldTemplate(value: ReactComponentClass[FieldTemplateProps]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FieldTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldTemplate: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FieldTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectFieldTemplate(value: ReactComponentClass[ObjectFieldTemplateProps[_]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectFieldTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectFieldTemplate: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectFieldTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withAcceptcharset(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptcharset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceptcharset: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptcharset")(js.undefined)
        ret
    }
    @scala.inline
    def withAction(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.undefined)
        ret
    }
    @scala.inline
    def withAdditionalMetaSchemas(value: js.Array[js.Object]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalMetaSchemas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalMetaSchemas: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalMetaSchemas")(js.undefined)
        ret
    }
    @scala.inline
    def withAutocomplete(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autocomplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutocomplete: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autocomplete")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomFormats(value: StringDictionary[String | js.RegExp | (js.Function1[/* data */ String, Boolean])]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customFormats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomFormats: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customFormats")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withEnctype(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enctype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnctype: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enctype")(js.undefined)
        ret
    }
    @scala.inline
    def withFields(value: StringDictionary[Field]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withFormContext(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormContext: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formContext")(js.undefined)
        ret
    }
    @scala.inline
    def withFormData(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormData: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formData")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withIdPrefix(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdPrefix: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withLiveOmit(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liveOmit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLiveOmit: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liveOmit")(js.undefined)
        ret
    }
    @scala.inline
    def withLiveValidate(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liveValidate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLiveValidate: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liveValidate")(js.undefined)
        ret
    }
    @scala.inline
    def withMethod(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNoHtml5Validate(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noHtml5Validate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoHtml5Validate: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noHtml5Validate")(js.undefined)
        ret
    }
    @scala.inline
    def withNoValidate(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noValidate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoValidate: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noValidate")(js.undefined)
        ret
    }
    @scala.inline
    def withOmitExtraData(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("omitExtraData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOmitExtraData: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("omitExtraData")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBlur(value: (/* id */ String, /* value */ Boolean | Double | String | Null) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnBlur: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: (/* e */ IChangeEvent[T], /* es */ js.UndefOr[ErrorSchema]) => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnError(value: /* e */ js.Any => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnError: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSubmit(value: /* e */ ISubmitEvent[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSubmit: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmit")(js.undefined)
        ret
    }
    @scala.inline
    def withSafeRenderCompletion(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safeRenderCompletion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSafeRenderCompletion: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safeRenderCompletion")(js.undefined)
        ret
    }
    @scala.inline
    def withShowErrorList(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showErrorList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowErrorList: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showErrorList")(js.undefined)
        ret
    }
    @scala.inline
    def withTagName(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 177 */ js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagName: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagName")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformErrors(value: /* errors */ js.Array[AjvError] => js.Array[AjvError]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformErrors")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTransformErrors: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withUiSchema(value: UiSchema): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uiSchema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUiSchema: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uiSchema")(js.undefined)
        ret
    }
    @scala.inline
    def withValidate(value: (/* formData */ T, /* errors */ FormValidation) => FormValidation): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutValidate: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.undefined)
        ret
    }
    @scala.inline
    def withWidgets(value: StringDictionary[Widget]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widgets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidgets: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widgets")(js.undefined)
        ret
    }
  }
  
}

