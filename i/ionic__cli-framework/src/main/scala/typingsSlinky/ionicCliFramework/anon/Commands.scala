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
  def apply[/* <: typingsSlinky.ionicCliFramework.definitionsMod.ICommand[C, N, M, I, O] */ C, /* <: typingsSlinky.ionicCliFramework.definitionsMod.INamespace[C, N, M, I, O] */ N, /* <: typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadata[I, O] */ M, /* <: typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataInput */ I, /* <: typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataOption */ O](commands: js.Array[HydratedCommandMetadata[C, N, M, I, O]]): Commands[C, N, M, I, O] = {
    val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any])
    __obj.asInstanceOf[Commands[C, N, M, I, O]]
  }
  @scala.inline
  implicit class CommandsOps[Self <: Commands[_, _, _, _, _], /* <: typingsSlinky.ionicCliFramework.definitionsMod.ICommand[C, N, M, I, O] */ C, /* <: typingsSlinky.ionicCliFramework.definitionsMod.INamespace[C, N, M, I, O] */ N, /* <: typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadata[I, O] */ M, /* <: typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataInput */ I, /* <: typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataOption */ O] (val x: Self with (Commands[C, N, M, I, O])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCommandsVarargs(value: (HydratedCommandMetadata[C, N, M, I, O])*): Self = this.set("commands", js.Array(value :_*))
    @scala.inline
    def setCommands(value: js.Array[HydratedCommandMetadata[C, N, M, I, O]]): Self = this.set("commands", value.asInstanceOf[js.Any])
  }
  
}

