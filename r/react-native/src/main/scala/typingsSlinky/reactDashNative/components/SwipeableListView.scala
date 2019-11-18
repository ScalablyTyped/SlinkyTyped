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
  override val component: String | js.Object = js.constructorOf[typingsSlinky.reactDashNative.reactDashNativeMod.SwipeableListView].asInstanceOf[String | js.Object]
  def apply(
    bounceFirstRowOnMount: Boolean,
    dataSource: SwipeableListViewDataSource,
    maxSwipeDistance: Double,
    renderQuickActions: (js.Any, Double, Double) => ReactElement,
    renderRow: (js.Any, Double, Double, Boolean) => ReactElement,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashNative.reactDashNativeMod.SwipeableListView] = {
    val __obj = js.Dynamic.literal(bounceFirstRowOnMount = bounceFirstRowOnMount.asInstanceOf[js.Any], dataSource = dataSource.asInstanceOf[js.Any], maxSwipeDistance = maxSwipeDistance.asInstanceOf[js.Any], renderQuickActions = js.Any.fromFunction3(renderQuickActions), renderRow = js.Any.fromFunction4(renderRow))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SwipeableListViewProps
}

