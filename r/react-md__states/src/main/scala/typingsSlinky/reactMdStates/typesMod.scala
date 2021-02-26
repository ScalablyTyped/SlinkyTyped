package typingsSlinky.reactMdStates

import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import typingsSlinky.react.mod.KeyboardEventHandler
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.react.mod.TouchEventHandler
import typingsSlinky.react.mod.TouchList
import typingsSlinky.reactMdStates.anon.CSSPropertiesleftnumberto
import typingsSlinky.reactMdTransition.typesMod.TransitionTimeout
import typingsSlinky.reactTransitionGroup.csstransitionMod.CSSTransitionClassNames
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactMdStates.reactMdStatesStrings.onKeyDown
    - typingsSlinky.reactMdStates.reactMdStatesStrings.onKeyUp
    - typingsSlinky.reactMdStates.reactMdStatesStrings.onMouseDown
    - typingsSlinky.reactMdStates.reactMdStatesStrings.onMouseUp
    - typingsSlinky.reactMdStates.reactMdStatesStrings.onMouseLeave
    - typingsSlinky.reactMdStates.reactMdStatesStrings.onClick
    - typingsSlinky.reactMdStates.reactMdStatesStrings.onTouchStart
    - typingsSlinky.reactMdStates.reactMdStatesStrings.onTouchMove
    - typingsSlinky.reactMdStates.reactMdStatesStrings.onTouchEnd
  */
  trait MergableRippleHandlerNames extends StObject
  object MergableRippleHandlerNames {
    
    @scala.inline
    def onClick: typingsSlinky.reactMdStates.reactMdStatesStrings.onClick = "onClick".asInstanceOf[typingsSlinky.reactMdStates.reactMdStatesStrings.onClick]
    
    @scala.inline
    def onKeyDown: typingsSlinky.reactMdStates.reactMdStatesStrings.onKeyDown = "onKeyDown".asInstanceOf[typingsSlinky.reactMdStates.reactMdStatesStrings.onKeyDown]
    
    @scala.inline
    def onKeyUp: typingsSlinky.reactMdStates.reactMdStatesStrings.onKeyUp = "onKeyUp".asInstanceOf[typingsSlinky.reactMdStates.reactMdStatesStrings.onKeyUp]
    
    @scala.inline
    def onMouseDown: typingsSlinky.reactMdStates.reactMdStatesStrings.onMouseDown = "onMouseDown".asInstanceOf[typingsSlinky.reactMdStates.reactMdStatesStrings.onMouseDown]
    
    @scala.inline
    def onMouseLeave: typingsSlinky.reactMdStates.reactMdStatesStrings.onMouseLeave = "onMouseLeave".asInstanceOf[typingsSlinky.reactMdStates.reactMdStatesStrings.onMouseLeave]
    
    @scala.inline
    def onMouseUp: typingsSlinky.reactMdStates.reactMdStatesStrings.onMouseUp = "onMouseUp".asInstanceOf[typingsSlinky.reactMdStates.reactMdStatesStrings.onMouseUp]
    
    @scala.inline
    def onTouchEnd: typingsSlinky.reactMdStates.reactMdStatesStrings.onTouchEnd = "onTouchEnd".asInstanceOf[typingsSlinky.reactMdStates.reactMdStatesStrings.onTouchEnd]
    
    @scala.inline
    def onTouchMove: typingsSlinky.reactMdStates.reactMdStatesStrings.onTouchMove = "onTouchMove".asInstanceOf[typingsSlinky.reactMdStates.reactMdStatesStrings.onTouchMove]
    
    @scala.inline
    def onTouchStart: typingsSlinky.reactMdStates.reactMdStatesStrings.onTouchStart = "onTouchStart".asInstanceOf[typingsSlinky.reactMdStates.reactMdStatesStrings.onTouchStart]
  }
  
  /* Inlined std.Pick<react.react.HTMLAttributes<E>, @react-md/states.@react-md/states/types/ripples/types.MergableRippleHandlerNames> */
  @js.native
  trait MergableRippleHandlers[E /* <: HTMLElement */] extends StObject {
    
    var onClick: js.UndefOr[MouseEventHandler[E]] = js.native
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[E]] = js.native
    
    var onKeyUp: js.UndefOr[KeyboardEventHandler[E]] = js.native
    
    var onMouseDown: js.UndefOr[MouseEventHandler[E]] = js.native
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[E]] = js.native
    
    var onMouseUp: js.UndefOr[MouseEventHandler[E]] = js.native
    
    var onTouchEnd: js.UndefOr[TouchEventHandler[E]] = js.native
    
    var onTouchMove: js.UndefOr[TouchEventHandler[E]] = js.native
    
    var onTouchStart: js.UndefOr[TouchEventHandler[E]] = js.native
  }
  object MergableRippleHandlers {
    
    @scala.inline
    def apply[E /* <: HTMLElement */](): MergableRippleHandlers[E] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MergableRippleHandlers[E]]
    }
    
    @scala.inline
    implicit class MergableRippleHandlersMutableBuilder[Self <: MergableRippleHandlers[_], E /* <: HTMLElement */] (val x: Self with MergableRippleHandlers[E]) extends AnyVal {
      
      @scala.inline
      def setOnClick(value: SyntheticMouseEvent[E] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: SyntheticKeyboardEvent[E] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOnKeyUp(value: SyntheticKeyboardEvent[E] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      @scala.inline
      def setOnMouseDown(value: SyntheticMouseEvent[E] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: SyntheticMouseEvent[E] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setOnMouseUp(value: SyntheticMouseEvent[E] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      @scala.inline
      def setOnTouchEnd(value: SyntheticTouchEvent[E] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      @scala.inline
      def setOnTouchMove(value: SyntheticTouchEvent[E] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      @scala.inline
      def setOnTouchStart(value: SyntheticTouchEvent[E] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
    }
  }
  
  /* Inlined std.Pick<react.react.MouseEvent<E, react.react.NativeMouseEvent>, 'target' | 'currentTarget' | 'type'> & std.Partial<std.Pick<react.react.MouseEvent<E, react.react.NativeMouseEvent>, 'pageX' | 'pageY' | 'button'>> & std.Partial<std.Pick<react.react.KeyboardEvent<E>, 'key'>> & std.Partial<std.Pick<react.react.TouchEvent<E>, 'touches'>> */
  @js.native
  trait RippleEvent[E /* <: HTMLElement */] extends StObject {
    
    var button: js.UndefOr[Double] = js.native
    
    var currentTarget: EventTarget with E = js.native
    
    var key: js.UndefOr[String] = js.native
    
    var pageX: js.UndefOr[Double] = js.native
    
    var pageY: js.UndefOr[Double] = js.native
    
    var target: EventTarget = js.native
    
    var touches: js.UndefOr[TouchList] = js.native
    
    var `type`: String = js.native
  }
  object RippleEvent {
    
    @scala.inline
    def apply[E /* <: HTMLElement */](currentTarget: EventTarget with E, target: EventTarget, `type`: String): RippleEvent[E] = {
      val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RippleEvent[E]]
    }
    
    @scala.inline
    implicit class RippleEventMutableBuilder[Self <: RippleEvent[_], E /* <: HTMLElement */] (val x: Self with RippleEvent[E]) extends AnyVal {
      
      @scala.inline
      def setButton(value: Double): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
      
      @scala.inline
      def setCurrentTarget(value: EventTarget with E): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setPageX(value: Double): Self = StObject.set(x, "pageX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageXUndefined: Self = StObject.set(x, "pageX", js.undefined)
      
      @scala.inline
      def setPageY(value: Double): Self = StObject.set(x, "pageY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageYUndefined: Self = StObject.set(x, "pageY", js.undefined)
      
      @scala.inline
      def setTarget(value: EventTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouches(value: TouchList): Self = StObject.set(x, "touches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchesUndefined: Self = StObject.set(x, "touches", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RippleState extends StObject {
    
    var entered: Boolean = js.native
    
    var exiting: Boolean = js.native
    
    var holding: Boolean = js.native
    
    var startTime: Double = js.native
    
    var style: CSSPropertiesleftnumberto = js.native
    
    var `type`: RippleType = js.native
  }
  object RippleState {
    
    @scala.inline
    def apply(
      entered: Boolean,
      exiting: Boolean,
      holding: Boolean,
      startTime: Double,
      style: CSSPropertiesleftnumberto,
      `type`: RippleType
    ): RippleState = {
      val __obj = js.Dynamic.literal(entered = entered.asInstanceOf[js.Any], exiting = exiting.asInstanceOf[js.Any], holding = holding.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RippleState]
    }
    
    @scala.inline
    implicit class RippleStateMutableBuilder[Self <: RippleState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEntered(value: Boolean): Self = StObject.set(x, "entered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExiting(value: Boolean): Self = StObject.set(x, "exiting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHolding(value: Boolean): Self = StObject.set(x, "holding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: CSSPropertiesleftnumberto): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: RippleType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactMdStates.reactMdStatesStrings.mouse
    - typingsSlinky.reactMdStates.reactMdStatesStrings.touch
    - typingsSlinky.reactMdStates.reactMdStatesStrings.keyboard
    - typingsSlinky.reactMdStates.reactMdStatesStrings.programmatic
  */
  trait RippleType extends StObject
  object RippleType {
    
    @scala.inline
    def keyboard: typingsSlinky.reactMdStates.reactMdStatesStrings.keyboard = "keyboard".asInstanceOf[typingsSlinky.reactMdStates.reactMdStatesStrings.keyboard]
    
    @scala.inline
    def mouse: typingsSlinky.reactMdStates.reactMdStatesStrings.mouse = "mouse".asInstanceOf[typingsSlinky.reactMdStates.reactMdStatesStrings.mouse]
    
    @scala.inline
    def programmatic: typingsSlinky.reactMdStates.reactMdStatesStrings.programmatic = "programmatic".asInstanceOf[typingsSlinky.reactMdStates.reactMdStatesStrings.programmatic]
    
    @scala.inline
    def touch: typingsSlinky.reactMdStates.reactMdStatesStrings.touch = "touch".asInstanceOf[typingsSlinky.reactMdStates.reactMdStatesStrings.touch]
  }
  
  @js.native
  trait RipplesOptions[E /* <: HTMLElement */] extends StObject {
    
    /**
      * Boolean if the ripple effect should not occur after a programmatic trigger
      * of a click event. This would normally happen if using `aria-activedescendat`
      * movement and the user "presses" the current active element.
      */
    var disableProgrammaticRipple: js.UndefOr[Boolean] = js.native
    
    /**
      * Boolean if the ripple effeect should be disabled. This will make the `useRipples`
      * hook not provide any additional logic for the provided handlers.
      */
    var disableRipple: js.UndefOr[Boolean] = js.native
    
    /**
      * Boolean if the spacebar click effect should be disabled. This should normally
      * state disabled unless dealing with links.
      */
    var disableSpacebarClick: js.UndefOr[Boolean] = js.native
    
    /**
      * An optional boolean if the element is currently disabled. This will ensure
      * that the ripple states are not applied during these times.
      */
    var disabled: js.UndefOr[Boolean] = js.native
    
    /**
      * An optional object of event handlers to merge with the required
      * ripple trigger event handlers.
      */
    var handlers: js.UndefOr[MergableRippleHandlers[E]] = js.native
    
    /**
      * An optional className to apply to the ripple element.
      */
    var rippleClassName: js.UndefOr[String] = js.native
    
    /**
      * An optional object containing the different transition class names for the ripple
      * effect. If this is undefined, it will be extracted from the current `StatesContext`
      * instead.
      */
    var rippleClassNames: js.UndefOr[CSSTransitionClassNames] = js.native
    
    /**
      * An optional className to apply to the ripple's container element.
      */
    var rippleContainerClassName: js.UndefOr[String] = js.native
    
    /**
      * An optional timeout duration for the ripple effect. If this is undefined, its value
      * will be extracted from the current `StatesContext` instead.
      */
    var rippleTimeout: js.UndefOr[TransitionTimeout] = js.native
  }
  object RipplesOptions {
    
    @scala.inline
    def apply[E /* <: HTMLElement */](): RipplesOptions[E] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RipplesOptions[E]]
    }
    
    @scala.inline
    implicit class RipplesOptionsMutableBuilder[Self <: RipplesOptions[_], E /* <: HTMLElement */] (val x: Self with RipplesOptions[E]) extends AnyVal {
      
      @scala.inline
      def setDisableProgrammaticRipple(value: Boolean): Self = StObject.set(x, "disableProgrammaticRipple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableProgrammaticRippleUndefined: Self = StObject.set(x, "disableProgrammaticRipple", js.undefined)
      
      @scala.inline
      def setDisableRipple(value: Boolean): Self = StObject.set(x, "disableRipple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableRippleUndefined: Self = StObject.set(x, "disableRipple", js.undefined)
      
      @scala.inline
      def setDisableSpacebarClick(value: Boolean): Self = StObject.set(x, "disableSpacebarClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableSpacebarClickUndefined: Self = StObject.set(x, "disableSpacebarClick", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setHandlers(value: MergableRippleHandlers[E]): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandlersUndefined: Self = StObject.set(x, "handlers", js.undefined)
      
      @scala.inline
      def setRippleClassName(value: String): Self = StObject.set(x, "rippleClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRippleClassNameUndefined: Self = StObject.set(x, "rippleClassName", js.undefined)
      
      @scala.inline
      def setRippleClassNames(value: CSSTransitionClassNames): Self = StObject.set(x, "rippleClassNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRippleClassNamesUndefined: Self = StObject.set(x, "rippleClassNames", js.undefined)
      
      @scala.inline
      def setRippleContainerClassName(value: String): Self = StObject.set(x, "rippleContainerClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRippleContainerClassNameUndefined: Self = StObject.set(x, "rippleContainerClassName", js.undefined)
      
      @scala.inline
      def setRippleTimeout(value: TransitionTimeout): Self = StObject.set(x, "rippleTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRippleTimeoutUndefined: Self = StObject.set(x, "rippleTimeout", js.undefined)
    }
  }
  
  type RipplesState = js.Array[RippleState]
}
