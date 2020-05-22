package typingsSlinky.awsSdkClientS3Browser.typesSelectObjectContentOutputMod

import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.typesSelectObjectContentEventStreamMod.UnmarshalledSelectObjectContentEventStream
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectObjectContentOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * _SelectObjectContentEventStream shape
    */
  var Payload: js.UndefOr[UnmarshalledSelectObjectContentEventStream] = js.undefined
}

object SelectObjectContentOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, Payload: UnmarshalledSelectObjectContentEventStream = null): SelectObjectContentOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (Payload != null) __obj.updateDynamic("Payload")(Payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectObjectContentOutput]
  }
}

