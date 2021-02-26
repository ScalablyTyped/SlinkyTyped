package typingsSlinky.reactNative.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactNative.mod.SwipeableListViewDataSource
import typingsSlinky.reactNative.mod.SwipeableListViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SwipeableListView {
  
  @scala.inline
  def apply(
    bounceFirstRowOnMount: Boolean,
    dataSource: SwipeableListViewDataSource,
    maxSwipeDistance: Double,
    renderQuickActions: (js.Any, Double | String, Double | String) => ReactElement,
    renderRow: (js.Any, Double | String, Double | String, js.UndefOr[Boolean]) => ReactElement
  ): Default[tag.type, typingsSlinky.reactNative.mod.SwipeableListView] = {
    val __props = js.Dynamic.literal(bounceFirstRowOnMount = bounceFirstRowOnMount.asInstanceOf[js.Any], dataSource = dataSource.asInstanceOf[js.Any], maxSwipeDistance = maxSwipeDistance.asInstanceOf[js.Any], renderQuickActions = js.Any.fromFunction3(renderQuickActions), renderRow = js.Any.fromFunction4(renderRow))
    new Default[tag.type, typingsSlinky.reactNative.mod.SwipeableListView](js.Array(this.component, __props.asInstanceOf[SwipeableListViewProps]))
  }
  
  @JSImport("react-native", "SwipeableListView")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: SwipeableListViewProps): Default[tag.type, typingsSlinky.reactNative.mod.SwipeableListView] = new Default[tag.type, typingsSlinky.reactNative.mod.SwipeableListView](js.Array(this.component, p.asInstanceOf[js.Any]))
}
