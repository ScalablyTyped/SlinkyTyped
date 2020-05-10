package typingsSlinky.appBuilderLib.packageDependenciesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeModuleDirInfo extends js.Object {
  val deps: js.Array[NodeModuleInfo] = js.native
  val dir: String = js.native
}

object NodeModuleDirInfo {
  @scala.inline
  def apply(deps: js.Array[NodeModuleInfo], dir: String): NodeModuleDirInfo = {
    val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeModuleDirInfo]
  }
  @scala.inline
  implicit class NodeModuleDirInfoOps[Self <: NodeModuleDirInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeps(value: js.Array[NodeModuleInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

