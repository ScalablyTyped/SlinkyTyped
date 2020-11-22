package typingsSlinky.reactRange

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.TouchEvent
import slinky.core.facade.ReactRef
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import typingsSlinky.react.mod.Component
import typingsSlinky.reactRange.anon.AllowOverlap
import typingsSlinky.reactRange.anon.DraggedThumbIndex
import typingsSlinky.reactRange.anon.X
import typingsSlinky.reactRange.typesMod.IProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-range/lib/Range", JSImport.Namespace)
@js.native
object rangeMod extends js.Object {
  
  @js.native
  trait Range
    extends Component[IProps, js.Object, js.Any] {
    
    def addMouseEvents(e: MouseEvent): Unit = js.native
    
    def addTouchEvents(e: TouchEvent): Unit = js.native
    
    def calculateMarkOffsets(): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MRange(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MRange(prevProps: IProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MRange(): Unit = js.native
    
    def fireOnFinalChange(): Unit = js.native
    
    def getOffsets(): js.Array[X] = js.native
    
    def getTargetIndex(e: Event): Double = js.native
    
    def getThumbs(): js.Array[Element] = js.native
    
    var markRefs: js.Array[ReactRef[HTMLElement]] = js.native
    
    def normalizeValue(value: Double, index: Double): Double = js.native
    
    var numOfMarks: Double = js.native
    
    def onEnd(e: Event): js.UndefOr[Null] = js.native
    
    def onKeyDown(e: SyntheticKeyboardEvent[Element]): Unit = js.native
    
    def onKeyUp(e: SyntheticKeyboardEvent[Element]): Unit = js.native
    
    def onMouseDownTrack(e: SyntheticMouseEvent[Element]): Unit = js.native
    
    def onMouseMove(e: MouseEvent): Unit = js.native
    
    def onMouseOrTouchStart(e: MouseEvent with TouchEvent): Unit = js.native
    
    def onMove(clientX: Double, clientY: Double): js.UndefOr[Null] = js.native
    
    def onResize(): Unit = js.native
    
    def onTouchMove(e: TouchEvent): Unit = js.native
    
    def onTouchStartTrack(e: SyntheticTouchEvent[Element]): Unit = js.native
    
    var resizeObserver: js.Any = js.native
    
    def schdOnEnd(e: Event): Unit = js.native
    
    def schdOnMouseMove(e: MouseEvent): Unit = js.native
    
    def schdOnResize(): Unit = js.native
    
    def schdOnTouchMove(e: TouchEvent): Unit = js.native
    
    @JSName("state")
    var state_Range: DraggedThumbIndex = js.native
    
    var thumbRefs: js.Array[ReactRef[HTMLElement]] = js.native
    
    var trackRef: ReactRef[HTMLElement] = js.native
  }
  
  @js.native
  class default protected () extends Range {
    def this(props: IProps) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    var defaultProps: AllowOverlap = js.native
  }
}
