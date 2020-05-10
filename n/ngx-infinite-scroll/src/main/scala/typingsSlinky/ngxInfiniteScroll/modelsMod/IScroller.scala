package typingsSlinky.ngxInfiniteScroll.modelsMod

import typingsSlinky.angularCore.mod.ElementRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IScroller extends js.Object {
  var alwaysCallback: Boolean = js.native
  var disable: Boolean = js.native
  var downDistance: Double = js.native
  var element: ElementRef[_] = js.native
  var fromRoot: Boolean = js.native
  var horizontal: Boolean = js.native
  var scrollContainer: String | ElementRef[_] = js.native
  var scrollWindow: Boolean = js.native
  var throttle: Double = js.native
  var upDistance: Double = js.native
}

object IScroller {
  @scala.inline
  def apply(
    alwaysCallback: Boolean,
    disable: Boolean,
    downDistance: Double,
    element: ElementRef[_],
    fromRoot: Boolean,
    horizontal: Boolean,
    scrollContainer: String | ElementRef[_],
    scrollWindow: Boolean,
    throttle: Double,
    upDistance: Double
  ): IScroller = {
    val __obj = js.Dynamic.literal(alwaysCallback = alwaysCallback.asInstanceOf[js.Any], disable = disable.asInstanceOf[js.Any], downDistance = downDistance.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fromRoot = fromRoot.asInstanceOf[js.Any], horizontal = horizontal.asInstanceOf[js.Any], scrollContainer = scrollContainer.asInstanceOf[js.Any], scrollWindow = scrollWindow.asInstanceOf[js.Any], throttle = throttle.asInstanceOf[js.Any], upDistance = upDistance.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScroller]
  }
  @scala.inline
  implicit class IScrollerOps[Self <: IScroller] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlwaysCallback(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDownDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElement(value: ElementRef[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFromRoot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHorizontal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollContainer(value: String | ElementRef[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollWindow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThrottle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upDistance")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

