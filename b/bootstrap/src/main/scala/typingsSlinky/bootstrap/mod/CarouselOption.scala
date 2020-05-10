package typingsSlinky.bootstrap.mod

import typingsSlinky.bootstrap.bootstrapBooleans.`false`
import typingsSlinky.bootstrap.bootstrapStrings.carousel
import typingsSlinky.bootstrap.bootstrapStrings.hover
import typingsSlinky.bootstrap.bootstrapStrings.next
import typingsSlinky.bootstrap.bootstrapStrings.prev
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CarouselOption extends js.Object {
  /**
    * The amount of time to delay between automatically cycling an item. If false, carousel will not automatically cycle.
    *
    * @default 5000
    */
  var interval: js.UndefOr[`false` | Double] = js.native
  /**
    * Whether the carousel should react to keyboard events.
    *
    * @default true
    */
  var keyboard: js.UndefOr[Boolean] = js.native
  /**
    * If set to "hover", pauses the cycling of the carousel on `mouseenter` and resumes the cycling of the carousel on `mouseleave`.
    * If set to false, hovering over the carousel won't pause it.
    *
    * On touch-enabled devices, when set to "hover", cycling will pause on `touchend` (once the user finished interacting with the carousel)
    * for two intervals, before automatically resuming. Note that this is in addition to the above mouse behavior.
    *
    * @default "hover"
    */
  var pause: js.UndefOr[hover | `false`] = js.native
  /**
    * Autoplays the carousel after the user manually cycles the first item.
    * If `carousel`, autoplays the carousel on load.
    * @default false
    */
  var ride: js.UndefOr[carousel | Boolean] = js.native
  /**
    * Use to easily control the position of the carousel. It accepts the keywords prev or next, which alters the slide position
    * relative to its current position. Alternatively, use `data-slide-to` to pass a raw slide index to the carousel.
    *
    * @default false
    */
  var slide: js.UndefOr[next | prev | `false`] = js.native
  /**
    * Whether the carousel should support left/right swipe interactions on touchscreen devices.
    *
    * @default true
    */
  var touch: js.UndefOr[Boolean] = js.native
  /**
    * Whether the carousel should cycle continuously or have hard stops.
    *
    * @default true
    */
  var wrap: js.UndefOr[Boolean] = js.native
}

object CarouselOption {
  @scala.inline
  def apply(): CarouselOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CarouselOption]
  }
  @scala.inline
  implicit class CarouselOptionOps[Self <: CarouselOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInterval(value: `false` | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboard(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboard")(js.undefined)
        ret
    }
    @scala.inline
    def withPause(value: hover | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pause")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPause: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pause")(js.undefined)
        ret
    }
    @scala.inline
    def withRide(value: carousel | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ride")(js.undefined)
        ret
    }
    @scala.inline
    def withSlide(value: next | prev | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slide")(js.undefined)
        ret
    }
    @scala.inline
    def withTouch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touch")(js.undefined)
        ret
    }
    @scala.inline
    def withWrap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap")(js.undefined)
        ret
    }
  }
  
}

