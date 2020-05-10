package typingsSlinky.jupyterlabApplication.shellMod.ILabShell

import typingsSlinky.phosphorWidgets.docklayoutMod.DockLayout.ILayoutConfig
import typingsSlinky.phosphorWidgets.dockpanelMod.DockPanel.Mode
import typingsSlinky.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The restorable description of the main application area.
  */
@js.native
trait IMainArea extends js.Object {
  /**
    * The current widget that has application focus.
    */
  val currentWidget: Widget | Null = js.native
  /**
    * The contents of the main application dock panel.
    */
  val dock: ILayoutConfig | Null = js.native
  /**
    * The document mode (i.e., multiple/single) of the main dock panel.
    */
  val mode: Mode | Null = js.native
}

object IMainArea {
  @scala.inline
  def apply(): IMainArea = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMainArea]
  }
  @scala.inline
  implicit class IMainAreaOps[Self <: IMainArea] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentWidget(value: Widget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentWidget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentWidgetNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentWidget")(null)
        ret
    }
    @scala.inline
    def withDock(value: ILayoutConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDockNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dock")(null)
        ret
    }
    @scala.inline
    def withMode(value: Mode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(null)
        ret
    }
  }
  
}

