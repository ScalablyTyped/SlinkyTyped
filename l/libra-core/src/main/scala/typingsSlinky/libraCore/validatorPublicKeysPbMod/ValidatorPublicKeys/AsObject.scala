package typingsSlinky.libraCore.validatorPublicKeysPbMod.ValidatorPublicKeys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var accountAddress: js.typedarray.Uint8Array | String
  var consensusPublicKey: js.typedarray.Uint8Array | String
  var networkIdentityPublicKey: js.typedarray.Uint8Array | String
  var networkSigningPublicKey: js.typedarray.Uint8Array | String
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
}

