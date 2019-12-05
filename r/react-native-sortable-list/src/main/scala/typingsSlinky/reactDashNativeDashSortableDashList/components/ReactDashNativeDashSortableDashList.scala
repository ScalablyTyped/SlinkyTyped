package typingsSlinky.reactDashNativeDashSortableDashList.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNative.reactDashNativeMod.StyleProp
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewStyle
import typingsSlinky.reactDashNativeDashSortableDashList.reactDashNativeDashSortableDashListMod.DataByNumber
import typingsSlinky.reactDashNativeDashSortableDashList.reactDashNativeDashSortableDashListMod.DataByString
import typingsSlinky.reactDashNativeDashSortableDashList.reactDashNativeDashSortableDashListMod.RowProps
import typingsSlinky.reactDashNativeDashSortableDashList.reactDashNativeDashSortableDashListMod.SortableListProps
import typingsSlinky.reactDashNativeDashSortableDashList.reactDashNativeDashSortableDashListMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashNativeDashSortableDashList
  extends ExternalComponentWithAttributesWithRefType[tag.type, default[js.Any, js.Any]] {
  @JSImport("react-native-sortable-list", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply[T, K](
    data: DataByNumber[T] | DataByString[T],
    renderRow: RowProps[T, K] => ReactElement | Null,
    autoscrollAreaSize: Int | Double = null,
    contentContainerStyle: StyleProp[ViewStyle] = null,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    innerContainerStyle: StyleProp[ViewStyle] = null,
    manuallyActivateRows: js.UndefOr[Boolean] = js.undefined,
    onActivateRow: K => Unit = null,
    onChangeOrder: /* nextOrder */ js.Array[K] => Unit = null,
    onPressRow: K => Unit = null,
    onReleaseRow: (K, /* currentOrder */ js.Array[K]) => Unit = null,
    order: js.Array[K] = null,
    refreshControl: ReactElement = null,
    renderFooter: () => ReactElement = null,
    renderHeader: () => ReactElement = null,
    rowActivationTime: Int | Double = null,
    scrollEnabled: js.UndefOr[Boolean] = js.undefined,
    showsHorizontalScrollIndicator: js.UndefOr[Boolean] = js.undefined,
    showsVerticalScrollIndicator: js.UndefOr[Boolean] = js.undefined,
    sortingEnabled: js.UndefOr[Boolean] = js.undefined,
    style: StyleProp[ViewStyle] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default[js.Any, js.Any]] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], renderRow = js.Any.fromFunction1(renderRow))
    if (autoscrollAreaSize != null) __obj.updateDynamic("autoscrollAreaSize")(autoscrollAreaSize.asInstanceOf[js.Any])
    if (contentContainerStyle != null) __obj.updateDynamic("contentContainerStyle")(contentContainerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (innerContainerStyle != null) __obj.updateDynamic("innerContainerStyle")(innerContainerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(manuallyActivateRows)) __obj.updateDynamic("manuallyActivateRows")(manuallyActivateRows.asInstanceOf[js.Any])
    if (onActivateRow != null) __obj.updateDynamic("onActivateRow")(js.Any.fromFunction1(onActivateRow))
    if (onChangeOrder != null) __obj.updateDynamic("onChangeOrder")(js.Any.fromFunction1(onChangeOrder))
    if (onPressRow != null) __obj.updateDynamic("onPressRow")(js.Any.fromFunction1(onPressRow))
    if (onReleaseRow != null) __obj.updateDynamic("onReleaseRow")(js.Any.fromFunction2(onReleaseRow))
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (refreshControl != null) __obj.updateDynamic("refreshControl")(refreshControl.asInstanceOf[js.Any])
    if (renderFooter != null) __obj.updateDynamic("renderFooter")(js.Any.fromFunction0(renderFooter))
    if (renderHeader != null) __obj.updateDynamic("renderHeader")(js.Any.fromFunction0(renderHeader))
    if (rowActivationTime != null) __obj.updateDynamic("rowActivationTime")(rowActivationTime.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollEnabled)) __obj.updateDynamic("scrollEnabled")(scrollEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(showsHorizontalScrollIndicator)) __obj.updateDynamic("showsHorizontalScrollIndicator")(showsHorizontalScrollIndicator.asInstanceOf[js.Any])
    if (!js.isUndefined(showsVerticalScrollIndicator)) __obj.updateDynamic("showsVerticalScrollIndicator")(showsVerticalScrollIndicator.asInstanceOf[js.Any])
    if (!js.isUndefined(sortingEnabled)) __obj.updateDynamic("sortingEnabled")(sortingEnabled.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashNativeDashSortableDashList.reactDashNativeDashSortableDashListMod.default[js.Any, js.Any]]]
  }
  type Props = SortableListProps[js.Any, js.Any]
}

