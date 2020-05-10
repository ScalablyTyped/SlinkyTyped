package typingsSlinky.flickity.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.flickity.AnonX0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Enable keyboard navigation. Users can tab to a Flickity gallery, and pressing left & right keys to change cells.
    *
    * default: true
    */
  var accessibility: js.UndefOr[Boolean] = js.native
  /**
    * Changes height of carousel to fit height of selected slide.
    */
  var adaptiveHeight: js.UndefOr[Boolean] = js.native
  /**
    * Draws the shape of the arrows in the previous & next buttons.
    * javascript dictionary of points or path to SVG file
    */
  var arrowShape: js.UndefOr[String | AnonX0] = js.native
  /**
    * Use one Flickity gallery as navigation for another.
    *
    * default: disabled
    */
  var asNavFor: js.UndefOr[String | HTMLElement] = js.native
  /**
    * Automatically advances to the next cell.
    *
    * default: false
    */
  var autoPlay: js.UndefOr[Boolean | Double] = js.native
  /**
    * Loads cell background image when a cell is selected.
    * Set the background image's URL to load with the `data-flickity-bg-lazyload` attribute.
    * If set to `true`, lazyloads background image in selected slide
    * If set to a number n, load background images in selected slide and next n slides and previous n slides.
    * bgLazyLoad requires the flickity-bg-lazyload package. This package is not included and must be installed separately.
    */
  var bgLazyLoad: js.UndefOr[Boolean | Double] = js.native
  /**
    * Align cells within the gallery element.
    * opttions: 'left', 'center', 'right'
    *
    * default: 'center'
    */
  var cellAlign: js.UndefOr[String] = js.native
  /**
    * Specify selector for cell elements. cellSelector is useful if you have other elements in your gallery elements that are not cells.
    *
    * default: '.gallery-cell'
    */
  var cellSelector: js.UndefOr[String] = js.native
  /**
    * Contains cells to gallery element to prevent excess scroll at beginning or end. Has no effect if wrapAround is enabled
    *
    * default: true
    */
  var contain: js.UndefOr[Boolean] = js.native
  /**
    * The number of pixels a mouse or touch has to move before dragging begins. Increase dragThreshold to allow for more wiggle room for vertical page scrolling on touch devices.
    *
    * default: 3
    */
  var dragThreshold: js.UndefOr[Double] = js.native
  /**
    * Enables dragging and flicking
    *
    * default: true
    */
  var draggable: js.UndefOr[Boolean] = js.native
  /**
    * Enables content to be freely scrolled and flicked without aligning cells to an end position.
    * Enable freeScroll and wrapAround and you can flick forever, man.
    *
    * default: false
    */
  var freeScroll: js.UndefOr[Boolean] = js.native
  /**
    * Slows movement of slider when freeScroll: true. Higher friction makes the slider feel stickier. Lower friction makes the slider feel looser.
    *
    * default: 0.075
    */
  var freeScrollFriction: js.UndefOr[Double] = js.native
  /**
    * Friction slows the movement of slider. Higher friction makes the slider feel stickier and less bouncy. Lower friction makes the slider feel looser and more wobbly.
    *
    * default: 0.28
    */
  var friction: js.UndefOr[Double] = js.native
  /**
    * Groups cells together in slides. Flicking, page dots, and previous/next buttons are mapped to group slides, not individual cells.
    * `is-selected` class is added to the multiple cells in the selected slide.
    * If set to true, group cells that fit in carousel viewport.
    * If set to a number, group cells by that number.
    * If set to a percent string, group cells that fit in the percent of the width of the carousel viewport.
    */
  var groupCells: js.UndefOr[Boolean | Double | String] = js.native
  /**
    * Enables hash navigation to select slides with links and URLs.
    * default: false
    */
  var hash: js.UndefOr[Boolean] = js.native
  /**
    * Unloaded images have no size, which can throw off cell positions. To fix this, the imagesLoaded option re-positions cells once their images have loaded.
    *
    * default: true
    */
  var imagesLoaded: js.UndefOr[Boolean] = js.native
  /**
    * Zero-based index of the initial selected cell.
    */
  var initialIndex: js.UndefOr[Double] = js.native
  /**
    * Loads cell images when a cell is selected.
    * Set the image's URL to load with the `data-flickity-lazyload` attribute.
    * If set to `true`, lazyloads image in selected slide
    * If set to a number n, load images in selected slide and next n slides and previous n slides.
    *
    * default: false
    */
  var lazyLoad: js.UndefOr[Boolean | Double] = js.native
  /**
    * Bind events within Flickity's options by setting on to an Object. The object's keys should match the event names. on is useful for capturing events as Flickity is initialized, like ready
    */
  var on: js.UndefOr[EventBindings] = js.native
  /**
    * Creates and enables paging dots.
    *
    * default: true
    */
  var pageDots: js.UndefOr[Boolean] = js.native
  /**
    * Sets positioning in percent values, rather than pixel values. If your cells do not have percent widths, we recommended percentPosition: false.
    *
    * default: false
    */
  var percentPosition: js.UndefOr[Boolean] = js.native
  /**
    * Creates and enables previous & next buttons.
    *
    * default: true
    */
  var prevNextButtons: js.UndefOr[Boolean] = js.native
  /**
    * Adjusts sizes and positions when window is resized.
    *
    * default: true
    */
  var resize: js.UndefOr[Boolean] = js.native
  /**
    * Enables right-to-left layout.
    *
    * default: false
    */
  var rightToLeft: js.UndefOr[Boolean] = js.native
  /**
    * selectedAttraction attracts the position of the slider to the selected cell. Higher attraction makes the slider move faster. Lower makes it move slower.
    *
    * default: 0.025
    */
  var selectedAttraction: js.UndefOr[Double] = js.native
  /**
    * Sets the height of the gallery to the height of the tallest cell.  Set to  false if you prefer to size the gallery with CSS, rather than using the size of cells.
    *
    * default: true
    */
  var setGallerySize: js.UndefOr[Boolean] = js.native
  /**
    * You can enable and disable Flickity with CSS. watchCSS option watches the content of :after of the gallery element. Flickity is enabled if :after content is 'flickity'.
    * note: IE8 and Android 2.3 do not support watching :after. Flickity will be disabled when watchCSS: true. Set watchCSS: 'fallbackOn' to enable Flickity for these browsers.
    *
    * default: false
    */
  var watchCSS: js.UndefOr[Boolean | String] = js.native
  /**
    * At the end of cells, wrap-around to the other end for infinite scrolling.
    *
    * default: false
    */
  var wrapAround: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessibility(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibility")(js.undefined)
        ret
    }
    @scala.inline
    def withAdaptiveHeight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adaptiveHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdaptiveHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adaptiveHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withArrowShape(value: String | AnonX0): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowShape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowShape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowShape")(js.undefined)
        ret
    }
    @scala.inline
    def withAsNavForHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asNavFor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAsNavFor(value: String | HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asNavFor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsNavFor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asNavFor")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoPlay(value: Boolean | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoPlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPlay")(js.undefined)
        ret
    }
    @scala.inline
    def withBgLazyLoad(value: Boolean | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgLazyLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBgLazyLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgLazyLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withCellAlign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withCellSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withContain(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contain")(js.undefined)
        ret
    }
    @scala.inline
    def withDragThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withDraggable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(js.undefined)
        ret
    }
    @scala.inline
    def withFreeScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freeScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFreeScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freeScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withFreeScrollFriction(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freeScrollFriction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFreeScrollFriction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freeScrollFriction")(js.undefined)
        ret
    }
    @scala.inline
    def withFriction(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFriction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friction")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupCells(value: Boolean | Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupCells")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupCells: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupCells")(js.undefined)
        ret
    }
    @scala.inline
    def withHash(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(js.undefined)
        ret
    }
    @scala.inline
    def withImagesLoaded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imagesLoaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImagesLoaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imagesLoaded")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withLazyLoad(value: Boolean | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazyLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLazyLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazyLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withOn(value: EventBindings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.undefined)
        ret
    }
    @scala.inline
    def withPageDots(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageDots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageDots: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageDots")(js.undefined)
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
    def withPrevNextButtons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevNextButtons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevNextButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevNextButtons")(js.undefined)
        ret
    }
    @scala.inline
    def withResize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(js.undefined)
        ret
    }
    @scala.inline
    def withRightToLeft(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightToLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightToLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightToLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedAttraction(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedAttraction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedAttraction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedAttraction")(js.undefined)
        ret
    }
    @scala.inline
    def withSetGallerySize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setGallerySize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetGallerySize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setGallerySize")(js.undefined)
        ret
    }
    @scala.inline
    def withWatchCSS(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchCSS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatchCSS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchCSS")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapAround(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapAround")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapAround: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapAround")(js.undefined)
        ret
    }
  }
  
}

