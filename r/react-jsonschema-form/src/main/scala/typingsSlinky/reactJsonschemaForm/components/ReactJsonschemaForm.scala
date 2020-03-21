package typingsSlinky.reactJsonschemaForm.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
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

object ReactJsonschemaForm
  extends ExternalComponentWithAttributesWithRefType[tag.type, default[js.Any]] {
  @JSImport("react-jsonschema-form", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: action, className, disabled, id, method, name, target */
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
    formContext: js.Any = null,
    formData: T = null,
    idPrefix: String = null,
    liveOmit: js.UndefOr[Boolean] = js.undefined,
    liveValidate: js.UndefOr[Boolean] = js.undefined,
    noHtml5Validate: js.UndefOr[Boolean] = js.undefined,
    noValidate: js.UndefOr[Boolean] = js.undefined,
    omitExtraData: js.UndefOr[Boolean] = js.undefined,
    onBlur: (/* id */ String, /* value */ Boolean | Double | String | Null) => Unit = null,
    onChange: (/* e */ IChangeEvent[T], /* es */ js.UndefOr[ErrorSchema]) => _ = null,
    onError: /* e */ js.Any => _ = null,
    onSubmit: /* e */ ISubmitEvent[T] => _ = null,
    safeRenderCompletion: js.UndefOr[Boolean] = js.undefined,
    showErrorList: js.UndefOr[Boolean] = js.undefined,
    tagName: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any = null,
    transformErrors: /* errors */ js.Array[AjvError] => js.Array[AjvError] = null,
    uiSchema: UiSchema = null,
    validate: (T, /* errors */ FormValidation) => FormValidation = null,
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
    if (formContext != null) __obj.updateDynamic("formContext")(formContext.asInstanceOf[js.Any])
    if (formData != null) __obj.updateDynamic("formData")(formData.asInstanceOf[js.Any])
    if (idPrefix != null) __obj.updateDynamic("idPrefix")(idPrefix.asInstanceOf[js.Any])
    if (!js.isUndefined(liveOmit)) __obj.updateDynamic("liveOmit")(liveOmit.asInstanceOf[js.Any])
    if (!js.isUndefined(liveValidate)) __obj.updateDynamic("liveValidate")(liveValidate.asInstanceOf[js.Any])
    if (!js.isUndefined(noHtml5Validate)) __obj.updateDynamic("noHtml5Validate")(noHtml5Validate.asInstanceOf[js.Any])
    if (!js.isUndefined(noValidate)) __obj.updateDynamic("noValidate")(noValidate.asInstanceOf[js.Any])
    if (!js.isUndefined(omitExtraData)) __obj.updateDynamic("omitExtraData")(omitExtraData.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction2(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1(onSubmit))
    if (!js.isUndefined(safeRenderCompletion)) __obj.updateDynamic("safeRenderCompletion")(safeRenderCompletion.asInstanceOf[js.Any])
    if (!js.isUndefined(showErrorList)) __obj.updateDynamic("showErrorList")(showErrorList.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    if (transformErrors != null) __obj.updateDynamic("transformErrors")(js.Any.fromFunction1(transformErrors))
    if (uiSchema != null) __obj.updateDynamic("uiSchema")(uiSchema.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction2(validate))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactJsonschemaForm.mod.default[js.Any]]]
  }
  type Props = FormProps[js.Any]
}

