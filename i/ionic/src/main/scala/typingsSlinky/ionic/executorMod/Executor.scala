package typingsSlinky.ionic.executorMod

import typingsSlinky.ionic.definitionsMod.CommandInstanceInfo
import typingsSlinky.ionic.definitionsMod.CommandMetadata
import typingsSlinky.ionic.definitionsMod.CommandMetadataOption
import typingsSlinky.ionic.definitionsMod.ICommand
import typingsSlinky.ionic.definitionsMod.INamespace
import typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataInput
import typingsSlinky.ionicCliFramework.mod.BaseExecutor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ionic/lib/executor", "Executor")
@js.native
class Executor () extends BaseExecutor[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption] {
  
  def run(command: ICommand, cmdargs: js.Array[String], hasLocationEnvExecutor: CommandInstanceInfo): js.Promise[Unit] = js.native
}
