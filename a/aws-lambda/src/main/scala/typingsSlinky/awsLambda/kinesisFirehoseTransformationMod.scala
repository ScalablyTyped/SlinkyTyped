package typingsSlinky.awsLambda

import typingsSlinky.awsLambda.handlerMod.Callback
import typingsSlinky.awsLambda.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kinesisFirehoseTransformationMod {
  
  @js.native
  trait FirehoseRecordMetadata extends StObject {
    
    var approximateArrivalTimestamp: Double = js.native
    
    var partitionKey: String = js.native
    
    var sequenceNumber: String = js.native
    
    var shardId: String = js.native
    
    var subsequenceNumber: String = js.native
  }
  object FirehoseRecordMetadata {
    
    @scala.inline
    def apply(
      approximateArrivalTimestamp: Double,
      partitionKey: String,
      sequenceNumber: String,
      shardId: String,
      subsequenceNumber: String
    ): FirehoseRecordMetadata = {
      val __obj = js.Dynamic.literal(approximateArrivalTimestamp = approximateArrivalTimestamp.asInstanceOf[js.Any], partitionKey = partitionKey.asInstanceOf[js.Any], sequenceNumber = sequenceNumber.asInstanceOf[js.Any], shardId = shardId.asInstanceOf[js.Any], subsequenceNumber = subsequenceNumber.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirehoseRecordMetadata]
    }
    
    @scala.inline
    implicit class FirehoseRecordMetadataMutableBuilder[Self <: FirehoseRecordMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApproximateArrivalTimestamp(value: Double): Self = StObject.set(x, "approximateArrivalTimestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartitionKey(value: String): Self = StObject.set(x, "partitionKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSequenceNumber(value: String): Self = StObject.set(x, "sequenceNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShardId(value: String): Self = StObject.set(x, "shardId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubsequenceNumber(value: String): Self = StObject.set(x, "subsequenceNumber", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsLambda.awsLambdaStrings.Ok
    - typingsSlinky.awsLambda.awsLambdaStrings.Dropped
    - typingsSlinky.awsLambda.awsLambdaStrings.ProcessingFailed
  */
  trait FirehoseRecordTransformationStatus extends StObject
  object FirehoseRecordTransformationStatus {
    
    @scala.inline
    def Dropped: typingsSlinky.awsLambda.awsLambdaStrings.Dropped = "Dropped".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.Dropped]
    
    @scala.inline
    def Ok: typingsSlinky.awsLambda.awsLambdaStrings.Ok = "Ok".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.Ok]
    
    @scala.inline
    def ProcessingFailed: typingsSlinky.awsLambda.awsLambdaStrings.ProcessingFailed = "ProcessingFailed".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.ProcessingFailed]
  }
  
  type FirehoseTransformationCallback = Callback[FirehoseTransformationResult]
  
  @js.native
  trait FirehoseTransformationEvent extends StObject {
    
    var deliveryStreamArn: String = js.native
    
    var invocationId: String = js.native
    
    var records: js.Array[FirehoseTransformationEventRecord] = js.native
    
    var region: String = js.native
  }
  object FirehoseTransformationEvent {
    
    @scala.inline
    def apply(
      deliveryStreamArn: String,
      invocationId: String,
      records: js.Array[FirehoseTransformationEventRecord],
      region: String
    ): FirehoseTransformationEvent = {
      val __obj = js.Dynamic.literal(deliveryStreamArn = deliveryStreamArn.asInstanceOf[js.Any], invocationId = invocationId.asInstanceOf[js.Any], records = records.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirehoseTransformationEvent]
    }
    
    @scala.inline
    implicit class FirehoseTransformationEventMutableBuilder[Self <: FirehoseTransformationEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeliveryStreamArn(value: String): Self = StObject.set(x, "deliveryStreamArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvocationId(value: String): Self = StObject.set(x, "invocationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecords(value: js.Array[FirehoseTransformationEventRecord]): Self = StObject.set(x, "records", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordsVarargs(value: FirehoseTransformationEventRecord*): Self = StObject.set(x, "records", js.Array(value :_*))
      
      @scala.inline
      def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FirehoseTransformationEventRecord extends StObject {
    
    var approximateArrivalTimestamp: Double = js.native
    
    /** Base64 encoded */
    var data: String = js.native
    
    var kinesisRecordMetadata: js.UndefOr[FirehoseRecordMetadata] = js.native
    
    var recordId: String = js.native
  }
  object FirehoseTransformationEventRecord {
    
    @scala.inline
    def apply(approximateArrivalTimestamp: Double, data: String, recordId: String): FirehoseTransformationEventRecord = {
      val __obj = js.Dynamic.literal(approximateArrivalTimestamp = approximateArrivalTimestamp.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], recordId = recordId.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirehoseTransformationEventRecord]
    }
    
    @scala.inline
    implicit class FirehoseTransformationEventRecordMutableBuilder[Self <: FirehoseTransformationEventRecord] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApproximateArrivalTimestamp(value: Double): Self = StObject.set(x, "approximateArrivalTimestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKinesisRecordMetadata(value: FirehoseRecordMetadata): Self = StObject.set(x, "kinesisRecordMetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKinesisRecordMetadataUndefined: Self = StObject.set(x, "kinesisRecordMetadata", js.undefined)
      
      @scala.inline
      def setRecordId(value: String): Self = StObject.set(x, "recordId", value.asInstanceOf[js.Any])
    }
  }
  
  type FirehoseTransformationHandler = Handler[FirehoseTransformationEvent, FirehoseTransformationResult]
  
  @js.native
  trait FirehoseTransformationResult extends StObject {
    
    var records: js.Array[FirehoseTransformationResultRecord] = js.native
  }
  object FirehoseTransformationResult {
    
    @scala.inline
    def apply(records: js.Array[FirehoseTransformationResultRecord]): FirehoseTransformationResult = {
      val __obj = js.Dynamic.literal(records = records.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirehoseTransformationResult]
    }
    
    @scala.inline
    implicit class FirehoseTransformationResultMutableBuilder[Self <: FirehoseTransformationResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRecords(value: js.Array[FirehoseTransformationResultRecord]): Self = StObject.set(x, "records", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordsVarargs(value: FirehoseTransformationResultRecord*): Self = StObject.set(x, "records", js.Array(value :_*))
    }
  }
  
  @js.native
  trait FirehoseTransformationResultRecord extends StObject {
    
    /** Encode in Base64 */
    var data: String = js.native
    
    var recordId: String = js.native
    
    var result: FirehoseRecordTransformationStatus = js.native
  }
  object FirehoseTransformationResultRecord {
    
    @scala.inline
    def apply(data: String, recordId: String, result: FirehoseRecordTransformationStatus): FirehoseTransformationResultRecord = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], recordId = recordId.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirehoseTransformationResultRecord]
    }
    
    @scala.inline
    implicit class FirehoseTransformationResultRecordMutableBuilder[Self <: FirehoseTransformationResultRecord] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordId(value: String): Self = StObject.set(x, "recordId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResult(value: FirehoseRecordTransformationStatus): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
}
