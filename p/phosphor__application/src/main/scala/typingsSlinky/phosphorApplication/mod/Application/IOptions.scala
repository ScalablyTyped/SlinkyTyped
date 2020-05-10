package typingsSlinky.phosphorApplication.mod.Application

import typingsSlinky.phosphorWidgets.menuMod.Menu.IRenderer
import typingsSlinky.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for creating an application.
  */
@js.native
trait IOptions[T /* <: Widget */] extends js.Object {
  /**
    * A custom renderer for the context menu.
    */
  var contextMenuRenderer: js.UndefOr[IRenderer] = js.native
  /**
    * The shell widget to use for the application.
    *
    * This should be a newly created and initialized widget.
    *
    * The application will attach the widget to the DOM.
    */
  var shell: T = js.native
}

object IOptions {
  @scala.inline
  def apply[T](shell: T): IOptions[T] = {
    val __obj = js.Dynamic.literal(shell = shell.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions[T]]
  }
  @scala.inline
  implicit class IOptionsOps[Self[t] <: IOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withShell(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContextMenuRenderer(value: IRenderer): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenuRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextMenuRenderer: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenuRenderer")(js.undefined)
        ret
    }
  }
  
}

