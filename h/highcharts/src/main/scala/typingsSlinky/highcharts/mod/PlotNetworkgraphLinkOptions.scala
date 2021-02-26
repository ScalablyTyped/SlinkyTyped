package typingsSlinky.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotNetworkgraphLinkOptions extends StObject {
  
  /**
    * (Highcharts) Color of the link between two nodes.
    */
  var color: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts) A name for the dash style to use for links.
    */
  var dashStyle: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts) Width (px) of the link between two nodes.
    */
  var width: js.UndefOr[Double] = js.native
}
object PlotNetworkgraphLinkOptions {
  
  @scala.inline
  def apply(): PlotNetworkgraphLinkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotNetworkgraphLinkOptions]
  }
  
  @scala.inline
  implicit class PlotNetworkgraphLinkOptionsMutableBuilder[Self <: PlotNetworkgraphLinkOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDashStyle(value: String): Self = StObject.set(x, "dashStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashStyleUndefined: Self = StObject.set(x, "dashStyle", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
