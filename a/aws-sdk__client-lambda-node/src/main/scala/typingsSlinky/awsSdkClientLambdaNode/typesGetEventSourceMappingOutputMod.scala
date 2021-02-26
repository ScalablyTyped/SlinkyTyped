package typingsSlinky.awsSdkClientLambdaNode

import typingsSlinky.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetEventSourceMappingOutputMod {
  
  @js.native
  trait GetEventSourceMappingOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * <p>The largest number of records that AWS Lambda will retrieve from your event source at the time of invoking your function. Your function receives an event with all the retrieved records.</p>
      */
    var BatchSize: js.UndefOr[Double] = js.native
    
    /**
      * <p>The Amazon Resource Name (ARN) of the Amazon Kinesis or DynamoDB stream that is the source of events.</p>
      */
    var EventSourceArn: js.UndefOr[String] = js.native
    
    /**
      * <p>The Lambda function to invoke when AWS Lambda detects an event on the poll-based source.</p>
      */
    var FunctionArn: js.UndefOr[String] = js.native
    
    /**
      * <p>The UTC time string indicating the last time the event mapping was updated.</p>
      */
    var LastModified: js.UndefOr[js.Date] = js.native
    
    /**
      * <p>The result of the last AWS Lambda invocation of your Lambda function. This value will be null if an SQS queue is the event source.</p>
      */
    var LastProcessingResult: js.UndefOr[String] = js.native
    
    /**
      * <p>The state of the event source mapping. It can be <code>Creating</code>, <code>Enabled</code>, <code>Disabled</code>, <code>Enabling</code>, <code>Disabling</code>, <code>Updating</code>, or <code>Deleting</code>.</p>
      */
    var State: js.UndefOr[String] = js.native
    
    /**
      * <p>The reason the event source mapping is in its current state. It is either user-requested or an AWS Lambda-initiated state transition.</p>
      */
    var StateTransitionReason: js.UndefOr[String] = js.native
    
    /**
      * <p>The AWS Lambda assigned opaque identifier for the mapping.</p>
      */
    var UUID: js.UndefOr[String] = js.native
  }
  object GetEventSourceMappingOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): GetEventSourceMappingOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetEventSourceMappingOutput]
    }
    
    @scala.inline
    implicit class GetEventSourceMappingOutputMutableBuilder[Self <: GetEventSourceMappingOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBatchSize(value: Double): Self = StObject.set(x, "BatchSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBatchSizeUndefined: Self = StObject.set(x, "BatchSize", js.undefined)
      
      @scala.inline
      def setEventSourceArn(value: String): Self = StObject.set(x, "EventSourceArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventSourceArnUndefined: Self = StObject.set(x, "EventSourceArn", js.undefined)
      
      @scala.inline
      def setFunctionArn(value: String): Self = StObject.set(x, "FunctionArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionArnUndefined: Self = StObject.set(x, "FunctionArn", js.undefined)
      
      @scala.inline
      def setLastModified(value: js.Date): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastModifiedUndefined: Self = StObject.set(x, "LastModified", js.undefined)
      
      @scala.inline
      def setLastProcessingResult(value: String): Self = StObject.set(x, "LastProcessingResult", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastProcessingResultUndefined: Self = StObject.set(x, "LastProcessingResult", js.undefined)
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateTransitionReason(value: String): Self = StObject.set(x, "StateTransitionReason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateTransitionReasonUndefined: Self = StObject.set(x, "StateTransitionReason", js.undefined)
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
      
      @scala.inline
      def setUUID(value: String): Self = StObject.set(x, "UUID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUUIDUndefined: Self = StObject.set(x, "UUID", js.undefined)
    }
  }
}
