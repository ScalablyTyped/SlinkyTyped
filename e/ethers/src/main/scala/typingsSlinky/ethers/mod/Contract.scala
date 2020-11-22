package typingsSlinky.ethers.mod

import typingsSlinky.ethersprojectAbi.mod.Interface
import typingsSlinky.ethersprojectAbstractProvider.mod.Provider
import typingsSlinky.ethersprojectContracts.anon.From
import typingsSlinky.ethersprojectContracts.mod.ContractInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "Contract")
@js.native
class Contract protected ()
  extends typingsSlinky.ethersprojectContracts.mod.Contract {
  def this(addressOrName: String, contractInterface: ContractInterface) = this()
  def this(addressOrName: String, contractInterface: ContractInterface, signerOrProvider: Provider) = this()
  def this(
    addressOrName: String,
    contractInterface: ContractInterface,
    signerOrProvider: typingsSlinky.ethersprojectAbstractSigner.mod.Signer
  ) = this()
}
/* static members */
@JSImport("ethers", "Contract")
@js.native
object Contract extends js.Object {
  
  def getContractAddress(transaction: From): String = js.native
  
  def getInterface(contractInterface: ContractInterface): Interface = js.native
  
  def isIndexed(value: js.Any): /* is @ethersproject/abi.@ethersproject/abi.Indexed */ Boolean = js.native
}
