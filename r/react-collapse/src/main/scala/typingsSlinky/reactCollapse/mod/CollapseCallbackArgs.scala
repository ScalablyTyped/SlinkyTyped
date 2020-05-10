package typingsSlinky.reactCollapse.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollapseCallbackArgs extends js.Object {
  /** current pixel height of Collapse container (changes until reaches `contentHeight`) */
  var containerHeight: Double = js.native
  /** determined height of supplied Content */
  var contentHeight: Double = js.native
  /** `true` only when Collapse is fully closed and height is zero */
  var isFullyClosed: Boolean = js.native
  /** `true` only when Collapse reached final height */
  var isFullyOpened: Boolean = js.native
  /** `true` if Collapse has any non-zero height */
  var isOpened: Boolean = js.native
}

object CollapseCallbackArgs {
  @scala.inline
  def apply(
    containerHeight: Double,
    contentHeight: Double,
    isFullyClosed: Boolean,
    isFullyOpened: Boolean,
    isOpened: Boolean
  ): CollapseCallbackArgs = {
    val __obj = js.Dynamic.literal(containerHeight = containerHeight.asInstanceOf[js.Any], contentHeight = contentHeight.asInstanceOf[js.Any], isFullyClosed = isFullyClosed.asInstanceOf[js.Any], isFullyOpened = isFullyOpened.asInstanceOf[js.Any], isOpened = isOpened.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollapseCallbackArgs]
  }
  @scala.inline
  implicit class CollapseCallbackArgsOps[Self <: CollapseCallbackArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainerHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsFullyClosed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFullyClosed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsFullyOpened(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFullyOpened")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsOpened(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpened")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

