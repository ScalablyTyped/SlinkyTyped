package typingsSlinky.materialUi.MaterialUI

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Node
import typingsSlinky.materialUi.anon.Left
import typingsSlinky.std.EventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Utils {
  
  object ColorManipulator {
    
    @js.native
    trait MuiColorObject extends StObject {
      
      var `type`: String = js.native
      
      var values: js.Array[Double] = js.native
    }
    object MuiColorObject {
      
      @scala.inline
      def apply(`type`: String, values: js.Array[Double]): MuiColorObject = {
        val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[MuiColorObject]
      }
      
      @scala.inline
      implicit class MuiColorObjectMutableBuilder[Self <: MuiColorObject] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValues(value: js.Array[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValuesVarargs(value: Double*): Self = StObject.set(x, "values", js.Array(value :_*))
      }
    }
  }
  
  @js.native
  trait Dom extends StObject {
    
    def addClass(el: Element, className: String): Unit = js.native
    
    def forceRedraw(el: HTMLElement): Unit = js.native
    
    def getStyleAttributeAsNumber(el: HTMLElement, attr: String): Double = js.native
    
    def hasClass(el: Element, className: String): Boolean = js.native
    
    def isDescendant(parent: Node, child: Node): Boolean = js.native
    
    def offset(el: Element): Left = js.native
    
    def removeClass(el: Element, className: String): Unit = js.native
    
    def toggleClass(el: Element, className: String): Unit = js.native
    
    def withoutTransition(el: HTMLElement, callback: js.Function0[Unit]): Unit = js.native
  }
  object Dom {
    
    @scala.inline
    def apply(
      addClass: (Element, String) => Unit,
      forceRedraw: HTMLElement => Unit,
      getStyleAttributeAsNumber: (HTMLElement, String) => Double,
      hasClass: (Element, String) => Boolean,
      isDescendant: (Node, Node) => Boolean,
      offset: Element => Left,
      removeClass: (Element, String) => Unit,
      toggleClass: (Element, String) => Unit,
      withoutTransition: (HTMLElement, js.Function0[Unit]) => Unit
    ): Dom = {
      val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction2(addClass), forceRedraw = js.Any.fromFunction1(forceRedraw), getStyleAttributeAsNumber = js.Any.fromFunction2(getStyleAttributeAsNumber), hasClass = js.Any.fromFunction2(hasClass), isDescendant = js.Any.fromFunction2(isDescendant), offset = js.Any.fromFunction1(offset), removeClass = js.Any.fromFunction2(removeClass), toggleClass = js.Any.fromFunction2(toggleClass), withoutTransition = js.Any.fromFunction2(withoutTransition))
      __obj.asInstanceOf[Dom]
    }
    
    @scala.inline
    implicit class DomMutableBuilder[Self <: Dom] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddClass(value: (Element, String) => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction2(value))
      
      @scala.inline
      def setForceRedraw(value: HTMLElement => Unit): Self = StObject.set(x, "forceRedraw", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetStyleAttributeAsNumber(value: (HTMLElement, String) => Double): Self = StObject.set(x, "getStyleAttributeAsNumber", js.Any.fromFunction2(value))
      
      @scala.inline
      def setHasClass(value: (Element, String) => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIsDescendant(value: (Node, Node) => Boolean): Self = StObject.set(x, "isDescendant", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOffset(value: Element => Left): Self = StObject.set(x, "offset", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveClass(value: (Element, String) => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction2(value))
      
      @scala.inline
      def setToggleClass(value: (Element, String) => Unit): Self = StObject.set(x, "toggleClass", js.Any.fromFunction2(value))
      
      @scala.inline
      def setWithoutTransition(value: (HTMLElement, js.Function0[Unit]) => Unit): Self = StObject.set(x, "withoutTransition", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait Events extends StObject {
    
    def isKeyboard(e: Event): Boolean = js.native
    
    def off(el: Element, `type`: String, callback: EventListener): Unit = js.native
    
    def on(el: Element, `type`: String, callback: EventListener): Unit = js.native
    
    def once(el: Element, `type`: String, callback: EventListener): Unit = js.native
  }
  object Events {
    
    @scala.inline
    def apply(
      isKeyboard: Event => Boolean,
      off: (Element, String, EventListener) => Unit,
      on: (Element, String, EventListener) => Unit,
      once: (Element, String, EventListener) => Unit
    ): Events = {
      val __obj = js.Dynamic.literal(isKeyboard = js.Any.fromFunction1(isKeyboard), off = js.Any.fromFunction3(off), on = js.Any.fromFunction3(on), once = js.Any.fromFunction3(once))
      __obj.asInstanceOf[Events]
    }
    
    @scala.inline
    implicit class EventsMutableBuilder[Self <: Events] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsKeyboard(value: Event => Boolean): Self = StObject.set(x, "isKeyboard", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOff(value: (Element, String, EventListener) => Unit): Self = StObject.set(x, "off", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOn(value: (Element, String, EventListener) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnce(value: (Element, String, EventListener) => Unit): Self = StObject.set(x, "once", js.Any.fromFunction3(value))
    }
  }
}
