package typingsSlinky.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SeriesNetworkgraphDataLabelsFormatterContextObject extends PointLabelObject {
  
  /**
    * The color of the node.
    */
  @JSName("color")
  var color_SeriesNetworkgraphDataLabelsFormatterContextObject: ColorString = js.native
  
  /**
    * The ID of the node.
    */
  @JSName("key")
  var key_SeriesNetworkgraphDataLabelsFormatterContextObject: String = js.native
}
object SeriesNetworkgraphDataLabelsFormatterContextObject {
  
  @scala.inline
  def apply(
    color: ColorString,
    colorIndex: Double,
    key: String,
    percentage: Double,
    point: Point,
    series: Series
  ): SeriesNetworkgraphDataLabelsFormatterContextObject = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], colorIndex = colorIndex.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], percentage = percentage.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesNetworkgraphDataLabelsFormatterContextObject]
  }
  
  @scala.inline
  implicit class SeriesNetworkgraphDataLabelsFormatterContextObjectMutableBuilder[Self <: SeriesNetworkgraphDataLabelsFormatterContextObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: ColorString): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
