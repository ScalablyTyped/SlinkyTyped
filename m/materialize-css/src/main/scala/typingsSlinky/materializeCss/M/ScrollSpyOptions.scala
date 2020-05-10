package typingsSlinky.materializeCss.M

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollSpyOptions extends js.Object {
  /**
    * Class applied to active elements
    * @default 'active'
    */
  var activeClass: String = js.native
  /**
    * Offset for centering element when scrolled to
    * @default 200
    */
  var scrollOffset: Double = js.native
  /**
    * Throttle of scroll handler
    * @default 100
    */
  var throttle: Double = js.native
  /**
    * Used to find active element
    * @default id => 'a[href="#' + id + '"]'
    */
  def getActiveElement(id: String): String = js.native
}

object ScrollSpyOptions {
  @scala.inline
  def apply(activeClass: String, getActiveElement: String => String, scrollOffset: Double, throttle: Double): ScrollSpyOptions = {
    val __obj = js.Dynamic.literal(activeClass = activeClass.asInstanceOf[js.Any], getActiveElement = js.Any.fromFunction1(getActiveElement), scrollOffset = scrollOffset.asInstanceOf[js.Any], throttle = throttle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollSpyOptions]
  }
  @scala.inline
  implicit class ScrollSpyOptionsOps[Self <: ScrollSpyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetActiveElement(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActiveElement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withScrollOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThrottle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

