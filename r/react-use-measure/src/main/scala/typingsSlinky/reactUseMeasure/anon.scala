package typingsSlinky.reactUseMeasure

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.reactUseMeasure.mod.ResizeObserver
import typingsSlinky.reactUseMeasure.mod.ResizeObserverCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Instantiable extends Instantiable1[/* cb */ ResizeObserverCallback, ResizeObserver]
  
  @js.native
  trait Resize extends StObject {
    
    var resize: Double = js.native
    
    var scroll: Double = js.native
  }
  object Resize {
    
    @scala.inline
    def apply(resize: Double, scroll: Double): Resize = {
      val __obj = js.Dynamic.literal(resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any])
      __obj.asInstanceOf[Resize]
    }
    
    @scala.inline
    implicit class ResizeMutableBuilder[Self <: Resize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResize(value: Double): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScroll(value: Double): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
    }
  }
}
