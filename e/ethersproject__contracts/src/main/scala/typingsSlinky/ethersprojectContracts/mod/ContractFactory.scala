package typingsSlinky.ethersprojectContracts.mod

import typingsSlinky.ethersprojectAbi.mod.Interface
import typingsSlinky.ethersprojectAbstractProvider.mod.TransactionRequest
import typingsSlinky.ethersprojectAbstractSigner.mod.Signer
import typingsSlinky.ethersprojectBytes.mod.BytesLike
import typingsSlinky.ethersprojectContracts.anon.Nonce
import typingsSlinky.ethersprojectContracts.anon.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/contracts", "ContractFactory")
@js.native
class ContractFactory protected () extends js.Object {
  def this(contractInterface: ContractInterface, bytecode: BytesLike) = this()
  def this(contractInterface: ContractInterface, bytecode: Object) = this()
  def this(contractInterface: ContractInterface, bytecode: BytesLike, signer: Signer) = this()
  def this(contractInterface: ContractInterface, bytecode: Object, signer: Signer) = this()
  
  def attach(address: String): Contract = js.native
  
  val bytecode: String = js.native
  
  def connect(signer: Signer): ContractFactory = js.native
  
  def deploy(args: js.Any*): js.Promise[Contract] = js.native
  
  def getDeployTransaction(args: js.Any*): TransactionRequest = js.native
  
  val interface: Interface = js.native
  
  val signer: Signer = js.native
}
/* static members */
@JSImport("@ethersproject/contracts", "ContractFactory")
@js.native
object ContractFactory extends js.Object {
  
  def fromSolidity(compilerOutput: js.Any): ContractFactory = js.native
  def fromSolidity(compilerOutput: js.Any, signer: Signer): ContractFactory = js.native
  
  def getContract(address: String, contractInterface: ContractInterface): Contract = js.native
  def getContract(address: String, contractInterface: ContractInterface, signer: Signer): Contract = js.native
  
  def getContractAddress(tx: Nonce): String = js.native
  
  def getInterface(contractInterface: ContractInterface): Interface = js.native
}
