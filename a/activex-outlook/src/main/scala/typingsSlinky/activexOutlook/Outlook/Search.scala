package typingsSlinky.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Search extends js.Object {
  val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  val Filter: String = js.native
  val IsSynchronous: Boolean = js.native
  @JSName("Outlook.Search_typekey")
  var OutlookDotSearch_typekey: Search = js.native
  val Parent: js.Any = js.native
  val Results: typingsSlinky.activexOutlook.Outlook.Results = js.native
  val Scope: String = js.native
  val SearchSubFolders: Boolean = js.native
  val Session: NameSpace = js.native
  val Tag: String = js.native
  def GetTable(): Table = js.native
  def Save(Name: String): Folder = js.native
  def Stop(): Unit = js.native
}

object Search {
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    Filter: String,
    GetTable: () => Table,
    IsSynchronous: Boolean,
    OutlookDotSearch_typekey: Search,
    Parent: js.Any,
    Results: Results,
    Save: String => Folder,
    Scope: String,
    SearchSubFolders: Boolean,
    Session: NameSpace,
    Stop: () => Unit,
    Tag: String
  ): Search = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Filter = Filter.asInstanceOf[js.Any], GetTable = js.Any.fromFunction0(GetTable), IsSynchronous = IsSynchronous.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Results = Results.asInstanceOf[js.Any], Save = js.Any.fromFunction1(Save), Scope = Scope.asInstanceOf[js.Any], SearchSubFolders = SearchSubFolders.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], Stop = js.Any.fromFunction0(Stop), Tag = Tag.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.Search_typekey")(OutlookDotSearch_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Search]
  }
  @scala.inline
  implicit class SearchOps[Self <: Search] (val x: Self) extends AnyVal {
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
    def withFilter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetTable(value: () => Table): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetTable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsSynchronous(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsSynchronous")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutlookDotSearch_typekey(value: Search): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outlook.Search_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResults(value: Results): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Results")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSave(value: String => Folder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Save")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withScope(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchSubFolders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SearchSubFolders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSession(value: NameSpace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Session")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStop(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Stop")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tag")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

