package typingsSlinky.ethereumjsWallet.thirdpartyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethereumjs-wallet/dist/thirdparty", JSImport.Default)
@js.native
object default extends js.Object {
  
  def fromEtherCamp(passphrase: String): typingsSlinky.ethereumjsWallet.mod.default = js.native
  @JSName("fromEtherCamp")
  var fromEtherCamp_Original: js.Function1[/* passphrase */ String, typingsSlinky.ethereumjsWallet.mod.default] = js.native
  
  def fromEtherWallet(input: String, password: String): typingsSlinky.ethereumjsWallet.mod.default = js.native
  def fromEtherWallet(input: EtherWalletOptions, password: String): typingsSlinky.ethereumjsWallet.mod.default = js.native
  @JSName("fromEtherWallet")
  var fromEtherWallet_Original: js.Function2[
    /* input */ String | EtherWalletOptions, 
    /* password */ String, 
    typingsSlinky.ethereumjsWallet.mod.default
  ] = js.native
  
  def fromKryptoKit(entropy: String, password: String): js.Promise[typingsSlinky.ethereumjsWallet.mod.default] = js.native
  @JSName("fromKryptoKit")
  var fromKryptoKit_Original: js.Function2[
    /* entropy */ String, 
    /* password */ String, 
    js.Promise[typingsSlinky.ethereumjsWallet.mod.default]
  ] = js.native
  
  def fromQuorumWallet(passphrase: String, userid: String): typingsSlinky.ethereumjsWallet.mod.default = js.native
  @JSName("fromQuorumWallet")
  var fromQuorumWallet_Original: js.Function2[
    /* passphrase */ String, 
    /* userid */ String, 
    typingsSlinky.ethereumjsWallet.mod.default
  ] = js.native
}
