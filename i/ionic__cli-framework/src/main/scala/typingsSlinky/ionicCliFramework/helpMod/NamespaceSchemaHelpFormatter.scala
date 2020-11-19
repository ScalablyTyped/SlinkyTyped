package typingsSlinky.ionicCliFramework.helpMod

import typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadata
import typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataInput
import typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataOption
import typingsSlinky.ionicCliFramework.definitionsMod.HydratedCommandMetadata
import typingsSlinky.ionicCliFramework.definitionsMod.ICommand
import typingsSlinky.ionicCliFramework.definitionsMod.INamespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/cli-framework/lib/help", "NamespaceSchemaHelpFormatter")
@js.native
class NamespaceSchemaHelpFormatter[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] () extends NamespaceHelpFormatter[C, N, M, I, O] {
  
  def formatCommand(cmd: HydratedCommandMetadata[C, N, M, I, O]): js.Promise[CommandHelpSchema] = js.native
  
  def formatCommandGroup(commands: js.Array[HydratedCommandMetadata[C, N, M, I, O]]): js.Promise[js.Array[CommandHelpSchema]] = js.native
  
  def serialize(): js.Promise[NamespaceHelpSchema] = js.native
}
