package typingsSlinky.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filterFilterMod {
  
  @JSImport("ol/format/filter/Filter", JSImport.Default)
  @js.native
  abstract class default protected () extends Filter {
    def this(tagName: String) = this()
  }
  
  @js.native
  trait Filter extends StObject {
    
    /**
      * The XML tag name for a filter.
      */
    def getTagName(): String = js.native
  }
  object Filter {
    
    @scala.inline
    def apply(getTagName: () => String): Filter = {
      val __obj = js.Dynamic.literal(getTagName = js.Any.fromFunction0(getTagName))
      __obj.asInstanceOf[Filter]
    }
    
    @scala.inline
    implicit class FilterMutableBuilder[Self <: Filter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetTagName(value: () => String): Self = StObject.set(x, "getTagName", js.Any.fromFunction0(value))
    }
  }
}
