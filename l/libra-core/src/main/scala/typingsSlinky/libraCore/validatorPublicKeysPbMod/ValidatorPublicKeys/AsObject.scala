package typingsSlinky.libraCore.validatorPublicKeysPbMod.ValidatorPublicKeys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var accountAddress: js.typedarray.Uint8Array | String = js.native
  var consensusPublicKey: js.typedarray.Uint8Array | String = js.native
  var networkIdentityPublicKey: js.typedarray.Uint8Array | String = js.native
  var networkSigningPublicKey: js.typedarray.Uint8Array | String = js.native
}

object AsObject {
  @scala.inline
  def apply(
    accountAddress: js.typedarray.Uint8Array | String,
    consensusPublicKey: js.typedarray.Uint8Array | String,
    networkIdentityPublicKey: js.typedarray.Uint8Array | String,
    networkSigningPublicKey: js.typedarray.Uint8Array | String
  ): AsObject = {
    val __obj = js.Dynamic.literal(accountAddress = accountAddress.asInstanceOf[js.Any], consensusPublicKey = consensusPublicKey.asInstanceOf[js.Any], networkIdentityPublicKey = networkIdentityPublicKey.asInstanceOf[js.Any], networkSigningPublicKey = networkSigningPublicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccountAddressUint8Array(value: js.typedarray.Uint8Array): Self = this.set("accountAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccountAddress(value: js.typedarray.Uint8Array | String): Self = this.set("accountAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setConsensusPublicKeyUint8Array(value: js.typedarray.Uint8Array): Self = this.set("consensusPublicKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setConsensusPublicKey(value: js.typedarray.Uint8Array | String): Self = this.set("consensusPublicKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetworkIdentityPublicKeyUint8Array(value: js.typedarray.Uint8Array): Self = this.set("networkIdentityPublicKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetworkIdentityPublicKey(value: js.typedarray.Uint8Array | String): Self = this.set("networkIdentityPublicKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetworkSigningPublicKeyUint8Array(value: js.typedarray.Uint8Array): Self = this.set("networkSigningPublicKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetworkSigningPublicKey(value: js.typedarray.Uint8Array | String): Self = this.set("networkSigningPublicKey", value.asInstanceOf[js.Any])
  }
  
}

