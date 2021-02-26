package typingsSlinky.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertyType extends StObject {
  
  /**
    * Specifies an asset attribute property. An attribute generally contains static information, such as the serial number of an IIoT wind turbine.
    */
  var attribute: js.UndefOr[Attribute] = js.native
  
  /**
    * Specifies an asset measurement property. A measurement represents a device's raw sensor data stream, such as timestamped temperature values or timestamped power values.
    */
  var measurement: js.UndefOr[Measurement] = js.native
  
  /**
    * Specifies an asset metric property. A metric contains a mathematical expression that uses aggregate functions to process all input data points over a time interval and output a single data point, such as to calculate the average hourly temperature.
    */
  var metric: js.UndefOr[Metric] = js.native
  
  /**
    * Specifies an asset transform property. A transform contains a mathematical expression that maps a property's data points from one form to another, such as a unit conversion from Celsius to Fahrenheit.
    */
  var transform: js.UndefOr[Transform] = js.native
}
object PropertyType {
  
  @scala.inline
  def apply(): PropertyType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertyType]
  }
  
  @scala.inline
  implicit class PropertyTypeMutableBuilder[Self <: PropertyType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttribute(value: Attribute): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
    
    @scala.inline
    def setMeasurement(value: Measurement): Self = StObject.set(x, "measurement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasurementUndefined: Self = StObject.set(x, "measurement", js.undefined)
    
    @scala.inline
    def setMetric(value: Metric): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
    
    @scala.inline
    def setTransform(value: Transform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
  }
}
