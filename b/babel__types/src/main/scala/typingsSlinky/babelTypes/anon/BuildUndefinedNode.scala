package typingsSlinky.babelTypes.anon

import typingsSlinky.babelTypes.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildUndefinedNode extends js.Object {
  def buildUndefinedNode(): Node = js.native
  def push(value: Id): Unit = js.native
}

object BuildUndefinedNode {
  @scala.inline
  def apply(buildUndefinedNode: () => Node, push: Id => Unit): BuildUndefinedNode = {
    val __obj = js.Dynamic.literal(buildUndefinedNode = js.Any.fromFunction0(buildUndefinedNode), push = js.Any.fromFunction1(push))
    __obj.asInstanceOf[BuildUndefinedNode]
  }
  @scala.inline
  implicit class BuildUndefinedNodeOps[Self <: BuildUndefinedNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuildUndefinedNode(value: () => Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildUndefinedNode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPush(value: Id => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

