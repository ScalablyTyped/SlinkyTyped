package typingsSlinky.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SolutionsModule extends js.Object {
  val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  val Name: String = js.native
  val NavigationModuleType: OlNavigationModuleType = js.native
  @JSName("Outlook.SolutionsModule_typekey")
  var OutlookDotSolutionsModule_typekey: SolutionsModule = js.native
  val Parent: js.Any = js.native
  var Position: Double = js.native
  val Session: NameSpace = js.native
  var Visible: Boolean = js.native
  def AddSolution(Solution: Folder, Scope: OlSolutionScope): Unit = js.native
}

object SolutionsModule {
  @scala.inline
  def apply(
    AddSolution: (Folder, OlSolutionScope) => Unit,
    Application: Application,
    Class: OlObjectClass,
    Name: String,
    NavigationModuleType: OlNavigationModuleType,
    OutlookDotSolutionsModule_typekey: SolutionsModule,
    Parent: js.Any,
    Position: Double,
    Session: NameSpace,
    Visible: Boolean
  ): SolutionsModule = {
    val __obj = js.Dynamic.literal(AddSolution = js.Any.fromFunction2(AddSolution), Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NavigationModuleType = NavigationModuleType.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.SolutionsModule_typekey")(OutlookDotSolutionsModule_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SolutionsModule]
  }
  @scala.inline
  implicit class SolutionsModuleOps[Self <: SolutionsModule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddSolution(value: (Folder, OlSolutionScope) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddSolution")(js.Any.fromFunction2(value))
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
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNavigationModuleType(value: OlNavigationModuleType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NavigationModuleType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutlookDotSolutionsModule_typekey(value: SolutionsModule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outlook.SolutionsModule_typekey")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Visible")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

