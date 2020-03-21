package typingsSlinky.grommet.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.grommet.AnonColor
import typingsSlinky.grommet.AnonHeight
import typingsSlinky.grommet.AnonLabel
import typingsSlinky.grommet.AnonValue
import typingsSlinky.grommet.chartMod.ChartProps
import typingsSlinky.grommet.grommetStrings.area
import typingsSlinky.grommet.grommetStrings.bar
import typingsSlinky.grommet.grommetStrings.full
import typingsSlinky.grommet.grommetStrings.hair
import typingsSlinky.grommet.grommetStrings.large
import typingsSlinky.grommet.grommetStrings.line
import typingsSlinky.grommet.grommetStrings.medium
import typingsSlinky.grommet.grommetStrings.none
import typingsSlinky.grommet.grommetStrings.point
import typingsSlinky.grommet.grommetStrings.small
import typingsSlinky.grommet.grommetStrings.xlarge
import typingsSlinky.grommet.grommetStrings.xsmall
import typingsSlinky.grommet.grommetStrings.xxsmall
import typingsSlinky.grommet.utilsMod.A11yTitleType
import typingsSlinky.grommet.utilsMod.AlignSelfType
import typingsSlinky.grommet.utilsMod.GapType
import typingsSlinky.grommet.utilsMod.GridAreaType
import typingsSlinky.grommet.utilsMod.MarginType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Chart
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.grommet.mod.Chart] {
  @JSImport("grommet", "Chart")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    values: js.Array[Double | js.Array[Double] | AnonLabel],
    a11yTitle: A11yTitleType = null,
    alignSelf: AlignSelfType = null,
    bounds: js.Array[js.Array[Double]] = null,
    color: String | AnonColor | js.Array[AnonValue] = null,
    gap: GapType = null,
    gridArea: GridAreaType = null,
    margin: MarginType = null,
    onClick: /* repeated */ js.Any => _ = null,
    onHover: /* repeated */ js.Any => _ = null,
    overflow: js.UndefOr[Boolean] = js.undefined,
    round: js.UndefOr[Boolean] = js.undefined,
    size: xxsmall | xsmall | small | medium | large | xlarge | full | AnonHeight | String = null,
    thickness: hair | xsmall | small | medium | large | xlarge | none | String = null,
    `type`: bar | line | area | point = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.grommet.mod.Chart] = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    if (a11yTitle != null) __obj.updateDynamic("a11yTitle")(a11yTitle.asInstanceOf[js.Any])
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (gap != null) __obj.updateDynamic("gap")(gap.asInstanceOf[js.Any])
    if (gridArea != null) __obj.updateDynamic("gridArea")(gridArea.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onHover != null) __obj.updateDynamic("onHover")(js.Any.fromFunction1(onHover))
    if (!js.isUndefined(overflow)) __obj.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
    if (!js.isUndefined(round)) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (thickness != null) __obj.updateDynamic("thickness")(thickness.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ChartProps
}

