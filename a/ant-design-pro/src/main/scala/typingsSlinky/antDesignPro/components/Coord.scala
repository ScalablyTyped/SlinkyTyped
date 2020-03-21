package typingsSlinky.antDesignPro.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.bizcharts.bizchartsStrings.x
import typingsSlinky.bizcharts.bizchartsStrings.y
import typingsSlinky.bizcharts.mod.CoordProps
import typingsSlinky.bizcharts.mod.CoordType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Coord
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.antDesignPro.bizchartsMod.Coord] {
  @JSImport("ant-design-pro/lib/Charts/bizcharts", "Coord")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    endAngle: Int | Double = null,
    innerRadius: Int | Double = null,
    radius: Int | Double = null,
    reflect: x | y = null,
    rotate: Int | Double = null,
    scale: js.Tuple2[Double, Double] = null,
    startAngle: Int | Double = null,
    transpose: js.UndefOr[Boolean] = js.undefined,
    `type`: CoordType = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.antDesignPro.bizchartsMod.Coord] = {
    val __obj = js.Dynamic.literal()
    if (endAngle != null) __obj.updateDynamic("endAngle")(endAngle.asInstanceOf[js.Any])
    if (innerRadius != null) __obj.updateDynamic("innerRadius")(innerRadius.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (reflect != null) __obj.updateDynamic("reflect")(reflect.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (startAngle != null) __obj.updateDynamic("startAngle")(startAngle.asInstanceOf[js.Any])
    if (!js.isUndefined(transpose)) __obj.updateDynamic("transpose")(transpose.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.antDesignPro.bizchartsMod.Coord] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.antDesignPro.bizchartsMod.Coord](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = CoordProps
}

