package typingsSlinky.packery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PackeryOptions extends js.Object {
  /**
    * [columnWidth The width of a column of a horizontal grid. When set, Packery will align item elements horizontally to this grid]
    * @type {number}
    */
  var columnWidth: js.UndefOr[Double] = js.native
  /**
    * [containerStyle CSS styles that are applied to the container element. To disable Packery from setting any CSS to the container element, set containerStyle: null]
    * @type {Object}
    */
  var containerStyle: js.UndefOr[js.Object] = js.native
  /**
    * [gutter The space between item elements, both vertically and horizontally]
    * @type {number}
    */
  var gutter: js.UndefOr[Double] = js.native
  /**
    * [isHorizontal Arranges items horizontally instead of vertically]
    * @type {boolean}
    */
  var isHorizontal: js.UndefOr[Boolean] = js.native
  /**
    * [isInitLayout Enables layout on initialization. Set this to false to disable layout on initialization, so you can use methods or add events before the initial layout]
    * @type {boolean}
    */
  var isInitLayout: js.UndefOr[Boolean] = js.native
  /**
    * [isOriginLeft Controls the horizontal flow of the layout. By default, item elements start positioning at the left. Set to false for right-to-left layouts]
    * @type {boolean}
    */
  var isOriginLeft: js.UndefOr[Boolean] = js.native
  /**
    * [isOriginTop Controls the vertical flow of the layout. By default, item elements start positioning at the top. Set to false for bottom-up layouts. It’s like Tetris!]
    * @type {boolean}
    */
  var isOriginTop: js.UndefOr[Boolean] = js.native
  /**
    * [isResizeBound Binds layout to window resizing]
    * @type {boolean}
    */
  var isResizeBound: js.UndefOr[Boolean] = js.native
  /**
    * [itemSelector Specifies which child elements to be used as item elements. Setting itemSelector is always recommended. itemSelector is useful to exclude sizing elements]
    * @type {string}
    */
  var itemSelector: js.UndefOr[String] = js.native
  /**
    * [percentPosition Will set item position in percent values, rather than pixel values. percentPosition works well with percent-width items, as items will not transition their position on resize]
    * @type {boolean}
    */
  var percentPosition: js.UndefOr[Boolean] = js.native
  /**
    * [rowHeight Height of a row of a vertical grid. When set, Packery will align item elements vertically to this grid]
    * @type {number}
    */
  var rowHeight: js.UndefOr[Double] = js.native
  /**
    * [stamp Specifies which elements are stamped within the layout. These are special layout elements which will not be laid out by Packery. Rather, Packery will layout item elements around stamped elements]
    * @type {string}
    */
  var stamp: js.UndefOr[String] = js.native
  /**
    * [transitionDuration The time duration of transitions for item elements]
    * @type {string}
    */
  var transitionDuration: js.UndefOr[String] = js.native
}

object PackeryOptions {
  @scala.inline
  def apply(): PackeryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PackeryOptions]
  }
  @scala.inline
  implicit class PackeryOptionsOps[Self <: PackeryOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withGutter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gutter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGutter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gutter")(js.undefined)
        ret
    }
    @scala.inline
    def withIsHorizontal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHorizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsHorizontal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHorizontal")(js.undefined)
        ret
    }
    @scala.inline
    def withIsInitLayout(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInitLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsInitLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInitLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withIsOriginLeft(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOriginLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsOriginLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOriginLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withIsOriginTop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOriginTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsOriginTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOriginTop")(js.undefined)
        ret
    }
    @scala.inline
    def withIsResizeBound(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isResizeBound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsResizeBound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isResizeBound")(js.undefined)
        ret
    }
    @scala.inline
    def withItemSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withPercentPosition(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPercentPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withRowHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withStamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stamp")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionDuration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionDuration")(js.undefined)
        ret
    }
  }
  
}

