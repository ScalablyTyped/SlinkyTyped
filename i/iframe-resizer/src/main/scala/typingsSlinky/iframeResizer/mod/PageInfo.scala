package typingsSlinky.iframeResizer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageInfo extends js.Object {
  /**
    * The height of the viewport in pixels
    */
  var clientHeight: Double = js.native
  /**
    * The width of the viewport in pixels
    */
  var clientWidth: Double = js.native
  /**
    * The height of the iframe in pixels
    */
  var iframeHeight: Double = js.native
  /**
    * The width of the iframe in pixels
    */
  var iframeWidth: Double = js.native
  /**
    * The number of pixels between the left edge of the containing page and the left edge of the iframe
    */
  var offsetLeft: Double = js.native
  /**
    * The number of pixels between the top edge of the containing page and the top edge of the iframe
    */
  var offsetTop: Double = js.native
  /**
    * The number of pixels between the left edge of the iframe and the left edge of the iframe viewport
    */
  var scrollLeft: Double = js.native
  /**
    * The number of pixels between the top edge of the iframe and the top edge of the iframe viewport
    */
  var scrollTop: Double = js.native
}

object PageInfo {
  @scala.inline
  def apply(
    clientHeight: Double,
    clientWidth: Double,
    iframeHeight: Double,
    iframeWidth: Double,
    offsetLeft: Double,
    offsetTop: Double,
    scrollLeft: Double,
    scrollTop: Double
  ): PageInfo = {
    val __obj = js.Dynamic.literal(clientHeight = clientHeight.asInstanceOf[js.Any], clientWidth = clientWidth.asInstanceOf[js.Any], iframeHeight = iframeHeight.asInstanceOf[js.Any], iframeWidth = iframeWidth.asInstanceOf[js.Any], offsetLeft = offsetLeft.asInstanceOf[js.Any], offsetTop = offsetTop.asInstanceOf[js.Any], scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageInfo]
  }
  @scala.inline
  implicit class PageInfoOps[Self <: PageInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIframeHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iframeHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIframeWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iframeWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffsetLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffsetTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollTop")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

