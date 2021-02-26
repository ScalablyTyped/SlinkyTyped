package typingsSlinky.cathoQuantum

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.cathoQuantum.anon.Columns
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object breakpointsMod extends Shortcut {
  
  @JSImport("@catho/quantum/Breakpoints", JSImport.Default)
  @js.native
  val default: Breakpoints = js.native
  
  @js.native
  trait Breakpoints extends StObject {
    
    var large: Columns = js.native
    
    var medium: Columns = js.native
    
    var small: Columns = js.native
    
    var xlarge: Columns = js.native
    
    var xsmall: Columns = js.native
  }
  object Breakpoints {
    
    @scala.inline
    def apply(large: Columns, medium: Columns, small: Columns, xlarge: Columns, xsmall: Columns): Breakpoints = {
      val __obj = js.Dynamic.literal(large = large.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any], xlarge = xlarge.asInstanceOf[js.Any], xsmall = xsmall.asInstanceOf[js.Any])
      __obj.asInstanceOf[Breakpoints]
    }
    
    @scala.inline
    implicit class BreakpointsMutableBuilder[Self <: Breakpoints] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLarge(value: Columns): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMedium(value: Columns): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmall(value: Columns): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXlarge(value: Columns): Self = StObject.set(x, "xlarge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXsmall(value: Columns): Self = StObject.set(x, "xsmall", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Breakpoints
  
  /* This means you don't have to write `default`, but can instead just say `breakpointsMod.foo` */
  override def _to: Breakpoints = default
}
