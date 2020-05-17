package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains options affecting the touch scrolling functionality.
  */
@js.native
trait ASPxClientTouchUIOptions extends js.Object {
  /**
    * Gets or sets the name of the CSS class defining the horizontal scroll bar's appearance.
    */
  var hScrollClassName: String = js.native
  /**
    * Gets or sets a value that specifies whether or not the horizontal scroll bar should be displayed.
    */
  var showHorizontalScrollbar: Boolean = js.native
  /**
    * Gets or sets a value that specifies whether or not the vertical scroll bar should be displayed.
    */
  var showVerticalScrollbar: Boolean = js.native
  /**
    * Gets or sets the name of the CSS class defining the vertical scroll bar's appearance.
    */
  var vScrollClassName: String = js.native
}

object ASPxClientTouchUIOptions {
  @scala.inline
  def apply(
    hScrollClassName: String,
    showHorizontalScrollbar: Boolean,
    showVerticalScrollbar: Boolean,
    vScrollClassName: String
  ): ASPxClientTouchUIOptions = {
    val __obj = js.Dynamic.literal(hScrollClassName = hScrollClassName.asInstanceOf[js.Any], showHorizontalScrollbar = showHorizontalScrollbar.asInstanceOf[js.Any], showVerticalScrollbar = showVerticalScrollbar.asInstanceOf[js.Any], vScrollClassName = vScrollClassName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTouchUIOptions]
  }
  @scala.inline
  implicit class ASPxClientTouchUIOptionsOps[Self <: ASPxClientTouchUIOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHScrollClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hScrollClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowHorizontalScrollbar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHorizontalScrollbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowVerticalScrollbar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showVerticalScrollbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVScrollClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vScrollClassName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

