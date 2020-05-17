package typingsSlinky.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectionWrapper extends js.Object {
  def execCommand(name: js.Object, args: js.Object): Unit = js.native
  def focus(): Unit = js.native
  def getSelectedItem(): Unit = js.native
  def getSelectionAsText(): Unit = js.native
  def insertElement(element: js.Object): Unit = js.native
  def insertTable(table: js.Object): Unit = js.native
  def replaceNode(newNode: js.Object): Unit = js.native
  def select(element: js.Object): Unit = js.native
}

object SelectionWrapper {
  @scala.inline
  def apply(
    execCommand: (js.Object, js.Object) => Unit,
    focus: () => Unit,
    getSelectedItem: () => Unit,
    getSelectionAsText: () => Unit,
    insertElement: js.Object => Unit,
    insertTable: js.Object => Unit,
    replaceNode: js.Object => Unit,
    select: js.Object => Unit
  ): SelectionWrapper = {
    val __obj = js.Dynamic.literal(execCommand = js.Any.fromFunction2(execCommand), focus = js.Any.fromFunction0(focus), getSelectedItem = js.Any.fromFunction0(getSelectedItem), getSelectionAsText = js.Any.fromFunction0(getSelectionAsText), insertElement = js.Any.fromFunction1(insertElement), insertTable = js.Any.fromFunction1(insertTable), replaceNode = js.Any.fromFunction1(replaceNode), select = js.Any.fromFunction1(select))
    __obj.asInstanceOf[SelectionWrapper]
  }
  @scala.inline
  implicit class SelectionWrapperOps[Self <: SelectionWrapper] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExecCommand(value: (js.Object, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execCommand")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFocus(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSelectedItem(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelectedItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSelectionAsText(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelectionAsText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInsertElement(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertElement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsertTable(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertTable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReplaceNode(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSelect(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

