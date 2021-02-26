package typingsSlinky.reactSwipeable

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.TouchEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.reactSwipeable.anon.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @JSImport("react-swipeable/dist/types", "DOWN")
  @js.native
  val DOWN: /* "Down" */ String = js.native
  
  @JSImport("react-swipeable/dist/types", "LEFT")
  @js.native
  val LEFT: /* "Left" */ String = js.native
  
  @JSImport("react-swipeable/dist/types", "RIGHT")
  @js.native
  val RIGHT: /* "Right" */ String = js.native
  
  @JSImport("react-swipeable/dist/types", "UP")
  @js.native
  val UP: /* "Up" */ String = js.native
  
  type AttachTouch = js.Function2[/* el */ HTMLElement, /* passive */ Boolean, js.Function0[Unit]]
  
  @js.native
  trait ConfigurationOptions extends StObject {
    
    var delta: Double = js.native
    
    var preventDefaultTouchmoveEvent: Boolean = js.native
    
    var rotationAngle: Double = js.native
    
    var trackMouse: Boolean = js.native
    
    var trackTouch: Boolean = js.native
  }
  object ConfigurationOptions {
    
    @scala.inline
    def apply(
      delta: Double,
      preventDefaultTouchmoveEvent: Boolean,
      rotationAngle: Double,
      trackMouse: Boolean,
      trackTouch: Boolean
    ): ConfigurationOptions = {
      val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], preventDefaultTouchmoveEvent = preventDefaultTouchmoveEvent.asInstanceOf[js.Any], rotationAngle = rotationAngle.asInstanceOf[js.Any], trackMouse = trackMouse.asInstanceOf[js.Any], trackTouch = trackTouch.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigurationOptions]
    }
    
    @scala.inline
    implicit class ConfigurationOptionsMutableBuilder[Self <: ConfigurationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventDefaultTouchmoveEvent(value: Boolean): Self = StObject.set(x, "preventDefaultTouchmoveEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotationAngle(value: Double): Self = StObject.set(x, "rotationAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackMouse(value: Boolean): Self = StObject.set(x, "trackMouse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackTouch(value: Boolean): Self = StObject.set(x, "trackTouch", value.asInstanceOf[js.Any])
    }
  }
  
  type HandledEvents = SyntheticMouseEvent[Element] | TouchEvent | MouseEvent
  
  type Setter = js.Function1[/* stateSetter */ StateSetter, Unit]
  
  type StateSetter = js.Function2[
    /* state */ SwipeableState, 
    /* props */ SwipeablePropsWithDefaultOptions, 
    SwipeableState
  ]
  
  type SwipeCallback = js.Function1[/* eventData */ SwipeEventData, Unit]
  
  type SwipeDirections = /* "Left" */ String
  
  @js.native
  trait SwipeEventData extends StObject {
    
    var absX: Double = js.native
    
    var absY: Double = js.native
    
    var deltaX: Double = js.native
    
    var deltaY: Double = js.native
    
    var dir: SwipeDirections = js.native
    
    var event: HandledEvents = js.native
    
    var first: Boolean = js.native
    
    var initial: Vector2 = js.native
    
    var velocity: Double = js.native
    
    var vxvy: Vector2 = js.native
  }
  object SwipeEventData {
    
    @scala.inline
    def apply(
      absX: Double,
      absY: Double,
      deltaX: Double,
      deltaY: Double,
      dir: SwipeDirections,
      event: HandledEvents,
      first: Boolean,
      initial: Vector2,
      velocity: Double,
      vxvy: Vector2
    ): SwipeEventData = {
      val __obj = js.Dynamic.literal(absX = absX.asInstanceOf[js.Any], absY = absY.asInstanceOf[js.Any], deltaX = deltaX.asInstanceOf[js.Any], deltaY = deltaY.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any], vxvy = vxvy.asInstanceOf[js.Any])
      __obj.asInstanceOf[SwipeEventData]
    }
    
    @scala.inline
    implicit class SwipeEventDataMutableBuilder[Self <: SwipeEventData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbsX(value: Double): Self = StObject.set(x, "absX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbsY(value: Double): Self = StObject.set(x, "absY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeltaX(value: Double): Self = StObject.set(x, "deltaX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeltaY(value: Double): Self = StObject.set(x, "deltaY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDir(value: SwipeDirections): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvent(value: HandledEvents): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventMouseEvent(value: SyntheticMouseEvent[Element]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventTouchEvent(value: TouchEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirst(value: Boolean): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitial(value: Vector2): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVelocity(value: Double): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVxvy(value: Vector2): Self = StObject.set(x, "vxvy", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SwipeableCallbacks extends StObject {
    
    var onSwiped: SwipeCallback = js.native
    
    var onSwipedDown: SwipeCallback = js.native
    
    var onSwipedLeft: SwipeCallback = js.native
    
    var onSwipedRight: SwipeCallback = js.native
    
    var onSwipedUp: SwipeCallback = js.native
    
    var onSwiping: SwipeCallback = js.native
    
    var onTap: TapCallback = js.native
  }
  object SwipeableCallbacks {
    
    @scala.inline
    def apply(
      onSwiped: /* eventData */ SwipeEventData => Unit,
      onSwipedDown: /* eventData */ SwipeEventData => Unit,
      onSwipedLeft: /* eventData */ SwipeEventData => Unit,
      onSwipedRight: /* eventData */ SwipeEventData => Unit,
      onSwipedUp: /* eventData */ SwipeEventData => Unit,
      onSwiping: /* eventData */ SwipeEventData => Unit,
      onTap: /* hasEvent */ Event => Unit
    ): SwipeableCallbacks = {
      val __obj = js.Dynamic.literal(onSwiped = js.Any.fromFunction1(onSwiped), onSwipedDown = js.Any.fromFunction1(onSwipedDown), onSwipedLeft = js.Any.fromFunction1(onSwipedLeft), onSwipedRight = js.Any.fromFunction1(onSwipedRight), onSwipedUp = js.Any.fromFunction1(onSwipedUp), onSwiping = js.Any.fromFunction1(onSwiping), onTap = js.Any.fromFunction1(onTap))
      __obj.asInstanceOf[SwipeableCallbacks]
    }
    
    @scala.inline
    implicit class SwipeableCallbacksMutableBuilder[Self <: SwipeableCallbacks] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnSwiped(value: /* eventData */ SwipeEventData => Unit): Self = StObject.set(x, "onSwiped", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSwipedDown(value: /* eventData */ SwipeEventData => Unit): Self = StObject.set(x, "onSwipedDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSwipedLeft(value: /* eventData */ SwipeEventData => Unit): Self = StObject.set(x, "onSwipedLeft", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSwipedRight(value: /* eventData */ SwipeEventData => Unit): Self = StObject.set(x, "onSwipedRight", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSwipedUp(value: /* eventData */ SwipeEventData => Unit): Self = StObject.set(x, "onSwipedUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSwiping(value: /* eventData */ SwipeEventData => Unit): Self = StObject.set(x, "onSwiping", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTap(value: /* hasEvent */ Event => Unit): Self = StObject.set(x, "onTap", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait SwipeableHandlers extends StObject {
    
    var onMouseDown: js.UndefOr[js.Function1[/* event */ SyntheticMouseEvent[Element], Unit]] = js.native
    
    def ref(): Unit = js.native
    def ref(element: HTMLElement): Unit = js.native
  }
  
  /* Inlined std.Partial<react-swipeable.react-swipeable/dist/types.SwipeableCallbacks & react-swipeable.react-swipeable/dist/types.ConfigurationOptions> */
  @js.native
  trait SwipeableProps extends StObject {
    
    var delta: js.UndefOr[Double] = js.native
    
    var onSwiped: js.UndefOr[SwipeCallback] = js.native
    
    var onSwipedDown: js.UndefOr[SwipeCallback] = js.native
    
    var onSwipedLeft: js.UndefOr[SwipeCallback] = js.native
    
    var onSwipedRight: js.UndefOr[SwipeCallback] = js.native
    
    var onSwipedUp: js.UndefOr[SwipeCallback] = js.native
    
    var onSwiping: js.UndefOr[SwipeCallback] = js.native
    
    var onTap: js.UndefOr[TapCallback] = js.native
    
    var preventDefaultTouchmoveEvent: js.UndefOr[Boolean] = js.native
    
    var rotationAngle: js.UndefOr[Double] = js.native
    
    var trackMouse: js.UndefOr[Boolean] = js.native
    
    var trackTouch: js.UndefOr[Boolean] = js.native
  }
  object SwipeableProps {
    
    @scala.inline
    def apply(): SwipeableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwipeableProps]
    }
    
    @scala.inline
    implicit class SwipeablePropsMutableBuilder[Self <: SwipeableProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeltaUndefined: Self = StObject.set(x, "delta", js.undefined)
      
      @scala.inline
      def setOnSwiped(value: /* eventData */ SwipeEventData => Unit): Self = StObject.set(x, "onSwiped", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSwipedDown(value: /* eventData */ SwipeEventData => Unit): Self = StObject.set(x, "onSwipedDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSwipedDownUndefined: Self = StObject.set(x, "onSwipedDown", js.undefined)
      
      @scala.inline
      def setOnSwipedLeft(value: /* eventData */ SwipeEventData => Unit): Self = StObject.set(x, "onSwipedLeft", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSwipedLeftUndefined: Self = StObject.set(x, "onSwipedLeft", js.undefined)
      
      @scala.inline
      def setOnSwipedRight(value: /* eventData */ SwipeEventData => Unit): Self = StObject.set(x, "onSwipedRight", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSwipedRightUndefined: Self = StObject.set(x, "onSwipedRight", js.undefined)
      
      @scala.inline
      def setOnSwipedUndefined: Self = StObject.set(x, "onSwiped", js.undefined)
      
      @scala.inline
      def setOnSwipedUp(value: /* eventData */ SwipeEventData => Unit): Self = StObject.set(x, "onSwipedUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSwipedUpUndefined: Self = StObject.set(x, "onSwipedUp", js.undefined)
      
      @scala.inline
      def setOnSwiping(value: /* eventData */ SwipeEventData => Unit): Self = StObject.set(x, "onSwiping", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSwipingUndefined: Self = StObject.set(x, "onSwiping", js.undefined)
      
      @scala.inline
      def setOnTap(value: /* hasEvent */ Event => Unit): Self = StObject.set(x, "onTap", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTapUndefined: Self = StObject.set(x, "onTap", js.undefined)
      
      @scala.inline
      def setPreventDefaultTouchmoveEvent(value: Boolean): Self = StObject.set(x, "preventDefaultTouchmoveEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventDefaultTouchmoveEventUndefined: Self = StObject.set(x, "preventDefaultTouchmoveEvent", js.undefined)
      
      @scala.inline
      def setRotationAngle(value: Double): Self = StObject.set(x, "rotationAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotationAngleUndefined: Self = StObject.set(x, "rotationAngle", js.undefined)
      
      @scala.inline
      def setTrackMouse(value: Boolean): Self = StObject.set(x, "trackMouse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackMouseUndefined: Self = StObject.set(x, "trackMouse", js.undefined)
      
      @scala.inline
      def setTrackTouch(value: Boolean): Self = StObject.set(x, "trackTouch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackTouchUndefined: Self = StObject.set(x, "trackTouch", js.undefined)
    }
  }
  
  /* Inlined std.Partial<react-swipeable.react-swipeable/dist/types.SwipeableCallbacks> & react-swipeable.react-swipeable/dist/types.ConfigurationOptions */
  @js.native
  trait SwipeablePropsWithDefaultOptions extends StObject {
    
    var delta: Double = js.native
    
    var onSwiped: js.UndefOr[SwipeCallback] = js.native
    
    var onSwipedDown: js.UndefOr[SwipeCallback] = js.native
    
    var onSwipedLeft: js.UndefOr[SwipeCallback] = js.native
    
    var onSwipedRight: js.UndefOr[SwipeCallback] = js.native
    
    var onSwipedUp: js.UndefOr[SwipeCallback] = js.native
    
    var onSwiping: js.UndefOr[SwipeCallback] = js.native
    
    var onTap: js.UndefOr[TapCallback] = js.native
    
    var preventDefaultTouchmoveEvent: Boolean = js.native
    
    var rotationAngle: Double = js.native
    
    var trackMouse: Boolean = js.native
    
    var trackTouch: Boolean = js.native
  }
  object SwipeablePropsWithDefaultOptions {
    
    @scala.inline
    def apply(
      delta: Double,
      preventDefaultTouchmoveEvent: Boolean,
      rotationAngle: Double,
      trackMouse: Boolean,
      trackTouch: Boolean
    ): SwipeablePropsWithDefaultOptions = {
      val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], preventDefaultTouchmoveEvent = preventDefaultTouchmoveEvent.asInstanceOf[js.Any], rotationAngle = rotationAngle.asInstanceOf[js.Any], trackMouse = trackMouse.asInstanceOf[js.Any], trackTouch = trackTouch.asInstanceOf[js.Any])
      __obj.asInstanceOf[SwipeablePropsWithDefaultOptions]
    }
    
    @scala.inline
    implicit class SwipeablePropsWithDefaultOptionsMutableBuilder[Self <: SwipeablePropsWithDefaultOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnSwiped(value: /* eventData */ SwipeEventData => Unit): Self = StObject.set(x, "onSwiped", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSwipedDown(value: /* eventData */ SwipeEventData => Unit): Self = StObject.set(x, "onSwipedDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSwipedDownUndefined: Self = StObject.set(x, "onSwipedDown", js.undefined)
      
      @scala.inline
      def setOnSwipedLeft(value: /* eventData */ SwipeEventData => Unit): Self = StObject.set(x, "onSwipedLeft", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSwipedLeftUndefined: Self = StObject.set(x, "onSwipedLeft", js.undefined)
      
      @scala.inline
      def setOnSwipedRight(value: /* eventData */ SwipeEventData => Unit): Self = StObject.set(x, "onSwipedRight", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSwipedRightUndefined: Self = StObject.set(x, "onSwipedRight", js.undefined)
      
      @scala.inline
      def setOnSwipedUndefined: Self = StObject.set(x, "onSwiped", js.undefined)
      
      @scala.inline
      def setOnSwipedUp(value: /* eventData */ SwipeEventData => Unit): Self = StObject.set(x, "onSwipedUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSwipedUpUndefined: Self = StObject.set(x, "onSwipedUp", js.undefined)
      
      @scala.inline
      def setOnSwiping(value: /* eventData */ SwipeEventData => Unit): Self = StObject.set(x, "onSwiping", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSwipingUndefined: Self = StObject.set(x, "onSwiping", js.undefined)
      
      @scala.inline
      def setOnTap(value: /* hasEvent */ Event => Unit): Self = StObject.set(x, "onTap", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTapUndefined: Self = StObject.set(x, "onTap", js.undefined)
      
      @scala.inline
      def setPreventDefaultTouchmoveEvent(value: Boolean): Self = StObject.set(x, "preventDefaultTouchmoveEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotationAngle(value: Double): Self = StObject.set(x, "rotationAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackMouse(value: Boolean): Self = StObject.set(x, "trackMouse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackTouch(value: Boolean): Self = StObject.set(x, "trackTouch", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SwipeableState extends StObject {
    
    var cleanUpTouch: js.UndefOr[js.Function0[Unit]] = js.native
    
    var el: js.UndefOr[HTMLElement] = js.native
    
    var eventData: js.UndefOr[SwipeEventData] = js.native
    
    var first: Boolean = js.native
    
    var initial: Vector2 = js.native
    
    var start: Double = js.native
    
    var swiping: Boolean = js.native
    
    var xy: Vector2 = js.native
  }
  object SwipeableState {
    
    @scala.inline
    def apply(first: Boolean, initial: Vector2, start: Double, swiping: Boolean, xy: Vector2): SwipeableState = {
      val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], swiping = swiping.asInstanceOf[js.Any], xy = xy.asInstanceOf[js.Any])
      __obj.asInstanceOf[SwipeableState]
    }
    
    @scala.inline
    implicit class SwipeableStateMutableBuilder[Self <: SwipeableState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCleanUpTouch(value: () => Unit): Self = StObject.set(x, "cleanUpTouch", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCleanUpTouchUndefined: Self = StObject.set(x, "cleanUpTouch", js.undefined)
      
      @scala.inline
      def setEl(value: HTMLElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElUndefined: Self = StObject.set(x, "el", js.undefined)
      
      @scala.inline
      def setEventData(value: SwipeEventData): Self = StObject.set(x, "eventData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventDataUndefined: Self = StObject.set(x, "eventData", js.undefined)
      
      @scala.inline
      def setFirst(value: Boolean): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitial(value: Vector2): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwiping(value: Boolean): Self = StObject.set(x, "swiping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXy(value: Vector2): Self = StObject.set(x, "xy", value.asInstanceOf[js.Any])
    }
  }
  
  type TapCallback = js.Function1[/* hasEvent */ Event, Unit]
  
  type Vector2 = js.Tuple2[Double, Double]
}
