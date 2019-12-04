package typingsSlinky.reactDashNative.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNative.reactDashNativeMod.SwipeableListViewDataSource
import typingsSlinky.reactDashNative.reactDashNativeMod.SwipeableListViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SwipeableListView
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashNative.reactDashNativeMod.SwipeableListView] {
  @JSImport("react-native", "SwipeableListView")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    bounceFirstRowOnMount: Boolean,
    dataSource: SwipeableListViewDataSource,
    maxSwipeDistance: Double,
    renderQuickActions: (js.Any, Double | String, Double | String) => ReactElement,
    renderRow: (js.Any, Double | String, Double | String, js.UndefOr[Boolean]) => ReactElement,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashNative.reactDashNativeMod.SwipeableListView] = {
    val __obj = js.Dynamic.literal(bounceFirstRowOnMount = bounceFirstRowOnMount.asInstanceOf[js.Any], dataSource = dataSource.asInstanceOf[js.Any], maxSwipeDistance = maxSwipeDistance.asInstanceOf[js.Any], renderQuickActions = js.Any.fromFunction3(renderQuickActions), renderRow = js.Any.fromFunction4(renderRow))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SwipeableListViewProps
}

