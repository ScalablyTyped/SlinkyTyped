package typingsSlinky.ionic.definitionsMod

import typingsSlinky.ionicCliFramework.definitionsMod.CommandLineInputs
import typingsSlinky.ionicCliFramework.definitionsMod.CommandLineOptions
import typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICommand
  extends typingsSlinky.ionicCliFramework.definitionsMod.ICommand[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption] {
  
  val env: IonicEnvironment = js.native
  
  def execute(inputs: CommandLineInputs, options: CommandLineOptions, metadata: CommandInstanceInfo): js.Promise[Unit] = js.native
  
  val project: js.UndefOr[IProject] = js.native
}
