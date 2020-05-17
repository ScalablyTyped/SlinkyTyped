package typingsSlinky.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationGroups extends js.Object {
  val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  val Count: Double = js.native
  @JSName("Outlook.NavigationGroups_typekey")
  var OutlookDotNavigationGroups_typekey: NavigationGroups = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def Create(GroupDisplayName: String): NavigationGroup = js.native
  def Delete(Group: NavigationGroup): Unit = js.native
  def GetDefaultNavigationGroup(DefaultFolderGroup: OlGroupType): NavigationGroup = js.native
  def Item(Index: js.Any): NavigationGroup = js.native
}

object NavigationGroups {
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    Count: Double,
    Create: String => NavigationGroup,
    Delete: NavigationGroup => Unit,
    GetDefaultNavigationGroup: OlGroupType => NavigationGroup,
    Item: js.Any => NavigationGroup,
    OutlookDotNavigationGroups_typekey: NavigationGroups,
    Parent: js.Any,
    Session: NameSpace
  ): NavigationGroups = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Create = js.Any.fromFunction1(Create), Delete = js.Any.fromFunction1(Delete), GetDefaultNavigationGroup = js.Any.fromFunction1(GetDefaultNavigationGroup), Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.NavigationGroups_typekey")(OutlookDotNavigationGroups_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationGroups]
  }
  @scala.inline
  implicit class NavigationGroupsOps[Self <: NavigationGroups] (val x: Self) extends AnyVal {
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
    def withCreate(value: String => NavigationGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: NavigationGroup => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetDefaultNavigationGroup(value: OlGroupType => NavigationGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetDefaultNavigationGroup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withItem(value: js.Any => NavigationGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOutlookDotNavigationGroups_typekey(value: NavigationGroups): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outlook.NavigationGroups_typekey")(value.asInstanceOf[js.Any])
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

