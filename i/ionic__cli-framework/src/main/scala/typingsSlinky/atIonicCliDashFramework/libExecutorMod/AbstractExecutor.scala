package typingsSlinky.atIonicCliDashFramework.libExecutorMod

import typingsSlinky.atIonicCliDashFramework.definitionsMod.CommandMetadata
import typingsSlinky.atIonicCliDashFramework.definitionsMod.CommandMetadataInput
import typingsSlinky.atIonicCliDashFramework.definitionsMod.CommandMetadataOption
import typingsSlinky.atIonicCliDashFramework.definitionsMod.ICommand
import typingsSlinky.atIonicCliDashFramework.definitionsMod.IExecutor
import typingsSlinky.atIonicCliDashFramework.definitionsMod.INamespace
import typingsSlinky.atIonicCliDashFramework.definitionsMod.NamespaceLocateResult
import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib/executor", "AbstractExecutor")
@js.native
abstract class AbstractExecutor[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] ()
  extends EventEmitter
     with IExecutor[C, N, M, I, O] {
  def resolveExecuteInput(argvOrLocation: js.Array[String]): js.Promise[js.Tuple2[NamespaceLocateResult[C, N, M, I, O], js.Array[String]]] = js.native
  def resolveExecuteInput(argvOrLocation: NamespaceLocateResult[C, N, M, I, O]): js.Promise[js.Tuple2[NamespaceLocateResult[C, N, M, I, O], js.Array[String]]] = js.native
}

