package typingsSlinky.reactNativeSvgCharts.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactNativeSvgCharts.PartialLineProps
import typingsSlinky.reactNativeSvgCharts.mod.GridDirection
import typingsSlinky.reactNativeSvgCharts.mod.GridProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Grid
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactNativeSvgCharts.mod.Grid[js.Any]] {
  @JSImport("react-native-svg-charts", "Grid")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply[T](
    belowChart: js.UndefOr[Boolean] = js.undefined,
    direction: GridDirection = null,
    svg: PartialLineProps = null,
    ticks: js.Array[T] = null,
    x: T => Double = null,
    y: T => Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactNativeSvgCharts.mod.Grid[js.Any]] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(belowChart)) __obj.updateDynamic("belowChart")(belowChart.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (svg != null) __obj.updateDynamic("svg")(svg.asInstanceOf[js.Any])
    if (ticks != null) __obj.updateDynamic("ticks")(ticks.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(js.Any.fromFunction1(x))
    if (y != null) __obj.updateDynamic("y")(js.Any.fromFunction1(y))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactNativeSvgCharts.mod.Grid[js.Any]]]
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactNativeSvgCharts.mod.Grid[js.Any]] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactNativeSvgCharts.mod.Grid[js.Any]](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = GridProps[js.Any]
}

