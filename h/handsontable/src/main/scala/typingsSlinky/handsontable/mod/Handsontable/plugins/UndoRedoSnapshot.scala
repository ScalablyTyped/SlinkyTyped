package typingsSlinky.handsontable.mod.Handsontable.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UndoRedoSnapshot extends js.Object {
  var sheet: Sheet = js.native
  var stack: Stack = js.native
  def destroy(): Unit = js.native
  def restore(): Unit = js.native
  def save(axis: String, index: Double, amount: Double): Unit = js.native
}

object UndoRedoSnapshot {
  @scala.inline
  def apply(
    destroy: () => Unit,
    restore: () => Unit,
    save: (String, Double, Double) => Unit,
    sheet: Sheet,
    stack: Stack
  ): UndoRedoSnapshot = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), restore = js.Any.fromFunction0(restore), save = js.Any.fromFunction3(save), sheet = sheet.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[UndoRedoSnapshot]
  }
  @scala.inline
  implicit class UndoRedoSnapshotOps[Self <: UndoRedoSnapshot] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRestore(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restore")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSave(value: (String, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSheet(value: Sheet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStack(value: Stack): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stack")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

