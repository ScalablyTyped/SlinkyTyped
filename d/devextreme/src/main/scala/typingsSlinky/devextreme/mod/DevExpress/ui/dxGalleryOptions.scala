package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.mod.DevExpress.data.DataSource
import typingsSlinky.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxGalleryOptions extends CollectionWidgetOptions[dxGallery] {
  /** The time, in milliseconds, spent on slide animation. */
  var animationDuration: js.UndefOr[Double] = js.native
  /** Specifies whether or not to animate the displayed item change. */
  var animationEnabled: js.UndefOr[Boolean] = js.native
  /** Binds the widget to data. */
  @JSName("dataSource")
  var dataSource_dxGalleryOptions: js.UndefOr[String | (js.Array[String | dxGalleryItem | _]) | DataSource | DataSourceOptions] = js.native
  /** A Boolean value specifying whether or not to allow users to switch between items by clicking an indicator. */
  var indicatorEnabled: js.UndefOr[Boolean] = js.native
  /** Specifies the width of an area used to display a single image. */
  var initialItemWidth: js.UndefOr[Double] = js.native
  /** An array of items displayed by the widget. */
  @JSName("items")
  var items_dxGalleryOptions: js.UndefOr[js.Array[String | dxGalleryItem | _]] = js.native
  /** A Boolean value specifying whether or not to scroll back to the first item after the last item is swiped. */
  var loop: js.UndefOr[Boolean] = js.native
  /** A Boolean value specifying whether or not to display an indicator that points to the selected gallery item. */
  var showIndicator: js.UndefOr[Boolean] = js.native
  /** A Boolean value that specifies the availability of the "Forward" and "Back" navigation buttons. */
  var showNavButtons: js.UndefOr[Boolean] = js.native
  /** The time interval in milliseconds, after which the gallery switches to the next item. */
  var slideshowDelay: js.UndefOr[Double] = js.native
  /** Specifies if the widget stretches images to fit the total gallery width. */
  var stretchImages: js.UndefOr[Boolean] = js.native
  /** A Boolean value specifying whether or not to allow users to switch between items by swiping. */
  var swipeEnabled: js.UndefOr[Boolean] = js.native
  /** Specifies whether or not to display parts of previous and next images along the sides of the current image. */
  var wrapAround: js.UndefOr[Boolean] = js.native
}

object dxGalleryOptions {
  @scala.inline
  def apply(): dxGalleryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxGalleryOptions]
  }
  @scala.inline
  implicit class dxGalleryOptionsOps[Self <: dxGalleryOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimationDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSource(value: String | (js.Array[String | dxGalleryItem | _]) | DataSource | DataSourceOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(js.undefined)
        ret
    }
    @scala.inline
    def withIndicatorEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicatorEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndicatorEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicatorEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialItemWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialItemWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialItemWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialItemWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: js.Array[String | dxGalleryItem | _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withLoop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(js.undefined)
        ret
    }
    @scala.inline
    def withShowIndicator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showIndicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowIndicator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showIndicator")(js.undefined)
        ret
    }
    @scala.inline
    def withShowNavButtons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNavButtons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowNavButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNavButtons")(js.undefined)
        ret
    }
    @scala.inline
    def withSlideshowDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideshowDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlideshowDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideshowDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withStretchImages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stretchImages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStretchImages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stretchImages")(js.undefined)
        ret
    }
    @scala.inline
    def withSwipeEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwipeEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeEnabled")(js.undefined)
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

