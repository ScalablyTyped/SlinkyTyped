package typingsSlinky.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistoryManager extends js.Object {
  /** A method that takes a history entry as argument and returns whether the specific entry can be popped or not
    */
  var canPop: js.UndefOr[js.Any] = js.native
  /** A method that ends grouping the changes
    */
  var closeGroupAction: js.UndefOr[js.Any] = js.native
  /** A method that removes the history of a recent change made in diagram
    */
  var pop: js.UndefOr[js.Any] = js.native
  /** A method that allows to track the custom changes made in diagram
    */
  var push: js.UndefOr[js.Any] = js.native
  /** Defines what should be happened while trying to restore a custom change
    * @Default {null}
    */
  var redo: js.UndefOr[js.Any] = js.native
  /** The redoStack property is used to get the number of redo actions to be stored on the history manager. Its an read-only property and the collection should not be modified.
    * @Default {[]}
    */
  var redoStack: js.UndefOr[js.Array[_]] = js.native
  /** The stackLimit property used to restrict the undo and redo actions to a certain limit.
    * @Default {null}
    */
  var stackLimit: js.UndefOr[Double] = js.native
  /** A method that starts to group the changes to revert/restore them in a single undo or redo
    */
  var startGroupAction: js.UndefOr[js.Any] = js.native
  /** Defines what should be happened while trying to revert a custom change
    */
  var undo: js.UndefOr[js.Any] = js.native
  /** The undoStack property is used to get the number of undo actions to be stored on the history manager. Its an read-only property and the collection should not be modified.
    * @Default {[]}
    */
  var undoStack: js.UndefOr[js.Array[_]] = js.native
}

object HistoryManager {
  @scala.inline
  def apply(): HistoryManager = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistoryManager]
  }
  @scala.inline
  implicit class HistoryManagerOps[Self <: HistoryManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanPop(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canPop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanPop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canPop")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseGroupAction(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeGroupAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseGroupAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeGroupAction")(js.undefined)
        ret
    }
    @scala.inline
    def withPop(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pop")(js.undefined)
        ret
    }
    @scala.inline
    def withPush(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(js.undefined)
        ret
    }
    @scala.inline
    def withRedo(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redo")(js.undefined)
        ret
    }
    @scala.inline
    def withRedoStack(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redoStack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedoStack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redoStack")(js.undefined)
        ret
    }
    @scala.inline
    def withStackLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withStartGroupAction(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startGroupAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartGroupAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startGroupAction")(js.undefined)
        ret
    }
    @scala.inline
    def withUndo(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUndo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undo")(js.undefined)
        ret
    }
    @scala.inline
    def withUndoStack(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undoStack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUndoStack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undoStack")(js.undefined)
        ret
    }
  }
  
}

