package typingsSlinky.bizcharts.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.atAntvG2.atAntvG2Mod.AxisGrid
import typingsSlinky.atAntvG2.atAntvG2Mod.AxisLabel
import typingsSlinky.atAntvG2.atAntvG2Mod.Styles.line
import typingsSlinky.atAntvG2.atAntvG2Mod.Styles.tickLine
import typingsSlinky.bizcharts.bizchartsMod.AxisProps
import typingsSlinky.bizcharts.bizchartsMod.PositionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Axis
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.bizcharts.bizchartsMod.Axis] {
  @JSImport("bizcharts", "Axis")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: name */
  def apply(
    grid: AxisGrid = null,
    label: AxisLabel = null,
    line: line = null,
    min: Int | Double = null,
    position: PositionType = null,
    subTickCount: Int | Double = null,
    subTickLine: tickLine = null,
    tickLine: tickLine = null,
    title: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify G2.AxisTile */ js.Any) | Boolean = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    zIndex: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.bizcharts.bizchartsMod.Axis] = {
    val __obj = js.Dynamic.literal()
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (subTickCount != null) __obj.updateDynamic("subTickCount")(subTickCount.asInstanceOf[js.Any])
    if (subTickLine != null) __obj.updateDynamic("subTickLine")(subTickLine.asInstanceOf[js.Any])
    if (tickLine != null) __obj.updateDynamic("tickLine")(tickLine.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.bizcharts.bizchartsMod.Axis] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.bizcharts.bizchartsMod.Axis](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = AxisProps
}

