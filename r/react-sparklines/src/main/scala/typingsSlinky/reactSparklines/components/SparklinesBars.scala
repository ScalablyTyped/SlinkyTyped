package typingsSlinky.reactSparklines.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.react.mod.ReactSVGElement
import typingsSlinky.reactSparklines.mod.Point
import typingsSlinky.reactSparklines.mod.SparklinesBarsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SparklinesBars
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactSparklines.mod.SparklinesBars] {
  @JSImport("react-sparklines", "SparklinesBars")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: style */
  def apply(
    barWidth: Int | Double = null,
    height: Int | Double = null,
    margin: Int | Double = null,
    onMouseMove: (/* p */ Point, /* event */ SyntheticMouseEvent[ReactSVGElement]) => Unit = null,
    points: js.Array[Point] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactSparklines.mod.SparklinesBars] = {
    val __obj = js.Dynamic.literal()
    if (barWidth != null) __obj.updateDynamic("barWidth")(barWidth.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction2(onMouseMove))
    if (points != null) __obj.updateDynamic("points")(points.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactSparklines.mod.SparklinesBars] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactSparklines.mod.SparklinesBars](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = SparklinesBarsProps
}

