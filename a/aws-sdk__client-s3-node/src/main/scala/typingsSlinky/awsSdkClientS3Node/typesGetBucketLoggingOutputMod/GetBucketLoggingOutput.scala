package typingsSlinky.awsSdkClientS3Node.typesGetBucketLoggingOutputMod

import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typingsSlinky.awsSdkClientS3Node.typesLoggingEnabledMod.UnmarshalledLoggingEnabled
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketLoggingOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * <p>Container for logging information. Presence of this element indicates that logging is enabled. Parameters TargetBucket and TargetPrefix are required in this case.</p>
    */
  var LoggingEnabled: js.UndefOr[UnmarshalledLoggingEnabled] = js.undefined
}

object GetBucketLoggingOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, LoggingEnabled: UnmarshalledLoggingEnabled = null): GetBucketLoggingOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (LoggingEnabled != null) __obj.updateDynamic("LoggingEnabled")(LoggingEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketLoggingOutput]
  }
}

