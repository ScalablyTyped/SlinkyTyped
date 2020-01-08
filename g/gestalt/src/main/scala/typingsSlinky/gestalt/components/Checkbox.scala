package typingsSlinky.gestalt.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.gestalt.Anon_Checked
import typingsSlinky.gestalt.gestaltMod.CheckboxProps
import typingsSlinky.gestalt.gestaltStrings.md
import typingsSlinky.gestalt.gestaltStrings.sm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Checkbox
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.gestalt.gestaltMod.Checkbox] {
  @JSImport("gestalt", "Checkbox")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: checked, disabled, name */
  def apply(
    id: String,
    onChange: Anon_Checked => Unit,
    indeterminate: js.UndefOr[Boolean] = js.undefined,
    size: sm | md = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.gestalt.gestaltMod.Checkbox] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    if (!js.isUndefined(indeterminate)) __obj.updateDynamic("indeterminate")(indeterminate.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = CheckboxProps
}

