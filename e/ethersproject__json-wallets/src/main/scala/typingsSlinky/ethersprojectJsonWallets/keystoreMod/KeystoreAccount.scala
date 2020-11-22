package typingsSlinky.ethersprojectJsonWallets.keystoreMod

import typingsSlinky.ethersprojectAbstractSigner.mod.ExternallyOwnedAccount
import typingsSlinky.ethersprojectHdnode.mod.Mnemonic
import typingsSlinky.ethersprojectProperties.mod.Description
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/json-wallets/lib/keystore", "KeystoreAccount")
@js.native
class KeystoreAccount ()
  extends Description[_KeystoreAccount]
     with ExternallyOwnedAccount {
  
  val _isKeystoreAccount: Boolean = js.native
  
  def isKeystoreAccount(value: js.Any): /* is @ethersproject/json-wallets.@ethersproject/json-wallets/lib/keystore.KeystoreAccount */ Boolean = js.native
  
  val mnemonic: js.UndefOr[Mnemonic] = js.native
}
