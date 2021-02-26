package typingsSlinky.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RealtimeLogConfig extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of this real-time log configuration.
    */
  var ARN: String = js.native
  
  /**
    * Contains information about the Amazon Kinesis data stream where you are sending real-time log data for this real-time log configuration.
    */
  var EndPoints: EndPointList = js.native
  
  /**
    * A list of fields that are included in each real-time log record. In an API response, the fields are provided in the same order in which they are sent to the Amazon Kinesis data stream. For more information about fields, see Real-time log configuration fields in the Amazon CloudFront Developer Guide.
    */
  var Fields: FieldList = js.native
  
  /**
    * The unique name of this real-time log configuration.
    */
  var Name: String = js.native
  
  /**
    * The sampling rate for this real-time log configuration. The sampling rate determines the percentage of viewer requests that are represented in the real-time log data. The sampling rate is an integer between 1 and 100, inclusive.
    */
  var SamplingRate: long = js.native
}
object RealtimeLogConfig {
  
  @scala.inline
  def apply(ARN: String, EndPoints: EndPointList, Fields: FieldList, Name: String, SamplingRate: long): RealtimeLogConfig = {
    val __obj = js.Dynamic.literal(ARN = ARN.asInstanceOf[js.Any], EndPoints = EndPoints.asInstanceOf[js.Any], Fields = Fields.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], SamplingRate = SamplingRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[RealtimeLogConfig]
  }
  
  @scala.inline
  implicit class RealtimeLogConfigMutableBuilder[Self <: RealtimeLogConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setARN(value: String): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndPoints(value: EndPointList): Self = StObject.set(x, "EndPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndPointsVarargs(value: EndPoint*): Self = StObject.set(x, "EndPoints", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: FieldList): Self = StObject.set(x, "Fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsVarargs(value: String*): Self = StObject.set(x, "Fields", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSamplingRate(value: long): Self = StObject.set(x, "SamplingRate", value.asInstanceOf[js.Any])
  }
}
