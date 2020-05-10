package typingsSlinky.jqueryScrollto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollToOptions extends js.Object {
  /**
    * Which axis must be scrolled, use 'x', 'y', 'xy' or 'yx'.
    */
  var axis: js.UndefOr[String] = js.native
  /**
    * The OVERALL length of the animation.
    */
  var duration: js.UndefOr[js.Any] = js.native
  /**
    * The easing method for the animation.
    */
  var easing: js.UndefOr[String] = js.native
  /**
    * If true, the margin of the target element will be deducted from the final position.
    */
  var margin: js.UndefOr[Boolean] = js.native
  /**
    * Add/deduct from the end position. 
    * One number for both axes or { top:x, left:y }.
    */
  var offset: js.UndefOr[js.Any] = js.native
  /**
    * Function to be called after the scrolling ends. 
    */
  var onAfter: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    *  If queuing is activated, this function will be called after the first scrolling ends.
    */
  var onAfterFirst: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Add/deduct the height/width multiplied by 'over'.
    * Can be { top:x, left:y } when using both axes.
    */
  var over: js.UndefOr[js.Any] = js.native
  /**
    * If true, and both axis are given.
    * The 2nd axis will only be animated after the first one ends.
    */
  var queue: js.UndefOr[Boolean] = js.native
}

object ScrollToOptions {
  @scala.inline
  def apply(): ScrollToOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollToOptions]
  }
  @scala.inline
  implicit class ScrollToOptionsOps[Self <: ScrollToOptions] (val x: Self) extends AnyVal {
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
    def withDuration(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withEasing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAfter(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAfter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAfterFirst(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAfterFirst")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnAfterFirst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAfterFirst")(js.undefined)
        ret
    }
    @scala.inline
    def withOver(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("over")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("over")(js.undefined)
        ret
    }
    @scala.inline
    def withQueue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queue")(js.undefined)
        ret
    }
  }
  
}

