package typingsSlinky.nodeTimecodes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Framerate extends StObject {
    
    var framerate: Double = js.native
  }
  object Framerate {
    
    @scala.inline
    def apply(framerate: Double): Framerate = {
      val __obj = js.Dynamic.literal(framerate = framerate.asInstanceOf[js.Any])
      __obj.asInstanceOf[Framerate]
    }
    
    @scala.inline
    implicit class FramerateMutableBuilder[Self <: Framerate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFramerate(value: Double): Self = StObject.set(x, "framerate", value.asInstanceOf[js.Any])
    }
  }
}
