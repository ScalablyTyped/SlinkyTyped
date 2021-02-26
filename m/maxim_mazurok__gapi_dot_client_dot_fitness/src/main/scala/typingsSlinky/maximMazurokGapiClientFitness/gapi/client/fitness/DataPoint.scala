package typingsSlinky.maximMazurokGapiClientFitness.gapi.client.fitness

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataPoint extends StObject {
  
  /** DO NOT USE THIS FIELD. It is ignored, and not stored. */
  var computationTimeMillis: js.UndefOr[String] = js.native
  
  /** The data type defining the format of the values in this data point. */
  var dataTypeName: js.UndefOr[String] = js.native
  
  /** The end time of the interval represented by this data point, in nanoseconds since epoch. */
  var endTimeNanos: js.UndefOr[String] = js.native
  
  /** Indicates the last time this data point was modified. Useful only in contexts where we are listing the data changes, rather than representing the current state of the data. */
  var modifiedTimeMillis: js.UndefOr[String] = js.native
  
  /**
    * If the data point is contained in a dataset for a derived data source, this field will be populated with the data source stream ID that created the data point originally. WARNING:
    * do not rely on this field for anything other than debugging. The value of this field, if it is set at all, is an implementation detail and is not guaranteed to remain consistent.
    */
  var originDataSourceId: js.UndefOr[String] = js.native
  
  /** The raw timestamp from the original SensorEvent. */
  var rawTimestampNanos: js.UndefOr[String] = js.native
  
  /** The start time of the interval represented by this data point, in nanoseconds since epoch. */
  var startTimeNanos: js.UndefOr[String] = js.native
  
  /**
    * Values of each data type field for the data point. It is expected that each value corresponding to a data type field will occur in the same order that the field is listed with in
    * the data type specified in a data source. Only one of integer and floating point fields will be populated, depending on the format enum value within data source's type field.
    */
  var value: js.UndefOr[js.Array[Value]] = js.native
}
object DataPoint {
  
  @scala.inline
  def apply(): DataPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataPoint]
  }
  
  @scala.inline
  implicit class DataPointMutableBuilder[Self <: DataPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComputationTimeMillis(value: String): Self = StObject.set(x, "computationTimeMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputationTimeMillisUndefined: Self = StObject.set(x, "computationTimeMillis", js.undefined)
    
    @scala.inline
    def setDataTypeName(value: String): Self = StObject.set(x, "dataTypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTypeNameUndefined: Self = StObject.set(x, "dataTypeName", js.undefined)
    
    @scala.inline
    def setEndTimeNanos(value: String): Self = StObject.set(x, "endTimeNanos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeNanosUndefined: Self = StObject.set(x, "endTimeNanos", js.undefined)
    
    @scala.inline
    def setModifiedTimeMillis(value: String): Self = StObject.set(x, "modifiedTimeMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedTimeMillisUndefined: Self = StObject.set(x, "modifiedTimeMillis", js.undefined)
    
    @scala.inline
    def setOriginDataSourceId(value: String): Self = StObject.set(x, "originDataSourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginDataSourceIdUndefined: Self = StObject.set(x, "originDataSourceId", js.undefined)
    
    @scala.inline
    def setRawTimestampNanos(value: String): Self = StObject.set(x, "rawTimestampNanos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawTimestampNanosUndefined: Self = StObject.set(x, "rawTimestampNanos", js.undefined)
    
    @scala.inline
    def setStartTimeNanos(value: String): Self = StObject.set(x, "startTimeNanos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeNanosUndefined: Self = StObject.set(x, "startTimeNanos", js.undefined)
    
    @scala.inline
    def setValue(value: js.Array[Value]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: Value*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
