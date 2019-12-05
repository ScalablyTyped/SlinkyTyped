package typingsSlinky.antdDashMobileDashRn.libCarouselIndexDotNativeMod

import slinky.core.TagMod
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod._Global_.JSX.Element
import typingsSlinky.reactDashNative.reactDashNativeMod.LayoutChangeEvent
import typingsSlinky.reactDashNative.reactDashNativeMod.NativeScrollEvent
import typingsSlinky.reactDashNative.reactDashNativeMod.NativeSyntheticEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Carousel
  extends Component[CarouselProps, CarouselState, js.Any] {
  var androidScrollEndTimer: js.Any = js.native
  var autoplayTimer: js.Any = js.native
  var scrollEndTimter: js.Any = js.native
  var scrollviewRef: js.Any = js.native
  def autoplay(): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MCarousel(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MCarousel(): Unit = js.native
  def getChildrenCount(children: TagMod[Any]): Double = js.native
  def loopJump(): Unit = js.native
  def onChildLayout(e: LayoutChangeEvent): Unit = js.native
  def onLayout(e: LayoutChangeEvent): Unit = js.native
  def onScrollBegin(e: NativeSyntheticEvent[NativeScrollEvent]): Unit = js.native
  def onScrollEnd(e: NativeSyntheticEvent[NativeScrollEvent]): Unit = js.native
  def onScrollEndDrag(e: NativeSyntheticEvent[NativeScrollEvent]): Unit = js.native
  def paging(offsetY: Double): Unit = js.native
  def renderContent(pages: TagMod[Any]): Element = js.native
  def renderDots(index: Double): js.UndefOr[js.Object | Null] = js.native
  def scrollNextPage(): Unit = js.native
  def updateIndex(offset: CarouselOffset): Unit = js.native
}

