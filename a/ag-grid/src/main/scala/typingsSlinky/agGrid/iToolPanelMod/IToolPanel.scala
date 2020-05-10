package typingsSlinky.agGrid.iToolPanelMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.agGrid.gridPanelMod.GridPanel
import typingsSlinky.agGrid.iComponentMod.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IToolPanel
  extends IComponent[js.Any] {
  def getPreferredWidth(): Double = js.native
  def isToolPanelShowing(): Boolean = js.native
  def refresh(): Unit = js.native
  def registerGridComp(gridPanel: GridPanel): Unit = js.native
  def showToolPanel(show: Boolean): Unit = js.native
}

object IToolPanel {
  @scala.inline
  def apply(
    getGui: () => HTMLElement,
    getPreferredWidth: () => Double,
    isToolPanelShowing: () => Boolean,
    refresh: () => Unit,
    registerGridComp: GridPanel => Unit,
    showToolPanel: Boolean => Unit
  ): IToolPanel = {
    val __obj = js.Dynamic.literal(getGui = js.Any.fromFunction0(getGui), getPreferredWidth = js.Any.fromFunction0(getPreferredWidth), isToolPanelShowing = js.Any.fromFunction0(isToolPanelShowing), refresh = js.Any.fromFunction0(refresh), registerGridComp = js.Any.fromFunction1(registerGridComp), showToolPanel = js.Any.fromFunction1(showToolPanel))
    __obj.asInstanceOf[IToolPanel]
  }
  @scala.inline
  implicit class IToolPanelOps[Self <: IToolPanel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetPreferredWidth(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPreferredWidth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsToolPanelShowing(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isToolPanelShowing")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRefresh(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refresh")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRegisterGridComp(value: GridPanel => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerGridComp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShowToolPanel(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showToolPanel")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

