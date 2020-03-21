package typingsSlinky.formik.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.formik.typesMod.FormikActions
import typingsSlinky.formik.typesMod.FormikConfig
import typingsSlinky.formik.typesMod.FormikErrors
import typingsSlinky.formik.typesMod.FormikProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Formik
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.formik.mod.Formik[js.Any]] {
  @JSImport("formik", "Formik")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply[Values](
    initialValues: Values,
    onSubmit: (Values, FormikActions[Values]) => Unit,
    component: ReactComponentClass[FormikProps[Values]] | TagMod[Any] = null,
    enableReinitialize: js.UndefOr[Boolean] = js.undefined,
    initialStatus: js.Any = null,
    isInitialValid: Boolean | (js.Function1[js.Object, Boolean]) = null,
    onReset: (Values, /* formikActions */ FormikActions[Values]) => Unit = null,
    render: /* props */ FormikProps[Values] => TagMod[Any] = null,
    validate: Values => Unit | js.Object | js.Promise[FormikErrors[Values]] = null,
    validateOnBlur: js.UndefOr[Boolean] = js.undefined,
    validateOnChange: js.UndefOr[Boolean] = js.undefined,
    validationSchema: js.Any | js.Function0[_] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.formik.mod.Formik[js.Any]] = {
    val __obj = js.Dynamic.literal(initialValues = initialValues.asInstanceOf[js.Any], onSubmit = js.Any.fromFunction2(onSubmit))
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(enableReinitialize)) __obj.updateDynamic("enableReinitialize")(enableReinitialize.asInstanceOf[js.Any])
    if (initialStatus != null) __obj.updateDynamic("initialStatus")(initialStatus.asInstanceOf[js.Any])
    if (isInitialValid != null) __obj.updateDynamic("isInitialValid")(isInitialValid.asInstanceOf[js.Any])
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction2(onReset))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction1(validate))
    if (!js.isUndefined(validateOnBlur)) __obj.updateDynamic("validateOnBlur")(validateOnBlur.asInstanceOf[js.Any])
    if (!js.isUndefined(validateOnChange)) __obj.updateDynamic("validateOnChange")(validateOnChange.asInstanceOf[js.Any])
    if (validationSchema != null) __obj.updateDynamic("validationSchema")(validationSchema.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.formik.mod.Formik[js.Any]]]
  }
  type Props = FormikConfig[js.Any]
}

