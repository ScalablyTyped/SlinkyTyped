package typingsSlinky.rmcPullToRefresh.components

import slinky.core.TagMod
import typingsSlinky.rmcPullToRefresh.mod.default
import typingsSlinky.rmcPullToRefresh.propsTypeMod.Indicator
import typingsSlinky.rmcPullToRefresh.propsTypeMod.PropsType
import typingsSlinky.rmcPullToRefresh.rmcPullToRefreshStrings.down
import typingsSlinky.rmcPullToRefresh.rmcPullToRefreshStrings.up
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Lib {
  @JSImport("rmc-pull-to-refresh/lib", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: PropsType): SharedBuilder_PropsType_974277609[default] = new SharedBuilder_PropsType_974277609[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    damping: Double,
    direction: down | up,
    distanceToRefresh: Double,
    getScrollContainer: () => TagMod[Any],
    indicator: Indicator,
    onRefresh: () => Unit
  ): SharedBuilder_PropsType_974277609[default] = {
    val __props = js.Dynamic.literal(damping = damping.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], distanceToRefresh = distanceToRefresh.asInstanceOf[js.Any], getScrollContainer = js.Any.fromFunction0(getScrollContainer), indicator = indicator.asInstanceOf[js.Any], onRefresh = js.Any.fromFunction0(onRefresh))
    new SharedBuilder_PropsType_974277609[default](js.Array(this.component, __props.asInstanceOf[PropsType]))
  }
}

