package typingsSlinky.formik.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.formik.distErrorMessageMod.ErrorMessageProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ErrorMessage
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.formik.formikMod.ErrorMessage] {
  @JSImport("formik", "ErrorMessage")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    name: String,
    component: String | ReactComponentClass[js.Object] = null,
    render: /* errorMessage */ String => TagMod[Any] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.formik.formikMod.ErrorMessage] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ErrorMessageProps
}

