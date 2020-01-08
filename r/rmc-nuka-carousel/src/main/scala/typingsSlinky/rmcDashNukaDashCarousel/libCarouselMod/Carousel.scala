package typingsSlinky.rmcDashNukaDashCarousel.libCarouselMod

import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod._Global_.JSX.Element
import typingsSlinky.rmcDashNukaDashCarousel.Anon_BeginValue
import typingsSlinky.rmcDashNukaDashCarousel.Anon_Bottom
import typingsSlinky.rmcDashNukaDashCarousel.Anon_BottomPosition
import typingsSlinky.rmcDashNukaDashCarousel.Anon_BottomPositionRight
import typingsSlinky.rmcDashNukaDashCarousel.Anon_BoxSizing
import typingsSlinky.rmcDashNukaDashCarousel.Anon_E
import typingsSlinky.rmcDashNukaDashCarousel.Anon_EOnMouseDown
import typingsSlinky.rmcDashNukaDashCarousel.Anon_Left
import typingsSlinky.rmcDashNukaDashCarousel.Anon_LeftMsTransform
import typingsSlinky.rmcDashNukaDashCarousel.Anon_LeftMsTransformPosition
import typingsSlinky.rmcDashNukaDashCarousel.Anon_LeftMsTransformPositionTop
import typingsSlinky.rmcDashNukaDashCarousel.Anon_MsTransform
import typingsSlinky.rmcDashNukaDashCarousel.Anon_Position
import typingsSlinky.rmcDashNukaDashCarousel.rmcDashNukaDashCarouselNumbers.`-1`
import typingsSlinky.rmcDashNukaDashCarousel.rmcDashNukaDashCarouselNumbers.`0`
import typingsSlinky.rmcDashNukaDashCarousel.rmcDashNukaDashCarouselNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Carousel
  extends Component[ICarouselProps, js.Any, js.Any] {
  var _rafID: js.Any = js.native
  var autoplayID: js.Any = js.native
  var autoplayPaused: js.Any = js.native
  var clickSafe: Boolean = js.native
  var touchObject: js.Any = js.native
  def _rafCb(): Unit = js.native
  def animateSlide(): Unit = js.native
  def animateSlide(easing: js.Any): Unit = js.native
  def animateSlide(easing: js.Any, duration: js.Any): Unit = js.native
  def animateSlide(easing: js.Any, duration: js.Any, endValue: js.Any): Unit = js.native
  def animateSlide(easing: js.Any, duration: js.Any, endValue: js.Any, callback: js.Function): Unit = js.native
  def autoplayIterator(): Unit = js.native
  def bindEvents(): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MCarousel(): Unit = js.native
  @JSName("componentWillMount")
  def componentWillMount_MCarousel(): Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MCarousel(nextProps: js.Any): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MCarousel(): Unit = js.native
  def formatChildren(children: js.Any): js.Array[Element] = js.native
  def getDecoratorStyles(position: js.Any): Anon_Left | Anon_LeftMsTransform | Anon_Position | Anon_LeftMsTransformPosition | Anon_LeftMsTransformPositionTop | Anon_MsTransform | Anon_Bottom | Anon_BottomPosition | Anon_BottomPositionRight = js.native
  def getFrameStyles(): CSSProperties = js.native
  def getListStyles(): CSSProperties = js.native
  def getMouseEvents(): Anon_EOnMouseDown | Null = js.native
  def getSlideStyles(index: js.Any, positionValue: js.Any): CSSProperties = js.native
  def getSlideTargetPosition(index: js.Any, positionValue: js.Any): Double = js.native
  def getSliderStyles(): Anon_BoxSizing = js.native
  def getStyleTagStyles(): String = js.native
  def getTargetLeft(): Double = js.native
  def getTargetLeft(touchOffset: js.Any): Double = js.native
  def getTargetLeft(touchOffset: js.Any, slide: js.Any): Double = js.native
  def getTouchEvents(): Anon_E | Null = js.native
  def getTweeningValue(path: js.Any): js.Any = js.native
  def goToSlide(index: js.Any): Unit = js.native
  def handleClick(e: js.Any): Unit = js.native
  def handleMouseOut(): Unit = js.native
  def handleMouseOver(): Unit = js.native
  def handleSwipe(_underscore: js.Any): Unit = js.native
  def nextSlide(): Unit = js.native
  def onReadyStateChange(): Unit = js.native
  def onResize(): Unit = js.native
  def previousSlide(): Unit = js.native
  def resetAutoplay(): Unit = js.native
  def setDimensions(): Unit = js.native
  def setDimensions(props: js.Any): Unit = js.native
  def setExternalData(): Unit = js.native
  def setInitialDimensions(): Unit = js.native
  def setLeft(): Unit = js.native
  def startAutoplay(): Unit = js.native
  def stopAutoplay(): Unit = js.native
  def swipeDirection(x1: js.Any, x2: js.Any, y1: js.Any, y2: js.Any): `0` | `1` | `-1` = js.native
  def tweenState(path: js.Any, hasEasingDurationDelayBeginValueEndValueOnEndStackBehavior: Anon_BeginValue): Unit = js.native
  def unbindEvents(): Unit = js.native
}

