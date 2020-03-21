package typingsSlinky.reactRouterNavigationCore.mod

import slinky.core.TagMod
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabStackProps extends js.Object {
  var children: js.UndefOr[js.Array[TagMod[Any]]] = js.undefined
  var forceSync: js.UndefOr[Boolean] = js.undefined
  var `lazy`: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  def render(props: TabsRendererProps): TagMod[Any]
}

object TabStackProps {
  @scala.inline
  def apply(
    render: TabsRendererProps => TagMod[Any],
    children: js.Array[TagMod[Any]] = null,
    forceSync: js.UndefOr[Boolean] = js.undefined,
    `lazy`: js.UndefOr[Boolean] = js.undefined,
    style: StyleProp[ViewStyle] = null
  ): TabStackProps = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render))
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(forceSync)) __obj.updateDynamic("forceSync")(forceSync.asInstanceOf[js.Any])
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabStackProps]
  }
}

