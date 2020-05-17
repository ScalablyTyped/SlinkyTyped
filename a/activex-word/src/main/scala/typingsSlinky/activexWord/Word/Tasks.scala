package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tasks extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.Tasks_typekey")
  var WordDotTasks_typekey: Tasks = js.native
  def Exists(Name: String): Boolean = js.native
  def ExitWindows(): Unit = js.native
  def Item(Index: js.Any): Task = js.native
}

object Tasks {
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Exists: String => Boolean,
    ExitWindows: () => Unit,
    Item: js.Any => Task,
    Parent: js.Any,
    WordDotTasks_typekey: Tasks
  ): Tasks = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Exists = js.Any.fromFunction1(Exists), ExitWindows = js.Any.fromFunction0(ExitWindows), Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Tasks_typekey")(WordDotTasks_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tasks]
  }
  @scala.inline
  implicit class TasksOps[Self <: Tasks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExists(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Exists")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExitWindows(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExitWindows")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withItem(value: js.Any => Task): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotTasks_typekey(value: Tasks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.Tasks_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

