package typingsSlinky.phosphorWidgets.docklayoutMod.DockLayout

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.phosphorWidgets.tabbarMod.TabBar
import typingsSlinky.phosphorWidgets.widgetMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A renderer for use with a dock layout.
  */
@js.native
trait IRenderer extends js.Object {
  /**
    * Create a new handle node for use with a dock layout.
    *
    * @returns A new handle node for a dock layout.
    */
  def createHandle(): HTMLDivElement = js.native
  /**
    * Create a new tab bar for use with a dock layout.
    *
    * @returns A new tab bar for a dock layout.
    */
  def createTabBar(): TabBar[Widget] = js.native
}

object IRenderer {
  @scala.inline
  def apply(createHandle: () => HTMLDivElement, createTabBar: () => TabBar[Widget]): IRenderer = {
    val __obj = js.Dynamic.literal(createHandle = js.Any.fromFunction0(createHandle), createTabBar = js.Any.fromFunction0(createTabBar))
    __obj.asInstanceOf[IRenderer]
  }
  @scala.inline
  implicit class IRendererOps[Self <: IRenderer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateHandle(value: () => HTMLDivElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createHandle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCreateTabBar(value: () => TabBar[Widget]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTabBar")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

