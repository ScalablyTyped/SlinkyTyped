package typingsSlinky.ionicCliFramework.anon

import typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadata
import typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataInput
import typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataOption
import typingsSlinky.ionicCliFramework.definitionsMod.ICommand
import typingsSlinky.ionicCliFramework.definitionsMod.INamespace
import typingsSlinky.node.NodeJS.ProcessEnv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Argv[N /* <: INamespace[C, N, M, I, O] */, C /* <: ICommand[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] extends js.Object {
  var argv: js.Array[String] = js.native
  var env: ProcessEnv = js.native
  var namespace: N = js.native
}

object Argv {
  @scala.inline
  def apply[N, C, M, I, O](argv: js.Array[String], env: ProcessEnv, namespace: N): Argv[N, C, M, I, O] = {
    val __obj = js.Dynamic.literal(argv = argv.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[Argv[N, C, M, I, O]]
  }
  @scala.inline
  implicit class ArgvOps[Self[n, c, m, i, o] <: Argv[n, c, m, i, o], N, C, M, I, O] (val x: Self[N, C, M, I, O]) extends AnyVal {
    @scala.inline
    def duplicate: Self[N, C, M, I, O] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[N, C, M, I, O]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[N, C, M, I, O]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[N, C, M, I, O]) with Other]
    @scala.inline
    def withArgv(value: js.Array[String]): Self[N, C, M, I, O] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnv(value: ProcessEnv): Self[N, C, M, I, O] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamespace(value: N): Self[N, C, M, I, O] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

