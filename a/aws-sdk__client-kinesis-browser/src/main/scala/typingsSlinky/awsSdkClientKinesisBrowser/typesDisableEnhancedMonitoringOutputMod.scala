package typingsSlinky.awsSdkClientKinesisBrowser

import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ALL
import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.IncomingBytes
import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.IncomingRecords
import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.IteratorAgeMilliseconds
import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.OutgoingBytes
import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.OutgoingRecords
import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ReadProvisionedThroughputExceeded
import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.WriteProvisionedThroughputExceeded
import typingsSlinky.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDisableEnhancedMonitoringOutputMod {
  
  @js.native
  trait DisableEnhancedMonitoringOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * <p>Represents the current state of the metrics that are in the enhanced state before the operation.</p>
      */
    var CurrentShardLevelMetrics: js.UndefOr[
        js.Array[
          IncomingBytes | IncomingRecords | OutgoingBytes | OutgoingRecords | WriteProvisionedThroughputExceeded | ReadProvisionedThroughputExceeded | IteratorAgeMilliseconds | ALL | String
        ]
      ] = js.native
    
    /**
      * <p>Represents the list of all the metrics that would be in the enhanced state after the operation.</p>
      */
    var DesiredShardLevelMetrics: js.UndefOr[
        js.Array[
          IncomingBytes | IncomingRecords | OutgoingBytes | OutgoingRecords | WriteProvisionedThroughputExceeded | ReadProvisionedThroughputExceeded | IteratorAgeMilliseconds | ALL | String
        ]
      ] = js.native
    
    /**
      * <p>The name of the Kinesis data stream.</p>
      */
    var StreamName: js.UndefOr[String] = js.native
  }
  object DisableEnhancedMonitoringOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): DisableEnhancedMonitoringOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[DisableEnhancedMonitoringOutput]
    }
    
    @scala.inline
    implicit class DisableEnhancedMonitoringOutputMutableBuilder[Self <: DisableEnhancedMonitoringOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentShardLevelMetrics(
        value: js.Array[
              IncomingBytes | IncomingRecords | OutgoingBytes | OutgoingRecords | WriteProvisionedThroughputExceeded | ReadProvisionedThroughputExceeded | IteratorAgeMilliseconds | ALL | String
            ]
      ): Self = StObject.set(x, "CurrentShardLevelMetrics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentShardLevelMetricsUndefined: Self = StObject.set(x, "CurrentShardLevelMetrics", js.undefined)
      
      @scala.inline
      def setCurrentShardLevelMetricsVarargs(
        value: (IncomingBytes | IncomingRecords | OutgoingBytes | OutgoingRecords | WriteProvisionedThroughputExceeded | ReadProvisionedThroughputExceeded | IteratorAgeMilliseconds | ALL | String)*
      ): Self = StObject.set(x, "CurrentShardLevelMetrics", js.Array(value :_*))
      
      @scala.inline
      def setDesiredShardLevelMetrics(
        value: js.Array[
              IncomingBytes | IncomingRecords | OutgoingBytes | OutgoingRecords | WriteProvisionedThroughputExceeded | ReadProvisionedThroughputExceeded | IteratorAgeMilliseconds | ALL | String
            ]
      ): Self = StObject.set(x, "DesiredShardLevelMetrics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDesiredShardLevelMetricsUndefined: Self = StObject.set(x, "DesiredShardLevelMetrics", js.undefined)
      
      @scala.inline
      def setDesiredShardLevelMetricsVarargs(
        value: (IncomingBytes | IncomingRecords | OutgoingBytes | OutgoingRecords | WriteProvisionedThroughputExceeded | ReadProvisionedThroughputExceeded | IteratorAgeMilliseconds | ALL | String)*
      ): Self = StObject.set(x, "DesiredShardLevelMetrics", js.Array(value :_*))
      
      @scala.inline
      def setStreamName(value: String): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamNameUndefined: Self = StObject.set(x, "StreamName", js.undefined)
    }
  }
}
