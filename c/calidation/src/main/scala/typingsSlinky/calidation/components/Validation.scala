package typingsSlinky.calidation.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.calidation.mod.Dictionary
import typingsSlinky.calidation.mod.FieldsConfig
import typingsSlinky.calidation.mod.Transforms
import typingsSlinky.calidation.mod.ValidationProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Validation
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.calidation.mod.Validation] {
  @JSImport("calidation", "Validation")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    config: FieldsConfig,
    initialValues: Dictionary[_] = null,
    transforms: Transforms = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.calidation.mod.Validation] = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
    if (initialValues != null) __obj.updateDynamic("initialValues")(initialValues.asInstanceOf[js.Any])
    if (transforms != null) __obj.updateDynamic("transforms")(transforms.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ValidationProps
}

