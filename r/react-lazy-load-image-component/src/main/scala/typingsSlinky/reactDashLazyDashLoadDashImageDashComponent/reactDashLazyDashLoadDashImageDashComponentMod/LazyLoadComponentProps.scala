package typingsSlinky.reactDashLazyDashLoadDashImageDashComponent.reactDashLazyDashLoadDashImageDashComponentMod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LazyLoadComponentProps extends CommonProps {
  var children: TagMod[Any]
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object LazyLoadComponentProps {
  @scala.inline
  def apply(
    children: TagMod[Any],
    afterLoad: () => _ = null,
    beforeLoad: () => _ = null,
    delayMethod: DelayMethod = null,
    delayTime: Int | Double = null,
    placeholder: ReactElement = null,
    scrollPosition: ScrollPosition = null,
    style: CSSProperties = null,
    threshold: Int | Double = null,
    useIntersectionObserver: js.UndefOr[Boolean] = js.undefined,
    visibleByDefault: js.UndefOr[Boolean] = js.undefined
  ): LazyLoadComponentProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (afterLoad != null) __obj.updateDynamic("afterLoad")(js.Any.fromFunction0(afterLoad))
    if (beforeLoad != null) __obj.updateDynamic("beforeLoad")(js.Any.fromFunction0(beforeLoad))
    if (delayMethod != null) __obj.updateDynamic("delayMethod")(delayMethod.asInstanceOf[js.Any])
    if (delayTime != null) __obj.updateDynamic("delayTime")(delayTime.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (scrollPosition != null) __obj.updateDynamic("scrollPosition")(scrollPosition.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    if (!js.isUndefined(useIntersectionObserver)) __obj.updateDynamic("useIntersectionObserver")(useIntersectionObserver.asInstanceOf[js.Any])
    if (!js.isUndefined(visibleByDefault)) __obj.updateDynamic("visibleByDefault")(visibleByDefault.asInstanceOf[js.Any])
    __obj.asInstanceOf[LazyLoadComponentProps]
  }
}

