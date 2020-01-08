package typingsSlinky.reactDashJsonschemaDashForm.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.jsonDashSchema.jsonDashSchemaMod.JSONSchema6
import typingsSlinky.reactDashJsonschemaDashForm.reactDashJsonschemaDashFormMod.AjvError
import typingsSlinky.reactDashJsonschemaDashForm.reactDashJsonschemaDashFormMod.ArrayFieldTemplateProps
import typingsSlinky.reactDashJsonschemaDashForm.reactDashJsonschemaDashFormMod.ErrorListProps
import typingsSlinky.reactDashJsonschemaDashForm.reactDashJsonschemaDashFormMod.ErrorSchema
import typingsSlinky.reactDashJsonschemaDashForm.reactDashJsonschemaDashFormMod.Field
import typingsSlinky.reactDashJsonschemaDashForm.reactDashJsonschemaDashFormMod.FieldTemplateProps
import typingsSlinky.reactDashJsonschemaDashForm.reactDashJsonschemaDashFormMod.FormProps
import typingsSlinky.reactDashJsonschemaDashForm.reactDashJsonschemaDashFormMod.FormValidation
import typingsSlinky.reactDashJsonschemaDashForm.reactDashJsonschemaDashFormMod.IChangeEvent
import typingsSlinky.reactDashJsonschemaDashForm.reactDashJsonschemaDashFormMod.ObjectFieldTemplateProps
import typingsSlinky.reactDashJsonschemaDashForm.reactDashJsonschemaDashFormMod.UiSchema
import typingsSlinky.reactDashJsonschemaDashForm.reactDashJsonschemaDashFormMod.Widget
import typingsSlinky.reactDashJsonschemaDashForm.reactDashJsonschemaDashFormMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashJsonschemaDashForm
  extends ExternalComponentWithAttributesWithRefType[tag.type, default[js.Any]] {
  @JSImport("react-jsonschema-form", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: action, className, disabled, id, method, name, onError, onSubmit, target */
  def apply[T](
    schema: JSONSchema6,
    ArrayFieldTemplate: ReactComponentClass[ArrayFieldTemplateProps[_]] = null,
    ErrorList: ReactComponentClass[ErrorListProps] = null,
    FieldTemplate: ReactComponentClass[FieldTemplateProps] = null,
    ObjectFieldTemplate: ReactComponentClass[ObjectFieldTemplateProps[_]] = null,
    acceptcharset: String = null,
    additionalMetaSchemas: js.Array[js.Object] = null,
    autocomplete: String = null,
    enctype: String = null,
    fields: StringDictionary[Field] = null,
    formContext: js.Any = null,
    formData: T = null,
    idPrefix: String = null,
    liveValidate: js.UndefOr[Boolean] = js.undefined,
    noHtml5Validate: js.UndefOr[Boolean] = js.undefined,
    noValidate: js.UndefOr[Boolean] = js.undefined,
    onBlur: (/* id */ String, /* value */ Boolean | Double | String | Null) => Unit = null,
    onChange: (/* e */ IChangeEvent[T], /* es */ js.UndefOr[ErrorSchema]) => _ = null,
    safeRenderCompletion: js.UndefOr[Boolean] = js.undefined,
    showErrorList: js.UndefOr[Boolean] = js.undefined,
    transformErrors: /* errors */ js.Array[AjvError] => js.Array[AjvError] = null,
    uiSchema: UiSchema = null,
    validate: (T, /* errors */ FormValidation) => FormValidation = null,
    widgets: StringDictionary[Widget] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default[js.Any]] = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
    if (ArrayFieldTemplate != null) __obj.updateDynamic("ArrayFieldTemplate")(ArrayFieldTemplate.asInstanceOf[js.Any])
    if (ErrorList != null) __obj.updateDynamic("ErrorList")(ErrorList.asInstanceOf[js.Any])
    if (FieldTemplate != null) __obj.updateDynamic("FieldTemplate")(FieldTemplate.asInstanceOf[js.Any])
    if (ObjectFieldTemplate != null) __obj.updateDynamic("ObjectFieldTemplate")(ObjectFieldTemplate.asInstanceOf[js.Any])
    if (acceptcharset != null) __obj.updateDynamic("acceptcharset")(acceptcharset.asInstanceOf[js.Any])
    if (additionalMetaSchemas != null) __obj.updateDynamic("additionalMetaSchemas")(additionalMetaSchemas.asInstanceOf[js.Any])
    if (autocomplete != null) __obj.updateDynamic("autocomplete")(autocomplete.asInstanceOf[js.Any])
    if (enctype != null) __obj.updateDynamic("enctype")(enctype.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (formContext != null) __obj.updateDynamic("formContext")(formContext.asInstanceOf[js.Any])
    if (formData != null) __obj.updateDynamic("formData")(formData.asInstanceOf[js.Any])
    if (idPrefix != null) __obj.updateDynamic("idPrefix")(idPrefix.asInstanceOf[js.Any])
    if (!js.isUndefined(liveValidate)) __obj.updateDynamic("liveValidate")(liveValidate.asInstanceOf[js.Any])
    if (!js.isUndefined(noHtml5Validate)) __obj.updateDynamic("noHtml5Validate")(noHtml5Validate.asInstanceOf[js.Any])
    if (!js.isUndefined(noValidate)) __obj.updateDynamic("noValidate")(noValidate.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction2(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (!js.isUndefined(safeRenderCompletion)) __obj.updateDynamic("safeRenderCompletion")(safeRenderCompletion.asInstanceOf[js.Any])
    if (!js.isUndefined(showErrorList)) __obj.updateDynamic("showErrorList")(showErrorList.asInstanceOf[js.Any])
    if (transformErrors != null) __obj.updateDynamic("transformErrors")(js.Any.fromFunction1(transformErrors))
    if (uiSchema != null) __obj.updateDynamic("uiSchema")(uiSchema.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction2(validate))
    if (widgets != null) __obj.updateDynamic("widgets")(widgets.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashJsonschemaDashForm.reactDashJsonschemaDashFormMod.default[js.Any]]]
  }
  type Props = FormProps[js.Any]
}

