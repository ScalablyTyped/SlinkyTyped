package typingsSlinky.awsSdkClientPinpointBrowser

import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.typesApnschannelresponseMod.UnmarshalledAPNSChannelResponse
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/types/UpdateApnsChannelOutput", JSImport.Namespace)
@js.native
object typesUpdateApnsChannelOutputMod extends js.Object {
  @js.native
  trait UpdateApnsChannelOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * Apple Distribution Push Notification Service channel definition.
      */
    var APNSChannelResponse: UnmarshalledAPNSChannelResponse = js.native
  }
  
}

