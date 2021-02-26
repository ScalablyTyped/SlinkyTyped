package typingsSlinky.highcharts.mod

import typingsSlinky.highcharts.anon.PartialAnimationOptionsOb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SeriesStatesHoverOptionsObject extends StObject {
  
  /**
    * (Highcharts, Highstock) Animation setting for hovering the graph in
    * line-type series.
    */
  var animation: js.UndefOr[Boolean | PartialAnimationOptionsOb] = js.native
  
  /**
    * (Highmaps) The border color of the point in this state.
    */
  var borderColor: js.UndefOr[String | ColorString | GradientColorObject | PatternObject] = js.native
  
  /**
    * (Highmaps) The border width of the point in this state
    */
  var borderWidth: js.UndefOr[Double] = js.native
  
  /**
    * (Highmaps) The relative brightness of the point when hovered, relative to
    * the normal point color.
    */
  var brightness: js.UndefOr[Double] = js.native
  
  /**
    * (Highmaps) The color of the shape in this state.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  
  /**
    * (Highstock) Enable separate styles for the hovered series to visualize
    * that the user hovers either the series itself or the legend.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highstock) The fill or background color of the flag.
    */
  var fillColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  
  /**
    * (Highcharts, Highstock) Options for the halo appearing around the hovered
    * point in line-type series as well as outside the hovered slice in pie
    * charts. By default the halo is filled by the current point or series
    * color with an opacity of 0.25\. The halo can be disabled by setting the
    * `halo` option to `null`.
    *
    * In styled mode, the halo is styled with the `.highcharts-halo` class,
    * with colors inherited from `.highcharts-color-{n}`.
    */
  var halo: js.UndefOr[SeriesStatesHoverHaloOptionsObject | Null] = js.native
  
  /**
    * (Highstock) The color of the line/border of the flag.
    */
  var lineColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  
  /**
    * (Highcharts, Highstock) Pixel width of the graph line. By default this
    * property is undefined, and the `lineWidthPlus` property dictates how much
    * to increase the linewidth from normal state.
    */
  var lineWidth: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock) The additional line width for the graph of a
    * hovered series.
    */
  var lineWidthPlus: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) Opacity for the links between nodes in the
    * sankey diagram in hover mode.
    */
  var linkOpacity: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) The opacity of a point in treemap. When a point has
    * children, the visibility of the children is determined by the opacity.
    */
  var opacity: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) The shadow option for hovered state.
    */
  var shadow: js.UndefOr[Boolean] = js.native
}
object SeriesStatesHoverOptionsObject {
  
  @scala.inline
  def apply(): SeriesStatesHoverOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesStatesHoverOptionsObject]
  }
  
  @scala.inline
  implicit class SeriesStatesHoverOptionsObjectMutableBuilder[Self <: SeriesStatesHoverOptionsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: Boolean | PartialAnimationOptionsOb): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setBorderColor(value: String | ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    @scala.inline
    def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    @scala.inline
    def setBrightness(value: Double): Self = StObject.set(x, "brightness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrightnessUndefined: Self = StObject.set(x, "brightness", js.undefined)
    
    @scala.inline
    def setColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setFillColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    @scala.inline
    def setHalo(value: SeriesStatesHoverHaloOptionsObject): Self = StObject.set(x, "halo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHaloNull: Self = StObject.set(x, "halo", null)
    
    @scala.inline
    def setHaloUndefined: Self = StObject.set(x, "halo", js.undefined)
    
    @scala.inline
    def setLineColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "lineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineColorUndefined: Self = StObject.set(x, "lineColor", js.undefined)
    
    @scala.inline
    def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineWidthPlus(value: Double): Self = StObject.set(x, "lineWidthPlus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineWidthPlusUndefined: Self = StObject.set(x, "lineWidthPlus", js.undefined)
    
    @scala.inline
    def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
    
    @scala.inline
    def setLinkOpacity(value: Double): Self = StObject.set(x, "linkOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkOpacityUndefined: Self = StObject.set(x, "linkOpacity", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setShadow(value: Boolean): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
  }
}
