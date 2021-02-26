package typingsSlinky.getRes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Get ten most popular screen resolutions
    *
    * @returns An array with the details of ten most popular screen resolutions
    */
  @JSImport("get-res", JSImport.Namespace)
  @js.native
  def apply(): js.Promise[js.Array[Resolution]] = js.native
  
  @js.native
  trait Resolution extends StObject {
    
    var item: String = js.native
    
    var percent: String = js.native
  }
  object Resolution {
    
    @scala.inline
    def apply(item: String, percent: String): Resolution = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any])
      __obj.asInstanceOf[Resolution]
    }
    
    @scala.inline
    implicit class ResolutionMutableBuilder[Self <: Resolution] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItem(value: String): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPercent(value: String): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    }
  }
}
