package typingsSlinky.nivoRadar.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.nivoColors.mod.InheritedColorProp
import typingsSlinky.nivoColors.mod.OrdinalColorsInstruction
import typingsSlinky.nivoCore.mod.Box
import typingsSlinky.nivoCore.mod.CssMixBlendMode
import typingsSlinky.nivoLegends.mod.LegendProps
import typingsSlinky.nivoRadar.mod.CustomDotLabel
import typingsSlinky.nivoRadar.mod.CustomFormatter
import typingsSlinky.nivoRadar.mod.IndexByCustomFunctiono
import typingsSlinky.nivoRadar.mod.RadarProps
import typingsSlinky.nivoRadar.nivoRadarStrings.auto
import typingsSlinky.nivoRadar.nivoRadarStrings.circular
import typingsSlinky.nivoRadar.nivoRadarStrings.linear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ResponsiveRadar {
  @JSImport("@nivo/radar", "ResponsiveRadar")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.nivoRadar.mod.ResponsiveRadar] {
    @scala.inline
    def animate(value: Boolean): this.type = set("animate", value.asInstanceOf[js.Any])
    @scala.inline
    def blendMode(value: CssMixBlendMode): this.type = set("blendMode", value.asInstanceOf[js.Any])
    @scala.inline
    def borderColorFunction1(value: _ => String): this.type = set("borderColor", js.Any.fromFunction1(value))
    @scala.inline
    def borderColor(value: InheritedColorProp[_]): this.type = set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def borderWidth(value: Double): this.type = set("borderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def colorsVarargs(value: String*): this.type = set("colors", js.Array(value :_*))
    @scala.inline
    def colorsFunction1(value: _ => String): this.type = set("colors", js.Any.fromFunction1(value))
    @scala.inline
    def colors(value: OrdinalColorsInstruction[_]): this.type = set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def curve(value: String): this.type = set("curve", value.asInstanceOf[js.Any])
    @scala.inline
    def dotBorderColorFunction1(value: _ => String): this.type = set("dotBorderColor", js.Any.fromFunction1(value))
    @scala.inline
    def dotBorderColor(value: InheritedColorProp[_]): this.type = set("dotBorderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def dotBorderWidth(value: Double): this.type = set("dotBorderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def dotColorFunction1(value: _ => String): this.type = set("dotColor", js.Any.fromFunction1(value))
    @scala.inline
    def dotColor(value: InheritedColorProp[_]): this.type = set("dotColor", value.asInstanceOf[js.Any])
    @scala.inline
    def dotLabelFunction1(value: /* repeated */ js.Any => ReactElement): this.type = set("dotLabel", js.Any.fromFunction1(value))
    @scala.inline
    def dotLabel(value: String | CustomDotLabel): this.type = set("dotLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def dotLabelFormatFunction1(value: /* repeated */ js.Any => ReactElement): this.type = set("dotLabelFormat", js.Any.fromFunction1(value))
    @scala.inline
    def dotLabelFormat(value: String | CustomFormatter): this.type = set("dotLabelFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def dotLabelYOffset(value: Double): this.type = set("dotLabelYOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def dotSize(value: Double): this.type = set("dotSize", value.asInstanceOf[js.Any])
    @scala.inline
    def dotSymbol(value: /* repeated */ js.Any => ReactElement): this.type = set("dotSymbol", js.Any.fromFunction1(value))
    @scala.inline
    def enableDotLabel(value: Boolean): this.type = set("enableDotLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def enableDots(value: Boolean): this.type = set("enableDots", value.asInstanceOf[js.Any])
    @scala.inline
    def fillOpacity(value: Double): this.type = set("fillOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def gridLabel(value: /* repeated */ js.Any => String): this.type = set("gridLabel", js.Any.fromFunction1(value))
    @scala.inline
    def gridLabelOffset(value: Double): this.type = set("gridLabelOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def gridLevels(value: Double): this.type = set("gridLevels", value.asInstanceOf[js.Any])
    @scala.inline
    def gridShape(value: circular | linear): this.type = set("gridShape", value.asInstanceOf[js.Any])
    @scala.inline
    def isInteractive(value: Boolean): this.type = set("isInteractive", value.asInstanceOf[js.Any])
    @scala.inline
    def margin(value: Box): this.type = set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def maxValue(value: auto | Double): this.type = set("maxValue", value.asInstanceOf[js.Any])
    @scala.inline
    def motionDamping(value: Double): this.type = set("motionDamping", value.asInstanceOf[js.Any])
    @scala.inline
    def motionStiffness(value: Double): this.type = set("motionStiffness", value.asInstanceOf[js.Any])
    @scala.inline
    def tooltipFormatFunction1(value: /* repeated */ js.Any => ReactElement): this.type = set("tooltipFormat", js.Any.fromFunction1(value))
    @scala.inline
    def tooltipFormat(value: String | CustomFormatter): this.type = set("tooltipFormat", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: RadarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    data: js.Array[js.Object],
    indexBy: Double | String | IndexByCustomFunctiono[_],
    keys: js.Array[String | Double],
    legends: js.Array[LegendProps]
  ): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], indexBy = indexBy.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], legends = legends.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[RadarProps]))
  }
}

