package typingsSlinky.atIonicCliDashFramework

import typingsSlinky.atIonicCliDashFramework.definitionsMod.CommandMetadata
import typingsSlinky.atIonicCliDashFramework.definitionsMod.CommandMetadataInput
import typingsSlinky.atIonicCliDashFramework.definitionsMod.CommandMetadataOption
import typingsSlinky.atIonicCliDashFramework.definitionsMod.CommandPathItem
import typingsSlinky.atIonicCliDashFramework.definitionsMod.ICommand
import typingsSlinky.atIonicCliDashFramework.definitionsMod.INamespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Aliases[M /* <: CommandMetadata[I, O] */, C /* <: ICommand[C, N, M, I, O] */, O /* <: CommandMetadataOption */, N /* <: INamespace[C, N, M, I, O] */, I /* <: CommandMetadataInput */] extends js.Object {
  val aliases: js.Array[String]
  val command: C
  val namespace: N
  val path: js.Array[CommandPathItem[C, N, M, I, O]]
}

object Anon_Aliases {
  @scala.inline
  def apply[M /* <: CommandMetadata[I, O] */, C /* <: ICommand[C, N, M, I, O] */, O /* <: CommandMetadataOption */, N /* <: INamespace[C, N, M, I, O] */, I /* <: CommandMetadataInput */](
    aliases: js.Array[String],
    command: C,
    namespace: N,
    path: js.Array[CommandPathItem[C, N, M, I, O]]
  ): Anon_Aliases[M, C, O, N, I] = {
    val __obj = js.Dynamic.literal(aliases = aliases.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Aliases[M, C, O, N, I]]
  }
}

