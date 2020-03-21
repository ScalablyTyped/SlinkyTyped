package typingsSlinky.reactVirtualized.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactVirtualized.esInfiniteLoaderMod.InfiniteLoaderProps
import typingsSlinky.reactVirtualized.mod.Index
import typingsSlinky.reactVirtualized.mod.IndexRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object InfiniteLoader
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactVirtualized.mod.InfiniteLoader] {
  @JSImport("react-virtualized", "InfiniteLoader")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    isRowLoaded: Index => Boolean,
    loadMoreRows: IndexRange => js.Promise[_],
    minimumBatchSize: Int | Double = null,
    rowCount: Int | Double = null,
    threshold: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactVirtualized.mod.InfiniteLoader] = {
    val __obj = js.Dynamic.literal(isRowLoaded = js.Any.fromFunction1(isRowLoaded), loadMoreRows = js.Any.fromFunction1(loadMoreRows))
    if (minimumBatchSize != null) __obj.updateDynamic("minimumBatchSize")(minimumBatchSize.asInstanceOf[js.Any])
    if (rowCount != null) __obj.updateDynamic("rowCount")(rowCount.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = InfiniteLoaderProps
}

