package typingsSlinky.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.ethers.mod.ethers.providers.BaseProvider
import typingsSlinky.ethersprojectNetworks.typesMod.Network
import typingsSlinky.ethersprojectNetworks.typesMod.Networkish
import typingsSlinky.ethersprojectProviders.formatterMod.Formatter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofBaseProvider extends Instantiable1[/* network */ Networkish, BaseProvider] {
  
  def getFormatter(): Formatter = js.native
  
  def getNetwork(network: Networkish): Network = js.native
}
