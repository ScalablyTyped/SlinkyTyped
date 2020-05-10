package typingsSlinky.reactVirtualized

import typingsSlinky.reactVirtualized.reactVirtualizedBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDisableHeight extends js.Object {
  var disableHeight: `false` = js.native
  var disableWidth: `false` = js.native
  def onResize(): Unit = js.native
}

object AnonDisableHeight {
  @scala.inline
  def apply(disableHeight: `false`, disableWidth: `false`, onResize: () => Unit): AnonDisableHeight = {
    val __obj = js.Dynamic.literal(disableHeight = disableHeight.asInstanceOf[js.Any], disableWidth = disableWidth.asInstanceOf[js.Any], onResize = js.Any.fromFunction0(onResize))
    __obj.asInstanceOf[AnonDisableHeight]
  }
  @scala.inline
  implicit class AnonDisableHeightOps[Self <: AnonDisableHeight] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisableHeight(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisableWidth(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnResize(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResize")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

