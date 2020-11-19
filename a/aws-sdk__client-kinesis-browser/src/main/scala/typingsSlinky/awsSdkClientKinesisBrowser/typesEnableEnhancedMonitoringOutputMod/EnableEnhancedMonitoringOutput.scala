package typingsSlinky.awsSdkClientKinesisBrowser.typesEnableEnhancedMonitoringOutputMod

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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnableEnhancedMonitoringOutput extends OutputTypesUnion {
  
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
object EnableEnhancedMonitoringOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata): EnableEnhancedMonitoringOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableEnhancedMonitoringOutput]
  }
  
  @scala.inline
  implicit class EnableEnhancedMonitoringOutputOps[Self <: EnableEnhancedMonitoringOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set$metadata(value: ResponseMetadata): Self = this.set("$metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentShardLevelMetricsVarargs(
      value: (IncomingBytes | IncomingRecords | OutgoingBytes | OutgoingRecords | WriteProvisionedThroughputExceeded | ReadProvisionedThroughputExceeded | IteratorAgeMilliseconds | ALL | String)*
    ): Self = this.set("CurrentShardLevelMetrics", js.Array(value :_*))
    
    @scala.inline
    def setCurrentShardLevelMetrics(
      value: js.Array[
          IncomingBytes | IncomingRecords | OutgoingBytes | OutgoingRecords | WriteProvisionedThroughputExceeded | ReadProvisionedThroughputExceeded | IteratorAgeMilliseconds | ALL | String
        ]
    ): Self = this.set("CurrentShardLevelMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentShardLevelMetrics: Self = this.set("CurrentShardLevelMetrics", js.undefined)
    
    @scala.inline
    def setDesiredShardLevelMetricsVarargs(
      value: (IncomingBytes | IncomingRecords | OutgoingBytes | OutgoingRecords | WriteProvisionedThroughputExceeded | ReadProvisionedThroughputExceeded | IteratorAgeMilliseconds | ALL | String)*
    ): Self = this.set("DesiredShardLevelMetrics", js.Array(value :_*))
    
    @scala.inline
    def setDesiredShardLevelMetrics(
      value: js.Array[
          IncomingBytes | IncomingRecords | OutgoingBytes | OutgoingRecords | WriteProvisionedThroughputExceeded | ReadProvisionedThroughputExceeded | IteratorAgeMilliseconds | ALL | String
        ]
    ): Self = this.set("DesiredShardLevelMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDesiredShardLevelMetrics: Self = this.set("DesiredShardLevelMetrics", js.undefined)
    
    @scala.inline
    def setStreamName(value: String): Self = this.set("StreamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreamName: Self = this.set("StreamName", js.undefined)
  }
}
