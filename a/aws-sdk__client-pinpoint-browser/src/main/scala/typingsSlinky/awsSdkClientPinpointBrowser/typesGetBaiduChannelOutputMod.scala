package typingsSlinky.awsSdkClientPinpointBrowser

import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.typesBaiduChannelResponseMod.UnmarshalledBaiduChannelResponse
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/types/GetBaiduChannelOutput", JSImport.Namespace)
@js.native
object typesGetBaiduChannelOutputMod extends js.Object {
  @js.native
  trait GetBaiduChannelOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * Baidu Cloud Messaging channel definition
      */
    var BaiduChannelResponse: UnmarshalledBaiduChannelResponse = js.native
  }
  
}

