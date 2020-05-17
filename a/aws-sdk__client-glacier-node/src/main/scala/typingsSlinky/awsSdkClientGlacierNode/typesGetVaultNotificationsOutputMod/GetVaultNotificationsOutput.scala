package typingsSlinky.awsSdkClientGlacierNode.typesGetVaultNotificationsOutputMod

import typingsSlinky.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.typesVaultNotificationConfigMod.UnmarshalledVaultNotificationConfig
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVaultNotificationsOutput extends OutputTypesUnion {
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

object GetVaultNotificationsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): GetVaultNotificationsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVaultNotificationsOutput]
  }
  @scala.inline
  implicit class GetVaultNotificationsOutputOps[Self <: GetVaultNotificationsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$metadata(value: ResponseMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVaultNotificationConfig(value: UnmarshalledVaultNotificationConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vaultNotificationConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVaultNotificationConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vaultNotificationConfig")(js.undefined)
        ret
    }
  }
  
}

