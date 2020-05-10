package typingsSlinky.phosphorWidgets.tabbarMod.TabBar

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.phosphorWidgets.titleMod.Title
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The arguments object for the `tabDetachRequested` signal.
  */
@js.native
trait ITabDetachRequestedArgs[T] extends js.Object {
  /**
    * The current client X position of the mouse.
    */
  val clientX: Double = js.native
  /**
    * The current client Y position of the mouse.
    */
  val clientY: Double = js.native
  /**
    * The index of the tab to detach.
    */
  val index: Double = js.native
  /**
    * The node representing the tab.
    */
  val tab: HTMLElement = js.native
  /**
    * The title for the tab.
    */
  val title: Title[T] = js.native
}

object ITabDetachRequestedArgs {
  @scala.inline
  def apply[T](clientX: Double, clientY: Double, index: Double, tab: HTMLElement, title: Title[T]): ITabDetachRequestedArgs[T] = {
    val __obj = js.Dynamic.literal(clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITabDetachRequestedArgs[T]]
  }
  @scala.inline
  implicit class ITabDetachRequestedArgsOps[Self[t] <: ITabDetachRequestedArgs[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withClientX(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientY(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTab(value: HTMLElement): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: Title[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

