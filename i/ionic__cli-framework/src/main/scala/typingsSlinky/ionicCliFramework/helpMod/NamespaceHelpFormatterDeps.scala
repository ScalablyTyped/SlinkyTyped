package typingsSlinky.ionicCliFramework.helpMod

import typingsSlinky.ionicCliFramework.colorsMod.Colors
import typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadata
import typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataInput
import typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataOption
import typingsSlinky.ionicCliFramework.definitionsMod.ICommand
import typingsSlinky.ionicCliFramework.definitionsMod.INamespace
import typingsSlinky.ionicCliFramework.definitionsMod.NamespaceLocateResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NamespaceHelpFormatterDeps[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] extends js.Object {
  val colors: js.UndefOr[Colors] = js.native
  val location: NamespaceLocateResult[C, N, M, I, O] = js.native
  val namespace: N = js.native
}

object NamespaceHelpFormatterDeps {
  @scala.inline
  def apply[C, N, M, I, O](location: NamespaceLocateResult[C, N, M, I, O], namespace: N): NamespaceHelpFormatterDeps[C, N, M, I, O] = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamespaceHelpFormatterDeps[C, N, M, I, O]]
  }
  @scala.inline
  implicit class NamespaceHelpFormatterDepsOps[Self[c, n, m, i, o] <: NamespaceHelpFormatterDeps[c, n, m, i, o], C, N, M, I, O] (val x: Self[C, N, M, I, O]) extends AnyVal {
    @scala.inline
    def duplicate: Self[C, N, M, I, O] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[C, N, M, I, O]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[C, N, M, I, O]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[C, N, M, I, O]) with Other]
    @scala.inline
    def withLocation(value: NamespaceLocateResult[C, N, M, I, O]): Self[C, N, M, I, O] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamespace(value: N): Self[C, N, M, I, O] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColors(value: Colors): Self[C, N, M, I, O] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColors: Self[C, N, M, I, O] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.undefined)
        ret
    }
  }
  
}

