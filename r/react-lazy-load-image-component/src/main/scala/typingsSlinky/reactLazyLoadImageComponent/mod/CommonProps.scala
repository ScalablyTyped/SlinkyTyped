package typingsSlinky.reactLazyLoadImageComponent.mod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonProps extends js.Object {
  /** Function called after the image has been completely loaded. */
  var afterLoad: js.UndefOr[js.Function0[_]] = js.native
  /** Function called right before the placeholder is replaced with the image element. */
  var beforeLoad: js.UndefOr[js.Function0[_]] = js.native
  /* Method from lodash to use to delay the scroll/resize events. */
  var delayMethod: js.UndefOr[DelayMethod] = js.native
  /** Time in ms sent to the delayMethod. */
  var delayTime: js.UndefOr[Double] = js.native
  /** React element to use as a placeholder. Default is <span>. */
  var placeholder: js.UndefOr[ReactElement | Null] = js.native
  /** See trackWindowScroll(). */
  var scrollPosition: js.UndefOr[ScrollPosition] = js.native
  /** Threshold in pixels. So the image starts loading before it appears in the viewport. */
  var threshold: js.UndefOr[Double] = js.native
  /** Whether to use browser's IntersectionObserver when available. */
  var useIntersectionObserver: js.UndefOr[Boolean] = js.native
  /** Whether the image must be visible from the beginning. */
  var visibleByDefault: js.UndefOr[Boolean] = js.native
}

object CommonProps {
  @scala.inline
  def apply(): CommonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonProps]
  }
  @scala.inline
  implicit class CommonPropsOps[Self <: CommonProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterLoad(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterLoad")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAfterLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeLoad(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeLoad")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutBeforeLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withDelayMethod(value: DelayMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelayMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withDelayTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelayTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayTime")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholder(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholderNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(null)
        ret
    }
    @scala.inline
    def withScrollPosition(value: ScrollPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(js.undefined)
        ret
    }
    @scala.inline
    def withUseIntersectionObserver(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useIntersectionObserver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseIntersectionObserver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useIntersectionObserver")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibleByDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleByDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibleByDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleByDefault")(js.undefined)
        ret
    }
  }
  
}

