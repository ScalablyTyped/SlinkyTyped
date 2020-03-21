package typingsSlinky.ionic.definitionsMod

import typingsSlinky.ionicCliFramework.definitionsMod.CommandLineInputs
import typingsSlinky.ionicCliFramework.definitionsMod.CommandLineOptions
import typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICommand
  extends typingsSlinky.ionicCliFramework.definitionsMod.ICommand[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption] {
  val env: IonicEnvironment = js.native
  val project: js.UndefOr[IProject] = js.native
  def execute(inputs: CommandLineInputs, options: CommandLineOptions, metadata: CommandInstanceInfo): js.Promise[Unit] = js.native
}

