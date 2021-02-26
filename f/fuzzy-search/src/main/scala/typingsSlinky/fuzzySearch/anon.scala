package typingsSlinky.fuzzySearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Required<fuzzy-search.fuzzy-search.Options> */
  @js.native
  trait RequiredOptions extends StObject {
    
    var caseSensitive: Boolean = js.native
    
    var sort: Boolean = js.native
  }
  object RequiredOptions {
    
    @scala.inline
    def apply(caseSensitive: Boolean, sort: Boolean): RequiredOptions = {
      val __obj = js.Dynamic.literal(caseSensitive = caseSensitive.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredOptions]
    }
    
    @scala.inline
    implicit class RequiredOptionsMutableBuilder[Self <: RequiredOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSort(value: Boolean): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    }
  }
}
