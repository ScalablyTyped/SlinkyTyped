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
  def apply[C, N, M, I, O](namespace: N): CompletionFormatterDeps[C, N, M, I, O] = {
    val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionFormatterDeps[C, N, M, I, O]]
  }
  @scala.inline
  implicit class CompletionFormatterDepsOps[Self[c, n, m, i, o] <: CompletionFormatterDeps[c, n, m, i, o], C, N, M, I, O] (val x: Self[C, N, M, I, O]) extends AnyVal {
    @scala.inline
    def duplicate: Self[C, N, M, I, O] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[C, N, M, I, O]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[C, N, M, I, O]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[C, N, M, I, O]) with Other]
    @scala.inline
    def withNamespace(value: N): Self[C, N, M, I, O] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

