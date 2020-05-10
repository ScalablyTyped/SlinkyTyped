package typingsSlinky.jupyterlabApputils.mainareawidgetMod.MainAreaWidget

import typingsSlinky.jupyterlabApputils.toolbarMod.Toolbar
import typingsSlinky.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for main area widget subclasses providing their own
  * default content.
  *
  * #### Notes
  * This makes it easier to have a subclass that provides its own default
  * content. This can go away once we upgrade to TypeScript 2.8 and have an
  * easy way to make a single property optional, ala
  * https://stackoverflow.com/a/46941824
  */
@js.native
trait IOptionsOptionalContent[T /* <: Widget */]
  extends typingsSlinky.phosphorWidgets.widgetMod.Widget.IOptions {
  /**
    * The child widget to wrap.
    */
  var content: js.UndefOr[T] = js.native
  /**
    * An optional promise for when the content is ready to be revealed.
    */
  var reveal: js.UndefOr[js.Promise[_]] = js.native
  /**
    * The toolbar to use for the widget.  Defaults to an empty toolbar.
    */
  var toolbar: js.UndefOr[Toolbar[Widget]] = js.native
}

object IOptionsOptionalContent {
  @scala.inline
  def apply[T](): IOptionsOptionalContent[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOptionsOptionalContent[T]]
  }
  @scala.inline
  implicit class IOptionsOptionalContentOps[Self[t] <: IOptionsOptionalContent[t], T] (val x: Self[T]) extends AnyVal {
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
    def withoutContent: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
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

