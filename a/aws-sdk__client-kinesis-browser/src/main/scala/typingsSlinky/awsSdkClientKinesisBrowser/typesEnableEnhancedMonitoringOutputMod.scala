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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/types/EnableEnhancedMonitoringOutput", JSImport.Namespace)
@js.native
object typesEnableEnhancedMonitoringOutputMod extends js.Object {
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
  
}

