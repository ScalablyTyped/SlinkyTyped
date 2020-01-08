package typingsSlinky.antDashDesignDashPro.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.antDashDesignDashPro.Anon_XY
import typingsSlinky.antDashDesignDashPro.libChartsMiniAreaMod.IAxis
import typingsSlinky.antDashDesignDashPro.libChartsMiniAreaMod.IMiniAreaProps
import typingsSlinky.antDashDesignDashPro.libChartsMiniAreaMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MiniArea
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("ant-design-pro/lib/Charts/MiniArea", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    data: js.Array[Anon_XY],
    height: Double,
    animate: js.UndefOr[Boolean] = js.undefined,
    borderColor: String = null,
    color: String = null,
    line: js.UndefOr[Boolean] = js.undefined,
    xAxis: IAxis = null,
    yAxis: IAxis = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(line)) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (xAxis != null) __obj.updateDynamic("xAxis")(xAxis.asInstanceOf[js.Any])
    if (yAxis != null) __obj.updateDynamic("yAxis")(yAxis.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IMiniAreaProps
}

