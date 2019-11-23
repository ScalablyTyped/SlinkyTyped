package typingsSlinky.atFortawesomeReactDashFontawesome.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atFortawesomeFontawesomeDashSvgDashCore.atFortawesomeFontawesomeDashSvgDashCoreMod.FaSymbol
import typingsSlinky.atFortawesomeFontawesomeDashSvgDashCore.atFortawesomeFontawesomeDashSvgDashCoreMod.FlipProp
import typingsSlinky.atFortawesomeFontawesomeDashSvgDashCore.atFortawesomeFontawesomeDashSvgDashCoreMod.IconProp
import typingsSlinky.atFortawesomeFontawesomeDashSvgDashCore.atFortawesomeFontawesomeDashSvgDashCoreMod.PullProp
import typingsSlinky.atFortawesomeFontawesomeDashSvgDashCore.atFortawesomeFontawesomeDashSvgDashCoreMod.RotateProp
import typingsSlinky.atFortawesomeFontawesomeDashSvgDashCore.atFortawesomeFontawesomeDashSvgDashCoreMod.SizeProp
import typingsSlinky.atFortawesomeFontawesomeDashSvgDashCore.atFortawesomeFontawesomeDashSvgDashCoreMod.Transform
import typingsSlinky.atFortawesomeReactDashFontawesome.atFortawesomeReactDashFontawesomeMod.FontAwesomeIconProps
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FontAwesomeIcon
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  override val component: String | js.Object = typingsSlinky.atFortawesomeReactDashFontawesome.atFortawesomeReactDashFontawesomeMod.FontAwesomeIcon.asInstanceOf[String | js.Object]
  /* The following DOM/SVG props were specified: className, tabIndex */
  def apply(
    icon: IconProp,
    border: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    fixedWidth: js.UndefOr[Boolean] = js.undefined,
    flip: FlipProp = null,
    inverse: js.UndefOr[Boolean] = js.undefined,
    listItem: js.UndefOr[Boolean] = js.undefined,
    mask: IconProp = null,
    pull: PullProp = null,
    pulse: js.UndefOr[Boolean] = js.undefined,
    rotation: RotateProp = null,
    size: SizeProp = null,
    spin: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    symbol: FaSymbol = null,
    title: String = null,
    transform: String | Transform = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
    if (!js.isUndefined(border)) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedWidth)) __obj.updateDynamic("fixedWidth")(fixedWidth.asInstanceOf[js.Any])
    if (flip != null) __obj.updateDynamic("flip")(flip.asInstanceOf[js.Any])
    if (!js.isUndefined(inverse)) __obj.updateDynamic("inverse")(inverse.asInstanceOf[js.Any])
    if (!js.isUndefined(listItem)) __obj.updateDynamic("listItem")(listItem.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (pull != null) __obj.updateDynamic("pull")(pull.asInstanceOf[js.Any])
    if (!js.isUndefined(pulse)) __obj.updateDynamic("pulse")(pulse.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(spin)) __obj.updateDynamic("spin")(spin.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (symbol != null) __obj.updateDynamic("symbol")(symbol.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = FontAwesomeIconProps
}

