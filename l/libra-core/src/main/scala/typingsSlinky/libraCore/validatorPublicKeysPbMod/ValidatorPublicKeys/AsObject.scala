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
    def withAccountAddressUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccountAddress(value: js.typedarray.Uint8Array | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConsensusPublicKeyUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consensusPublicKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConsensusPublicKey(value: js.typedarray.Uint8Array | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consensusPublicKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetworkIdentityPublicKeyUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkIdentityPublicKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetworkIdentityPublicKey(value: js.typedarray.Uint8Array | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkIdentityPublicKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetworkSigningPublicKeyUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkSigningPublicKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetworkSigningPublicKey(value: js.typedarray.Uint8Array | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkSigningPublicKey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

