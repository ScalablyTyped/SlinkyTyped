package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Conflicts extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.Conflicts_typekey")
  var WordDotConflicts_typekey: Conflicts = js.native
  def AcceptAll(): Unit = js.native
  def Item(Index: Double): Conflict = js.native
  def RejectAll(): Unit = js.native
}

object Conflicts {
  @scala.inline
  def apply(
    AcceptAll: () => Unit,
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: Double => Conflict,
    Parent: js.Any,
    RejectAll: () => Unit,
    WordDotConflicts_typekey: Conflicts
  ): Conflicts = {
    val __obj = js.Dynamic.literal(AcceptAll = js.Any.fromFunction0(AcceptAll), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], RejectAll = js.Any.fromFunction0(RejectAll))
    __obj.updateDynamic("Word.Conflicts_typekey")(WordDotConflicts_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conflicts]
  }
  @scala.inline
  implicit class ConflictsOps[Self <: Conflicts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceptAll(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AcceptAll")(js.Any.fromFunction0(value))
        ret
    }
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
    def withItem(value: Double => Conflict): Self = {
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
    def withRejectAll(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RejectAll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWordDotConflicts_typekey(value: Conflicts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.Conflicts_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

