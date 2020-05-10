package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IShellPaneContainer extends js.Object {
  val Content: js.Any = js.native
  val Events: IShellPaneContainerEvents = js.native
  val IsFocused: Boolean = js.native
  var Minimized: Boolean = js.native
  val ShellFrame: IShellFrame = js.native
  var Size: Double = js.native
  val TabTitleSize: Double = js.native
  var Visible: Boolean = js.native
  def AddTab(TabId: String, tabTitle: String, insertBeforeTabId: String): IShellPaneTab = js.native
  def Focus(): Unit = js.native
  def GetSelectedTab(): IShellPaneTab = js.native
  def GetTab(TabId: String): IShellPaneTab = js.native
  def SetDefaultSize(defaultSize: Double, resizeToDefault: Boolean): Unit = js.native
  def SetDefaultVisibility(Visible: Boolean, resetToDefault: Boolean): Unit = js.native
}

object IShellPaneContainer {
  @scala.inline
  def apply(
    AddTab: (String, String, String) => IShellPaneTab,
    Content: js.Any,
    Events: IShellPaneContainerEvents,
    Focus: () => Unit,
    GetSelectedTab: () => IShellPaneTab,
    GetTab: String => IShellPaneTab,
    IsFocused: Boolean,
    Minimized: Boolean,
    SetDefaultSize: (Double, Boolean) => Unit,
    SetDefaultVisibility: (Boolean, Boolean) => Unit,
    ShellFrame: IShellFrame,
    Size: Double,
    TabTitleSize: Double,
    Visible: Boolean
  ): IShellPaneContainer = {
    val __obj = js.Dynamic.literal(AddTab = js.Any.fromFunction3(AddTab), Content = Content.asInstanceOf[js.Any], Events = Events.asInstanceOf[js.Any], Focus = js.Any.fromFunction0(Focus), GetSelectedTab = js.Any.fromFunction0(GetSelectedTab), GetTab = js.Any.fromFunction1(GetTab), IsFocused = IsFocused.asInstanceOf[js.Any], Minimized = Minimized.asInstanceOf[js.Any], SetDefaultSize = js.Any.fromFunction2(SetDefaultSize), SetDefaultVisibility = js.Any.fromFunction2(SetDefaultVisibility), ShellFrame = ShellFrame.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], TabTitleSize = TabTitleSize.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShellPaneContainer]
  }
  @scala.inline
  implicit class IShellPaneContainerOps[Self <: IShellPaneContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddTab(value: (String, String, String) => IShellPaneTab): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddTab")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withContent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvents(value: IShellPaneContainerEvents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocus(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Focus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSelectedTab(value: () => IShellPaneTab): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetSelectedTab")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTab(value: String => IShellPaneTab): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetTab")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsFocused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsFocused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinimized(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Minimized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetDefaultSize(value: (Double, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetDefaultSize")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetDefaultVisibility(value: (Boolean, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetDefaultVisibility")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withShellFrame(value: IShellFrame): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShellFrame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabTitleSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TabTitleSize")(value.asInstanceOf[js.Any])
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

