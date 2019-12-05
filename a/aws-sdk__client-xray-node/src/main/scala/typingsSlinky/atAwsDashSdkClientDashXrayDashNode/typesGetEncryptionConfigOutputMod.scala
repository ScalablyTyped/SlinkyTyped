package typingsSlinky.atAwsDashSdkClientDashXrayDashNode

import typingsSlinky.atAwsDashSdkClientDashXrayDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreEncryptionConfigMod._UnmarshalledEncryptionConfig
import typingsSlinky.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-xray-node/types/GetEncryptionConfigOutput", JSImport.Namespace)
@js.native
object typesGetEncryptionConfigOutputMod extends js.Object {
  @js.native
  trait GetEncryptionConfigOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>The encryption configuration document.</p>
      */
    var EncryptionConfig: js.UndefOr[_UnmarshalledEncryptionConfig] = js.native
  }
  
}

