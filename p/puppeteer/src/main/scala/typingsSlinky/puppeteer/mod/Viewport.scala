package typingsSlinky.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Viewport extends js.Object {
  /**
    * Specify device scale factor (can be thought of as dpr).
    * @default 1
    */
  var deviceScaleFactor: js.UndefOr[Double] = js.native
  /**
    * Specifies if viewport supports touch events.
    * @default false
    */
  var hasTouch: js.UndefOr[Boolean] = js.native
  /** The page height in pixels. */
  var height: Double = js.native
  /**
    * Specifies if viewport is in landscape mode.
    * @default false
    */
  var isLandscape: js.UndefOr[Boolean] = js.native
  /**
    * Whether the `meta viewport` tag is taken into account.
    * @default false
    */
  var isMobile: js.UndefOr[Boolean] = js.native
  /** The page width in pixels. */
  var width: Double = js.native
}

object Viewport {
  @scala.inline
  def apply(height: Double, width: Double): Viewport = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Viewport]
  }
  @scala.inline
  implicit class ViewportOps[Self <: Viewport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceScaleFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceScaleFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceScaleFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceScaleFactor")(js.undefined)
        ret
    }
    @scala.inline
    def withHasTouch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasTouch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasTouch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasTouch")(js.undefined)
        ret
    }
    @scala.inline
    def withIsLandscape(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLandscape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsLandscape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLandscape")(js.undefined)
        ret
    }
    @scala.inline
    def withIsMobile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMobile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsMobile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMobile")(js.undefined)
        ret
    }
  }
  
}

