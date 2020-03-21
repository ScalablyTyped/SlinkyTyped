package typingsSlinky.awsSdkClientKmsNode

import typingsSlinky.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-node/types/DecryptOutput", JSImport.Namespace)
@js.native
object typesDecryptOutputMod extends js.Object {
  @js.native
  trait DecryptOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>ARN of the key used to perform the decryption. This value is returned if no errors are encountered during the operation.</p>
      */
    var KeyId: js.UndefOr[String] = js.native
    /**
      * <p>Decrypted plaintext data. When you use the HTTP API or the AWS CLI, the value is Base64-encoded. Otherwise, it is not encoded.</p>
      */
    var Plaintext: js.UndefOr[scala.scalajs.js.typedarray.Uint8Array] = js.native
  }
  
}

