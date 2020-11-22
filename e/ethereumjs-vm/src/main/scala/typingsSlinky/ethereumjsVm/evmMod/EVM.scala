package typingsSlinky.ethereumjsVm.evmMod

import typingsSlinky.bnJs.mod.^
import typingsSlinky.ethereumjsVm.interpreterMod.InterpreterOpts
import typingsSlinky.ethereumjsVm.typesMod.PrecompileFunc
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EVM extends js.Object {
  
  def _addToBalance(
    toAccount: typingsSlinky.ethereumjsAccount.mod.default,
    message: typingsSlinky.ethereumjsVm.messageMod.default
  ): js.Promise[Unit] = js.native
  
  var _block: js.Any = js.native
  
  def _executeCall(message: typingsSlinky.ethereumjsVm.messageMod.default): js.Promise[EVMResult] = js.native
  
  def _executeCreate(message: typingsSlinky.ethereumjsVm.messageMod.default): js.Promise[EVMResult] = js.native
  
  def _generateAddress(message: typingsSlinky.ethereumjsVm.messageMod.default): js.Promise[Buffer] = js.native
  
  def _loadCode(message: typingsSlinky.ethereumjsVm.messageMod.default): js.Promise[Unit] = js.native
  
  def _reduceSenderBalance(
    account: typingsSlinky.ethereumjsAccount.mod.default,
    message: typingsSlinky.ethereumjsVm.messageMod.default
  ): js.Promise[Unit] = js.native
  
  /**
    * Amount of gas to refund from deleting storage values
    */
  var _refund: ^ = js.native
  
  var _state: typingsSlinky.ethereumjsVm.promisifiedMod.default = js.native
  
  def _touchAccount(address: Buffer): js.Promise[Unit] = js.native
  
  var _tx: typingsSlinky.ethereumjsVm.txContextMod.default = js.native
  
  var _vm: js.Any = js.native
  
  /**
    * Executes an EVM message, determining whether it's a call or create
    * based on the `to` address. It checkpoints the state and reverts changes
    * if an exception happens during the message execution.
    */
  def executeMessage(message: typingsSlinky.ethereumjsVm.messageMod.default): js.Promise[EVMResult] = js.native
  
  /**
    * Returns code for precompile at the given address, or undefined
    * if no such precompile exists.
    */
  def getPrecompile(address: Buffer): PrecompileFunc = js.native
  
  /**
    * Starts the actual bytecode processing for a CALL or CREATE, providing
    * it with the [[EEI]].
    */
  def runInterpreter(message: typingsSlinky.ethereumjsVm.messageMod.default): js.Promise[ExecResult] = js.native
  def runInterpreter(message: typingsSlinky.ethereumjsVm.messageMod.default, opts: InterpreterOpts): js.Promise[ExecResult] = js.native
  
  /**
    * Executes a precompiled contract with given data and gas limit.
    */
  def runPrecompile(code: PrecompileFunc, data: Buffer, gasLimit: ^): ExecResult = js.native
}
