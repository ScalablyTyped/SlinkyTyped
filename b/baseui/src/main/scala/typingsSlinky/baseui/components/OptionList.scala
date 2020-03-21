package typingsSlinky.baseui.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.MouseEvent
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.baseui.AnonListItem
import typingsSlinky.baseui.baseuiStrings.compact
import typingsSlinky.baseui.baseuiStrings.default_
import typingsSlinky.baseui.menuMod.OptionListProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object OptionList
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("baseui/menu", "OptionList")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    getItemLabel: js.Any => TagMod[Any],
    item: js.Any,
    $isFocused: js.UndefOr[Boolean] = js.undefined,
    $isHighlighted: js.UndefOr[Boolean] = js.undefined,
    getChildMenu: /* item */ js.Any => TagMod[Any] = null,
    onMouseEnter: /* event */ MouseEvent => _ = null,
    overrides: AnonListItem = null,
    renderAll: js.UndefOr[Boolean] = js.undefined,
    resetMenu: () => Unit = null,
    size: default_ | compact = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal(getItemLabel = js.Any.fromFunction1(getItemLabel), item = item.asInstanceOf[js.Any])
    if (!js.isUndefined($isFocused)) __obj.updateDynamic("$isFocused")($isFocused.asInstanceOf[js.Any])
    if (!js.isUndefined($isHighlighted)) __obj.updateDynamic("$isHighlighted")($isHighlighted.asInstanceOf[js.Any])
    if (getChildMenu != null) __obj.updateDynamic("getChildMenu")(js.Any.fromFunction1(getChildMenu))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(renderAll)) __obj.updateDynamic("renderAll")(renderAll.asInstanceOf[js.Any])
    if (resetMenu != null) __obj.updateDynamic("resetMenu")(js.Any.fromFunction0(resetMenu))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = OptionListProps
}

