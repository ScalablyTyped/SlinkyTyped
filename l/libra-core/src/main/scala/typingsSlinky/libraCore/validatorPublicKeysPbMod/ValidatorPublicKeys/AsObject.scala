package typingsSlinky.libraCore.validatorPublicKeysPbMod.ValidatorPublicKeys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var accountAddress: scala.scalajs.js.typedarray.Uint8Array | String
  var consensusPublicKey: scala.scalajs.js.typedarray.Uint8Array | String
  var networkIdentityPublicKey: scala.scalajs.js.typedarray.Uint8Array | String
  var networkSigningPublicKey: scala.scalajs.js.typedarray.Uint8Array | String
}

object AsObject {
  @scala.inline
  def apply(
    accountAddress: scala.scalajs.js.typedarray.Uint8Array | String,
    consensusPublicKey: scala.scalajs.js.typedarray.Uint8Array | String,
    networkIdentityPublicKey: scala.scalajs.js.typedarray.Uint8Array | String,
    networkSigningPublicKey: scala.scalajs.js.typedarray.Uint8Array | String
  ): AsObject = {
    val __obj = js.Dynamic.literal(accountAddress = accountAddress.asInstanceOf[js.Any], consensusPublicKey = consensusPublicKey.asInstanceOf[js.Any], networkIdentityPublicKey = networkIdentityPublicKey.asInstanceOf[js.Any], networkSigningPublicKey = networkSigningPublicKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AsObject]
  }
}

