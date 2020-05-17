package typingsSlinky.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Explorers extends js.Object {
  val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  val Count: Double = js.native
  @JSName("Outlook.Explorers_typekey")
  var OutlookDotExplorers_typekey: Explorers = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def Add(Folder: js.Any, DisplayMode: OlFolderDisplayMode): Explorer = js.native
  def Item(Index: js.Any): Explorer = js.native
}

object Explorers {
  @scala.inline
  def apply(
    Add: (js.Any, OlFolderDisplayMode) => Explorer,
    Application: Application,
    Class: OlObjectClass,
    Count: Double,
    Item: js.Any => Explorer,
    OutlookDotExplorers_typekey: Explorers,
    Parent: js.Any,
    Session: NameSpace
  ): Explorers = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.Explorers_typekey")(OutlookDotExplorers_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Explorers]
  }
  @scala.inline
  implicit class ExplorersOps[Self <: Explorers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: (js.Any, OlFolderDisplayMode) => Explorer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Add")(js.Any.fromFunction2(value))
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
    def withItem(value: js.Any => Explorer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOutlookDotExplorers_typekey(value: Explorers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outlook.Explorers_typekey")(value.asInstanceOf[js.Any])
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

