package typingsSlinky.reactJsonschemaForm.components

import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.jsonSchema.mod.JSONSchema6
import typingsSlinky.reactJsonschemaForm.mod.AjvError
import typingsSlinky.reactJsonschemaForm.mod.ArrayFieldTemplateProps
import typingsSlinky.reactJsonschemaForm.mod.ErrorListProps
import typingsSlinky.reactJsonschemaForm.mod.ErrorSchema
import typingsSlinky.reactJsonschemaForm.mod.FieldTemplateProps
import typingsSlinky.reactJsonschemaForm.mod.FormProps
import typingsSlinky.reactJsonschemaForm.mod.FormValidation
import typingsSlinky.reactJsonschemaForm.mod.IChangeEvent
import typingsSlinky.reactJsonschemaForm.mod.ISubmitEvent
import typingsSlinky.reactJsonschemaForm.mod.ObjectFieldTemplateProps
import typingsSlinky.reactJsonschemaForm.mod.UiSchema
import typingsSlinky.reactJsonschemaForm.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactJsonschemaForm {
  @JSImport("react-jsonschema-form", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[T] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default[js.Any]] {
    @scala.inline
    def ArrayFieldTemplate(value: ReactComponentClass[ArrayFieldTemplateProps[_]]): this.type = set("ArrayFieldTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def ErrorList(value: ReactComponentClass[ErrorListProps]): this.type = set("ErrorList", value.asInstanceOf[js.Any])
    @scala.inline
    def FieldTemplate(value: ReactComponentClass[FieldTemplateProps]): this.type = set("FieldTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def ObjectFieldTemplate(value: ReactComponentClass[ObjectFieldTemplateProps[_]]): this.type = set("ObjectFieldTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def acceptcharset(value: String): this.type = set("acceptcharset", value.asInstanceOf[js.Any])
    @scala.inline
    def action(value: String): this.type = set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def additionalMetaSchemas(value: js.Array[js.Object]): this.type = set("additionalMetaSchemas", value.asInstanceOf[js.Any])
    @scala.inline
    def autocomplete(value: String): this.type = set("autocomplete", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def enctype(value: String): this.type = set("enctype", value.asInstanceOf[js.Any])
    @scala.inline
    def formContext(value: js.Any): this.type = set("formContext", value.asInstanceOf[js.Any])
    @scala.inline
    def formData(value: T): this.type = set("formData", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def idPrefix(value: String): this.type = set("idPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def liveOmit(value: Boolean): this.type = set("liveOmit", value.asInstanceOf[js.Any])
    @scala.inline
    def liveValidate(value: Boolean): this.type = set("liveValidate", value.asInstanceOf[js.Any])
    @scala.inline
    def method(value: String): this.type = set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def noHtml5Validate(value: Boolean): this.type = set("noHtml5Validate", value.asInstanceOf[js.Any])
    @scala.inline
    def noValidate(value: Boolean): this.type = set("noValidate", value.asInstanceOf[js.Any])
    @scala.inline
    def omitExtraData(value: Boolean): this.type = set("omitExtraData", value.asInstanceOf[js.Any])
    @scala.inline
    def onBlur(value: (/* id */ String, /* value */ Boolean | Double | String | Null) => Unit): this.type = set("onBlur", js.Any.fromFunction2(value))
    @scala.inline
    def onChange(value: (/* e */ IChangeEvent[T], /* es */ js.UndefOr[ErrorSchema]) => _): this.type = set("onChange", js.Any.fromFunction2(value))
    @scala.inline
    def onError(value: /* e */ js.Any => _): this.type = set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def onSubmit(value: /* e */ ISubmitEvent[T] => _): this.type = set("onSubmit", js.Any.fromFunction1(value))
    @scala.inline
    def safeRenderCompletion(value: Boolean): this.type = set("safeRenderCompletion", value.asInstanceOf[js.Any])
    @scala.inline
    def showErrorList(value: Boolean): this.type = set("showErrorList", value.asInstanceOf[js.Any])
    @scala.inline
    def tagName(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 177 */ js.Any): this.type = set("tagName", value.asInstanceOf[js.Any])
    @scala.inline
    def target(value: String): this.type = set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def transformErrors(value: /* errors */ js.Array[AjvError] => js.Array[AjvError]): this.type = set("transformErrors", js.Any.fromFunction1(value))
    @scala.inline
    def uiSchema(value: UiSchema): this.type = set("uiSchema", value.asInstanceOf[js.Any])
    @scala.inline
    def validate(value: (T, /* errors */ FormValidation) => FormValidation): this.type = set("validate", js.Any.fromFunction2(value))
  }
  
  def withProps[T](p: FormProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[T](schema: JSONSchema6): Builder[T] = {
    val __props = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[FormProps[T]]))
  }
}

