package typingsSlinky.antdMobileRn.carouselIndexNativeMod

import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.anon.Layout
import typingsSlinky.reactNative.mod.NativeScrollEvent
import typingsSlinky.reactNative.mod.NodeHandle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Carousel
  extends Component[CarouselProps, CarouselState, js.Any] {
  
  var androidScrollEndTimer: js.Any = js.native
  
  def autoplay(): Unit = js.native
  
  var autoplayTimer: js.Any = js.native
  
  @JSName("componentDidMount")
  def componentDidMount_MCarousel(): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MCarousel(): Unit = js.native
  
  def getChildrenCount(children: ReactElement): Double = js.native
  
  def loopJump(): Unit = js.native
  
  def onChildLayout(e: SyntheticEvent[NodeHandle, Layout]): Unit = js.native
  
  def onLayout(e: SyntheticEvent[NodeHandle, Layout]): Unit = js.native
  
  def onScrollBegin(e: SyntheticEvent[NodeHandle, NativeScrollEvent]): Unit = js.native
  
  def onScrollEnd(e: SyntheticEvent[NodeHandle, NativeScrollEvent]): Unit = js.native
  
  def onScrollEndDrag(e: SyntheticEvent[NodeHandle, NativeScrollEvent]): Unit = js.native
  
  def paging(offsetY: Double): Unit = js.native
  
  def renderContent(pages: ReactElement): ReactElement = js.native
  
  def renderDots(index: Double): js.UndefOr[js.Object | Null] = js.native
  
  var scrollEndTimter: js.Any = js.native
  
  def scrollNextPage(): Unit = js.native
  
  var scrollviewRef: js.Any = js.native
  
  def updateIndex(offset: CarouselOffset): Unit = js.native
}
