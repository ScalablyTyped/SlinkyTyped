package typingsSlinky.protonNative.mod

import slinky.core.facade.ReactElement
import typingsSlinky.protonNative.anon.W
import typingsSlinky.protonNative.anon.Y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowProps extends js.Object {
  /**
    * Whether the window will have a border on the inside.
    */
  var borderless: js.UndefOr[Boolean] = js.native
  /**
    * Window can only have one child. To have more than one child, use boxes.
    */
  var children: js.UndefOr[ReactElement] = js.native
  /**
    * Whether the window is closed. If set to closed, then the window will be closed.
    */
  var closed: js.UndefOr[Boolean] = js.native
  /**
    * Whether the window will be fullscreen on start.
    */
  var fullscreen: js.UndefOr[Boolean] = js.native
  /**
    * Whether the window is the last window. If set to `true`, then the program will quit once the window is closed.
    */
  var lastWindow: js.UndefOr[Boolean] = js.native
  /**
    * Whether all children will have a margin around them and the outer edge of the window.
    */
  var margined: js.UndefOr[Boolean] = js.native
  /**
    * Whether a menubar will be shown on the top of the window.
    */
  var menuBar: js.UndefOr[Boolean] = js.native
  /**
    * Called when the window is closed.
    */
  var onClose: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Called when the window size is changed by the user. The new size is passed as an argument, in an object.
    */
  var onContentSizeChange: js.UndefOr[js.Function1[/* size */ Y, Unit]] = js.native
  /**
    * How big the window is when the application is first started.
    */
  var size: js.UndefOr[W] = js.native
  /**
    * The title of the window. Will be shown at the top left ribbon.
    */
  var title: js.UndefOr[String] = js.native
}

object WindowProps {
  @scala.inline
  def apply(): WindowProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowProps]
  }
  @scala.inline
  implicit class WindowPropsOps[Self <: WindowProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorderless(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderless")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderless: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderless")(js.undefined)
        ret
    }
    @scala.inline
    def withChildren(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withClosed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClosed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closed")(js.undefined)
        ret
    }
    @scala.inline
    def withFullscreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullscreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreen")(js.undefined)
        ret
    }
    @scala.inline
    def withLastWindow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastWindow")(js.undefined)
        ret
    }
    @scala.inline
    def withMargined(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margined")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargined: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margined")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuBar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuBar")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnContentSizeChange(value: /* size */ Y => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContentSizeChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnContentSizeChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContentSizeChange")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: W): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

