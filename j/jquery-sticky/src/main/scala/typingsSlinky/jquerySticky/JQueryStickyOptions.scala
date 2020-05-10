package typingsSlinky.jquerySticky

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryStickyOptions extends js.Object {
  /**
  	 * Pixels between the page bottom and the element's bottom.
  	 * @default 0
  	 */
  var bottomSpacing: js.UndefOr[Double] = js.native
  /**
  	 * Boolean determining whether the sticky element should be horizontally centered in the page.
  	 * @default false
  	 */
  var center: js.UndefOr[Boolean] = js.native
  /**
  	 * CSS class added to the element's wrapper when "sticked".
  	 * @default is-sticky
  	 */
  var className: js.UndefOr[String] = js.native
  /**
  	 * Selector of element referenced to set fixed width of "sticky" element.
  	 * @default ''
  	 */
  var getWidthFrom: js.UndefOr[String] = js.native
  /**
  	 * Boolean determining whether widths will be recalculated on window resize (using getWidthfrom).
  	 * @default false
  	 */
  var responsiveWidth: js.UndefOr[Boolean] = js.native
  /**
  	 * Pixels between the page top and the element's top.
  	 * @default 0
  	 */
  var topSpacing: js.UndefOr[Double] = js.native
  /**
  	 * Boolean determining whether width of the "sticky" element should be updated to match the wrapper's width.
  	 * Wrapper is a placeholder for "sticky" element while it is fixed (out of static elements flow), and its width depends on the context and CSS rules.
  	 * Works only as long getWidthForm isn't set.
  	 * @default true
  	 */
  var widthFromWrapper: js.UndefOr[Boolean] = js.native
  /**
  	 * CSS class added to the wrapper.
  	 * @default 'sticky-wrapper'
  	 */
  var wrapperClassName: js.UndefOr[String] = js.native
  /**
  	 * Controls z-index of the sticked element.
  	 * @default inherit
  	 */
  var zIndex: js.UndefOr[String] = js.native
}

object JQueryStickyOptions {
  @scala.inline
  def apply(): JQueryStickyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryStickyOptions]
  }
  @scala.inline
  implicit class JQueryStickyOptionsOps[Self <: JQueryStickyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBottomSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottomSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomSpacing")(js.undefined)
        ret
    }
    @scala.inline
    def withCenter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withGetWidthFrom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWidthFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetWidthFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWidthFrom")(js.undefined)
        ret
    }
    @scala.inline
    def withResponsiveWidth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsiveWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponsiveWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsiveWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withTopSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topSpacing")(js.undefined)
        ret
    }
    @scala.inline
    def withWidthFromWrapper(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widthFromWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidthFromWrapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widthFromWrapper")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapperClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapperClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapperClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapperClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withZIndex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(js.undefined)
        ret
    }
  }
  
}

