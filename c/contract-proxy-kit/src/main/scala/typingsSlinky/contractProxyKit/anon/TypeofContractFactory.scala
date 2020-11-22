package typingsSlinky.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.ethers.mod.ethers.ContractFactory
import typingsSlinky.ethersprojectAbi.mod.Interface
import typingsSlinky.ethersprojectAbstractSigner.mod.Signer
import typingsSlinky.ethersprojectBytes.mod.BytesLike
import typingsSlinky.ethersprojectContracts.anon.Nonce
import typingsSlinky.ethersprojectContracts.mod.Contract
import typingsSlinky.ethersprojectContracts.mod.ContractInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofContractFactory extends Instantiable2[/* contractInterface */ ContractInterface, /* bytecode */ BytesLike, ContractFactory] {
  
  def fromSolidity(compilerOutput: js.Any): typingsSlinky.ethersprojectContracts.mod.ContractFactory = js.native
  def fromSolidity(compilerOutput: js.Any, signer: Signer): typingsSlinky.ethersprojectContracts.mod.ContractFactory = js.native
  
  def getContract(address: String, contractInterface: ContractInterface): Contract = js.native
  def getContract(address: String, contractInterface: ContractInterface, signer: Signer): Contract = js.native
  
  def getContractAddress(tx: Nonce): String = js.native
  
  def getInterface(contractInterface: ContractInterface): Interface = js.native
}
