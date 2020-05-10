package typingsSlinky.ionicCliFramework.definitionsMod

import typingsSlinky.node.NodeJS.ProcessEnv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandInstanceInfo[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] extends js.Object {
  var env: ProcessEnv = js.native
  var executor: IExecutor[C, N, M, I, O] = js.native
  var location: NamespaceLocateResult[C, N, M, I, O] = js.native
}

object CommandInstanceInfo {
  @scala.inline
  def apply[C, N, M, I, O](
    env: ProcessEnv,
    executor: IExecutor[C, N, M, I, O],
    location: NamespaceLocateResult[C, N, M, I, O]
  ): CommandInstanceInfo[C, N, M, I, O] = {
    val __obj = js.Dynamic.literal(env = env.asInstanceOf[js.Any], executor = executor.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandInstanceInfo[C, N, M, I, O]]
  }
  @scala.inline
  implicit class CommandInstanceInfoOps[Self[c, n, m, i, o] <: CommandInstanceInfo[c, n, m, i, o], C, N, M, I, O] (val x: Self[C, N, M, I, O]) extends AnyVal {
    @scala.inline
    def duplicate: Self[C, N, M, I, O] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[C, N, M, I, O]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[C, N, M, I, O]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[C, N, M, I, O]) with Other]
    @scala.inline
    def withEnv(value: ProcessEnv): Self[C, N, M, I, O] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecutor(value: IExecutor[C, N, M, I, O]): Self[C, N, M, I, O] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocation(value: NamespaceLocateResult[C, N, M, I, O]): Self[C, N, M, I, O] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

