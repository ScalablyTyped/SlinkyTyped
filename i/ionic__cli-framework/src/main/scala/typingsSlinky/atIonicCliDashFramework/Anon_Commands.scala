package typingsSlinky.atIonicCliDashFramework

import typingsSlinky.atIonicCliDashFramework.definitionsMod.CommandMetadata
import typingsSlinky.atIonicCliDashFramework.definitionsMod.CommandMetadataInput
import typingsSlinky.atIonicCliDashFramework.definitionsMod.CommandMetadataOption
import typingsSlinky.atIonicCliDashFramework.definitionsMod.HydratedCommandMetadata
import typingsSlinky.atIonicCliDashFramework.definitionsMod.ICommand
import typingsSlinky.atIonicCliDashFramework.definitionsMod.INamespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Commands[M /* <: CommandMetadata[I, O] */, C /* <: ICommand[C, N, M, I, O] */, O /* <: CommandMetadataOption */, N /* <: INamespace[C, N, M, I, O] */, I /* <: CommandMetadataInput */] extends js.Object {
  var commands: js.Array[HydratedCommandMetadata[C, N, M, I, O]]
}

object Anon_Commands {
  @scala.inline
  def apply[M /* <: CommandMetadata[I, O] */, C /* <: ICommand[C, N, M, I, O] */, O /* <: CommandMetadataOption */, N /* <: INamespace[C, N, M, I, O] */, I /* <: CommandMetadataInput */](commands: js.Array[HydratedCommandMetadata[C, N, M, I, O]]): Anon_Commands[M, C, O, N, I] = {
    val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Commands[M, C, O, N, I]]
  }
}

