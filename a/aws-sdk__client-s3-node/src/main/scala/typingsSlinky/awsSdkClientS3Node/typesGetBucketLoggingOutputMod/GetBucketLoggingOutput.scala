package typingsSlinky.awsSdkClientS3Node.typesGetBucketLoggingOutputMod

import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typingsSlinky.awsSdkClientS3Node.typesLoggingEnabledMod.UnmarshalledLoggingEnabled
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketLoggingOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * <p>Container for logging information. Presence of this element indicates that logging is enabled. Parameters TargetBucket and TargetPrefix are required in this case.</p>
    */
  var LoggingEnabled: js.UndefOr[UnmarshalledLoggingEnabled] = js.native
}

object GetBucketLoggingOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): GetBucketLoggingOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketLoggingOutput]
  }
  @scala.inline
  implicit class GetBucketLoggingOutputOps[Self <: GetBucketLoggingOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoggingEnabled(value: UnmarshalledLoggingEnabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoggingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoggingEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoggingEnabled")(js.undefined)
        ret
    }
  }
  
}

