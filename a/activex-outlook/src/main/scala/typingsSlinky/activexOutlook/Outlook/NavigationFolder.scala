package typingsSlinky.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationFolder extends js.Object {
  val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  val DisplayName: String = js.native
  val Folder: typingsSlinky.activexOutlook.Outlook.Folder = js.native
  val IsRemovable: Boolean = js.native
  var IsSelected: Boolean = js.native
  var IsSideBySide: Boolean = js.native
  @JSName("Outlook.NavigationFolder_typekey")
  var OutlookDotNavigationFolder_typekey: NavigationFolder = js.native
  val Parent: js.Any = js.native
  var Position: Double = js.native
  val Session: NameSpace = js.native
}

object NavigationFolder {
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    DisplayName: String,
    Folder: Folder,
    IsRemovable: Boolean,
    IsSelected: Boolean,
    IsSideBySide: Boolean,
    OutlookDotNavigationFolder_typekey: NavigationFolder,
    Parent: js.Any,
    Position: Double,
    Session: NameSpace
  ): NavigationFolder = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any], Folder = Folder.asInstanceOf[js.Any], IsRemovable = IsRemovable.asInstanceOf[js.Any], IsSelected = IsSelected.asInstanceOf[js.Any], IsSideBySide = IsSideBySide.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.NavigationFolder_typekey")(OutlookDotNavigationFolder_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationFolder]
  }
  @scala.inline
  implicit class NavigationFolderOps[Self <: NavigationFolder] (val x: Self) extends AnyVal {
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
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFolder(value: Folder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Folder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsRemovable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsRemovable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSideBySide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsSideBySide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutlookDotNavigationFolder_typekey(value: NavigationFolder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outlook.NavigationFolder_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Position")(value.asInstanceOf[js.Any])
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

