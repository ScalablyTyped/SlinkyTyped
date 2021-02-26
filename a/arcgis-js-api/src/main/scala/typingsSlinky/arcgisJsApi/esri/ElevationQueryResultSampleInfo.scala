package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElevationQueryResultSampleInfo extends Object {
  
  /**
    * The resolution at which the z-value was sampled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#ElevationQueryResult)
    */
  var demResolution: Double = js.native
  
  /**
    * The elevation source from which the data for the corresponding coordinate was sampled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#ElevationQueryResult)
    */
  var source: ElevationLayer = js.native
}
object ElevationQueryResultSampleInfo {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    demResolution: Double,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    source: ElevationLayer
  ): ElevationQueryResultSampleInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], demResolution = demResolution.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElevationQueryResultSampleInfo]
  }
  
  @scala.inline
  implicit class ElevationQueryResultSampleInfoMutableBuilder[Self <: ElevationQueryResultSampleInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDemResolution(value: Double): Self = StObject.set(x, "demResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: ElevationLayer): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
