package typingsSlinky.atIonicCliDashFramework.libExecutorMod

import typingsSlinky.atIonicCliDashFramework.definitionsMod.CommandMetadata
import typingsSlinky.atIonicCliDashFramework.definitionsMod.CommandMetadataInput
import typingsSlinky.atIonicCliDashFramework.definitionsMod.CommandMetadataOption
import typingsSlinky.atIonicCliDashFramework.libCommandMod.Command
import typingsSlinky.atIonicCliDashFramework.libCommandMod.Namespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib/executor", "Executor")
@js.native
class Executor () extends BaseExecutor[
      Command, 
      Namespace, 
      CommandMetadata[CommandMetadataInput, CommandMetadataOption], 
      CommandMetadataInput, 
      CommandMetadataOption
    ]

