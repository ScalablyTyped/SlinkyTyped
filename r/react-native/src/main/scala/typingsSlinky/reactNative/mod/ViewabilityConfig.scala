package typingsSlinky.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewabilityConfig extends js.Object {
  /**
    * Similar to `viewAreaCoveragePercentThreshold`, but considers the percent of the item that is visible,
    * rather than the fraction of the viewable area it covers.
    */
  var itemVisiblePercentThreshold: js.UndefOr[Double] = js.native
  /**
    * Minimum amount of time (in milliseconds) that an item must be physically viewable before the
    * viewability callback will be fired. A high number means that scrolling through content without
    * stopping will not mark the content as viewable.
    */
  var minimumViewTime: js.UndefOr[Double] = js.native
  /**
    * Percent of viewport that must be covered for a partially occluded item to count as
    * "viewable", 0-100. Fully visible items are always considered viewable. A value of 0 means
    * that a single pixel in the viewport makes the item viewable, and a value of 100 means that
    * an item must be either entirely visible or cover the entire viewport to count as viewable.
    */
  var viewAreaCoveragePercentThreshold: js.UndefOr[Double] = js.native
  /**
    * Nothing is considered viewable until the user scrolls or `recordInteraction` is called after
    * render.
    */
  var waitForInteraction: js.UndefOr[Boolean] = js.native
}

object ViewabilityConfig {
  @scala.inline
  def apply(): ViewabilityConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewabilityConfig]
  }
  @scala.inline
  implicit class ViewabilityConfigOps[Self <: ViewabilityConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItemVisiblePercentThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemVisiblePercentThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemVisiblePercentThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemVisiblePercentThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumViewTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumViewTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumViewTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumViewTime")(js.undefined)
        ret
    }
    @scala.inline
    def withViewAreaCoveragePercentThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewAreaCoveragePercentThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewAreaCoveragePercentThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewAreaCoveragePercentThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitForInteraction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForInteraction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitForInteraction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForInteraction")(js.undefined)
        ret
    }
  }
  
}

