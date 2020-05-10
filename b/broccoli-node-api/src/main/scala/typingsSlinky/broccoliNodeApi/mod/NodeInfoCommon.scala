package typingsSlinky.broccoliNodeApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeInfoCommon[T /* <: NodeType */] extends js.Object {
  /**
    A description of this particular node. Useful to tell multiple instances of
    the same plugin apart during debugging. Example: `'vendor directories'`
    */
  var annotation: js.UndefOr[String | Null] = js.native
  /**
    A stack trace generated when the node constructor ran. Useful for telling
    where a given node was instantiated during debugging. This is `(new
    Error).stack` without the first line.
    */
  var instantiationStack: String = js.native
  /**
    The name of the plugin that this node is an instance of. Example:
    `'BroccoliMergeTrees'`
    */
  var name: String = js.native
  /**
    Either `'transform'` or `'source'`, indicating the node type.
    */
  var nodeType: T = js.native
}

object NodeInfoCommon {
  @scala.inline
  def apply[T](instantiationStack: String, name: String, nodeType: T): NodeInfoCommon[T] = {
    val __obj = js.Dynamic.literal(instantiationStack = instantiationStack.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeInfoCommon[T]]
  }
  @scala.inline
  implicit class NodeInfoCommonOps[Self[t] <: NodeInfoCommon[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withInstantiationStack(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instantiationStack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeType(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnnotation(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnotation: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotation")(js.undefined)
        ret
    }
    @scala.inline
    def withAnnotationNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotation")(null)
        ret
    }
  }
  
}

