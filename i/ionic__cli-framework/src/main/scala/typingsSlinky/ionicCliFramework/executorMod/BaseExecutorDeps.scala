package typingsSlinky.ionicCliFramework.executorMod

import typingsSlinky.ionicCliFramework.colorsMod.Colors
import typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadata
import typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataInput
import typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataOption
import typingsSlinky.ionicCliFramework.definitionsMod.ICommand
import typingsSlinky.ionicCliFramework.definitionsMod.INamespace
import typingsSlinky.node.processMod.global.NodeJS.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseExecutorDeps[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] extends js.Object {
  val colors: js.UndefOr[Colors] = js.native
  val namespace: N = js.native
  val stderr: js.UndefOr[WriteStream] = js.native
  val stdout: js.UndefOr[WriteStream] = js.native
}

object BaseExecutorDeps {
  @scala.inline
  def apply[C, N, M, I, O](namespace: N): BaseExecutorDeps[C, N, M, I, O] = {
    val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseExecutorDeps[C, N, M, I, O]]
  }
  @scala.inline
  implicit class BaseExecutorDepsOps[Self[c, n, m, i, o] <: BaseExecutorDeps[c, n, m, i, o], C, N, M, I, O] (val x: Self[C, N, M, I, O]) extends AnyVal {
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
    @scala.inline
    def withStderr(value: WriteStream): Self[C, N, M, I, O] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stderr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStderr: Self[C, N, M, I, O] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stderr")(js.undefined)
        ret
    }
    @scala.inline
    def withStdout(value: WriteStream): Self[C, N, M, I, O] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStdout: Self[C, N, M, I, O] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdout")(js.undefined)
        ret
    }
  }
  
}

