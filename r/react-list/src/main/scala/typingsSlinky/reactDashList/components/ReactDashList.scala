package typingsSlinky.reactDashList.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashList.reactDashListMod.ReactListProps
import typingsSlinky.reactDashList.reactDashListMod.^
import typingsSlinky.reactDashList.reactDashListStrings.x
import typingsSlinky.reactDashList.reactDashListStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashList
  extends ExternalComponentWithAttributesWithRefType[tag.type, ^] {
  @JSImport("react-list", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: type */
  def apply(
    axis: x | y = null,
    initialIndex: Int | Double = null,
    itemRenderer: (/* index */ Double, /* key */ Double | String) => typingsSlinky.react.reactMod._Global_.JSX.Element = null,
    itemSizeEstimator: (/* index */ Double, /* cache */ js.Object) => Double = null,
    itemSizeGetter: /* index */ Double => Double = null,
    itemsRenderer: (/* items */ js.Array[typingsSlinky.react.reactMod._Global_.JSX.Element], /* ref */ String) => typingsSlinky.react.reactMod._Global_.JSX.Element = null,
    length: Int | Double = null,
    minSize: Int | Double = null,
    pageSize: Int | Double = null,
    scrollParentGetter: () => typingsSlinky.react.reactMod._Global_.JSX.Element = null,
    threshold: Int | Double = null,
    useStaticSize: js.UndefOr[Boolean] = js.undefined,
    useTranslate3d: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ^] = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (initialIndex != null) __obj.updateDynamic("initialIndex")(initialIndex.asInstanceOf[js.Any])
    if (itemRenderer != null) __obj.updateDynamic("itemRenderer")(js.Any.fromFunction2(itemRenderer))
    if (itemSizeEstimator != null) __obj.updateDynamic("itemSizeEstimator")(js.Any.fromFunction2(itemSizeEstimator))
    if (itemSizeGetter != null) __obj.updateDynamic("itemSizeGetter")(js.Any.fromFunction1(itemSizeGetter))
    if (itemsRenderer != null) __obj.updateDynamic("itemsRenderer")(js.Any.fromFunction2(itemsRenderer))
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (minSize != null) __obj.updateDynamic("minSize")(minSize.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (scrollParentGetter != null) __obj.updateDynamic("scrollParentGetter")(js.Any.fromFunction0(scrollParentGetter))
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    if (!js.isUndefined(useStaticSize)) __obj.updateDynamic("useStaticSize")(useStaticSize.asInstanceOf[js.Any])
    if (!js.isUndefined(useTranslate3d)) __obj.updateDynamic("useTranslate3d")(useTranslate3d.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ReactListProps
}

