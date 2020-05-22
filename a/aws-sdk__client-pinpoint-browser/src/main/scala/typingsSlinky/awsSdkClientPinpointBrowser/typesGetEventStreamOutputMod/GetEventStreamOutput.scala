package typingsSlinky.awsSdkClientPinpointBrowser.typesGetEventStreamOutputMod

import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.typesEventStreamMod.UnmarshalledEventStream
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetEventStreamOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * Model for an event publishing subscription export.
    */
  var EventStream: UnmarshalledEventStream
}

object GetEventStreamOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, EventStream: UnmarshalledEventStream): GetEventStreamOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], EventStream = EventStream.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEventStreamOutput]
  }
}

