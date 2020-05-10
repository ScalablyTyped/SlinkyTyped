package typingsSlinky.jui.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UITreeBase extends js.Object {
  def appendNode(args: js.Any*): UITreeNode = js.native
  def foldNode(index: String): Unit = js.native
  def foldNodeAll(index: String): Unit = js.native
  def getNode(index: String): UITreeNode = js.native
  def getNodeAll(index: String): js.Array[UITreeNode] = js.native
  def getNodeParent(index: String): UITreeNode = js.native
  def getRoot(): UITreeNode = js.native
  def insertNode(index: String, data: js.Any): UITreeNode = js.native
  def moveNode(index: String, targetIndex: Double): Unit = js.native
  def openNode(index: String): Unit = js.native
  def openNodeAll(index: String): Unit = js.native
  def removeNode(index: String): Unit = js.native
  def removeNodes(): Unit = js.native
  def updateNode(index: String, data: js.Any): UITreeNode = js.native
}

object UITreeBase {
  @scala.inline
  def apply(
    appendNode: /* repeated */ js.Any => UITreeNode,
    foldNode: String => Unit,
    foldNodeAll: String => Unit,
    getNode: String => UITreeNode,
    getNodeAll: String => js.Array[UITreeNode],
    getNodeParent: String => UITreeNode,
    getRoot: () => UITreeNode,
    insertNode: (String, js.Any) => UITreeNode,
    moveNode: (String, Double) => Unit,
    openNode: String => Unit,
    openNodeAll: String => Unit,
    removeNode: String => Unit,
    removeNodes: () => Unit,
    updateNode: (String, js.Any) => UITreeNode
  ): UITreeBase = {
    val __obj = js.Dynamic.literal(appendNode = js.Any.fromFunction1(appendNode), foldNode = js.Any.fromFunction1(foldNode), foldNodeAll = js.Any.fromFunction1(foldNodeAll), getNode = js.Any.fromFunction1(getNode), getNodeAll = js.Any.fromFunction1(getNodeAll), getNodeParent = js.Any.fromFunction1(getNodeParent), getRoot = js.Any.fromFunction0(getRoot), insertNode = js.Any.fromFunction2(insertNode), moveNode = js.Any.fromFunction2(moveNode), openNode = js.Any.fromFunction1(openNode), openNodeAll = js.Any.fromFunction1(openNodeAll), removeNode = js.Any.fromFunction1(removeNode), removeNodes = js.Any.fromFunction0(removeNodes), updateNode = js.Any.fromFunction2(updateNode))
    __obj.asInstanceOf[UITreeBase]
  }
  @scala.inline
  implicit class UITreeBaseOps[Self <: UITreeBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppendNode(value: /* repeated */ js.Any => UITreeNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFoldNode(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foldNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFoldNodeAll(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foldNodeAll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetNode(value: String => UITreeNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetNodeAll(value: String => js.Array[UITreeNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNodeAll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetNodeParent(value: String => UITreeNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNodeParent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetRoot(value: () => UITreeNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRoot")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInsertNode(value: (String, js.Any) => UITreeNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertNode")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMoveNode(value: (String, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveNode")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOpenNode(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOpenNodeAll(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openNodeAll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveNode(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveNodes(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeNodes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUpdateNode(value: (String, js.Any) => UITreeNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateNode")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

