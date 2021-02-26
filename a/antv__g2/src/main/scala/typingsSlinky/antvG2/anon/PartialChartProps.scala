package typingsSlinky.antvG2.anon

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.antvG2.mod.Styles.background
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@antv/g2.@antv/g2.ChartProps> */
@js.native
trait PartialChartProps extends StObject {
  
  var animate: js.UndefOr[Boolean] = js.native
  
  var background: js.UndefOr[typingsSlinky.antvG2.mod.Styles.background] = js.native
  
  var container: js.UndefOr[String | HTMLDivElement] = js.native
  
  var data: js.UndefOr[js.Object | js.Any] = js.native
  
  var forceFit: js.UndefOr[Boolean] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var padding: js.UndefOr[
    Bottom | Double | String | (js.Tuple4[Double | String, Double | String, Double | String, Double | String]) | (js.Tuple2[String, String])
  ] = js.native
  
  var pixelRatio: js.UndefOr[Double] = js.native
  
  var plotBackground: js.UndefOr[background] = js.native
  
  var theme: js.UndefOr[js.Object | String] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object PartialChartProps {
  
  @scala.inline
  def apply(): PartialChartProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialChartProps]
  }
  
  @scala.inline
  implicit class PartialChartPropsMutableBuilder[Self <: PartialChartProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    @scala.inline
    def setBackground(value: background): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setContainer(value: String | HTMLDivElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerHTMLDivElement(value: HTMLDivElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setData(value: js.Object | js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setForceFit(value: Boolean): Self = StObject.set(x, "forceFit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceFitUndefined: Self = StObject.set(x, "forceFit", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setPadding(
      value: Bottom | Double | String | (js.Tuple4[Double | String, Double | String, Double | String, Double | String]) | (js.Tuple2[String, String])
    ): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
    
    @scala.inline
    def setPlotBackground(value: background): Self = StObject.set(x, "plotBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlotBackgroundUndefined: Self = StObject.set(x, "plotBackground", js.undefined)
    
    @scala.inline
    def setTheme(value: js.Object | String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
