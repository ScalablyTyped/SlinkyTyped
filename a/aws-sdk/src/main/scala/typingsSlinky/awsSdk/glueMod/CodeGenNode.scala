package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeGenNode extends js.Object {
  /**
    * Properties of the node, in the form of name-value pairs.
    */
  var Args: CodeGenNodeArgs = js.native
  /**
    * A node identifier that is unique within the node's graph.
    */
  var Id: CodeGenIdentifier = js.native
  /**
    * The line number of the node.
    */
  var LineNumber: js.UndefOr[Integer] = js.native
  /**
    * The type of node that this is.
    */
  var NodeType: CodeGenNodeType = js.native
}

object CodeGenNode {
  @scala.inline
  def apply(Args: CodeGenNodeArgs, Id: CodeGenIdentifier, NodeType: CodeGenNodeType): CodeGenNode = {
    val __obj = js.Dynamic.literal(Args = Args.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], NodeType = NodeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeGenNode]
  }
  @scala.inline
  implicit class CodeGenNodeOps[Self <: CodeGenNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: CodeGenNodeArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: CodeGenIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeType(value: CodeGenNodeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineNumber(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LineNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LineNumber")(js.undefined)
        ret
    }
  }
  
}

