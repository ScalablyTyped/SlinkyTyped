package typingsSlinky.rmcPullToRefresh.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.rmcPullToRefresh.propsTypeMod.Indicator
import typingsSlinky.rmcPullToRefresh.propsTypeMod.PropsType
import typingsSlinky.rmcPullToRefresh.rmcPullToRefreshStrings.down
import typingsSlinky.rmcPullToRefresh.rmcPullToRefreshStrings.up
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_PropsType_137930963[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
  /* The following DOM/SVG props were specified: className, style */
  def apply(
    damping: Double,
    direction: down | up,
    distanceToRefresh: Double,
    getScrollContainer: () => TagMod[Any],
    indicator: Indicator,
    onRefresh: () => Unit,
    prefixCls: String = null,
    refreshing: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ComponentRef] = {
    val __obj = js.Dynamic.literal(damping = damping.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], distanceToRefresh = distanceToRefresh.asInstanceOf[js.Any], getScrollContainer = js.Any.fromFunction0(getScrollContainer), indicator = indicator.asInstanceOf[js.Any], onRefresh = js.Any.fromFunction0(onRefresh))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(refreshing)) __obj.updateDynamic("refreshing")(refreshing.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = PropsType
}

