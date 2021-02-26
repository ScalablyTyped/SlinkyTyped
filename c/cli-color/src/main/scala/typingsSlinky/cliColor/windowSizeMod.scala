package typingsSlinky.cliColor

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object windowSizeMod extends Shortcut {
  
  @JSImport("cli-color/window-size", JSImport.Namespace)
  @js.native
  val ^ : WindowSize = js.native
  
  @js.native
  trait WindowSize extends StObject {
    
    /**
      * Returns terminal height
      */
    val height: Double = js.native
    
    /**
      * Returns terminal width
      */
    val width: Double = js.native
  }
  object WindowSize {
    
    @scala.inline
    def apply(height: Double, width: Double): WindowSize = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[WindowSize]
    }
    
    @scala.inline
    implicit class WindowSizeMutableBuilder[Self <: WindowSize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = WindowSize
  
  /* This means you don't have to write `^`, but can instead just say `windowSizeMod.foo` */
  override def _to: WindowSize = ^
}
