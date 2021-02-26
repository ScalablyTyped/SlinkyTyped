package typingsSlinky.jqueryMouseExit

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jquery.JQuery.TriggeredEvent
import typingsSlinky.jqueryMouseExit.jqueryMouseExitStrings.mouseExit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* Inlined std.Partial<{  lostFocus :std.HTMLElement,   gainedFocus :std.HTMLElement}> */
  @js.native
  trait FocusElements extends StObject {
    
    var gainedFocus: js.UndefOr[HTMLElement] = js.native
    
    var lostFocus: js.UndefOr[HTMLElement] = js.native
  }
  object FocusElements {
    
    @scala.inline
    def apply(): FocusElements = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FocusElements]
    }
    
    @scala.inline
    implicit class FocusElementsMutableBuilder[Self <: FocusElements] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGainedFocus(value: HTMLElement): Self = StObject.set(x, "gainedFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGainedFocusUndefined: Self = StObject.set(x, "gainedFocus", js.undefined)
      
      @scala.inline
      def setLostFocus(value: HTMLElement): Self = StObject.set(x, "lostFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLostFocusUndefined: Self = StObject.set(x, "lostFocus", js.undefined)
    }
  }
  
  /* Inlined std.Partial<{  delay :number}> */
  @js.native
  trait Options extends StObject {
    
    var delay: js.UndefOr[Double] = js.native
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
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    }
  }
  
  object global {
    
    @js.native
    trait JQuery extends StObject {
      
      def mouseExit(): JQuery = js.native
      def mouseExit(options: Options): JQuery = js.native
      
      @JSName("on")
      def on_mouseExit(
        event: mouseExit,
        handler: js.Function2[/* event */ TriggeredEvent[HTMLElement, _, _, _], /* data */ FocusElements, Unit]
      ): JQuery = js.native
    }
  }
}
