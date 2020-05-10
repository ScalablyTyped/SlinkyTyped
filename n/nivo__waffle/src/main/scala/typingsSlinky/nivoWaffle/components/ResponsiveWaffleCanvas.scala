package typingsSlinky.nivoWaffle.components

import org.scalajs.dom.raw.HTMLCanvasElement
import slinky.core.ReactComponentClass
import slinky.web.SyntheticMouseEvent
import slinky.web.html.canvas.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.nivoColors.mod.InheritedColorProp
import typingsSlinky.nivoCore.mod.Box
import typingsSlinky.nivoCore.mod.Colors
import typingsSlinky.nivoCore.mod.GetColor
import typingsSlinky.nivoCore.mod.Theme
import typingsSlinky.nivoWaffle.mod.ValueFormatter
import typingsSlinky.nivoWaffle.mod.WaffleCanvasProps
import typingsSlinky.nivoWaffle.mod.WaffleDatum
import typingsSlinky.nivoWaffle.mod.WaffleFillDirection
import typingsSlinky.nivoWaffle.mod.WaffleTooltipData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ResponsiveWaffleCanvas {
  @JSImport("@nivo/waffle", "ResponsiveWaffleCanvas")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.nivoWaffle.mod.ResponsiveWaffleCanvas] {
    @scala.inline
    def borderColorFunction1(value: WaffleDatum => String): this.type = set("borderColor", js.Any.fromFunction1(value))
    @scala.inline
    def borderColor(value: InheritedColorProp[WaffleDatum]): this.type = set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def borderWidth(value: Double): this.type = set("borderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def colorByFunction1(value: WaffleDatum => String): this.type = set("colorBy", js.Any.fromFunction1(value))
    @scala.inline
    def colorBy(value: String | GetColor[WaffleDatum]): this.type = set("colorBy", value.asInstanceOf[js.Any])
    @scala.inline
    def colors(value: Colors): this.type = set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def emptyColor(value: String): this.type = set("emptyColor", value.asInstanceOf[js.Any])
    @scala.inline
    def emptyOpacity(value: Double): this.type = set("emptyOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def enableLabels(value: Boolean): this.type = set("enableLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def fillDirection(value: WaffleFillDirection): this.type = set("fillDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def isInteractive(value: Boolean): this.type = set("isInteractive", value.asInstanceOf[js.Any])
    @scala.inline
    def margin(value: Box): this.type = set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def onClick(value: (/* datum */ WaffleDatum, /* event */ SyntheticMouseEvent[HTMLCanvasElement]) => Unit): this.type = set("onClick", js.Any.fromFunction2(value))
    @scala.inline
    def padding(value: Double): this.type = set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def pixelRatio(value: Double): this.type = set("pixelRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: Theme): this.type = set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def tooltip(value: ReactComponentClass[WaffleTooltipData]): this.type = set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def tooltipFormatFunction1(value: /* value */ Double => String | Double): this.type = set("tooltipFormat", js.Any.fromFunction1(value))
    @scala.inline
    def tooltipFormat(value: String | ValueFormatter): this.type = set("tooltipFormat", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: WaffleCanvasProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(columns: Double, data: js.Array[js.Object], rows: Double, total: Double): Builder = {
    val __props = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[WaffleCanvasProps]))
  }
}

