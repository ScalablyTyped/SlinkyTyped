package typingsSlinky.reactMdTransition

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactMdTransition.typesMod.EnterHandler
import typingsSlinky.reactMdTransition.typesMod.ExitHandler
import typingsSlinky.reactMdTransition.useCSSTransitionMod.CSSTransitionReturnValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useCrossFadeMod {
  
  @JSImport("@react-md/transition/types/useCrossFade", "useCrossFade")
  @js.native
  def useCrossFade[E /* <: HTMLElement */](): CSSTransitionReturnValue[E] = js.native
  @JSImport("@react-md/transition/types/useCrossFade", "useCrossFade")
  @js.native
  def useCrossFade[E /* <: HTMLElement */](
    hasAppearTemporaryTransitionInClassNameOnEnterOnEnteringOnEnteredOnExitOnExitingOnExited: CrossFadeOptions[E]
  ): CSSTransitionReturnValue[E] = js.native
  
  /* Inlined parent std.Omit<@react-md/transition.@react-md/transition/types/types.CSSTransitionOptions<E>, 'timeout' | 'classNames' | 'transitionIn'> */
  @js.native
  trait CrossFadeOptions[E /* <: HTMLElement */] extends StObject {
    
    var appear: js.UndefOr[Boolean] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var enter: js.UndefOr[Boolean] = js.native
    
    var exit: js.UndefOr[Boolean] = js.native
    
    var onEnter: js.UndefOr[EnterHandler[E]] = js.native
    
    var onEntered: js.UndefOr[EnterHandler[E]] = js.native
    
    var onEntering: js.UndefOr[EnterHandler[E]] = js.native
    
    var onExit: js.UndefOr[ExitHandler[E]] = js.native
    
    var onExited: js.UndefOr[ExitHandler[E]] = js.native
    
    var onExiting: js.UndefOr[ExitHandler[E]] = js.native
    
    var ref: js.UndefOr[Ref[E]] = js.native
    
    var temporary: js.UndefOr[Boolean] = js.native
    
    var transitionIn: js.UndefOr[Boolean] = js.native
  }
  object CrossFadeOptions {
    
    @scala.inline
    def apply[E /* <: HTMLElement */](): CrossFadeOptions[E] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CrossFadeOptions[E]]
    }
    
    @scala.inline
    implicit class CrossFadeOptionsMutableBuilder[Self <: CrossFadeOptions[_], E /* <: HTMLElement */] (val x: Self with CrossFadeOptions[E]) extends AnyVal {
      
      @scala.inline
      def setAppear(value: Boolean): Self = StObject.set(x, "appear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppearUndefined: Self = StObject.set(x, "appear", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setEnter(value: Boolean): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
      
      @scala.inline
      def setExit(value: Boolean): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
      
      @scala.inline
      def setOnEnter(value: (E, /* isAppearing */ Boolean) => Unit): Self = StObject.set(x, "onEnter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
      
      @scala.inline
      def setOnEntered(value: (E, /* isAppearing */ Boolean) => Unit): Self = StObject.set(x, "onEntered", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnEnteredUndefined: Self = StObject.set(x, "onEntered", js.undefined)
      
      @scala.inline
      def setOnEntering(value: (E, /* isAppearing */ Boolean) => Unit): Self = StObject.set(x, "onEntering", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnEnteringUndefined: Self = StObject.set(x, "onEntering", js.undefined)
      
      @scala.inline
      def setOnExit(value: E => Unit): Self = StObject.set(x, "onExit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnExitUndefined: Self = StObject.set(x, "onExit", js.undefined)
      
      @scala.inline
      def setOnExited(value: E => Unit): Self = StObject.set(x, "onExited", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnExitedUndefined: Self = StObject.set(x, "onExited", js.undefined)
      
      @scala.inline
      def setOnExiting(value: E => Unit): Self = StObject.set(x, "onExiting", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnExitingUndefined: Self = StObject.set(x, "onExiting", js.undefined)
      
      @scala.inline
      def setRef(value: Ref[E]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefFunction1(value: /* instance */ E | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRefNull: Self = StObject.set(x, "ref", null)
      
      @scala.inline
      def setRefRefObject(value: ReactRef[E]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      @scala.inline
      def setTemporary(value: Boolean): Self = StObject.set(x, "temporary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemporaryUndefined: Self = StObject.set(x, "temporary", js.undefined)
      
      @scala.inline
      def setTransitionIn(value: Boolean): Self = StObject.set(x, "transitionIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionInUndefined: Self = StObject.set(x, "transitionIn", js.undefined)
    }
  }
}
