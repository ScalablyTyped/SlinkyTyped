package typingsSlinky.nivoBar.components

import org.scalajs.dom.raw.HTMLCanvasElement
import slinky.core.ReactComponentClass
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.nivoBar.anon.dataFromindexeskeysLegend
import typingsSlinky.nivoBar.mod.AccessorFunc
import typingsSlinky.nivoBar.mod.Axis
import typingsSlinky.nivoBar.mod.BarCanvasProps
import typingsSlinky.nivoBar.mod.BarDatum
import typingsSlinky.nivoBar.mod.BarDatumWithColor
import typingsSlinky.nivoBar.mod.BarExtendedDatum
import typingsSlinky.nivoBar.mod.BarItemProps
import typingsSlinky.nivoBar.mod.IndexByFunc
import typingsSlinky.nivoBar.mod.LabelFormatter
import typingsSlinky.nivoBar.mod.ValueFormatter
import typingsSlinky.nivoBar.nivoBarStrings.auto
import typingsSlinky.nivoBar.nivoBarStrings.grouped
import typingsSlinky.nivoBar.nivoBarStrings.horizontal
import typingsSlinky.nivoBar.nivoBarStrings.stacked
import typingsSlinky.nivoBar.nivoBarStrings.vertical
import typingsSlinky.nivoColors.mod.InheritedColorProp
import typingsSlinky.nivoColors.mod.OrdinalColorsInstruction
import typingsSlinky.nivoCore.mod.Box
import typingsSlinky.nivoCore.mod.CartesianMarkerProps
import typingsSlinky.nivoCore.mod.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ResponsiveBarCanvas {
  @JSImport("@nivo/bar", "ResponsiveBarCanvas")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.nivoBar.mod.ResponsiveBarCanvas] {
    @scala.inline
    def axisBottom(value: Axis): this.type = set("axisBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def axisLeft(value: Axis): this.type = set("axisLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def axisRight(value: Axis): this.type = set("axisRight", value.asInstanceOf[js.Any])
    @scala.inline
    def axisTop(value: Axis): this.type = set("axisTop", value.asInstanceOf[js.Any])
    @scala.inline
    def barComponent(value: ReactComponentClass[BarItemProps]): this.type = set("barComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def borderRadius(value: Double): this.type = set("borderRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def borderWidth(value: Double): this.type = set("borderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def colorsFunction1(value: _ => String): this.type = set("colors", js.Any.fromFunction1(value))
    @scala.inline
    def colors(value: OrdinalColorsInstruction[_]): this.type = set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def enableGridX(value: Boolean): this.type = set("enableGridX", value.asInstanceOf[js.Any])
    @scala.inline
    def enableGridY(value: Boolean): this.type = set("enableGridY", value.asInstanceOf[js.Any])
    @scala.inline
    def enableLabel(value: Boolean): this.type = set("enableLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def groupMode(value: stacked | grouped): this.type = set("groupMode", value.asInstanceOf[js.Any])
    @scala.inline
    def indexByFunction1(value: /* datum */ BarDatum => String | Double): this.type = set("indexBy", js.Any.fromFunction1(value))
    @scala.inline
    def indexBy(value: String | IndexByFunc): this.type = set("indexBy", value.asInstanceOf[js.Any])
    @scala.inline
    def innerPadding(value: Double): this.type = set("innerPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def isInteractive(value: Boolean): this.type = set("isInteractive", value.asInstanceOf[js.Any])
    @scala.inline
    def keys(value: js.Array[String]): this.type = set("keys", value.asInstanceOf[js.Any])
    @scala.inline
    def labelFunction1(value: /* datum */ BarDatum => String): this.type = set("label", js.Any.fromFunction1(value))
    @scala.inline
    def label(value: String | AccessorFunc): this.type = set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def labelFormatFunction1(value: /* label */ String | Double => String | Double): this.type = set("labelFormat", js.Any.fromFunction1(value))
    @scala.inline
    def labelFormat(value: String | LabelFormatter): this.type = set("labelFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def labelLinkColorFunction1(value: BarDatumWithColor => String): this.type = set("labelLinkColor", js.Any.fromFunction1(value))
    @scala.inline
    def labelLinkColor(value: InheritedColorProp[BarDatumWithColor]): this.type = set("labelLinkColor", value.asInstanceOf[js.Any])
    @scala.inline
    def labelSkipHeight(value: Double): this.type = set("labelSkipHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def labelSkipWidth(value: Double): this.type = set("labelSkipWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def labelTextColorFunction1(value: BarDatumWithColor => String): this.type = set("labelTextColor", js.Any.fromFunction1(value))
    @scala.inline
    def labelTextColor(value: InheritedColorProp[BarDatumWithColor]): this.type = set("labelTextColor", value.asInstanceOf[js.Any])
    @scala.inline
    def layout(value: horizontal | vertical): this.type = set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def legends(value: js.Array[dataFromindexeskeysLegend]): this.type = set("legends", value.asInstanceOf[js.Any])
    @scala.inline
    def margin(value: Box): this.type = set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def markers(value: js.Array[CartesianMarkerProps]): this.type = set("markers", value.asInstanceOf[js.Any])
    @scala.inline
    def maxValue(value: Double | auto): this.type = set("maxValue", value.asInstanceOf[js.Any])
    @scala.inline
    def minValue(value: Double | auto): this.type = set("minValue", value.asInstanceOf[js.Any])
    @scala.inline
    def onClick(value: (/* datum */ BarExtendedDatum, /* event */ SyntheticMouseEvent[HTMLCanvasElement]) => Unit): this.type = set("onClick", js.Any.fromFunction2(value))
    @scala.inline
    def padding(value: Double): this.type = set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def pixelRatio(value: Double): this.type = set("pixelRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def reverse(value: Boolean): this.type = set("reverse", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: Theme): this.type = set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def tooltip(value: ReactComponentClass[BarExtendedDatum]): this.type = set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def tooltipFormatFunction1(value: /* value */ Double => String | Double): this.type = set("tooltipFormat", js.Any.fromFunction1(value))
    @scala.inline
    def tooltipFormat(value: String | ValueFormatter): this.type = set("tooltipFormat", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: BarCanvasProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(data: js.Array[js.Object]): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[BarCanvasProps]))
  }
}

