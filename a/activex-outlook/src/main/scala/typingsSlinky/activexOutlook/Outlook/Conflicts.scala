package typingsSlinky.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Conflicts extends js.Object {
  val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  val Count: Double = js.native
  @JSName("Outlook.Conflicts_typekey")
  var OutlookDotConflicts_typekey: Conflicts = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def GetFirst(): Conflict = js.native
  def GetLast(): Conflict = js.native
  def GetNext(): Conflict = js.native
  def GetPrevious(): Conflict = js.native
  def Item(Index: js.Any): Conflict = js.native
}

object Conflicts {
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    Count: Double,
    GetFirst: () => Conflict,
    GetLast: () => Conflict,
    GetNext: () => Conflict,
    GetPrevious: () => Conflict,
    Item: js.Any => Conflict,
    OutlookDotConflicts_typekey: Conflicts,
    Parent: js.Any,
    Session: NameSpace
  ): Conflicts = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], GetFirst = js.Any.fromFunction0(GetFirst), GetLast = js.Any.fromFunction0(GetLast), GetNext = js.Any.fromFunction0(GetNext), GetPrevious = js.Any.fromFunction0(GetPrevious), Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.Conflicts_typekey")(OutlookDotConflicts_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conflicts]
  }
  @scala.inline
  implicit class ConflictsOps[Self <: Conflicts] (val x: Self) extends AnyVal {
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
    def withClass(value: OlObjectClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetFirst(value: () => Conflict): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetFirst")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLast(value: () => Conflict): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetLast")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetNext(value: () => Conflict): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetNext")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPrevious(value: () => Conflict): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetPrevious")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withItem(value: js.Any => Conflict): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOutlookDotConflicts_typekey(value: Conflicts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outlook.Conflicts_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSession(value: NameSpace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Session")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

