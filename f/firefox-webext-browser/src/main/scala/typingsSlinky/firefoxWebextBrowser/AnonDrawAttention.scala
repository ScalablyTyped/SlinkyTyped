package typingsSlinky.firefoxWebextBrowser

import typingsSlinky.firefoxWebextBrowser.browser.windows.WindowState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDrawAttention extends js.Object {
  /**
    * If true, causes the window to be displayed in a manner that draws the user's attention to the window,
    * without changing the focused window. The effect lasts until the user changes focus to the window. This
    * option has no effect if the window already has focus. Set to false to cancel a previous draw attention
    * request.
    */
  var drawAttention: js.UndefOr[Boolean] = js.native
  /**
    * If true, brings the window to the front. If false, brings the next window in the z-order to the front.
    */
  var focused: js.UndefOr[Boolean] = js.native
  /** The height to resize the window to in pixels. This value is ignored for panels. */
  var height: js.UndefOr[Double] = js.native
  /**
    * The offset from the left edge of the screen to move the window to in pixels. This value is ignored for
    * panels.
    */
  var left: js.UndefOr[Double] = js.native
  /**
    * The new state of the window. The 'minimized', 'maximized' and 'fullscreen' states cannot be combined with
    * 'left', 'top', 'width' or 'height'.
    */
  var state: js.UndefOr[WindowState] = js.native
  /** A string to add to the beginning of the window title. */
  var titlePreface: js.UndefOr[String] = js.native
  /**
    * The offset from the top edge of the screen to move the window to in pixels. This value is ignored for panels.
    */
  var top: js.UndefOr[Double] = js.native
  /** The width to resize the window to in pixels. This value is ignored for panels. */
  var width: js.UndefOr[Double] = js.native
}

object AnonDrawAttention {
  @scala.inline
  def apply(): AnonDrawAttention = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDrawAttention]
  }
  @scala.inline
  implicit class AnonDrawAttentionOps[Self <: AnonDrawAttention] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDrawAttention(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawAttention")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawAttention: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawAttention")(js.undefined)
        ret
    }
    @scala.inline
    def withFocused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocused: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focused")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: WindowState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withTitlePreface(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titlePreface")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitlePreface: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titlePreface")(js.undefined)
        ret
    }
    @scala.inline
    def withTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

