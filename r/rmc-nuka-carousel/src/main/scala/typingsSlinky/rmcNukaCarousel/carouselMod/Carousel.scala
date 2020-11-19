package typingsSlinky.rmcNukaCarousel.carouselMod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Component
import typingsSlinky.rmcNukaCarousel.anon.BeginValue
import typingsSlinky.rmcNukaCarousel.anon.Bottom
import typingsSlinky.rmcNukaCarousel.anon.BottomPosition
import typingsSlinky.rmcNukaCarousel.anon.BoxSizing
import typingsSlinky.rmcNukaCarousel.anon.Left
import typingsSlinky.rmcNukaCarousel.anon.MsTransform
import typingsSlinky.rmcNukaCarousel.anon.OnMouseDown
import typingsSlinky.rmcNukaCarousel.anon.OnTouchCancel
import typingsSlinky.rmcNukaCarousel.anon.Position
import typingsSlinky.rmcNukaCarousel.anon.Right
import typingsSlinky.rmcNukaCarousel.anon.TextAlign
import typingsSlinky.rmcNukaCarousel.anon.Top
import typingsSlinky.rmcNukaCarousel.anon.Transform
import typingsSlinky.rmcNukaCarousel.rmcNukaCarouselNumbers.`-1`
import typingsSlinky.rmcNukaCarousel.rmcNukaCarouselNumbers.`0`
import typingsSlinky.rmcNukaCarousel.rmcNukaCarouselNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Carousel
  extends Component[ICarouselProps, js.Any, js.Any] {
  
  def _rafCb(): Unit = js.native
  
  var _rafID: js.Any = js.native
  
  def animateSlide(): Unit = js.native
  def animateSlide(
    easing: js.UndefOr[scala.Nothing],
    duration: js.UndefOr[scala.Nothing],
    endValue: js.UndefOr[scala.Nothing],
    callback: js.Function
  ): Unit = js.native
  def animateSlide(easing: js.UndefOr[scala.Nothing], duration: js.UndefOr[scala.Nothing], endValue: js.Any): Unit = js.native
  def animateSlide(
    easing: js.UndefOr[scala.Nothing],
    duration: js.UndefOr[scala.Nothing],
    endValue: js.Any,
    callback: js.Function
  ): Unit = js.native
  def animateSlide(easing: js.UndefOr[scala.Nothing], duration: js.Any): Unit = js.native
  def animateSlide(
    easing: js.UndefOr[scala.Nothing],
    duration: js.Any,
    endValue: js.UndefOr[scala.Nothing],
    callback: js.Function
  ): Unit = js.native
  def animateSlide(easing: js.UndefOr[scala.Nothing], duration: js.Any, endValue: js.Any): Unit = js.native
  def animateSlide(easing: js.UndefOr[scala.Nothing], duration: js.Any, endValue: js.Any, callback: js.Function): Unit = js.native
  def animateSlide(easing: js.Any): Unit = js.native
  def animateSlide(
    easing: js.Any,
    duration: js.UndefOr[scala.Nothing],
    endValue: js.UndefOr[scala.Nothing],
    callback: js.Function
  ): Unit = js.native
  def animateSlide(easing: js.Any, duration: js.UndefOr[scala.Nothing], endValue: js.Any): Unit = js.native
  def animateSlide(easing: js.Any, duration: js.UndefOr[scala.Nothing], endValue: js.Any, callback: js.Function): Unit = js.native
  def animateSlide(easing: js.Any, duration: js.Any): Unit = js.native
  def animateSlide(easing: js.Any, duration: js.Any, endValue: js.UndefOr[scala.Nothing], callback: js.Function): Unit = js.native
  def animateSlide(easing: js.Any, duration: js.Any, endValue: js.Any): Unit = js.native
  def animateSlide(easing: js.Any, duration: js.Any, endValue: js.Any, callback: js.Function): Unit = js.native
  
  var autoplayID: js.Any = js.native
  
  def autoplayIterator(): Unit = js.native
  
  var autoplayPaused: js.Any = js.native
  
  def bindEvents(): Unit = js.native
  
  var clickSafe: Boolean = js.native
  
  @JSName("componentDidMount")
  def componentDidMount_MCarousel(): Unit = js.native
  
  @JSName("componentWillMount")
  def componentWillMount_MCarousel(): Unit = js.native
  
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MCarousel(nextProps: js.Any): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MCarousel(): Unit = js.native
  
  def formatChildren(children: js.Any): js.Array[ReactElement] = js.native
  
  def getDecoratorStyles(position: js.Any): Left | MsTransform | Position | Top | Transform | Right | Bottom | TextAlign | BottomPosition = js.native
  
  def getFrameStyles(): CSSProperties = js.native
  
  def getListStyles(): CSSProperties = js.native
  
  def getMouseEvents(): OnMouseDown | Null = js.native
  
  def getSlideStyles(index: js.Any, positionValue: js.Any): CSSProperties = js.native
  
  def getSlideTargetPosition(index: js.Any, positionValue: js.Any): Double = js.native
  
  def getSliderStyles(): BoxSizing = js.native
  
  def getStyleTagStyles(): String = js.native
  
  def getTargetLeft(): Double = js.native
  def getTargetLeft(touchOffset: js.UndefOr[scala.Nothing], slide: js.Any): Double = js.native
  def getTargetLeft(touchOffset: js.Any): Double = js.native
  def getTargetLeft(touchOffset: js.Any, slide: js.Any): Double = js.native
  
  def getTouchEvents(): OnTouchCancel | Null = js.native
  
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
  
  var touchObject: js.Any = js.native
  
  def tweenState(path: js.Any, hasEasingDurationDelayBeginValueEndValueOnEndStackBehavior: BeginValue): Unit = js.native
  
  def unbindEvents(): Unit = js.native
}
