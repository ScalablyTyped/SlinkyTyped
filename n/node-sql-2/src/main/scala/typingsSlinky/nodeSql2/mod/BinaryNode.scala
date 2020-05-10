package typingsSlinky.nodeSql2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BinaryNode extends js.Object {
  def and(node: BinaryNode): BinaryNode = js.native
  def or(node: BinaryNode): BinaryNode = js.native
}

object BinaryNode {
  @scala.inline
  def apply(and: BinaryNode => BinaryNode, or: BinaryNode => BinaryNode): BinaryNode = {
    val __obj = js.Dynamic.literal(and = js.Any.fromFunction1(and), or = js.Any.fromFunction1(or))
    __obj.asInstanceOf[BinaryNode]
  }
  @scala.inline
  implicit class BinaryNodeOps[Self <: BinaryNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnd(value: BinaryNode => BinaryNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("and")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOr(value: BinaryNode => BinaryNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("or")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

