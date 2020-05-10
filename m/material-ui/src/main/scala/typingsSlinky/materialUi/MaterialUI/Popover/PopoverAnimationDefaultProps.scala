package typingsSlinky.materialUi.MaterialUI.Popover

import typingsSlinky.materialUi.MaterialUI.propTypes.origin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopoverAnimationDefaultProps extends PopoverAnimationProps {
  var className: js.UndefOr[String] = js.native
  var targetOrigin: js.UndefOr[origin] = js.native
  var zDepth: js.UndefOr[Double] = js.native
}

object PopoverAnimationDefaultProps {
  @scala.inline
  def apply(open: Boolean): PopoverAnimationDefaultProps = {
    val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopoverAnimationDefaultProps]
  }
  @scala.inline
  implicit class PopoverAnimationDefaultPropsOps[Self <: PopoverAnimationDefaultProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetOrigin(value: origin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetOrigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetOrigin")(js.undefined)
        ret
    }
    @scala.inline
    def withZDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zDepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zDepth")(js.undefined)
        ret
    }
  }
  
}

