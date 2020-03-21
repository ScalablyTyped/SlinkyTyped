package typingsSlinky.baseui.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLLIElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import slinky.web.html.li.tag
import typingsSlinky.baseui.listMod.ArtworkSizesT
import typingsSlinky.baseui.listMod.MenuAdapterPropsT
import typingsSlinky.baseui.listMod.OverridesT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MenuAdapter
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("baseui/list", "MenuAdapter")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    $disabled: Boolean,
    $isHighlighted: Boolean,
    $size: String,
    item: js.Any,
    onClick: SyntheticMouseEvent[HTMLLIElement] => js.Any,
    onMouseEnter: SyntheticMouseEvent[HTMLLIElement] => js.Any,
    artwork: TagMod[Any] = null,
    artworkSize: ArtworkSizesT = null,
    endEnhancer: TagMod[Any] = null,
    overrides: OverridesT = null,
    sublist: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal($disabled = $disabled.asInstanceOf[js.Any], $isHighlighted = $isHighlighted.asInstanceOf[js.Any], $size = $size.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), onMouseEnter = js.Any.fromFunction1(onMouseEnter))
    if (artwork != null) __obj.updateDynamic("artwork")(artwork.asInstanceOf[js.Any])
    if (artworkSize != null) __obj.updateDynamic("artworkSize")(artworkSize.asInstanceOf[js.Any])
    if (endEnhancer != null) __obj.updateDynamic("endEnhancer")(endEnhancer.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(sublist)) __obj.updateDynamic("sublist")(sublist.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = MenuAdapterPropsT
}

