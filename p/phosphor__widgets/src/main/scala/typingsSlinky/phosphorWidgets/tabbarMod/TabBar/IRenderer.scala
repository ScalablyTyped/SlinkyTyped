package typingsSlinky.phosphorWidgets.tabbarMod.TabBar

import typingsSlinky.phosphorVirtualdom.mod.VirtualElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A renderer for use with a tab bar.
  */
@js.native
trait IRenderer[T] extends js.Object {
  /**
    * A selector which matches the close icon node in a tab.
    */
  val closeIconSelector: String = js.native
  /**
    * Render the virtual element for a tab.
    *
    * @param data - The data to use for rendering the tab.
    *
    * @returns A virtual element representing the tab.
    */
  def renderTab(data: IRenderData[T]): VirtualElement = js.native
}

object IRenderer {
  @scala.inline
  def apply[T](closeIconSelector: String, renderTab: IRenderData[T] => VirtualElement): IRenderer[T] = {
    val __obj = js.Dynamic.literal(closeIconSelector = closeIconSelector.asInstanceOf[js.Any], renderTab = js.Any.fromFunction1(renderTab))
    __obj.asInstanceOf[IRenderer[T]]
  }
  @scala.inline
  implicit class IRendererOps[Self[t] <: IRenderer[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withCloseIconSelector(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeIconSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderTab(value: IRenderData[T] => VirtualElement): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTab")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

