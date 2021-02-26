package typingsSlinky.bingmaps.Microsoft.Maps

import typingsSlinky.bingmaps.Microsoft.Maps.SpatialMath.DistanceUnits
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDataBinningOptions extends StObject {
  
  /* The name of a property in the Pushpin.metadata object on which to perform calculations (average, count, sum) against the pushpins in each data bin. */
  var aggregationProperty: js.UndefOr[String] = js.native
  
  /*
    * A callback function which defines the color a data bin polygon should be. This callback recieves data bin information
    * along with the min and max calculated metrics for the data set. If set, this callback function must return a color value.
    */
  var colorCallback: js.UndefOr[
    js.Function3[
      /* binInfo */ IDataBinInfo, 
      /* min */ IDataBinMetrics, 
      /* max */ IDataBinMetrics, 
      String | Color
    ]
  ] = js.native
  
  /* The shape of the data bin to generate. Default: hexagon */
  var dataBinType: js.UndefOr[DataBinType] = js.native
  
  /* The distance units of the radius option. Default: meters */
  var distanceUnits: js.UndefOr[DistanceUnits] = js.native
  
  /* The default options used for rendering the data bin polygons. */
  var polygonOptions: js.UndefOr[IPolygonOptions] = js.native
  
  /*
    * A spatial distance which will be converted into a pixel distance at the equater and used to generate symetrically sized data bins
    * that have the apprimate spatial distance radius. Default: 1000
    */
  var radius: js.UndefOr[Double] = js.native
  
  /*
    * A callback function which defines how much to scale a data bins size. This callback recieves data bin information
    * along with the min and max calculated metrics for the data set. If set, this callback function must return a number between 0 and 1.
    */
  var scaleCallback: js.UndefOr[
    js.Function3[
      /* binInfo */ IDataBinInfo, 
      /* min */ IDataBinMetrics, 
      /* max */ IDataBinMetrics, 
      Double
    ]
  ] = js.native
}
object IDataBinningOptions {
  
  @scala.inline
  def apply(): IDataBinningOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDataBinningOptions]
  }
  
  @scala.inline
  implicit class IDataBinningOptionsMutableBuilder[Self <: IDataBinningOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregationProperty(value: String): Self = StObject.set(x, "aggregationProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregationPropertyUndefined: Self = StObject.set(x, "aggregationProperty", js.undefined)
    
    @scala.inline
    def setColorCallback(
      value: (/* binInfo */ IDataBinInfo, /* min */ IDataBinMetrics, /* max */ IDataBinMetrics) => String | Color
    ): Self = StObject.set(x, "colorCallback", js.Any.fromFunction3(value))
    
    @scala.inline
    def setColorCallbackUndefined: Self = StObject.set(x, "colorCallback", js.undefined)
    
    @scala.inline
    def setDataBinType(value: DataBinType): Self = StObject.set(x, "dataBinType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataBinTypeUndefined: Self = StObject.set(x, "dataBinType", js.undefined)
    
    @scala.inline
    def setDistanceUnits(value: DistanceUnits): Self = StObject.set(x, "distanceUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceUnitsUndefined: Self = StObject.set(x, "distanceUnits", js.undefined)
    
    @scala.inline
    def setPolygonOptions(value: IPolygonOptions): Self = StObject.set(x, "polygonOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolygonOptionsUndefined: Self = StObject.set(x, "polygonOptions", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    @scala.inline
    def setScaleCallback(
      value: (/* binInfo */ IDataBinInfo, /* min */ IDataBinMetrics, /* max */ IDataBinMetrics) => Double
    ): Self = StObject.set(x, "scaleCallback", js.Any.fromFunction3(value))
    
    @scala.inline
    def setScaleCallbackUndefined: Self = StObject.set(x, "scaleCallback", js.undefined)
  }
}
