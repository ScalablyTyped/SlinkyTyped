package typingsSlinky.reactDashVirtualized.distEsCollectionMod

import slinky.core.TagMod
import typingsSlinky.react.reactMod.Component
import typingsSlinky.reactDashVirtualized.Anon_Align
import typingsSlinky.reactDashVirtualized.Anon_Arialabel
import typingsSlinky.reactDashVirtualized.Anon_ArialabelCellGroupRenderer
import typingsSlinky.reactDashVirtualized.Anon_IsScrolling
import typingsSlinky.reactDashVirtualized.reactDashVirtualizedMod.ScrollPosition
import typingsSlinky.reactDashVirtualized.reactDashVirtualizedMod.SizeInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-virtualized/dist/es/Collection", "Collection")
@js.native
class Collection ()
  extends Component[CollectionProps, js.Object, js.Any] {
  /** CellLayoutManager interface */
  def calculateSizeAndPositionData(): Unit = js.native
  def cellRenderers(params: Anon_IsScrolling with SizeInfo): js.Array[TagMod[Any]] = js.native
  /**
    * Returns the most recently rendered set of cell indices.
    */
  def getLastRenderedIndices(): js.Array[Double] = js.native
  /**
    * Calculates the minimum amount of change from the current scroll position to ensure the specified cell is (fully) visible.
    */
  def getScrollPositionForCell(params: Anon_Align): ScrollPosition = js.native
  def getTotalSize(): SizeInfo = js.native
  /** See Collection#recomputeCellSizesAndPositions */
  def recomputeCellSizesAndPositions(): Unit = js.native
}

/* static members */
@JSImport("react-virtualized/dist/es/Collection", "Collection")
@js.native
object Collection extends js.Object {
  var defaultProps: Anon_ArialabelCellGroupRenderer = js.native
  var propTypes: Anon_Arialabel = js.native
}

