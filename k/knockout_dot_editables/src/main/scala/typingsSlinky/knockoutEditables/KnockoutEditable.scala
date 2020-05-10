package typingsSlinky.knockoutEditables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// bestowed by ko.editable(target)
@js.native
trait KnockoutEditable extends js.Object {
  def addEditable(target: js.Any): js.Any = js.native
  def beginEdit(): Unit = js.native
  def commit(): Unit = js.native
  def hasChanges(): Boolean = js.native
  def rollback(): Unit = js.native
}

object KnockoutEditable {
  @scala.inline
  def apply(
    addEditable: js.Any => js.Any,
    beginEdit: () => Unit,
    commit: () => Unit,
    hasChanges: () => Boolean,
    rollback: () => Unit
  ): KnockoutEditable = {
    val __obj = js.Dynamic.literal(addEditable = js.Any.fromFunction1(addEditable), beginEdit = js.Any.fromFunction0(beginEdit), commit = js.Any.fromFunction0(commit), hasChanges = js.Any.fromFunction0(hasChanges), rollback = js.Any.fromFunction0(rollback))
    __obj.asInstanceOf[KnockoutEditable]
  }
  @scala.inline
  implicit class KnockoutEditableOps[Self <: KnockoutEditable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddEditable(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addEditable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBeginEdit(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginEdit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCommit(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasChanges(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasChanges")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRollback(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollback")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

