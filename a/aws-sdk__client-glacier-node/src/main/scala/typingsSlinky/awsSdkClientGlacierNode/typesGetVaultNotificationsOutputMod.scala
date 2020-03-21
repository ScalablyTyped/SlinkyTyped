package typingsSlinky.awsSdkClientGlacierNode

import typingsSlinky.awsSdkClientGlacierNode.outputTypesUnionMod._OutputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.typesVaultNotificationConfigMod.UnmarshalledVaultNotificationConfig
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/types/GetVaultNotificationsOutput", JSImport.Namespace)
@js.native
object typesGetVaultNotificationsOutputMod extends js.Object {
  @js.native
  trait GetVaultNotificationsOutput extends _OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>Returns the notification configuration set on the vault.</p>
      */
    var vaultNotificationConfig: js.UndefOr[UnmarshalledVaultNotificationConfig] = js.native
  }
  
}

