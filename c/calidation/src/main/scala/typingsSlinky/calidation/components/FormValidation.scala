package typingsSlinky.calidation.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.form.tag
import typingsSlinky.calidation.calidationMod.Dictionary
import typingsSlinky.calidation.calidationMod.FieldsConfig
import typingsSlinky.calidation.calidationMod.FormContext
import typingsSlinky.calidation.calidationMod.FormValidationProps
import typingsSlinky.calidation.calidationMod.Transforms
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FormValidation
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.calidation.calidationMod.FormValidation] {
  @JSImport("calidation", "FormValidation")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: onChange, onSubmit */
  def apply(
    config: FieldsConfig,
    initialValues: Dictionary[_] = null,
    onReset: () => Unit = null,
    onUpdate: /* context */ FormContext => Unit = null,
    transforms: Transforms = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.calidation.calidationMod.FormValidation] = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
    if (initialValues != null) __obj.updateDynamic("initialValues")(initialValues.asInstanceOf[js.Any])
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction0(onReset))
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(js.Any.fromFunction1(onUpdate))
    if (transforms != null) __obj.updateDynamic("transforms")(transforms.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = FormValidationProps
}

