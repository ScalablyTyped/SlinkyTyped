package typingsSlinky.ionicCliFramework.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NamespaceLocateResult[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] extends js.Object {
  val args: js.Array[String] = js.native
  val obj: C | N = js.native
  val path: js.Array[CommandPathItem[C, N, M, I, O]] = js.native
}

object NamespaceLocateResult {
  @scala.inline
  def apply[C, N, M, I, O](args: js.Array[String], obj: C | N, path: js.Array[CommandPathItem[C, N, M, I, O]]): NamespaceLocateResult[C, N, M, I, O] = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], obj = obj.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamespaceLocateResult[C, N, M, I, O]]
  }
  @scala.inline
  implicit class NamespaceLocateResultOps[Self[c, n, m, i, o] <: NamespaceLocateResult[c, n, m, i, o], C, N, M, I, O] (val x: Self[C, N, M, I, O]) extends AnyVal {
    @scala.inline
    def duplicate: Self[C, N, M, I, O] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[C, N, M, I, O]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[C, N, M, I, O]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[C, N, M, I, O]) with Other]
    @scala.inline
    def withArgs(value: js.Array[String]): Self[C, N, M, I, O] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObj(value: C | N): Self[C, N, M, I, O] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("obj")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: js.Array[CommandPathItem[C, N, M, I, O]]): Self[C, N, M, I, O] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

