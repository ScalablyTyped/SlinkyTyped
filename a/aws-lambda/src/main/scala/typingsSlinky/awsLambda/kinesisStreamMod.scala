package typingsSlinky.awsLambda

import typingsSlinky.awsLambda.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kinesisStreamMod {
  
  @js.native
  trait KinesisStreamEvent extends StObject {
    
    var Records: js.Array[KinesisStreamRecord] = js.native
  }
  object KinesisStreamEvent {
    
    @scala.inline
    def apply(Records: js.Array[KinesisStreamRecord]): KinesisStreamEvent = {
      val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
      __obj.asInstanceOf[KinesisStreamEvent]
    }
    
    @scala.inline
    implicit class KinesisStreamEventMutableBuilder[Self <: KinesisStreamEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRecords(value: js.Array[KinesisStreamRecord]): Self = StObject.set(x, "Records", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordsVarargs(value: KinesisStreamRecord*): Self = StObject.set(x, "Records", js.Array(value :_*))
    }
  }
  
  type KinesisStreamHandler = Handler[KinesisStreamEvent, Unit]
  
  @js.native
  trait KinesisStreamRecord extends StObject {
    
    var awsRegion: String = js.native
    
    var eventID: String = js.native
    
    var eventName: String = js.native
    
    var eventSource: String = js.native
    
    var eventSourceARN: String = js.native
    
    var eventVersion: String = js.native
    
    var invokeIdentityArn: String = js.native
    
    var kinesis: KinesisStreamRecordPayload = js.native
  }
  object KinesisStreamRecord {
    
    @scala.inline
    def apply(
      awsRegion: String,
      eventID: String,
      eventName: String,
      eventSource: String,
      eventSourceARN: String,
      eventVersion: String,
      invokeIdentityArn: String,
      kinesis: KinesisStreamRecordPayload
    ): KinesisStreamRecord = {
      val __obj = js.Dynamic.literal(awsRegion = awsRegion.asInstanceOf[js.Any], eventID = eventID.asInstanceOf[js.Any], eventName = eventName.asInstanceOf[js.Any], eventSource = eventSource.asInstanceOf[js.Any], eventSourceARN = eventSourceARN.asInstanceOf[js.Any], eventVersion = eventVersion.asInstanceOf[js.Any], invokeIdentityArn = invokeIdentityArn.asInstanceOf[js.Any], kinesis = kinesis.asInstanceOf[js.Any])
      __obj.asInstanceOf[KinesisStreamRecord]
    }
    
    @scala.inline
    implicit class KinesisStreamRecordMutableBuilder[Self <: KinesisStreamRecord] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAwsRegion(value: String): Self = StObject.set(x, "awsRegion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventID(value: String): Self = StObject.set(x, "eventID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventSource(value: String): Self = StObject.set(x, "eventSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventSourceARN(value: String): Self = StObject.set(x, "eventSourceARN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventVersion(value: String): Self = StObject.set(x, "eventVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvokeIdentityArn(value: String): Self = StObject.set(x, "invokeIdentityArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKinesis(value: KinesisStreamRecordPayload): Self = StObject.set(x, "kinesis", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait KinesisStreamRecordPayload extends StObject {
    
    var approximateArrivalTimestamp: Double = js.native
    
    var data: String = js.native
    
    var kinesisSchemaVersion: String = js.native
    
    var partitionKey: String = js.native
    
    var sequenceNumber: String = js.native
  }
  object KinesisStreamRecordPayload {
    
    @scala.inline
    def apply(
      approximateArrivalTimestamp: Double,
      data: String,
      kinesisSchemaVersion: String,
      partitionKey: String,
      sequenceNumber: String
    ): KinesisStreamRecordPayload = {
      val __obj = js.Dynamic.literal(approximateArrivalTimestamp = approximateArrivalTimestamp.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], kinesisSchemaVersion = kinesisSchemaVersion.asInstanceOf[js.Any], partitionKey = partitionKey.asInstanceOf[js.Any], sequenceNumber = sequenceNumber.asInstanceOf[js.Any])
      __obj.asInstanceOf[KinesisStreamRecordPayload]
    }
    
    @scala.inline
    implicit class KinesisStreamRecordPayloadMutableBuilder[Self <: KinesisStreamRecordPayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApproximateArrivalTimestamp(value: Double): Self = StObject.set(x, "approximateArrivalTimestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKinesisSchemaVersion(value: String): Self = StObject.set(x, "kinesisSchemaVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartitionKey(value: String): Self = StObject.set(x, "partitionKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSequenceNumber(value: String): Self = StObject.set(x, "sequenceNumber", value.asInstanceOf[js.Any])
    }
  }
}
