package typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser

import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreApplicationSettingsResourceMod._UnmarshalledApplicationSettingsResource
import typingsSlinky.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/types/UpdateApplicationSettingsOutput", JSImport.Namespace)
@js.native
object typesUpdateApplicationSettingsOutputMod extends js.Object {
  @js.native
  trait UpdateApplicationSettingsOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * Application settings.
      */
    var ApplicationSettingsResource: _UnmarshalledApplicationSettingsResource = js.native
  }
  
}

