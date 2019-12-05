package typingsSlinky.recharts.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.recharts.Anon_Height
import typingsSlinky.recharts.rechartsMod.CartesianGridProps
import typingsSlinky.recharts.rechartsMod.ContentRenderer
import typingsSlinky.recharts.rechartsMod.LineProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CartesianGrid
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.recharts.rechartsMod.CartesianGrid] {
  @JSImport("recharts", "CartesianGrid")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    chartHeight: Int | Double = null,
    chartWidth: Int | Double = null,
    height: Int | Double = null,
    horizontal: js.Object | ReactElement | (ContentRenderer[LineProps with CartesianGridProps]) | Boolean = null,
    horizontalCoordinatesGenerator: /* arg */ Anon_Height => js.Array[Double] = null,
    horizontalFill: js.Array[String] = null,
    horizontalPoints: js.Array[Double] = null,
    offset: js.Object = null,
    vertical: js.Object | ReactElement | (ContentRenderer[LineProps with CartesianGridProps]) | Boolean = null,
    verticalCoordinatesGenerator: /* arg */ Anon_Height => js.Array[Double] = null,
    verticalFill: js.Array[String] = null,
    verticalPoints: js.Array[Double] = null,
    width: Int | Double = null,
    xAxis: js.Object = null,
    y: Int | Double = null,
    yAxis: js.Object = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.recharts.rechartsMod.CartesianGrid] = {
    val __obj = js.Dynamic.literal()
    if (chartHeight != null) __obj.updateDynamic("chartHeight")(chartHeight.asInstanceOf[js.Any])
    if (chartWidth != null) __obj.updateDynamic("chartWidth")(chartWidth.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (horizontal != null) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (horizontalCoordinatesGenerator != null) __obj.updateDynamic("horizontalCoordinatesGenerator")(js.Any.fromFunction1(horizontalCoordinatesGenerator))
    if (horizontalFill != null) __obj.updateDynamic("horizontalFill")(horizontalFill.asInstanceOf[js.Any])
    if (horizontalPoints != null) __obj.updateDynamic("horizontalPoints")(horizontalPoints.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (vertical != null) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    if (verticalCoordinatesGenerator != null) __obj.updateDynamic("verticalCoordinatesGenerator")(js.Any.fromFunction1(verticalCoordinatesGenerator))
    if (verticalFill != null) __obj.updateDynamic("verticalFill")(verticalFill.asInstanceOf[js.Any])
    if (verticalPoints != null) __obj.updateDynamic("verticalPoints")(verticalPoints.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (xAxis != null) __obj.updateDynamic("xAxis")(xAxis.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (yAxis != null) __obj.updateDynamic("yAxis")(yAxis.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = CartesianGridProps
}

