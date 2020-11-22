package typingsSlinky.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.ethers.mod.ethers.Contract
import typingsSlinky.ethersprojectAbi.mod.Interface
import typingsSlinky.ethersprojectContracts.anon.From
import typingsSlinky.ethersprojectContracts.mod.ContractInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofContract extends Instantiable2[/* addressOrName */ String, /* contractInterface */ ContractInterface, Contract] {
  
  def getContractAddress(transaction: From): String = js.native
  
  def getInterface(contractInterface: ContractInterface): Interface = js.native
  
  def isIndexed(value: js.Any): /* is @ethersproject/abi.@ethersproject/abi.Indexed */ Boolean = js.native
}
