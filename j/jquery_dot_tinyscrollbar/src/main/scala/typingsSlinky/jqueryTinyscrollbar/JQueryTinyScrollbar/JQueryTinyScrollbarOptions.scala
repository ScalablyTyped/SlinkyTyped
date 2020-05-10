package typingsSlinky.jqueryTinyscrollbar.JQueryTinyScrollbar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryTinyScrollbarOptions extends js.Object {
  /**
    * Vertical or horizontal scroller? 'x' or 'y'. (default: 'x')
    */
  var axis: js.UndefOr[String] = js.native
  /**
    * Enable mobile invert style scrolling. (default: false)
    */
  var invertscroll: js.UndefOr[Boolean] = js.native
  /**
    * Return scrollwheel event to browser if there is no more content. (default: true)
    */
  var lockscroll: js.UndefOr[Boolean] = js.native
  /**
    * Enable or disable the mousewheel. (default: true)
    */
  var scroll: js.UndefOr[Boolean] = js.native
  /**
    * Set the size of the scrollbar to auto or a fixed number. (default: 'auto')
    */
  var size: js.UndefOr[js.Any] = js.native
  /**
    * Set the size of the thumb to auto or a fixed number. (default: 'auto')
    */
  var sizethumb: js.UndefOr[js.Any] = js.native
  /**
    * How many pixels must the mouswheel scrolls at a time. (default: 40)
    */
  var wheel: js.UndefOr[Double] = js.native
}

object JQueryTinyScrollbarOptions {
  @scala.inline
  def apply(): JQueryTinyScrollbarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryTinyScrollbarOptions]
  }
  @scala.inline
  implicit class JQueryTinyScrollbarOptionsOps[Self <: JQueryTinyScrollbarOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(js.undefined)
        ret
    }
    @scala.inline
    def withInvertscroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invertscroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvertscroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invertscroll")(js.undefined)
        ret
    }
    @scala.inline
    def withLockscroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockscroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockscroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockscroll")(js.undefined)
        ret
    }
    @scala.inline
    def withScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: js.Any): Self = {
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
    def withSizethumb(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizethumb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizethumb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizethumb")(js.undefined)
        ret
    }
    @scala.inline
    def withWheel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wheel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWheel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wheel")(js.undefined)
        ret
    }
  }
  
}

