package typingsSlinky.ionicCliFramework.completionMod

import typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadata
import typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataInput
import typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataOption
import typingsSlinky.ionicCliFramework.definitionsMod.ICommand
import typingsSlinky.ionicCliFramework.definitionsMod.INamespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompletionFormatterDeps[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] extends js.Object {
  val namespace: N = js.native
}

object CompletionFormatterDeps {
  @scala.inline
  def apply[/* <: typingsSlinky.ionicCliFramework.definitionsMod.ICommand[C, N, M, I, O] */ C, /* <: typingsSlinky.ionicCliFramework.definitionsMod.INamespace[C, N, M, I, O] */ N, /* <: typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadata[I, O] */ M, /* <: typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataInput */ I, /* <: typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataOption */ O](namespace: N): CompletionFormatterDeps[C, N, M, I, O] = {
    val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionFormatterDeps[C, N, M, I, O]]
  }
  @scala.inline
  implicit class CompletionFormatterDepsOps[Self <: CompletionFormatterDeps[_, _, _, _, _], /* <: typingsSlinky.ionicCliFramework.definitionsMod.ICommand[C, N, M, I, O] */ C, /* <: typingsSlinky.ionicCliFramework.definitionsMod.INamespace[C, N, M, I, O] */ N, /* <: typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadata[I, O] */ M, /* <: typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataInput */ I, /* <: typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataOption */ O] (val x: Self with (CompletionFormatterDeps[C, N, M, I, O])) extends AnyVal {
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
    def setNamespace(value: N): Self = this.set("namespace", value.asInstanceOf[js.Any])
  }
  
}

