package typingsSlinky.ionicCliFramework.anon

import typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadata
import typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataInput
import typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataOption
import typingsSlinky.ionicCliFramework.definitionsMod.HydratedCommandMetadata
import typingsSlinky.ionicCliFramework.definitionsMod.ICommand
import typingsSlinky.ionicCliFramework.definitionsMod.INamespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Commands[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] extends js.Object {
  var commands: js.Array[HydratedCommandMetadata[C, N, M, I, O]] = js.native
}

object Commands {
  @scala.inline
  def apply[C, N, M, I, O](commands: js.Array[HydratedCommandMetadata[C, N, M, I, O]]): Commands[C, N, M, I, O] = {
    val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any])
    __obj.asInstanceOf[Commands[C, N, M, I, O]]
  }
  @scala.inline
  implicit class CommandsOps[Self[c, n, m, i, o] <: Commands[c, n, m, i, o], C, N, M, I, O] (val x: Self[C, N, M, I, O]) extends AnyVal {
    @scala.inline
    def duplicate: Self[C, N, M, I, O] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[C, N, M, I, O]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[C, N, M, I, O]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[C, N, M, I, O]) with Other]
    @scala.inline
    def withCommands(value: js.Array[HydratedCommandMetadata[C, N, M, I, O]]): Self[C, N, M, I, O] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commands")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

