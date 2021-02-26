package typingsSlinky.reactAliceCarousel

import org.scalajs.dom.raw.Event
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.PureComponent
import typingsSlinky.reactAliceCarousel.anon.ActiveIndex
import typingsSlinky.reactAliceCarousel.anon.IsNextSlideDisabled
import typingsSlinky.reactAliceCarousel.anon.ReadonlyProps
import typingsSlinky.reactAliceCarousel.anon.ReadonlyPropsReadonlychil
import typingsSlinky.reactAliceCarousel.anon.ReadonlyState
import typingsSlinky.reactAliceCarousel.typesMod.Props
import typingsSlinky.reactAliceCarousel.typesMod.SlideTo
import typingsSlinky.reactAliceCarousel.typesMod.State
import typingsSlinky.vanillaSwipe.typesMod.EventData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-alice-carousel", JSImport.Default)
  @js.native
  class default protected () extends AliceCarousel {
    def this(props: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("react-alice-carousel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-alice-carousel", "default.defaultProps")
    @js.native
    def defaultProps: ActiveIndex = js.native
    @scala.inline
    def defaultProps_=(x: ActiveIndex): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait AliceCarousel
    extends PureComponent[Props, State, js.Any] {
    
    var RootElement: js.Any = js.native
    
    def _cancelTimeoutAnimations(): Unit = js.native
    
    def _clearAutoPlayTimeout(): Unit = js.native
    
    def _clearSlideEndTimeout(): Unit = js.native
    
    def _clearTouchmovePosition(): Unit = js.native
    
    def _handleBeforeSlideEnd(): js.Promise[Unit] = js.native
    
    def _handleBeforeTouchEnd(position: Double): Unit = js.native
    
    def _handleDotClick(index: js.Any): Unit = js.native
    
    def _handleMouseEnter(): Unit = js.native
    
    def _handleMouseLeave(): Unit = js.native
    
    def _handlePause(): Unit = js.native
    
    def _handlePlay(): Unit = js.native
    
    def _handlePlayPauseToggle(): js.Promise[Unit] = js.native
    
    def _handleResize(e: Event): js.Promise[Unit] = js.native
    
    var _handleResizeDebounced: js.Any = js.native
    
    def _handleResized(): Unit = js.native
    
    def _handleSlideChange(): Unit = js.native
    
    def _handleSlideChanged(): js.Promise[Unit] = js.native
    
    def _handleSlideTo(hasActiveIndexFadeoutAnimationIndexFadeoutAnimationPosition: SlideTo): js.Promise[Unit] = js.native
    
    def _handleTouchend(e: js.Any, hasDeltaX: EventData): Unit = js.native
    
    def _handleTouchmove(e: js.Any, eventData: EventData): Unit = js.native
    
    def _handleUpdateSlidePosition(activeIndex: js.Any): js.Promise[Unit] = js.native
    
    def _renderDotsNavigation(): ReactElement = js.native
    
    def _renderNextButton(): ReactElement = js.native
    
    def _renderPlayPauseButton(): ReactElement = js.native
    
    def _renderPrevButton(): ReactElement = js.native
    
    def _renderSlideInfo(): ReactElement = js.native
    
    def _renderStageItem(item: js.Any, i: Double): ReactElement = js.native
    
    def _setAutoPlayInterval(): Unit = js.native
    
    def _setInitialState(): js.Promise[Unit] = js.native
    
    def _setRootComponentRef(node: js.Any): js.Any = js.native
    
    def _setStageComponentRef(node: js.Any): js.Any = js.native
    
    def _setTouchmovePosition(): Unit = js.native
    
    def _setupSwipeHandlers(): Unit = js.native
    
    def _updateComponent(): Unit = js.native
    def _updateComponent(props: ReadonlyPropsReadonlychil): Unit = js.native
    
    def _updateSwipeProps(): Unit = js.native
    
    var autoPlayTimeoutId: js.Any = js.native
    
    var cancelTouchAnimations: js.Any = js.native
    
    def clearTouchendTimeout(): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MAliceCarousel(): js.Promise[Unit] = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MAliceCarousel(prevProps: ReadonlyProps, state: ReadonlyState): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MAliceCarousel(): Unit = js.native
    
    def eventObject: IsNextSlideDisabled = js.native
    
    var hasUserAction: js.Any = js.native
    
    var isAnimationDisabled: js.Any = js.native
    
    def isFadeoutAnimationAllowed: Boolean = js.native
    
    var isHovered: js.Any = js.native
    
    var isTouchMoveProcessStarted: js.Any = js.native
    
    var rootComponentDimensions: js.Any = js.native
    
    var slideEndTimeoutId: js.Any = js.native
    
    def slideNext(e: js.Any): Unit = js.native
    
    def slidePrev(e: js.Any): Unit = js.native
    
    def slideTo(): Unit = js.native
    def slideTo(activeIndex: Double): Unit = js.native
    
    var stageComponent: js.Any = js.native
    
    var startTouchmovePosition: js.Any = js.native
    
    var swipeListener: js.Any = js.native
    
    var touchEndTimeoutId: js.Any = js.native
    
    def touchmovePosition: Double = js.native
  }
}
