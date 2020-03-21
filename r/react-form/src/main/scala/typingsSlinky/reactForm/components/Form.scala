package typingsSlinky.reactForm.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactForm.AnonFormApi
import typingsSlinky.reactForm.FormPropschildrenpropsFor
import typingsSlinky.reactForm.mod.FormApi
import typingsSlinky.reactForm.mod.FormErrors
import typingsSlinky.reactForm.mod.FormState
import typingsSlinky.reactForm.mod.FormValues
import typingsSlinky.reactForm.mod.RenderReturn
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Form
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactForm.mod.Form] {
  @JSImport("react-form", "Form")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    component: ReactComponentClass[AnonFormApi] = null,
    defaultValues: FormValues = null,
    dontPreventDefault: js.UndefOr[Boolean] = js.undefined,
    dontValidateOnMount: js.UndefOr[Boolean] = js.undefined,
    formDidUpdate: /* formState */ FormState => Unit = null,
    getApi: /* formApi */ FormApi => Unit = null,
    onSubmit: (/* values */ FormValues, /* submissionEvent */ SyntheticEvent[Event_, _], /* formApi */ FormApi) => Unit = null,
    onSubmitFailure: (/* errors */ FormErrors, /* formApi */ FormApi) => Unit = null,
    preSubmit: (/* values */ FormValues, /* formApi */ FormApi) => FormValues = null,
    preValidate: /* values */ FormValues => FormValues = null,
    render: /* formApi */ FormApi => RenderReturn = null,
    validateError: /* values */ FormValues => FormErrors = null,
    validateOnSubmit: js.UndefOr[Boolean] = js.undefined,
    validateSuccess: (/* values */ FormValues, /* errors */ FormErrors) => FormErrors = null,
    validateWarning: /* values */ FormValues => FormErrors = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactForm.mod.Form] = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (defaultValues != null) __obj.updateDynamic("defaultValues")(defaultValues.asInstanceOf[js.Any])
    if (!js.isUndefined(dontPreventDefault)) __obj.updateDynamic("dontPreventDefault")(dontPreventDefault.asInstanceOf[js.Any])
    if (!js.isUndefined(dontValidateOnMount)) __obj.updateDynamic("dontValidateOnMount")(dontValidateOnMount.asInstanceOf[js.Any])
    if (formDidUpdate != null) __obj.updateDynamic("formDidUpdate")(js.Any.fromFunction1(formDidUpdate))
    if (getApi != null) __obj.updateDynamic("getApi")(js.Any.fromFunction1(getApi))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction3(onSubmit))
    if (onSubmitFailure != null) __obj.updateDynamic("onSubmitFailure")(js.Any.fromFunction2(onSubmitFailure))
    if (preSubmit != null) __obj.updateDynamic("preSubmit")(js.Any.fromFunction2(preSubmit))
    if (preValidate != null) __obj.updateDynamic("preValidate")(js.Any.fromFunction1(preValidate))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (validateError != null) __obj.updateDynamic("validateError")(js.Any.fromFunction1(validateError))
    if (!js.isUndefined(validateOnSubmit)) __obj.updateDynamic("validateOnSubmit")(validateOnSubmit.asInstanceOf[js.Any])
    if (validateSuccess != null) __obj.updateDynamic("validateSuccess")(js.Any.fromFunction2(validateSuccess))
    if (validateWarning != null) __obj.updateDynamic("validateWarning")(js.Any.fromFunction1(validateWarning))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactForm.mod.Form] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactForm.mod.Form](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = FormPropschildrenpropsFor
}

