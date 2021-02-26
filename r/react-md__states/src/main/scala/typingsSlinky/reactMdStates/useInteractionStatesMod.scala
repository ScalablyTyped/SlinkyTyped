package typingsSlinky.reactMdStates

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import typingsSlinky.reactMdStates.typesMod.MergableRippleHandlers
import typingsSlinky.reactMdTransition.typesMod.TransitionTimeout
import typingsSlinky.reactTransitionGroup.csstransitionMod.CSSTransitionClassNames
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useInteractionStatesMod {
  
  @JSImport("@react-md/states/types/useInteractionStates", "useInteractionStates")
  @js.native
  def useInteractionStates[E /* <: HTMLElement */](): ReturnValue[E] = js.native
  @JSImport("@react-md/states/types/useInteractionStates", "useInteractionStates")
  @js.native
  def useInteractionStates[E /* <: HTMLElement */](options: InteractionStatesOptions[E]): ReturnValue[E] = js.native
  
  /* Inlined parent std.Partial<@react-md/states.@react-md/states/types/StatesConfig.StatesConfigContextType> */
  /* Inlined parent @react-md/states.@react-md/states/types/ripples/types.RipplesOptions<E> */
  @js.native
  trait InteractionStatesOptions[E /* <: HTMLElement */] extends StObject {
    
    /**
      * An optional className to merge with the different interaction states.
      */
    var className: js.UndefOr[String] = js.native
    
    /**
      * Boolean if the enter keyboard click polyfill should be completely disabled.
      * This is generally used if the keyboard functionality is already built-in to
      * the element like buttons or labels.
      */
    var disableEnterClick: js.UndefOr[Boolean] = js.native
    
    /**
      * Boolean if the component should fallback to using the custom pressed class
      * names when ripples are disabled.
      *
      * @default false
      */
    var disablePressedFallback: js.UndefOr[Boolean] = js.native
    
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
      * Boolean if the spacebar should not trigger a click event when using the
      * user pressed spacebar on a focusable element. You _normally_ want the
      * spacebar to also trigger a click event , but there are a few cases where it
      * should not (like custom links).
      *
      * When this is disabled, it will also make sure that the ripple and pressed
      * effects are not triggered from a spacebar click.
      *
      * @default false
      */
    var disableSpacebarClick: js.UndefOr[Boolean] = js.native
    
    /**
      * An optional boolean if the element is currently disabled. This will ensure
      * that the ripple states are not applied during these times.
      */
    var disabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Boolean if the element should be able to gain both the ripple effect and
      * the pressed states changes. This will only be enabled if both the
      * `disableRipple` and `disabledPressedFallback` are still `false`
      */
    var enablePressedAndRipple: js.UndefOr[Boolean] = js.native
    
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
  object InteractionStatesOptions {
    
    @scala.inline
    def apply[E /* <: HTMLElement */](): InteractionStatesOptions[E] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InteractionStatesOptions[E]]
    }
    
    @scala.inline
    implicit class InteractionStatesOptionsMutableBuilder[Self <: InteractionStatesOptions[_], E /* <: HTMLElement */] (val x: Self with InteractionStatesOptions[E]) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDisableEnterClick(value: Boolean): Self = StObject.set(x, "disableEnterClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableEnterClickUndefined: Self = StObject.set(x, "disableEnterClick", js.undefined)
      
      @scala.inline
      def setDisablePressedFallback(value: Boolean): Self = StObject.set(x, "disablePressedFallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisablePressedFallbackUndefined: Self = StObject.set(x, "disablePressedFallback", js.undefined)
      
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
      def setEnablePressedAndRipple(value: Boolean): Self = StObject.set(x, "enablePressedAndRipple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnablePressedAndRippleUndefined: Self = StObject.set(x, "enablePressedAndRipple", js.undefined)
      
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
  
  @js.native
  trait ReturnValue[E /* <: HTMLElement */] extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var handlers: MergableRippleHandlers[E] = js.native
    
    var ripples: ReactElement = js.native
  }
  object ReturnValue {
    
    @scala.inline
    def apply[E /* <: HTMLElement */](handlers: MergableRippleHandlers[E]): ReturnValue[E] = {
      val __obj = js.Dynamic.literal(handlers = handlers.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReturnValue[E]]
    }
    
    @scala.inline
    implicit class ReturnValueMutableBuilder[Self <: ReturnValue[_], E /* <: HTMLElement */] (val x: Self with ReturnValue[E]) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setHandlers(value: MergableRippleHandlers[E]): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRipples(value: ReactElement): Self = StObject.set(x, "ripples", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRipplesUndefined: Self = StObject.set(x, "ripples", js.undefined)
    }
  }
}
