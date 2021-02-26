package typingsSlinky.ionicAngular

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object virtualUtilsMod {
  
  @js.native
  trait VirtualContext extends StObject {
    
    @JSName("$implicit")
    var $implicit: js.Any = js.native
    
    var index: Double = js.native
  }
  object VirtualContext {
    
    @scala.inline
    def apply($implicit: js.Any, index: Double): VirtualContext = {
      val __obj = js.Dynamic.literal($implicit = $implicit.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[VirtualContext]
    }
    
    @scala.inline
    implicit class VirtualContextMutableBuilder[Self <: VirtualContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$implicit(value: js.Any): Self = StObject.set(x, "$implicit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    }
  }
}
