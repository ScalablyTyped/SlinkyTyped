package typingsSlinky.awsSdkClientXrayNode

import typingsSlinky.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientXrayNode.typesEncryptionConfigMod.UnmarshalledEncryptionConfig
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-xray-node/types/PutEncryptionConfigOutput", JSImport.Namespace)
@js.native
object typesPutEncryptionConfigOutputMod extends js.Object {
  @js.native
  trait PutEncryptionConfigOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>The new encryption configuration.</p>
      */
    var EncryptionConfig: js.UndefOr[UnmarshalledEncryptionConfig] = js.native
  }
  
}

