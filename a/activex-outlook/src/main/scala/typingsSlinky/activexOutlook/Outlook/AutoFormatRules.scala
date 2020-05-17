package typingsSlinky.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoFormatRules extends js.Object {
  val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  val Count: Double = js.native
  @JSName("Outlook.AutoFormatRules_typekey")
  var OutlookDotAutoFormatRules_typekey: AutoFormatRules = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def Add(Name: String): AutoFormatRule = js.native
  def Insert(Name: String, Index: js.Any): AutoFormatRule = js.native
  def Item(Index: js.Any): AutoFormatRule = js.native
  def Remove(Index: js.Any): Unit = js.native
  def RemoveAll(): Unit = js.native
  def Save(): Unit = js.native
}

object AutoFormatRules {
  @scala.inline
  def apply(
    Add: String => AutoFormatRule,
    Application: Application,
    Class: OlObjectClass,
    Count: Double,
    Insert: (String, js.Any) => AutoFormatRule,
    Item: js.Any => AutoFormatRule,
    OutlookDotAutoFormatRules_typekey: AutoFormatRules,
    Parent: js.Any,
    Remove: js.Any => Unit,
    RemoveAll: () => Unit,
    Save: () => Unit,
    Session: NameSpace
  ): AutoFormatRules = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Insert = js.Any.fromFunction2(Insert), Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Remove = js.Any.fromFunction1(Remove), RemoveAll = js.Any.fromFunction0(RemoveAll), Save = js.Any.fromFunction0(Save), Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.AutoFormatRules_typekey")(OutlookDotAutoFormatRules_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoFormatRules]
  }
  @scala.inline
  implicit class AutoFormatRulesOps[Self <: AutoFormatRules] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: String => AutoFormatRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Add")(js.Any.fromFunction1(value))
        ret
    }
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
    def withInsert(value: (String, js.Any) => AutoFormatRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Insert")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withItem(value: js.Any => AutoFormatRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOutlookDotAutoFormatRules_typekey(value: AutoFormatRules): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outlook.AutoFormatRules_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemove(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveAll(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoveAll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSave(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Save")(js.Any.fromFunction0(value))
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

