package typingsSlinky.reactGaugeChart.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactGaugeChart.mod.GaugeChartProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactGaugeChart {
  
  @JSImport("react-gauge-chart", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def animDelay(value: Double): this.type = set("animDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def animate(value: Boolean): this.type = set("animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def arcPadding(value: Double): this.type = set("arcPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def arcWidth(value: Double): this.type = set("arcWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def arcsLengthVarargs(value: Double*): this.type = set("arcsLength", js.Array(value :_*))
    
    @scala.inline
    def arcsLength(value: js.Array[Double]): this.type = set("arcsLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def colorsVarargs(value: String*): this.type = set("colors", js.Array(value :_*))
    
    @scala.inline
    def colors(value: js.Array[String]): this.type = set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cornerRadius(value: Double): this.type = set("cornerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontSize(value: String): this.type = set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def formatTextValue(value: /* value */ String => String): this.type = set("formatTextValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def hideText(value: Boolean): this.type = set("hideText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def marginInPercent(value: Double): this.type = set("marginInPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def needleBaseColor(value: String): this.type = set("needleBaseColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def needleColor(value: String): this.type = set("needleColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def nrOfLevels(value: Double): this.type = set("nrOfLevels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def percent(value: Double): this.type = set("percent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textColor(value: String): this.type = set("textColor", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: GaugeChartProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(id: String): Builder = {
    val __props = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[GaugeChartProps]))
  }
}
