package typingsSlinky.noScroll

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("no-scroll", JSImport.Namespace)
  @js.native
  val ^ : NoScroll = js.native
  
  @js.native
  trait NoScroll extends StObject {
    
    def off(): Unit = js.native
    
    def on(): Unit = js.native
    
    def toggle(): Unit = js.native
  }
  object NoScroll {
    
    @scala.inline
    def apply(off: () => Unit, on: () => Unit, toggle: () => Unit): NoScroll = {
      val __obj = js.Dynamic.literal(off = js.Any.fromFunction0(off), on = js.Any.fromFunction0(on), toggle = js.Any.fromFunction0(toggle))
      __obj.asInstanceOf[NoScroll]
    }
    
    @scala.inline
    implicit class NoScrollMutableBuilder[Self <: NoScroll] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOff(value: () => Unit): Self = StObject.set(x, "off", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOn(value: () => Unit): Self = StObject.set(x, "on", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToggle(value: () => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction0(value))
    }
  }
  
  type _To = NoScroll
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: NoScroll = ^
}
