package typingsSlinky.materializeCss.M

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CarouselOptions extends js.Object {
  /**
    * Perspective zoom. If 0, all items are the same size
    * @default -100
    */
  var dist: Double = js.native
  /**
    * Transition duration in milliseconds
    * @default 200
    */
  var duration: Double = js.native
  /**
    * Make the carousel a full width slider like the second example
    * @default false
    */
  var fullWidth: Boolean = js.native
  /**
    * Set to true to show indicators
    * @default false
    */
  var indicators: Boolean = js.native
  /**
    * Don't wrap around and cycle through items
    * @default false
    */
  var noWrap: Boolean = js.native
  /**
    * Set the number of visible items
    * @default 5
    */
  var numVisible: Double = js.native
  /**
    * Set the padding between non center items
    * @default 0
    */
  var padding: Double = js.native
  /**
    * Set the spacing of the center item
    * @default 0
    */
  var shift: Double = js.native
  /**
    * Callback for when a new slide is cycled to
    * @default null
    */
  def onCycleTo(current: Element, dragged: Boolean): Unit = js.native
}

object CarouselOptions {
  @scala.inline
  def apply(
    dist: Double,
    duration: Double,
    fullWidth: Boolean,
    indicators: Boolean,
    noWrap: Boolean,
    numVisible: Double,
    onCycleTo: (Element, Boolean) => Unit,
    padding: Double,
    shift: Double
  ): CarouselOptions = {
    val __obj = js.Dynamic.literal(dist = dist.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], fullWidth = fullWidth.asInstanceOf[js.Any], indicators = indicators.asInstanceOf[js.Any], noWrap = noWrap.asInstanceOf[js.Any], numVisible = numVisible.asInstanceOf[js.Any], onCycleTo = js.Any.fromFunction2(onCycleTo), padding = padding.asInstanceOf[js.Any], shift = shift.asInstanceOf[js.Any])
    __obj.asInstanceOf[CarouselOptions]
  }
  @scala.inline
  implicit class CarouselOptionsOps[Self <: CarouselOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDist(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullWidth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndicators(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoWrap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumVisible(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnCycleTo(value: (Element, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCycleTo")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShift(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shift")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

