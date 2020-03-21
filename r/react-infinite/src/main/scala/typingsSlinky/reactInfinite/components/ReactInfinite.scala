package typingsSlinky.reactInfinite.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.reactInfinite.mod.InfiniteProps
import typingsSlinky.reactInfinite.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactInfinite
  extends ExternalComponentWithAttributesWithRefType[tag.type, ^] {
  @JSImport("react-infinite", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    elementHeight: Double | js.Array[Double],
    containerHeight: Int | Double = null,
    displayBottomUpwards: js.UndefOr[Boolean] = js.undefined,
    handleScroll: /* node */ ReactElement => Unit = null,
    infiniteLoadBeginBottomOffset: Int | Double = null,
    infiniteLoadBeginEdgeOffset: Int | Double = null,
    isInfiniteLoading: js.UndefOr[Boolean] = js.undefined,
    loadingSpinnerDelegate: ReactElement = null,
    onInfiniteLoad: () => Unit = null,
    preloadAdditionalHeight: Double | js.Object = null,
    preloadBatchSize: Double | js.Object = null,
    timeScrollStateLastsForAfterUserScrolls: Int | Double = null,
    useWindowAsScrollContainer: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ^] = {
    val __obj = js.Dynamic.literal(elementHeight = elementHeight.asInstanceOf[js.Any])
    if (containerHeight != null) __obj.updateDynamic("containerHeight")(containerHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(displayBottomUpwards)) __obj.updateDynamic("displayBottomUpwards")(displayBottomUpwards.asInstanceOf[js.Any])
    if (handleScroll != null) __obj.updateDynamic("handleScroll")(js.Any.fromFunction1(handleScroll))
    if (infiniteLoadBeginBottomOffset != null) __obj.updateDynamic("infiniteLoadBeginBottomOffset")(infiniteLoadBeginBottomOffset.asInstanceOf[js.Any])
    if (infiniteLoadBeginEdgeOffset != null) __obj.updateDynamic("infiniteLoadBeginEdgeOffset")(infiniteLoadBeginEdgeOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(isInfiniteLoading)) __obj.updateDynamic("isInfiniteLoading")(isInfiniteLoading.asInstanceOf[js.Any])
    if (loadingSpinnerDelegate != null) __obj.updateDynamic("loadingSpinnerDelegate")(loadingSpinnerDelegate.asInstanceOf[js.Any])
    if (onInfiniteLoad != null) __obj.updateDynamic("onInfiniteLoad")(js.Any.fromFunction0(onInfiniteLoad))
    if (preloadAdditionalHeight != null) __obj.updateDynamic("preloadAdditionalHeight")(preloadAdditionalHeight.asInstanceOf[js.Any])
    if (preloadBatchSize != null) __obj.updateDynamic("preloadBatchSize")(preloadBatchSize.asInstanceOf[js.Any])
    if (timeScrollStateLastsForAfterUserScrolls != null) __obj.updateDynamic("timeScrollStateLastsForAfterUserScrolls")(timeScrollStateLastsForAfterUserScrolls.asInstanceOf[js.Any])
    if (!js.isUndefined(useWindowAsScrollContainer)) __obj.updateDynamic("useWindowAsScrollContainer")(useWindowAsScrollContainer.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = InfiniteProps
}

