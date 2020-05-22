package typingsSlinky.bizcharts.mod

import slinky.core.TagMod
import typingsSlinky.antvG2.mod.AxisGrid
import typingsSlinky.antvG2.mod.AxisLabel
import typingsSlinky.antvG2.mod.Styles.line
import typingsSlinky.antvG2.mod.Styles.tickLine
import typingsSlinky.react.mod.Key
import typingsSlinky.react.mod.LegacyRef
import typingsSlinky.react.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxisProps
  extends Props[js.Any] {
  var grid: js.UndefOr[AxisGrid | Null] = js.undefined
  var label: js.UndefOr[AxisLabel | Null] = js.undefined
  var line: js.UndefOr[typingsSlinky.antvG2.mod.Styles.line | Null] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var position: js.UndefOr[PositionType] = js.undefined
  var subTickCount: js.UndefOr[Double] = js.undefined
  var subTickLine: js.UndefOr[tickLine] = js.undefined
  var tickLine: js.UndefOr[typingsSlinky.antvG2.mod.Styles.tickLine | Null] = js.undefined
  var title: js.UndefOr[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify G2.AxisTile */ js.Any) | Boolean | Null
  ] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object AxisProps {
  @scala.inline
  def apply(
    children: TagMod[Any] = null,
    grid: js.UndefOr[Null | AxisGrid] = js.undefined,
    key: Key = null,
    label: js.UndefOr[Null | AxisLabel] = js.undefined,
    line: js.UndefOr[Null | line] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    name: String = null,
    position: PositionType = null,
    ref: js.UndefOr[Null | LegacyRef[js.Any]] = js.undefined,
    subTickCount: js.UndefOr[Double] = js.undefined,
    subTickLine: tickLine = null,
    tickLine: js.UndefOr[Null | tickLine] = js.undefined,
    title: js.UndefOr[
      Null | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify G2.AxisTile */ js.Any) | Boolean
    ] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    zIndex: js.UndefOr[Double] = js.undefined
  ): AxisProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(grid)) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(label)) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(line)) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (!js.isUndefined(subTickCount)) __obj.updateDynamic("subTickCount")(subTickCount.get.asInstanceOf[js.Any])
    if (subTickLine != null) __obj.updateDynamic("subTickLine")(subTickLine.asInstanceOf[js.Any])
    if (!js.isUndefined(tickLine)) __obj.updateDynamic("tickLine")(tickLine.asInstanceOf[js.Any])
    if (!js.isUndefined(title)) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisProps]
  }
}

