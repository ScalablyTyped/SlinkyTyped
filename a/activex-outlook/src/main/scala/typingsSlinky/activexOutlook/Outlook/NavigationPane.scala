package typingsSlinky.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationPane extends js.Object {
  val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  var CurrentModule: NavigationModule = js.native
  var DisplayedModuleCount: Double = js.native
  var IsCollapsed: Boolean = js.native
  val Modules: NavigationModules = js.native
  @JSName("Outlook.NavigationPane_typekey")
  var OutlookDotNavigationPane_typekey: NavigationPane = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
}

object NavigationPane {
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    CurrentModule: NavigationModule,
    DisplayedModuleCount: Double,
    IsCollapsed: Boolean,
    Modules: NavigationModules,
    OutlookDotNavigationPane_typekey: NavigationPane,
    Parent: js.Any,
    Session: NameSpace
  ): NavigationPane = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], CurrentModule = CurrentModule.asInstanceOf[js.Any], DisplayedModuleCount = DisplayedModuleCount.asInstanceOf[js.Any], IsCollapsed = IsCollapsed.asInstanceOf[js.Any], Modules = Modules.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.NavigationPane_typekey")(OutlookDotNavigationPane_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationPane]
  }
  @scala.inline
  implicit class NavigationPaneOps[Self <: NavigationPane] (val x: Self) extends AnyVal {
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
    def withCurrentModule(value: NavigationModule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentModule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayedModuleCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayedModuleCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsCollapsed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsCollapsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModules(value: NavigationModules): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Modules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutlookDotNavigationPane_typekey(value: NavigationPane): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outlook.NavigationPane_typekey")(value.asInstanceOf[js.Any])
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

