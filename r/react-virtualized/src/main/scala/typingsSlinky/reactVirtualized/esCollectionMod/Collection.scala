package typingsSlinky.reactVirtualized.esCollectionMod

import slinky.core.TagMod
import typingsSlinky.react.mod.Component
import typingsSlinky.reactVirtualized.AnonAlign
import typingsSlinky.reactVirtualized.AnonArialabel
import typingsSlinky.reactVirtualized.AnonCellGroupRenderer
import typingsSlinky.reactVirtualized.isScrollingbooleanSizeInf
import typingsSlinky.reactVirtualized.mod.ScrollPosition
import typingsSlinky.reactVirtualized.mod.SizeInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-virtualized/dist/es/Collection", "Collection")
@js.native
class Collection ()
  extends Component[CollectionProps, js.Object, js.Any] {
  /** CellLayoutManager interface */
  def calculateSizeAndPositionData(): Unit = js.native
  def cellRenderers(params: isScrollingbooleanSizeInf): js.Array[TagMod[Any]] = js.native
  /**
    * Returns the most recently rendered set of cell indices.
    */
  def getLastRenderedIndices(): js.Array[Double] = js.native
  /**
    * Calculates the minimum amount of change from the current scroll position to ensure the specified cell is (fully) visible.
    */
  def getScrollPositionForCell(params: AnonAlign): ScrollPosition = js.native
  def getTotalSize(): SizeInfo = js.native
  /** See Collection#recomputeCellSizesAndPositions */
  def recomputeCellSizesAndPositions(): Unit = js.native
}

/* static members */
@JSImport("react-virtualized/dist/es/Collection", "Collection")
@js.native
object Collection extends js.Object {
  var defaultProps: AnonCellGroupRenderer = js.native
  var propTypes: AnonArialabel = js.native
}

