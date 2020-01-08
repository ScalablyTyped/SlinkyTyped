package typingsSlinky.reactDashNativeDashSortableDashGrid.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNative.reactDashNativeMod.StyleProp
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewStyle
import typingsSlinky.reactDashNativeDashSortableDashGrid.Anon_Transform
import typingsSlinky.reactDashNativeDashSortableDashGrid.reactDashNativeDashSortableDashGridMod.ItemOrder
import typingsSlinky.reactDashNativeDashSortableDashGrid.reactDashNativeDashSortableDashGridMod.OrderedItem
import typingsSlinky.reactDashNativeDashSortableDashGrid.reactDashNativeDashSortableDashGridMod.SortableGridProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashNativeDashSortableDashGrid
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("react-native-sortable-grid", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: onDragStart */
  def apply(
    activeBlockCenteringDuration: Int | Double = null,
    blockTransitionDuration: Int | Double = null,
    doubleTapTreshold: Int | Double = null,
    dragActivationThreshold: Int | Double = null,
    dragStartAnimation: Anon_Transform = null,
    itemHeight: Int | Double = null,
    itemWidth: Int | Double = null,
    itemsPerRow: Int | Double = null,
    onDeleteItem: /* deletedItem */ OrderedItem => Unit = null,
    onDragRelease: /* itemOrder */ ItemOrder => Unit = null,
    style: StyleProp[ViewStyle] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (activeBlockCenteringDuration != null) __obj.updateDynamic("activeBlockCenteringDuration")(activeBlockCenteringDuration.asInstanceOf[js.Any])
    if (blockTransitionDuration != null) __obj.updateDynamic("blockTransitionDuration")(blockTransitionDuration.asInstanceOf[js.Any])
    if (doubleTapTreshold != null) __obj.updateDynamic("doubleTapTreshold")(doubleTapTreshold.asInstanceOf[js.Any])
    if (dragActivationThreshold != null) __obj.updateDynamic("dragActivationThreshold")(dragActivationThreshold.asInstanceOf[js.Any])
    if (dragStartAnimation != null) __obj.updateDynamic("dragStartAnimation")(dragStartAnimation.asInstanceOf[js.Any])
    if (itemHeight != null) __obj.updateDynamic("itemHeight")(itemHeight.asInstanceOf[js.Any])
    if (itemWidth != null) __obj.updateDynamic("itemWidth")(itemWidth.asInstanceOf[js.Any])
    if (itemsPerRow != null) __obj.updateDynamic("itemsPerRow")(itemsPerRow.asInstanceOf[js.Any])
    if (onDeleteItem != null) __obj.updateDynamic("onDeleteItem")(js.Any.fromFunction1(onDeleteItem))
    if (onDragRelease != null) __obj.updateDynamic("onDragRelease")(js.Any.fromFunction1(onDragRelease))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, js.Object] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, js.Object](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = SortableGridProps
}

