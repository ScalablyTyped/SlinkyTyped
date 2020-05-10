package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITaskPane extends js.Object {
  val Available: Boolean = js.native
  val Events: ITaskPaneEvents = js.native
  var Visible: Boolean = js.native
  def AddCustomCommandToGroup(customCommand: Double, group: Double, orderPriority: Double): Unit = js.native
  def CreateGroup(groupName: String, priority: Double): Double = js.native
  def DeleteGroup(groupID: Double): Unit = js.native
  def RemoveCustomCommandFromGroup(customCommand: Double, group: Double): Unit = js.native
  def SetLogo(filename: String): Unit = js.native
  def SetTheme(theme: ITheme): Unit = js.native
}

object ITaskPane {
  @scala.inline
  def apply(
    AddCustomCommandToGroup: (Double, Double, Double) => Unit,
    Available: Boolean,
    CreateGroup: (String, Double) => Double,
    DeleteGroup: Double => Unit,
    Events: ITaskPaneEvents,
    RemoveCustomCommandFromGroup: (Double, Double) => Unit,
    SetLogo: String => Unit,
    SetTheme: ITheme => Unit,
    Visible: Boolean
  ): ITaskPane = {
    val __obj = js.Dynamic.literal(AddCustomCommandToGroup = js.Any.fromFunction3(AddCustomCommandToGroup), Available = Available.asInstanceOf[js.Any], CreateGroup = js.Any.fromFunction2(CreateGroup), DeleteGroup = js.Any.fromFunction1(DeleteGroup), Events = Events.asInstanceOf[js.Any], RemoveCustomCommandFromGroup = js.Any.fromFunction2(RemoveCustomCommandFromGroup), SetLogo = js.Any.fromFunction1(SetLogo), SetTheme = js.Any.fromFunction1(SetTheme), Visible = Visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITaskPane]
  }
  @scala.inline
  implicit class ITaskPaneOps[Self <: ITaskPane] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddCustomCommandToGroup(value: (Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddCustomCommandToGroup")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withAvailable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Available")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateGroup(value: (String, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateGroup")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDeleteGroup(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeleteGroup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEvents(value: ITaskPaneEvents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveCustomCommandFromGroup(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoveCustomCommandFromGroup")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetLogo(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetLogo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetTheme(value: ITheme => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetTheme")(js.Any.fromFunction1(value))
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

