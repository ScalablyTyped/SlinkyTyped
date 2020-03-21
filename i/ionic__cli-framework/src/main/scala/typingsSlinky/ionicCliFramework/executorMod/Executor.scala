package typingsSlinky.ionicCliFramework.executorMod

import typingsSlinky.ionicCliFramework.commandMod.Command
import typingsSlinky.ionicCliFramework.commandMod.Namespace
import typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadata
import typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataInput
import typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataOption
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

