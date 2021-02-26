package typingsSlinky.jumpJs

import org.scalajs.dom.raw.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jump.js", JSImport.Namespace)
  @js.native
  def apply(target: String): Unit = js.native
  @JSImport("jump.js", JSImport.Namespace)
  @js.native
  def apply(target: String, opts: Options): Unit = js.native
  @JSImport("jump.js", JSImport.Namespace)
  @js.native
  def apply(target: Element): Unit = js.native
  @JSImport("jump.js", JSImport.Namespace)
  @js.native
  def apply(target: Element, opts: Options): Unit = js.native
  @JSImport("jump.js", JSImport.Namespace)
  @js.native
  def apply(target: Double): Unit = js.native
  @JSImport("jump.js", JSImport.Namespace)
  @js.native
  def apply(target: Double, opts: Options): Unit = js.native
  
  @js.native
  trait Options extends StObject {
    
    var a11y: js.UndefOr[Boolean] = js.native
    
    var callback: js.UndefOr[js.Function0[Unit]] = js.native
    
    var duration: js.UndefOr[Double | (js.Function1[/* distance */ Double, Double])] = js.native
    
    var easing: js.UndefOr[TransitionFunc] = js.native
    
    var offset: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA11y(value: Boolean): Self = StObject.set(x, "a11y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setA11yUndefined: Self = StObject.set(x, "a11y", js.undefined)
      
      @scala.inline
      def setCallback(value: () => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setDuration(value: Double | (js.Function1[/* distance */ Double, Double])): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationFunction1(value: /* distance */ Double => Double): Self = StObject.set(x, "duration", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setEasing(value: (/* t */ Double, /* b */ Double, /* c */ Double, /* d */ Double) => Double): Self = StObject.set(x, "easing", js.Any.fromFunction4(value))
      
      @scala.inline
      def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    }
  }
  
  type TransitionFunc = js.Function4[/* t */ Double, /* b */ Double, /* c */ Double, /* d */ Double, Double]
}
