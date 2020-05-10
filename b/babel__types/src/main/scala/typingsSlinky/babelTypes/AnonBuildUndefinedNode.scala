package typingsSlinky.babelTypes

import typingsSlinky.babelTypes.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBuildUndefinedNode extends js.Object {
  def buildUndefinedNode(): Node = js.native
  def push(value: AnonId): Unit = js.native
}

object AnonBuildUndefinedNode {
  @scala.inline
  def apply(buildUndefinedNode: () => Node, push: AnonId => Unit): AnonBuildUndefinedNode = {
    val __obj = js.Dynamic.literal(buildUndefinedNode = js.Any.fromFunction0(buildUndefinedNode), push = js.Any.fromFunction1(push))
    __obj.asInstanceOf[AnonBuildUndefinedNode]
  }
  @scala.inline
  implicit class AnonBuildUndefinedNodeOps[Self <: AnonBuildUndefinedNode] (val x: Self) extends AnyVal {
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
    def withPush(value: AnonId => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

