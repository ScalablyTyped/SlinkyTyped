package typingsSlinky.nivoWaffle.mod

import org.scalajs.dom.raw.HTMLCanvasElement
import slinky.core.ReactComponentClass
import slinky.web.SyntheticMouseEvent
import typingsSlinky.nivoColors.mod.InheritedColorProp
import typingsSlinky.nivoCore.mod.Box
import typingsSlinky.nivoCore.mod.Colors
import typingsSlinky.nivoCore.mod.GetColor
import typingsSlinky.nivoCore.mod.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @nivo/core.@nivo/core.ColorProps<@nivo/waffle.@nivo/waffle.WaffleDatum> & std.Partial<{  margin :@nivo/core.@nivo/core.Box,   fillDirection :@nivo/waffle.@nivo/waffle.WaffleFillDirection,   padding :number,   theme :@nivo/core.@nivo/core.Theme,   emptyColor :string,   emptyOpacity :number,   borderWidth :number,   borderColor :@nivo/colors.@nivo/colors.InheritedColorProp<@nivo/waffle.@nivo/waffle.WaffleDatum>,   enableLabels :boolean,   isInteractive :boolean, onClick (datum : @nivo/waffle.@nivo/waffle.WaffleDatum, event : react.react.MouseEvent<std.HTMLCanvasElement, react.react.NativeMouseEvent>): void,   tooltipFormat :string | @nivo/waffle.@nivo/waffle.ValueFormatter,   tooltip :react.react.StatelessComponent<@nivo/waffle.@nivo/waffle.WaffleTooltipData>}> */
@js.native
trait WaffleCommonProps extends js.Object {
  
  var borderColor: js.UndefOr[InheritedColorProp[WaffleDatum]] = js.native
  
  var borderWidth: js.UndefOr[Double] = js.native
  
  var colorBy: js.UndefOr[String | GetColor[WaffleDatum]] = js.native
  
  var colors: js.UndefOr[Colors] = js.native
  
  var emptyColor: js.UndefOr[String] = js.native
  
  var emptyOpacity: js.UndefOr[Double] = js.native
  
  var enableLabels: js.UndefOr[Boolean] = js.native
  
  var fillDirection: js.UndefOr[WaffleFillDirection] = js.native
  
  var isInteractive: js.UndefOr[Boolean] = js.native
  
  var margin: js.UndefOr[Box] = js.native
  
  var onClick: js.UndefOr[
    js.Function2[/* datum */ WaffleDatum, /* event */ SyntheticMouseEvent[HTMLCanvasElement], Unit]
  ] = js.native
  
  var padding: js.UndefOr[Double] = js.native
  
  var theme: js.UndefOr[Theme] = js.native
  
  var tooltip: js.UndefOr[ReactComponentClass[WaffleTooltipData]] = js.native
  
  var tooltipFormat: js.UndefOr[String | ValueFormatter] = js.native
}
object WaffleCommonProps {
  
  @scala.inline
  def apply(): WaffleCommonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaffleCommonProps]
  }
  
  @scala.inline
  implicit class WaffleCommonPropsOps[Self <: WaffleCommonProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBorderColorFunction1(value: WaffleDatum => String): Self = this.set("borderColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBorderColor(value: InheritedColorProp[WaffleDatum]): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    
    @scala.inline
    def setBorderWidth(value: Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderWidth: Self = this.set("borderWidth", js.undefined)
    
    @scala.inline
    def setColorByFunction1(value: WaffleDatum => String): Self = this.set("colorBy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setColorBy(value: String | GetColor[WaffleDatum]): Self = this.set("colorBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorBy: Self = this.set("colorBy", js.undefined)
    
    @scala.inline
    def setColorsVarargs(value: String*): Self = this.set("colors", js.Array(value :_*))
    
    @scala.inline
    def setColors(value: Colors): Self = this.set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    
    @scala.inline
    def setEmptyColor(value: String): Self = this.set("emptyColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmptyColor: Self = this.set("emptyColor", js.undefined)
    
    @scala.inline
    def setEmptyOpacity(value: Double): Self = this.set("emptyOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmptyOpacity: Self = this.set("emptyOpacity", js.undefined)
    
    @scala.inline
    def setEnableLabels(value: Boolean): Self = this.set("enableLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableLabels: Self = this.set("enableLabels", js.undefined)
    
    @scala.inline
    def setFillDirection(value: WaffleFillDirection): Self = this.set("fillDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillDirection: Self = this.set("fillDirection", js.undefined)
    
    @scala.inline
    def setIsInteractive(value: Boolean): Self = this.set("isInteractive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsInteractive: Self = this.set("isInteractive", js.undefined)
    
    @scala.inline
    def setMargin(value: Box): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setOnClick(value: (/* datum */ WaffleDatum, /* event */ SyntheticMouseEvent[HTMLCanvasElement]) => Unit): Self = this.set("onClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setTheme(value: Theme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setTooltip(value: ReactComponentClass[WaffleTooltipData]): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    
    @scala.inline
    def setTooltipFormatFunction1(value: /* value */ Double => String | Double): Self = this.set("tooltipFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTooltipFormat(value: String | ValueFormatter): Self = this.set("tooltipFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipFormat: Self = this.set("tooltipFormat", js.undefined)
  }
}
