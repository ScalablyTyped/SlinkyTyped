package typingsSlinky.awsSdkClientPinpointBrowser

import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.typesApnssandboxchannelresponseMod.UnmarshalledAPNSSandboxChannelResponse
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/types/UpdateApnsSandboxChannelOutput", JSImport.Namespace)
@js.native
object typesUpdateApnsSandboxChannelOutputMod extends js.Object {
  @js.native
  trait UpdateApnsSandboxChannelOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * Apple Development Push Notification Service channel definition.
      */
    var APNSSandboxChannelResponse: UnmarshalledAPNSSandboxChannelResponse = js.native
  }
  
}

