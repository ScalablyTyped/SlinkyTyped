package typingsSlinky.rmcPullToRefresh.components

import slinky.core.facade.ReactElement
import typingsSlinky.rmcPullToRefresh.mod.default
import typingsSlinky.rmcPullToRefresh.propsTypeMod.Indicator
import typingsSlinky.rmcPullToRefresh.propsTypeMod.PropsType
import typingsSlinky.rmcPullToRefresh.rmcPullToRefreshStrings.down
import typingsSlinky.rmcPullToRefresh.rmcPullToRefreshStrings.up
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RmcPullToRefresh {
  
  @scala.inline
  def apply(
    direction: down | up,
    distanceToRefresh: Double,
    getScrollContainer: () => ReactElement,
    indicator: Indicator,
    onRefresh: () => Unit
  ): SharedBuilder_PropsType_974277609[default] = {
    val __props = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], distanceToRefresh = distanceToRefresh.asInstanceOf[js.Any], getScrollContainer = js.Any.fromFunction0(getScrollContainer), indicator = indicator.asInstanceOf[js.Any], onRefresh = js.Any.fromFunction0(onRefresh))
    new SharedBuilder_PropsType_974277609[default](js.Array(this.component, __props.asInstanceOf[PropsType]))
  }
  
  @JSImport("rmc-pull-to-refresh", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: PropsType): SharedBuilder_PropsType_974277609[default] = new SharedBuilder_PropsType_974277609[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
