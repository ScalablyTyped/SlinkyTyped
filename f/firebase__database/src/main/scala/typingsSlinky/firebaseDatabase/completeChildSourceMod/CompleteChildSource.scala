package typingsSlinky.firebaseDatabase.completeChildSourceMod

import typingsSlinky.firebaseDatabase.indexMod.Index
import typingsSlinky.firebaseDatabase.nodeMod.NamedNode
import typingsSlinky.firebaseDatabase.nodeMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompleteChildSource extends js.Object {
  /**
    * @param {!Index} index
    * @param {!NamedNode} child
    * @param {boolean} reverse
    * @return {?NamedNode}
    */
  def getChildAfterChild(index: Index, child: NamedNode, reverse: Boolean): NamedNode | Null = js.native
  /**
    * @param {!string} childKey
    * @return {?Node}
    */
  def getCompleteChild(childKey: String): Node | Null = js.native
}

object CompleteChildSource {
  @scala.inline
  def apply(
    getChildAfterChild: (Index, NamedNode, Boolean) => NamedNode | Null,
    getCompleteChild: String => Node | Null
  ): CompleteChildSource = {
    val __obj = js.Dynamic.literal(getChildAfterChild = js.Any.fromFunction3(getChildAfterChild), getCompleteChild = js.Any.fromFunction1(getCompleteChild))
    __obj.asInstanceOf[CompleteChildSource]
  }
  @scala.inline
  implicit class CompleteChildSourceOps[Self <: CompleteChildSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetChildAfterChild(value: (Index, NamedNode, Boolean) => NamedNode | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChildAfterChild")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetCompleteChild(value: String => Node | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCompleteChild")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

