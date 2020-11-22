package typingsSlinky.ethers.mod.ethers

import typingsSlinky.ethersprojectAbi.mod.Interface
import typingsSlinky.ethersprojectBytes.mod.BytesLike
import typingsSlinky.ethersprojectContracts.anon.Nonce
import typingsSlinky.ethersprojectContracts.anon.Object
import typingsSlinky.ethersprojectContracts.mod.ContractInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "ethers.ContractFactory")
@js.native
class ContractFactory protected ()
  extends typingsSlinky.ethers.ethersMod.ContractFactory {
  def this(contractInterface: ContractInterface, bytecode: BytesLike) = this()
  def this(contractInterface: ContractInterface, bytecode: Object) = this()
  def this(
    contractInterface: ContractInterface,
    bytecode: BytesLike,
    signer: typingsSlinky.ethersprojectAbstractSigner.mod.Signer
  ) = this()
  def this(
    contractInterface: ContractInterface,
    bytecode: Object,
    signer: typingsSlinky.ethersprojectAbstractSigner.mod.Signer
  ) = this()
}
/* static members */
@JSImport("ethers", "ethers.ContractFactory")
@js.native
object ContractFactory extends js.Object {
  
  def fromSolidity(compilerOutput: js.Any): typingsSlinky.ethersprojectContracts.mod.ContractFactory = js.native
  def fromSolidity(compilerOutput: js.Any, signer: typingsSlinky.ethersprojectAbstractSigner.mod.Signer): typingsSlinky.ethersprojectContracts.mod.ContractFactory = js.native
  
  def getContract(address: String, contractInterface: ContractInterface): typingsSlinky.ethersprojectContracts.mod.Contract = js.native
  def getContract(
    address: String,
    contractInterface: ContractInterface,
    signer: typingsSlinky.ethersprojectAbstractSigner.mod.Signer
  ): typingsSlinky.ethersprojectContracts.mod.Contract = js.native
  
  def getContractAddress(tx: Nonce): String = js.native
  
  def getInterface(contractInterface: ContractInterface): Interface = js.native
}
