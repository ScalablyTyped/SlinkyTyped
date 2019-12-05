package typingsSlinky.reactDashInfiniteDashScrollDashComponent.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashInfiniteDashScrollDashComponent.reactDashInfiniteDashScrollDashComponentMod.InfiniteScrollProps
import typingsSlinky.reactDashInfiniteDashScrollDashComponent.reactDashInfiniteDashScrollDashComponentMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashInfiniteDashScrollDashComponent
  extends ExternalComponentWithAttributesWithRefType[tag.type, ^] {
  @JSImport("react-infinite-scroll-component", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    dataLength: Double,
    hasMore: Boolean,
    loader: TagMod[Any],
    next: () => Unit,
    endMessage: TagMod[Any] = null,
    hasChildren: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    initialScrollY: Int | Double = null,
    onScroll: () => Unit = null,
    pullDownToRefresh: js.UndefOr[Boolean] = js.undefined,
    pullDownToRefreshContent: TagMod[Any] = null,
    pullDownToRefreshThreshold: Int | Double = null,
    refreshFunction: () => Unit = null,
    releaseToRefreshContent: TagMod[Any] = null,
    scrollThreshold: Double | String = null,
    scrollableTarget: TagMod[Any] | String = null,
    style: js.Any = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ^] = {
    val __obj = js.Dynamic.literal(dataLength = dataLength.asInstanceOf[js.Any], hasMore = hasMore.asInstanceOf[js.Any], loader = loader.asInstanceOf[js.Any], next = js.Any.fromFunction0(next))
    if (endMessage != null) __obj.updateDynamic("endMessage")(endMessage.asInstanceOf[js.Any])
    if (!js.isUndefined(hasChildren)) __obj.updateDynamic("hasChildren")(hasChildren.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (initialScrollY != null) __obj.updateDynamic("initialScrollY")(initialScrollY.asInstanceOf[js.Any])
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction0(onScroll))
    if (!js.isUndefined(pullDownToRefresh)) __obj.updateDynamic("pullDownToRefresh")(pullDownToRefresh.asInstanceOf[js.Any])
    if (pullDownToRefreshContent != null) __obj.updateDynamic("pullDownToRefreshContent")(pullDownToRefreshContent.asInstanceOf[js.Any])
    if (pullDownToRefreshThreshold != null) __obj.updateDynamic("pullDownToRefreshThreshold")(pullDownToRefreshThreshold.asInstanceOf[js.Any])
    if (refreshFunction != null) __obj.updateDynamic("refreshFunction")(js.Any.fromFunction0(refreshFunction))
    if (releaseToRefreshContent != null) __obj.updateDynamic("releaseToRefreshContent")(releaseToRefreshContent.asInstanceOf[js.Any])
    if (scrollThreshold != null) __obj.updateDynamic("scrollThreshold")(scrollThreshold.asInstanceOf[js.Any])
    if (scrollableTarget != null) __obj.updateDynamic("scrollableTarget")(scrollableTarget.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = InfiniteScrollProps
}

