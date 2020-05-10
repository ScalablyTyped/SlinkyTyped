package typingsSlinky.jupyterlabApputils.mainareawidgetMod.MainAreaWidget

import typingsSlinky.jupyterlabApputils.toolbarMod.Toolbar
import typingsSlinky.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for creating a main area widget.
  */
@js.native
trait IOptions[T /* <: Widget */]
  extends typingsSlinky.phosphorWidgets.widgetMod.Widget.IOptions {
  /**
    * The child widget to wrap.
    */
  var content: T = js.native
  /**
    * An optional promise for when the content is ready to be revealed.
    */
  var reveal: js.UndefOr[js.Promise[_]] = js.native
  /**
    * The toolbar to use for the widget.  Defaults to an empty toolbar.
    */
  var toolbar: js.UndefOr[Toolbar[Widget]] = js.native
}

object IOptions {
  @scala.inline
  def apply[T](content: T): IOptions[T] = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions[T]]
  }
  @scala.inline
  implicit class IOptionsOps[Self[t] <: IOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withContent(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReveal(value: js.Promise[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reveal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReveal: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reveal")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbar(value: Toolbar[Widget]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbar: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar")(js.undefined)
        ret
    }
  }
  
}

