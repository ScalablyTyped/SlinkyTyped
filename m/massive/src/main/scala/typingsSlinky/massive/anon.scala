package typingsSlinky.massive

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Pick<massive.massive.SearchDefinition, 'fields' | 'term'> */
  @js.native
  trait PickSearchDefinitionfield extends StObject {
    
    var fields: js.Array[String] = js.native
    
    var term: String = js.native
  }
  object PickSearchDefinitionfield {
    
    @scala.inline
    def apply(fields: js.Array[String], term: String): PickSearchDefinitionfield = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickSearchDefinitionfield]
    }
    
    @scala.inline
    implicit class PickSearchDefinitionfieldMutableBuilder[Self <: PickSearchDefinitionfield] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
      
      @scala.inline
      def setTerm(value: String): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
    }
  }
}
