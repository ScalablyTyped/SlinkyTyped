package typingsSlinky.ionicCliFramework.executorMod

import typingsSlinky.ionicCliFramework.colorsMod.Colors
import typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadata
import typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataInput
import typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataOption
import typingsSlinky.ionicCliFramework.definitionsMod.ICommand
import typingsSlinky.ionicCliFramework.definitionsMod.INamespace
import typingsSlinky.ionicCliFramework.definitionsMod.NamespaceLocateResult
import typingsSlinky.ionicCliFramework.ionicCliFrameworkStrings.`operation-rpc`
import typingsSlinky.ionicCliFramework.ipcMod.RPCProcess
import typingsSlinky.node.processMod.global.NodeJS.ProcessEnv
import typingsSlinky.node.processMod.global.NodeJS.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/cli-framework/lib/executor", "BaseExecutor")
@js.native
class BaseExecutor[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected () extends AbstractExecutor[C, N, M, I, O] {
  def this(hasNamespaceStdoutStderrColors: BaseExecutorDeps[C, N, M, I, O]) = this()
  
  val colors: Colors = js.native
  
  @JSName("emit")
  def emit_operationrpc(event: `operation-rpc`, rpc: RPCProcess): Boolean = js.native
  
  /**
    * Locate and execute a command given an array of positional command
    * arguments (argv) and a set of environment variables.
    *
    * If a command is not found, formatted help is automatically output for the
    * right-most namespace found.
    *
    * @param argv Command arguments sliced to the root for the namespace of this
    *             executor. Usually, this means `process.argv.slice(2)`.
    * @param env Environment variables for this execution.
    */
  def execute(argvOrLocation: js.Array[String]): js.Promise[Unit] = js.native
  def execute(argvOrLocation: NamespaceLocateResult[C, N, M, I, O], env: ProcessEnv): js.Promise[Unit] = js.native
  
  def formatHelp(location: NamespaceLocateResult[C, N, M, I, O]): js.Promise[String] = js.native
  def formatHelp(location: NamespaceLocateResult[C, N, M, I, O], hasFormat: BaseExecutorFormatHelpOptions): js.Promise[String] = js.native
  
  @JSName("on")
  def on_operationrpc(event: `operation-rpc`, callback: js.Function1[/* rpc */ RPCProcess, Unit]): this.type = js.native
  
  /**
    * Initiate RPC operation.
    *
    * This means the CLI has been executed by a parent Node process with an IPC
    * channel, allowing request/response communication via RPC.
    */
  def rpc(): js.Promise[Unit] = js.native
  
  val stderr: WriteStream = js.native
  
  val stdout: WriteStream = js.native
}
