package typingsSlinky.antDesignPro.components

import org.scalajs.dom.raw.CanvasRenderingContext2D
import org.scalajs.dom.raw.MouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antvG2.mod.Styles.text
import typingsSlinky.bizcharts.bizchartsStrings.multiple
import typingsSlinky.bizcharts.bizchartsStrings.single
import typingsSlinky.bizcharts.mod.LegendLayoutType
import typingsSlinky.bizcharts.mod.LegendPositionType
import typingsSlinky.bizcharts.mod.LegendProps
import typingsSlinky.bizcharts.mod.MarkerType
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Legend {
  
  @JSImport("ant-design-pro/lib/Charts/bizcharts", "Legend")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antDesignPro.bizchartsMod.Legend] {
    
    @scala.inline
    def allowAllCanceled(value: Boolean): this.type = set("allowAllCanceled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def background(value: typingsSlinky.antvG2.mod.Styles.background): this.type = set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def clickable(value: Boolean): this.type = set("clickable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def container(value: String): this.type = set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def containerTpl(value: String): this.type = set("containerTpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def custom(value: Boolean): this.type = set("custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `g2-legend`(value: CSSProperties): this.type = set("g2-legend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `g2-legend-item`(value: CSSProperties): this.type = set("g2-legend-item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `g2-legend-list-item`(value: CSSProperties): this.type = set("g2-legend-list-item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `g2-legend-marker`(value: CSSProperties): this.type = set("g2-legend-marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `g2-legend-text`(value: CSSProperties): this.type = set("g2-legend-text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hoverable(value: Boolean): this.type = set("hoverable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemFormatter(value: /* val */ js.UndefOr[js.Any] => String | Double): this.type = set("itemFormatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def itemGap(value: Double): this.type = set("itemGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemMarginBottom(value: Double): this.type = set("itemMarginBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemTpl(
      value: String | (js.Function4[
          /* value */ js.UndefOr[String], 
          /* color */ js.UndefOr[String], 
          /* checked */ js.UndefOr[Boolean], 
          /* index */ js.UndefOr[Double], 
          String
        ])
    ): this.type = set("itemTpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemTplFunction4(
      value: (/* value */ js.UndefOr[String], /* color */ js.UndefOr[String], /* checked */ js.UndefOr[Boolean], /* index */ js.UndefOr[Double]) => String
    ): this.type = set("itemTpl", js.Any.fromFunction4(value))
    
    @scala.inline
    def itemWidth(value: Double): this.type = set("itemWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def items(value: js.Array[_]): this.type = set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemsVarargs(value: js.Any*): this.type = set("items", js.Array(value :_*))
    
    @scala.inline
    def layout(value: LegendLayoutType): this.type = set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def marker(
      value: String | MarkerType | (js.Function4[
          /* x */ js.UndefOr[Double], 
          /* y */ js.UndefOr[Double], 
          /* r */ js.UndefOr[Double], 
          /* ctx */ js.UndefOr[CanvasRenderingContext2D], 
          Unit
        ])
    ): this.type = set("marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def markerFunction4(
      value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* r */ js.UndefOr[Double], /* ctx */ js.UndefOr[CanvasRenderingContext2D]) => Unit
    ): this.type = set("marker", js.Any.fromFunction4(value))
    
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def offsetX(value: Double): this.type = set("offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def offsetY(value: Double): this.type = set("offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClick(value: /* ev */ MouseEvent => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onHover(value: /* ev */ MouseEvent => Unit): this.type = set("onHover", js.Any.fromFunction1(value))
    
    @scala.inline
    def position(value: LegendPositionType): this.type = set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scroll(value: Boolean): this.type = set("scroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectedMode(value: single | multiple): this.type = set("selectedMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def slidable(value: Boolean): this.type = set("slidable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textStyle(value: text): this.type = set("textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: Boolean): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def unChecked(value: String): this.type = set("unChecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def useHtml(value: Boolean): this.type = set("useHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Legend.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: LegendProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
