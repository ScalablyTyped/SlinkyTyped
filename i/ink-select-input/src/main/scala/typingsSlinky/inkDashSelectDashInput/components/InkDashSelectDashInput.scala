package typingsSlinky.inkDashSelectDashInput.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.inkDashSelectDashInput.inkDashSelectDashInputMod.ItemOfSelectInput
import typingsSlinky.inkDashSelectDashInput.inkDashSelectDashInputMod.SelectInputProps
import typingsSlinky.inkDashSelectDashInput.inkDashSelectDashInputMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object InkDashSelectDashInput
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("ink-select-input", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: onSelect */
  def apply(
    focus: js.UndefOr[Boolean] = js.undefined,
    indicatorComponent: ReactComponentClass[js.Object] = null,
    initialIndex: Int | Double = null,
    itemComponent: ReactComponentClass[js.Object] = null,
    items: js.Array[ItemOfSelectInput] = null,
    limit: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(focus)) __obj.updateDynamic("focus")(focus.asInstanceOf[js.Any])
    if (indicatorComponent != null) __obj.updateDynamic("indicatorComponent")(indicatorComponent.asInstanceOf[js.Any])
    if (initialIndex != null) __obj.updateDynamic("initialIndex")(initialIndex.asInstanceOf[js.Any])
    if (itemComponent != null) __obj.updateDynamic("itemComponent")(itemComponent.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SelectInputProps[ItemOfSelectInput]
}

