package typingsSlinky.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.ethers.jsonRpcProviderMod.JsonRpcProvider
import typingsSlinky.ethers.providerMod.Provider
import typingsSlinky.ethers.typesMod.AsyncProvider
import typingsSlinky.ethers.typesMod.Network
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofproviders extends js.Object {
  var EtherscanProvider: Instantiable0[typingsSlinky.ethers.mod.ethers.providers.EtherscanProvider] = js.native
  var FallbackProvider: Instantiable1[
    /* providers */ js.Array[Provider], 
    typingsSlinky.ethers.mod.ethers.providers.FallbackProvider
  ] = js.native
  var InfuraProvider: Instantiable0[typingsSlinky.ethers.mod.ethers.providers.InfuraProvider] = js.native
  var IpcProvider: Instantiable1[/* path */ String, typingsSlinky.ethers.mod.ethers.providers.IpcProvider] = js.native
  var JsonRpcProvider: TypeofJsonRpcProvider = js.native
  var JsonRpcSigner: Instantiable1[
    /* provider */ JsonRpcProvider, 
    typingsSlinky.ethers.mod.ethers.providers.JsonRpcSigner
  ] = js.native
  var Provider: TypeofProvider = js.native
  var Web3Provider: Instantiable1[
    /* web3Provider */ AsyncProvider, 
    typingsSlinky.ethers.mod.ethers.providers.Web3Provider
  ] = js.native
  def getDefaultProvider(): Provider = js.native
  def getDefaultProvider(network: String): Provider = js.native
  def getDefaultProvider(network: Network): Provider = js.native
}

