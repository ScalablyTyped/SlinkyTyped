package typingsSlinky.reactSortablePane.mod

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.TouchEvent
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import typingsSlinky.react.mod.Component
import typingsSlinky.reactSortablePane.AnonChildren
import typingsSlinky.reactSortablePane.AnonNext
import typingsSlinky.reactSortablePane.AnonPageX
import typingsSlinky.resizeObserverPolyfill.mod._Global_.ResizeObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-sortable-pane", "SortablePane")
@js.native
class SortablePane protected ()
  extends Component[SortablePaneProps, State, js.Any] {
  def this(props: SortablePaneProps) = this()
  val order: js.Array[Double] = js.native
  val panes: js.Array[PaneProperty] = js.native
  var panesWrapper: HTMLDivElement = js.native
  var resizeObserver: ResizeObserver = js.native
  var sizePropsUpdated: Boolean = js.native
  def addPane(): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MSortablePane(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MSortablePane(prevProps: SortablePaneProps): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MSortablePane(): Unit = js.native
  def debounceUpdate(): Unit = js.native
  /**
    * Determine where a particular pane should be ordered
    *
    * @param  {number} position     - Top of the current pane
    * @param  {number} paneIndex    - Index of the pane
    * @return {number}              - New index of the pane based on position
    */
  def getItemCountByPosition(position: Double, paneIndex: Double): Double = js.native
  def getItemPositionByIndex(index: Double): Double = js.native
  def getPaneSizeList(): js.Array[Double] = js.native
  /**
    * Find the position sum of halfway points of panes surrounding a given pane
    *
    *  |-------------|
    *  |             | ---> 'previous' halfway
    *  |-------------|
    *                  <--- margin
    *  |-------------|
    *  | currentPane |
    *  |-------------|
    *                  <--- margin
    *  |-------------|
    *  |             |
    *  |             | ---> 'next' halfway
    *  |             |
    *  |-------------|
    *
    *
    * @param  {number}   currentPane - Index of reference pane
    * @param  {number[]} sizes       - Array of pane sizes
    * @param  {number}   margin      - The margin between panes
    * @return {object}               - Object containing 'previous' and 'next'
    *                                  pane halfway points
    */
  def getSurroundingHalfSizes(currentPane: Double, sizes: js.Array[Double], margin: Double): AnonNext = js.native
  def handleMouseDown(pos: Double, pressX: Double, pressY: Double, e: SyntheticMouseEvent[HTMLElement]): Unit = js.native
  def handleMouseDown(pos: Double, pressX: Double, pressY: Double, e: SyntheticTouchEvent[HTMLElement]): Unit = js.native
  def handleMouseUp(e: MouseEvent): Unit = js.native
  def handleMouseUp(e: TouchEvent): Unit = js.native
  def handleMove(hasPageXPageY: AnonPageX): Unit = js.native
  def handleResizeStart(
    i: Double,
    e: SyntheticMouseEvent[HTMLElement],
    dir: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResizableDirection */ js.Any
  ): Unit = js.native
  def handleResizeStart(
    i: Double,
    e: SyntheticTouchEvent[HTMLElement],
    dir: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResizableDirection */ js.Any
  ): Unit = js.native
  def handleResizeStop(
    i: Double,
    e: MouseEvent,
    dir: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResizableDirection */ js.Any,
    elementRef: HTMLElement,
    delta: PaneSize
  ): Unit = js.native
  def handleResizeStop(
    i: Double,
    e: TouchEvent,
    dir: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResizableDirection */ js.Any,
    elementRef: HTMLElement,
    delta: PaneSize
  ): Unit = js.native
  def handleTouchMove(e: TouchEvent): Unit = js.native
  def handleTouchStart(key: Double, x: Double, y: Double, e: SyntheticTouchEvent[HTMLElement], child: ReactElement): Unit = js.native
  def isHorizontal(): Boolean = js.native
  def onResize(
    i: Double,
    e: MouseEvent,
    dir: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResizableDirection */ js.Any,
    elementRef: HTMLElement,
    delta: PaneSize
  ): Unit = js.native
  def onResize(
    i: Double,
    e: TouchEvent,
    dir: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResizableDirection */ js.Any,
    elementRef: HTMLElement,
    delta: PaneSize
  ): Unit = js.native
  def removePane(): Unit = js.native
  def renderPanes(): js.Array[ReactElement] = js.native
}

/* static members */
@JSImport("react-sortable-pane", "SortablePane")
@js.native
object SortablePane extends js.Object {
  var defaultProps: AnonChildren = js.native
}

