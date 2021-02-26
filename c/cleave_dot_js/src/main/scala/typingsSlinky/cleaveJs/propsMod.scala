package typingsSlinky.cleaveJs

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLInputElement
import typingsSlinky.cleaveJs.optionsMod.CleaveOptions
import typingsSlinky.react.mod.EventHandler
import typingsSlinky.react.mod.InputHTMLAttributes
import typingsSlinky.react.mod.ReactInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object propsMod {
  
  @js.native
  trait ChangeEvent[T]
    extends typingsSlinky.react.mod.ChangeEvent[T]
  object ChangeEvent {
    
    @scala.inline
    def apply[T](
      bubbles: Boolean,
      cancelable: Boolean,
      currentTarget: EventTarget with T,
      defaultPrevented: Boolean,
      eventPhase: Double,
      isDefaultPrevented: () => Boolean,
      isPropagationStopped: () => Boolean,
      isTrusted: Boolean,
      nativeEvent: Event,
      persist: () => Unit,
      preventDefault: () => Unit,
      stopPropagation: () => Unit,
      target: EventTarget with T,
      timeStamp: Double,
      `type`: String
    ): ChangeEvent[T] = {
      val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), isTrusted = isTrusted.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], persist = js.Any.fromFunction0(persist), preventDefault = js.Any.fromFunction0(preventDefault), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChangeEvent[T]]
    }
  }
  
  type ChangeEventHandler[T] = EventHandler[ChangeEvent[T]]
  
  type InitHandler = js.Function1[/* owner */ ReactInstance, Unit]
  
  @js.native
  trait Props extends InputHTMLAttributes[HTMLInputElement] {
    
    var htmlRef: js.UndefOr[js.Function1[/* i */ js.Any, Unit]] = js.native
    
    @JSName("onChange")
    var onChange_Props: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.native
    
    var onInit: js.UndefOr[InitHandler] = js.native
    
    var options: CleaveOptions = js.native
  }
  object Props {
    
    @scala.inline
    def apply(options: CleaveOptions): Props = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHtmlRef(value: /* i */ js.Any => Unit): Self = StObject.set(x, "htmlRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHtmlRefUndefined: Self = StObject.set(x, "htmlRef", js.undefined)
      
      @scala.inline
      def setOnChange(value: ChangeEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnInit(value: /* owner */ ReactInstance => Unit): Self = StObject.set(x, "onInit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInitUndefined: Self = StObject.set(x, "onInit", js.undefined)
      
      @scala.inline
      def setOptions(value: CleaveOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
}
