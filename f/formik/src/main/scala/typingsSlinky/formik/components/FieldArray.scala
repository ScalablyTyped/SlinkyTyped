package typingsSlinky.formik.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.formik.fieldArrayMod.FieldArrayConfig
import typingsSlinky.formik.fieldArrayMod.FieldArrayRenderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FieldArray
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.formik.mod.FieldArray] {
  @JSImport("formik", "FieldArray")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    name: String,
    component: String | (ReactComponentClass[FieldArrayRenderProps | Unit]) = null,
    render: /* props */ FieldArrayRenderProps => TagMod[Any] = null,
    validateOnChange: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.formik.mod.FieldArray] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (!js.isUndefined(validateOnChange)) __obj.updateDynamic("validateOnChange")(validateOnChange.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = FieldArrayConfig
}

