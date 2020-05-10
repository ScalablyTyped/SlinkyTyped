package typingsSlinky.jupyterlabApplication.shellMod.ILabShell

import typingsSlinky.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The restorable description of a sidebar in the user interface.
  */
@js.native
trait ISideArea extends js.Object {
  /**
    * A flag denoting whether the sidebar has been collapsed.
    */
  val collapsed: Boolean = js.native
  /**
    * The current widget that has side area focus.
    */
  val currentWidget: Widget | Null = js.native
  /**
    * The collection of widgets held by the sidebar.
    */
  val widgets: js.Array[Widget] | Null = js.native
}

object ISideArea {
  @scala.inline
  def apply(collapsed: Boolean): ISideArea = {
    val __obj = js.Dynamic.literal(collapsed = collapsed.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISideArea]
  }
  @scala.inline
  implicit class ISideAreaOps[Self <: ISideArea] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollapsed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withWidgets(value: js.Array[Widget]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widgets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidgetsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widgets")(null)
        ret
    }
  }
  
}

