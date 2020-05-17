package typingsSlinky.awsSdkClientGlacierNode.typesGetVaultLockOutputMod

import typingsSlinky.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVaultLockOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>The UTC date and time at which the vault lock was put into the <code>InProgress</code> state.</p>
    */
  var CreationDate: js.UndefOr[String] = js.native
  /**
    * <p>The UTC date and time at which the lock ID expires. This value can be <code>null</code> if the vault lock is in a <code>Locked</code> state.</p>
    */
  var ExpirationDate: js.UndefOr[String] = js.native
  /**
    * <p>The vault lock policy as a JSON string, which uses "\" as an escape character.</p>
    */
  var Policy: js.UndefOr[String] = js.native
  /**
    * <p>The state of the vault lock. <code>InProgress</code> or <code>Locked</code>.</p>
    */
  var State: js.UndefOr[String] = js.native
}

object GetVaultLockOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): GetVaultLockOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVaultLockOutput]
  }
  @scala.inline
  implicit class GetVaultLockOutputOps[Self <: GetVaultLockOutput] (val x: Self) extends AnyVal {
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
    def withCreationDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withExpirationDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpirationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpirationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpirationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Policy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Policy")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
  }
  
}

