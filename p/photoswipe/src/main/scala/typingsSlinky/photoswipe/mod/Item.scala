package typingsSlinky.photoswipe.mod

import typingsSlinky.photoswipe.anon.Top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Item extends js.Object {
  /**
    * Internal property added by PhotoSwipe.
    */
  var bounds: js.UndefOr[js.Any] = js.native
  /**
    * Internal property added by PhotoSwipe.
    * This number is computed to be this item's smaller dimension divided by the larger dimension.
    */
  var fitRatio: js.UndefOr[Double] = js.native
  /**
    * The height of this image.
    */
  var h: js.UndefOr[Double] = js.native
  /**
    * HTML content instead of image.
    */
  var html: js.UndefOr[String] = js.native
  /**
    * Internal property added by PhotoSwipe.
    */
  var initialPosition: js.UndefOr[js.Any] = js.native
  /**
    * Internal property added by PhotoSwipe.
    */
  var initialZoomLevel: js.UndefOr[Double] = js.native
  /**
    * Internal property added by PhotoSwipe.
    */
  var loadError: js.UndefOr[Boolean] = js.native
  /**
    * The url to small image placeholder, large image will be loaded on top
    */
  var msrc: js.UndefOr[String] = js.native
  /**
    * The url of this image.
    */
  var src: js.UndefOr[String] = js.native
  /**
    * Internal property added by PhotoSwipe.
    */
  var vGap: js.UndefOr[Top] = js.native
  /**
    * The width of this image.
    */
  var w: js.UndefOr[Double] = js.native
}

object Item {
  @scala.inline
  def apply(): Item = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Item]
  }
  @scala.inline
  implicit class ItemOps[Self <: Item] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBounds(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBounds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(js.undefined)
        ret
    }
    @scala.inline
    def withFitRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fitRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFitRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fitRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withH(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutH: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h")(js.undefined)
        ret
    }
    @scala.inline
    def withHtml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialPosition(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialZoomLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialZoomLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialZoomLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialZoomLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadError")(js.undefined)
        ret
    }
    @scala.inline
    def withMsrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMsrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msrc")(js.undefined)
        ret
    }
    @scala.inline
    def withSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(js.undefined)
        ret
    }
    @scala.inline
    def withVGap(value: Top): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vGap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVGap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vGap")(js.undefined)
        ret
    }
    @scala.inline
    def withW(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("w")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutW: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("w")(js.undefined)
        ret
    }
  }
  
}

